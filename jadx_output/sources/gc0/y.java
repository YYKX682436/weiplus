package gc0;

/* loaded from: classes.dex */
public final class y implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map values, java.lang.String head, android.os.Bundle params, java.lang.ref.WeakReference ui6, java.lang.ref.WeakReference holdTextView) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(head, "head");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(holdTextView, "holdTextView");
        java.lang.String str = (java.lang.String) values.get(head.concat(".remarksend_newxml_info.talker"));
        java.lang.String str2 = (java.lang.String) values.get(head.concat(".remarksend_newxml_info.remark"));
        java.lang.String str3 = (java.lang.String) values.get(head.concat(".remarksend_newxml_info.phone"));
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) values.get(head.concat(".remarksend_newxml_info.img_msg_id")));
        java.lang.String str4 = (java.lang.String) values.get(head.concat(".title"));
        android.text.SpannableString spannableString = new android.text.SpannableString(str4);
        if (!android.text.TextUtils.isEmpty(str4)) {
            gc0.x xVar = new gc0.x(ui6, str, str2, str3, E1);
            xVar.setTextBold(true);
            kotlin.jvm.internal.o.d(str4);
            spannableString.setSpan(xVar, 0, str4.length(), 33);
        }
        return spannableString;
    }
}
