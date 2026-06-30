package zl2;

/* loaded from: classes2.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f473921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z63 f473922f;

    public p3(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.view.e3 e3Var, r45.z63 z63Var) {
        this.f473920d = c0Var;
        this.f473921e = e3Var;
        this.f473922f = z63Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$showGamePermissionBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f473920d.f310112d = true;
        this.f473921e.h();
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.String string = this.f473922f.getString(0);
        if (string == null) {
            string = "";
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GAME_RANK_PERMISSION_SHOW_STRING_SYNC;
        java.lang.String str = c17.v(u3Var, "") + ',' + string;
        gm0.j1.u().c().x(u3Var, str);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "appendAppid result " + str);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$showGamePermissionBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
