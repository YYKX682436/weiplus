package me5;

/* loaded from: classes4.dex */
public class g extends ih3.n {
    @Override // ih3.n
    public java.lang.String a() {
        return "link_revoke";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.lang.String str3 = str + ".usernamelist.username";
            if (i17 != 0) {
                str3 = str3 + i17;
            }
            java.lang.String str4 = (java.lang.String) map.get(str3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                android.text.SpannableString spannableString = new android.text.SpannableString(str2);
                me5.f fVar = new me5.f(this, 1, null, bundle, linkedList, map, weakReference, weakReference2);
                fVar.setTextBold(true);
                spannableString.setSpan(fVar, 0, str2.length(), 33);
                return spannableString;
            }
            linkedList.add(str4);
            i17++;
        }
    }
}
