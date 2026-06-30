package me5;

/* loaded from: classes5.dex */
public class p extends ih3.n {
    @Override // ih3.n
    public java.lang.String a() {
        return "link_revoke_qrcode";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        ih3.l lVar = new ih3.l(this);
        lVar.f291593a = (java.lang.String) map.get(str + ".username");
        lVar.f291594b = (java.lang.String) map.get(str + ".qrcode");
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        me5.o oVar = new me5.o(this, 1, null, lVar, map, bundle, weakReference, weakReference2);
        oVar.setTextBold(true);
        spannableString.setSpan(oVar, 0, str2.length(), 33);
        return spannableString;
    }
}
