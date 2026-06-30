package kz4;

/* loaded from: classes12.dex */
public abstract class c {
    public static boolean a(android.text.style.CharacterStyle characterStyle) {
        if (characterStyle instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.HighlightSpan) {
            return true;
        }
        if (characterStyle instanceof android.text.style.BackgroundColorSpan) {
            java.lang.String hexString = java.lang.Integer.toHexString(((android.text.style.BackgroundColorSpan) characterStyle).getBackgroundColor());
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.color.aec);
            if (string.length() > 0 && string.substring(1).endsWith(hexString)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.text.Spanned r18) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kz4.c.b(android.text.Spanned):java.lang.String");
    }

    public static void c(android.text.Spanned spanned, java.lang.StringBuilder sb6, int i17, int i18, java.util.SortedSet sortedSet) {
        while (i17 < i18) {
            android.text.style.CharacterStyle characterStyle = sortedSet.isEmpty() ? null : (android.text.style.CharacterStyle) sortedSet.first();
            int spanStart = characterStyle == null ? Integer.MAX_VALUE : spanned.getSpanStart(characterStyle);
            int spanEnd = characterStyle != null ? spanned.getSpanEnd(characterStyle) : Integer.MAX_VALUE;
            if (i17 < spanStart) {
                int min = java.lang.Math.min(i18, spanStart);
                while (i17 < min) {
                    char charAt = spanned.charAt(i17);
                    if (charAt == '\n') {
                        sb6.append("<br/>");
                    } else if (charAt == '<') {
                        sb6.append("&lt;");
                    } else if (charAt == '>') {
                        sb6.append("&gt;");
                    } else if (charAt == '&') {
                        sb6.append("&amp;");
                    } else if (charAt == ' ') {
                        while (true) {
                            int i19 = i17 + 1;
                            if (i19 >= min || spanned.charAt(i19) != ' ') {
                                break;
                            }
                            sb6.append("&nbsp;");
                            i17 = i19;
                        }
                        sb6.append(' ');
                    } else if (charAt < ' ') {
                        sb6.append("&#" + ((int) charAt) + ";");
                    } else {
                        sb6.append(charAt);
                    }
                    i17++;
                }
                i17 = spanStart;
            } else {
                sortedSet.remove(characterStyle);
                boolean z17 = characterStyle instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan;
                if (z17) {
                    sb6.append("<wx-b>");
                } else {
                    boolean z18 = characterStyle instanceof android.text.style.StyleSpan;
                    if (z18 && ((android.text.style.StyleSpan) characterStyle).getStyle() == 1) {
                        sb6.append("<wx-b>");
                    } else if (a(characterStyle)) {
                        sb6.append("<wx-mark>");
                    } else if (z18 && ((android.text.style.StyleSpan) characterStyle).getStyle() == 2) {
                        sb6.append("<i>");
                    } else if (characterStyle instanceof android.text.style.UnderlineSpan) {
                        sb6.append("<u>");
                    } else if (characterStyle instanceof android.text.style.RelativeSizeSpan) {
                        sb6.append("<wx-font style=\"font-size:");
                        sb6.append(java.lang.Math.round(((int) (((android.text.style.RelativeSizeSpan) characterStyle).getSizeChange() * mz4.b.f333226d)) / mz4.b.a()));
                        sb6.append("px\">");
                    } else if (characterStyle instanceof android.text.style.AbsoluteSizeSpan) {
                        sb6.append("<wx-font style=\"font-size:");
                        sb6.append(java.lang.Math.round(((android.text.style.AbsoluteSizeSpan) characterStyle).getSize() / mz4.b.a()));
                        sb6.append("px\">");
                    } else if (characterStyle instanceof android.text.style.ForegroundColorSpan) {
                        sb6.append("<wx-font style=\"color:#");
                        java.lang.String hexString = java.lang.Integer.toHexString(((android.text.style.ForegroundColorSpan) characterStyle).getForegroundColor() + com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                        while (hexString.length() < 6) {
                            hexString = "0".concat(hexString);
                        }
                        sb6.append(hexString);
                        sb6.append("\">");
                    } else if (characterStyle instanceof android.text.style.BackgroundColorSpan) {
                        sb6.append("<wx-font style=\"background-color:#");
                        java.lang.String hexString2 = java.lang.Integer.toHexString(((android.text.style.BackgroundColorSpan) characterStyle).getBackgroundColor() + com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                        while (hexString2.length() < 6) {
                            hexString2 = "0".concat(hexString2);
                        }
                        sb6.append(hexString2);
                        sb6.append("\">");
                    }
                }
                c(spanned, sb6, java.lang.Math.max(spanStart, i17), java.lang.Math.min(spanEnd, i18), sortedSet);
                if (characterStyle instanceof android.text.style.ForegroundColorSpan) {
                    sb6.append("</wx-font>");
                } else if (a(characterStyle)) {
                    sb6.append("</wx-mark>");
                } else if (characterStyle instanceof android.text.style.BackgroundColorSpan) {
                    sb6.append("</wx-font>");
                } else if (characterStyle instanceof android.text.style.AbsoluteSizeSpan) {
                    sb6.append("</wx-font>");
                } else if (characterStyle instanceof android.text.style.UnderlineSpan) {
                    sb6.append("</u>");
                } else if (z17) {
                    sb6.append("</wx-b>");
                } else {
                    boolean z19 = characterStyle instanceof android.text.style.StyleSpan;
                    if (z19 && ((android.text.style.StyleSpan) characterStyle).getStyle() == 2) {
                        sb6.append("</i>");
                    } else if (z19 && ((android.text.style.StyleSpan) characterStyle).getStyle() == 1) {
                        sb6.append("</wx-b>");
                    } else if (characterStyle instanceof android.text.style.RelativeSizeSpan) {
                        sb6.append("</wx-font>");
                    }
                }
                i17 = spanEnd;
            }
        }
    }

    public static void d(java.util.Stack stack, java.lang.StringBuilder sb6, oz4.a aVar) {
        int i17;
        oz4.s sVar = oz4.s.NONE;
        int i18 = 0;
        if (stack.isEmpty()) {
            i17 = 0;
        } else {
            oz4.a aVar2 = (oz4.a) stack.peek();
            i17 = aVar2.f350273b;
            sVar = aVar2.f350272a;
        }
        int i19 = aVar.f350273b;
        oz4.s sVar2 = aVar.f350272a;
        if (i19 > i17) {
            int i27 = i19 - i17;
            aVar.f350274c = i27;
            java.lang.String str = sVar2.f350304d;
            while (i18 < i27) {
                sb6.append(str);
                i18++;
            }
            stack.push(aVar);
            return;
        }
        if (i19 < i17) {
            e(stack, sb6);
            d(stack, sb6, aVar);
        } else if (sVar2 != sVar) {
            int e17 = e(stack, sb6);
            aVar.f350274c = e17;
            java.lang.String str2 = sVar2.f350304d;
            while (i18 < e17) {
                sb6.append(str2);
                i18++;
            }
            stack.push(aVar);
        }
    }

    public static int e(java.util.Stack stack, java.lang.StringBuilder sb6) {
        if (stack.isEmpty()) {
            return 0;
        }
        oz4.a aVar = (oz4.a) stack.pop();
        java.lang.String str = aVar.f350272a.f350305e;
        int i17 = aVar.f350274c;
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append(str);
        }
        return aVar.f350274c;
    }
}
