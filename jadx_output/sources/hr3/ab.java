package hr3;

/* loaded from: classes11.dex */
public class ab implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.eb f283395d;

    public ab(hr3.eb ebVar) {
        this.f283395d = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.eb ebVar = this.f283395d;
        if (ebVar.f283520f.K1.getIntent() != null) {
            java.lang.String stringExtra = ebVar.f283520f.K1.getIntent().getStringExtra("key_ww_add_session_id");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct();
                openIMSearchFriendtLogStruct.p(stringExtra);
                openIMSearchFriendtLogStruct.f59792e = 0L;
                openIMSearchFriendtLogStruct.f59794g = 1L;
                openIMSearchFriendtLogStruct.k();
            }
        }
        ebVar.m();
        int i17 = ebVar.f283520f.J1;
        if (i17 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11263, java.lang.Integer.valueOf(i17), ebVar.f283520f.L.d1());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
