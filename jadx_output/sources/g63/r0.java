package g63;

/* loaded from: classes.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView f269170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f269171e;

    public r0(com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView gameLifeLoadingCoverView, yz5.a aVar) {
        this.f269170d = gameLifeLoadingCoverView;
        this.f269171e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView gameLifeLoadingCoverView = this.f269170d;
        android.view.View view2 = gameLifeLoadingCoverView.f141997e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = gameLifeLoadingCoverView.f141996d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f269171e.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
