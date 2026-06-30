package m90;

/* loaded from: classes.dex */
public class w0 implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".identity_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".nickname");
        java.lang.String str4 = str3 != null ? str3 : "";
        java.lang.String e17 = c01.a2.e(str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            str4 = e17;
        }
        return new android.text.SpannableString(str4);
    }
}
