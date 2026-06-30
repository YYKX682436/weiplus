package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public enum Language implements com.tencent.tencentmap.mapsdk.maps.model.ILanguage {
    zh(1),
    zh_TW(2),
    en(3);

    private final int thisLanguageType;

    Language(int i17) {
        this.thisLanguageType = i17;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.Language wrap(int i17) {
        for (com.tencent.tencentmap.mapsdk.maps.model.Language language : values()) {
            if (language.getLanguageType() == i17) {
                return language;
            }
        }
        return zh;
    }

    public final int getLanguageType() {
        return this.thisLanguageType;
    }
}
