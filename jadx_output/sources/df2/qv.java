package df2;

/* loaded from: classes3.dex */
public final class qv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sv f231190d;

    public qv(df2.sv svVar) {
        this.f231190d = svVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveVipPermissionController$setCloseBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var = (com.tencent.mm.plugin.finder.live.plugin.wg0) this.f231190d.R6(com.tencent.mm.plugin.finder.live.plugin.wg0.class);
        if (wg0Var != null) {
            wg0Var.u1(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveVipPermissionController$setCloseBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
