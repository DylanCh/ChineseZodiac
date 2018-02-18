/**
 * Created by Hanjun Chen on 2/14/18.
 */
package com;
import com.amazonaws.services.lambda.runtime.*;


public class Handler implements RequestHandler<Integer,Zodiac>{

    @Override
    public Zodiac handleRequest(Integer input, Context context) {
        return get_ChineseZodiac(input);
    }

    public Zodiac get_ChineseZodiac(int year)
    {
        switch (year % 12) {
            case 0: return new Zodiac(year){{setName("monkey"); setChineseName(""); }};
            case 1: return new Zodiac(year){{setName("rooster"); setChineseName(""); }};
            case 2: return new Zodiac(year){{setName("dog"); setChineseName(""); }};
            case 3: return new Zodiac(year){{setName("pig"); setChineseName(""); }};
            case 4: return new Zodiac(year){{setName("rat"); setChineseName(""); }};
            case 5: return new Zodiac(year){{setName("ox"); setChineseName(""); }};
            case 6: return new Zodiac(year){{setName("tiger"); setChineseName(""); }};
            case 7: return new Zodiac(year){{setName("rabbit"); setChineseName(""); }};
            case 8: return new Zodiac(year){{setName("dragon"); setChineseName(""); }};
            case 9: return new Zodiac(year){{setName("snake"); setChineseName(""); }};
            case 10: return new Zodiac(year){{setName("horse"); setChineseName(""); }};
            case 11: return new Zodiac(year){{setName("sheep"); setChineseName(""); }};
            default: throw new IllegalArgumentException("Year format is not correct");
        }

    }
}
