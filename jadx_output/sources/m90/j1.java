package m90;

/* loaded from: classes4.dex */
public class j1 implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        m90.i1 i1Var = new m90.i1(this, 1, null, bundle, map, str, weakReference, weakReference2);
        i1Var.setTextBold(true);
        spannableString.setSpan(i1Var, 0, str3.length(), 33);
        return spannableString;
    }
}
