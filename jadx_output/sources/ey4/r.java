package ey4;

/* loaded from: classes8.dex */
public class r extends com.tencent.mm.ui.tools.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter f257629h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter, int i17, com.tencent.mm.ui.tools.t4 t4Var) {
        super(i17, t4Var);
        this.f257629h = webViewRedesignInputFooter;
    }

    @Override // com.tencent.mm.ui.tools.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (charSequence == null) {
            return "";
        }
        java.lang.String obj = spanned.toString();
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_3;
        int e17 = com.tencent.mm.ui.tools.v4.e(obj, t4Var);
        int e18 = com.tencent.mm.ui.tools.v4.e((!com.tencent.mm.sdk.platformtools.t8.J0(charSequence) || i19 >= i27) ? spanned.toString() + charSequence.toString() : spanned.toString().substring(0, i19) + spanned.toString().substring(i27), t4Var);
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.f257629h;
        int i28 = webViewRedesignInputFooter.f187310y;
        int i29 = i28 - webViewRedesignInputFooter.f187311z;
        if (i29 > i28 || i29 <= 0) {
            i29 = i28;
        }
        if (e18 < i28) {
            if (e18 <= i29) {
                webViewRedesignInputFooter.f187304s.setVisibility(8);
                return charSequence;
            }
            webViewRedesignInputFooter.f187304s.setVisibility(0);
            webViewRedesignInputFooter.f187304s.setText(com.tencent.mm.sdk.platformtools.t8.z1(webViewRedesignInputFooter.f187307v.getString(com.tencent.mm.R.string.l66), java.lang.Integer.valueOf(i28 - e18)));
            return charSequence;
        }
        java.lang.String z17 = com.tencent.mm.sdk.platformtools.t8.z1(webViewRedesignInputFooter.f187307v.getString(com.tencent.mm.R.string.l67), java.lang.Integer.valueOf(webViewRedesignInputFooter.f187310y));
        webViewRedesignInputFooter.f187304s.setVisibility(0);
        webViewRedesignInputFooter.f187304s.setText(z17);
        int max = java.lang.Math.max(i28 - e17, 0);
        if (max != 0) {
            if (max <= 0 || e18 <= max) {
                return charSequence;
            }
            java.lang.CharSequence a17 = pg5.d.a(webViewRedesignInputFooter.getContext(), charSequence.toString());
            if (!com.tencent.mm.sdk.platformtools.t8.J0(a17)) {
                java.lang.String charSequence2 = a17.toString();
                int i37 = 0;
                int i38 = 0;
                for (int i39 = 0; i39 < charSequence2.length(); i39++) {
                    i37 += charSequence2.charAt(i39) <= 127 ? 1 : 2;
                    if ((i37 % 2 != 0 ? (i37 + 1) / 2 : i37 / 2) > max) {
                        break;
                    }
                    i38 = i39;
                }
                if (i38 < charSequence2.length()) {
                    i38++;
                }
                try {
                    if (a17 instanceof android.text.SpannableString) {
                        com.tencent.mm.smiley.r0[] r0VarArr = (com.tencent.mm.smiley.r0[]) ((android.text.SpannableString) a17).getSpans(0, a17.length(), com.tencent.mm.smiley.r0.class);
                        int length = r0VarArr.length;
                        int i47 = 0;
                        while (true) {
                            if (i47 >= length) {
                                break;
                            }
                            com.tencent.mm.smiley.r0 r0Var = r0VarArr[i47];
                            int i48 = r0Var.f193354h;
                            if (i38 < i48 && i38 >= r0Var.f193353g) {
                                i38 = i48;
                                break;
                            }
                            i47++;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                return a17.subSequence(0, i38);
            }
        }
        return "";
    }
}
