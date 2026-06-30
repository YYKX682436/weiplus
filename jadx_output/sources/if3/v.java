package if3;

/* loaded from: classes.dex */
public class v implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(str + ".masssend_newxml_info.newmsgid"));
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) ((com.tencent.neattextview.textview.view.NeatTextView) weakReference2.get()).getTag();
        java.lang.String str3 = erVar != null ? erVar.f203906b : "";
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        if (!android.text.TextUtils.isEmpty(str2)) {
            spannableString.setSpan(new if3.u(this, 1, null, str3, weakReference, E1), 0, str2.length(), 33);
        }
        return spannableString;
    }
}
