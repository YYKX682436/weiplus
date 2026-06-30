package ue2;

/* loaded from: classes3.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.e0 f426870d;

    public z(ue2.e0 e0Var) {
        this.f426870d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog$initializeShell$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ue2.e0 e0Var = this.f426870d;
        if (!e0Var.f426809i) {
            e0Var.a(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog$initializeShell$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
