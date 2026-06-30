package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class x6 implements t25.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.profile.ui.ContactInfoUI f154695d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f154696e;

    public x6(com.tencent.mm.plugin.profile.ui.ContactInfoUI context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f154695d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f154695d;
        if (contactInfoUI.isFinishing()) {
            return true;
        }
        android.view.View findViewById = contactInfoUI.findViewById(com.tencent.mm.R.id.jlv);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetUnsupportedProfile", "hideOriginContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetUnsupportedProfile", "hideOriginContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ListView listView = contactInfoUI.getListView();
        if (listView != null) {
            listView.setVisibility(8);
        }
        android.view.View findViewById2 = contactInfoUI.findViewById(com.tencent.mm.R.id.l2v);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetUnsupportedProfile", "hideOriginContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetUnsupportedProfile", "hideOriginContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f154696e == null) {
            this.f154696e = android.view.LayoutInflater.from(contactInfoUI).inflate(com.tencent.mm.R.layout.e3z, (android.view.ViewGroup) null);
        }
        contactInfoUI.setContentView(this.f154696e);
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        return false;
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.b
    public boolean onBackPress() {
        return false;
    }

    @Override // t25.b
    public boolean onCreate() {
        return true;
    }

    @Override // t25.b
    public boolean onDestroy() {
        this.f154696e = null;
        return true;
    }

    @Override // t25.a
    public boolean onDetach() {
        return true;
    }

    @Override // t25.b
    public void onPause() {
    }

    @Override // t25.b
    public void onResume() {
    }
}
