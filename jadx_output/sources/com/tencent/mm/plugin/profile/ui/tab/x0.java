package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154689d;

    public x0(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        this.f154689d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154689d;
        m0Var.getClass();
        com.tencent.mm.ui.MMActivity mMActivity = m0Var.f154456h;
        android.content.Intent intent = new android.content.Intent(mMActivity.getIntent());
        intent.removeExtra(com.tencent.mm.ui.vas.VASActivity.KEY_IS_FRAGMENT_MODE);
        intent.removeExtra(com.tencent.mm.ui.vas.VASActivity.KEY_LAUNCH_MODE);
        intent.removeExtra(com.tencent.mm.ui.vas.VASActivity.KEY_CLS);
        intent.removeExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL);
        intent.putExtra("Contact_Scene", 232);
        j45.l.j(mMActivity, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
