package m90;

/* loaded from: classes.dex */
public class r1 implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(str + ".mmlive.live_id"));
        java.lang.String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        java.lang.String str2 = (java.lang.String) map.get(str + ".des");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".mmlive.identity_id");
        java.lang.String str4 = str3 == null ? "" : str3;
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        m90.q1 q1Var = new m90.q1(this, 1, null, weakReference, string, str4, E1);
        q1Var.setTextBold(true);
        spannableString.setSpan(q1Var, 0, str2.length(), 33);
        return spannableString;
    }
}
