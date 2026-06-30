package pl2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356619d;

    public c(pl2.s sVar) {
        this.f356619d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.live.api.LiveConfig b17;
        com.tencent.mm.live.api.LiveConfig b18;
        com.tencent.mm.live.api.LiveConfig b19;
        com.tencent.mm.live.api.LiveConfig b27;
        km2.n nVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pl2.m mVar = this.f356619d.f356651f;
        if (mVar != null) {
            vd2.l4 l4Var = (vd2.l4) mVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "sidebar onCreateKtvRoomClick");
            pl2.s.e(l4Var.f435805d, 0L, null, 3, null);
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = l4Var.f435804c;
            km2.t c17 = (finderLiveViewCallback.f111486h == null || (nVar = dk2.ef.H) == null) ? null : nVar.c();
            r45.m84 m84Var = new r45.m84();
            long j17 = 0;
            m84Var.set(1, java.lang.Long.valueOf((c17 == null || (b27 = c17.b()) == null) ? 0L : b27.f68537e));
            if (c17 != null && (b19 = c17.b()) != null) {
                j17 = b19.f68549s;
            }
            m84Var.set(0, java.lang.Long.valueOf(j17));
            if (c17 == null || (b18 = c17.b()) == null || (str = b18.f68556z) == null) {
                str = "";
            }
            m84Var.set(2, str);
            m84Var.set(3, (c17 == null || (b17 = c17.b()) == null) ? null : b17.f68542m);
            kotlinx.coroutines.y0 b28 = v65.m.b(finderLiveViewCallback.f111484f);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(b28, kotlinx.coroutines.internal.b0.f310484a, null, new vd2.h4(finderLiveViewCallback, m84Var, null), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
