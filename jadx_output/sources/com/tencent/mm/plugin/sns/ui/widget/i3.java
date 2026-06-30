package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public abstract class i3 {
    public static java.lang.CharSequence a(android.text.Spannable spannable) {
        com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr;
        java.lang.String e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compressedPostDesc", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(spannable);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.J0(spannable) && (z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) spannable.getSpans(0, spannable.length(), com.tencent.mm.pluginsdk.ui.span.z0.class)) != null && z0VarArr.length > 0) {
                for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : z0VarArr) {
                    if (z0Var.getType() == 1 && (e17 = z0Var.getHrefInfo().e()) != null && e17.length() > com.tencent.mm.plugin.sns.model.j4.f() && spannableStringBuilder.toString().contains(e17)) {
                        java.lang.String str = e17.substring(0, com.tencent.mm.plugin.sns.model.j4.f()) + "...";
                        android.text.SpannableString spannableString = new android.text.SpannableString(str);
                        spannableString.setSpan(new com.tencent.mm.pluginsdk.ui.span.z0(2, z0Var.getHrefInfo()), 0, str.length(), 33);
                        int indexOf = spannableStringBuilder.toString().indexOf(e17);
                        spannableStringBuilder.replace(indexOf, e17.length() + indexOf, (java.lang.CharSequence) spannableString);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsPostDescUtil", "compressedPostDesc fail:%s", spannable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compressedPostDesc", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        return spannableStringBuilder;
    }

    public static com.tencent.mm.pluginsdk.ui.span.f0 b(android.content.Context context, java.lang.String str, float f17, java.lang.Object obj, long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPostDescSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(ga4.m.f(j17, com.tencent.mm.pluginsdk.ui.span.c0.k(context, true, str, (int) f17, i17, obj, null, -1, true), 0, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostDescSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        return f0Var;
    }
}
