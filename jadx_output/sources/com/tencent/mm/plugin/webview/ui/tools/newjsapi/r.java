package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes10.dex */
public final class r extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.r f186470d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r();

    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.PrimitiveIterator$OfInt, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.PrimitiveIterator$OfInt, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.PrimitiveIterator$OfInt, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.PrimitiveIterator$OfInt, java.util.Iterator] */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        boolean z17;
        java.lang.Character.UnicodeBlock of6;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            org.json.JSONObject jSONObject = msg.f341014d;
            str = jSONObject != null ? jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT) : null;
            if (str == null) {
                str = "";
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "checkSameLanguage content=".concat(str));
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "empty content, treat as same language");
        } else {
            ?? it = str.codePoints().iterator();
            boolean z18 = false;
            boolean z19 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = false;
            boolean z37 = false;
            boolean z38 = false;
            boolean z39 = false;
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                if (!f(nextInt) && !h(nextInt) && (of6 = java.lang.Character.UnicodeBlock.of(nextInt)) != null) {
                    if (kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT)) {
                        z18 = true;
                    } else {
                        if (kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.BASIC_LATIN) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.LATIN_1_SUPPLEMENT) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.LATIN_EXTENDED_A) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.LATIN_EXTENDED_B) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL)) {
                            if (g(nextInt) || java.lang.Character.isLetter(nextInt)) {
                                z39 = true;
                            }
                        } else if (kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.HIRAGANA)) {
                            z19 = true;
                        } else {
                            if (kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.KATAKANA) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS)) {
                                z27 = true;
                            } else {
                                if (kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.HANGUL_JAMO) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO)) {
                                    z28 = true;
                                } else {
                                    if (kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CYRILLIC) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.CYRILLIC_SUPPLEMENTARY)) {
                                        z29 = true;
                                    } else {
                                        if (kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.ARABIC) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.ARABIC_PRESENTATION_FORMS_A) ? true : kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.ARABIC_PRESENTATION_FORMS_B)) {
                                            z37 = true;
                                        } else if (kotlin.jvm.internal.o.b(of6, java.lang.Character.UnicodeBlock.THAI)) {
                                            z38 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            java.lang.String str2 = z18 ? "zh_CN" : (z19 || z27) ? "ja" : z28 ? "ko" : z29 ? "ru" : z37 ? "ar" : z38 ? "th" : z39 ? "en" : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "detectLanguageCode result=" + str2);
            if (str2 != null) {
                java.lang.String str3 = r26.i0.y(str2, "zh", false) ? "zh_CN" : str2;
                boolean l17 = com.tencent.mm.sdk.platformtools.m2.l(str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "language guessed=" + str2 + ", normalized=" + str3 + ", supported=" + l17);
                if (l17) {
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    kotlin.jvm.internal.o.f(c17, "getActualTranslateLanguageIso(...)");
                    java.util.Locale locale = java.util.Locale.ROOT;
                    java.lang.String lowerCase = c17.toLowerCase(locale);
                    kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                    java.lang.String lowerCase2 = str2.toLowerCase(locale);
                    kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
                    boolean p17 = r26.i0.p(lowerCase, lowerCase2, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "group compare, appTargetLang=" + lowerCase + ", textGroup=" + lowerCase2 + ", sameGroup=" + p17);
                    if (p17) {
                        if (kotlin.jvm.internal.o.b(lowerCase2, "zh")) {
                            ?? it6 = str.codePoints().iterator();
                            while (it6.hasNext()) {
                                int nextInt2 = it6.nextInt();
                                if (!f(nextInt2) && ((nextInt2 > 127 && !h(nextInt2)) || g(nextInt2))) {
                                    if (g(nextInt2)) {
                                        java.lang.String format = java.lang.String.format("cn mismatch by en char cp=0x%X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(nextInt2)}, 1));
                                        kotlin.jvm.internal.o.f(format, "format(...)");
                                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", format);
                                    } else {
                                        if (!(19968 <= nextInt2 && nextInt2 < 40870)) {
                                            java.lang.String format2 = java.lang.String.format("cn mismatch by non-Hans char cp=0x%X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(nextInt2)}, 1));
                                            kotlin.jvm.internal.o.f(format2, "format(...)");
                                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", format2);
                                        }
                                    }
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "cn branch pass");
                        } else if (kotlin.jvm.internal.o.b(lowerCase2, "en")) {
                            ?? it7 = str.codePoints().iterator();
                            while (it7.hasNext()) {
                                int nextInt3 = it7.nextInt();
                                if (!f(nextInt3) && !h(nextInt3) && !g(nextInt3) && nextInt3 > 127) {
                                    java.lang.String format3 = java.lang.String.format("en mismatch by non-ascii cp=0x%X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(nextInt3)}, 1));
                                    kotlin.jvm.internal.o.f(format3, "format(...)");
                                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", format3);
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "en branch pass");
                        } else {
                            ?? it8 = str.codePoints().iterator();
                            while (it8.hasNext()) {
                                int nextInt4 = it8.nextInt();
                                if (!f(nextInt4) && !h(nextInt4) && !e(nextInt4) && nextInt4 > 127) {
                                    java.lang.String format4 = java.lang.String.format("other-enlike mismatch by non-ascii cp=0x%X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(nextInt4)}, 1));
                                    kotlin.jvm.internal.o.f(format4, "format(...)");
                                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", format4);
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "other-enlike branch pass");
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "check text is same language result=" + z17);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("result", java.lang.Boolean.valueOf(z17));
                        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", hashMap);
                        return true;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "group compare, miss match");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "language not supported, treat as different language");
                }
                z17 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "check text is same language result=" + z17);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("result", java.lang.Boolean.valueOf(z17));
                env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", hashMap2);
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "detectLanguageCode=null, only ignorable content, treat as same language");
        }
        z17 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckSameLanguage", "check text is same language result=" + z17);
        java.util.HashMap hashMap22 = new java.util.HashMap();
        hashMap22.put("result", java.lang.Boolean.valueOf(z17));
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", hashMap22);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 513;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "checkSameLanguage";
    }

    public final boolean e(int i17) {
        if (65 <= i17 && i17 < 91) {
            return true;
        }
        return 97 <= i17 && i17 < 123;
    }

    public final boolean f(int i17) {
        java.lang.Character.UnicodeBlock of6 = java.lang.Character.UnicodeBlock.of(i17);
        if (of6 == null) {
            return false;
        }
        return of6 == java.lang.Character.UnicodeBlock.EMOTICONS || of6 == java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS || of6 == java.lang.Character.UnicodeBlock.TRANSPORT_AND_MAP_SYMBOLS || of6 == java.lang.Character.UnicodeBlock.DINGBATS || of6 == java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS || of6 == java.lang.Character.UnicodeBlock.MISCELLANEOUS_TECHNICAL || of6 == java.lang.Character.UnicodeBlock.VARIATION_SELECTORS;
    }

    public final boolean g(int i17) {
        if (e(i17)) {
            return true;
        }
        if (65313 <= i17 && i17 < 65339) {
            return true;
        }
        return 65345 <= i17 && i17 < 65371;
    }

    public final boolean h(int i17) {
        if (65281 <= i17 && i17 < 65375) {
            return true;
        }
        if (65504 <= i17 && i17 < 65510) {
            return true;
        }
        if (65072 <= i17 && i17 < 65132) {
            return true;
        }
        return (12288 <= i17 && i17 < 12330) || i17 == 8197;
    }
}
