package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j20 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f118717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f118718e;

    public j20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, android.view.ViewGroup viewGroup) {
        this.f118717d = e30Var;
        this.f118718e = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        df2.xw xwVar;
        androidx.lifecycle.j0 j0Var;
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLikeWidget$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        android.view.ViewGroup viewGroup = this.f118718e;
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f118717d;
        if (actionMasked == 0) {
            e30Var.f118219x.setVisibility(4);
            com.tencent.mm.sdk.platformtools.u3.l(e30Var.I);
            com.tencent.mm.plugin.finder.live.widget.e30.t1(e30Var, viewGroup, 1.5f);
            e30Var.v1(false);
            e30Var.w1(true);
            e30Var.f118217v.setAlpha(0.3f);
            e30Var.f118220y.setAlpha(0.0f);
        } else if (actionMasked == 1 || actionMasked == 3) {
            viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.widget.i20(e30Var, viewGroup), 100L);
            com.tencent.mm.sdk.platformtools.u3.i(e30Var.I, 200L);
            com.tencent.mars.xlog.Log.i(e30Var.f118213r, "[ken_stopPostLike]");
            com.tencent.mm.plugin.finder.live.util.y.m(e30Var, null, kotlinx.coroutines.a1.UNDISPATCHED, new com.tencent.mm.plugin.finder.live.widget.a30(e30Var, null), 1, null);
            e30Var.f118217v.setAlpha(1.0f);
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.m20(e30Var, e30Var.E));
            com.tencent.mm.plugin.finder.live.plugin.l lVar = e30Var.f118212q;
            if (((mm2.c1) lVar.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) lVar.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.a();
                vVar.c(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION);
            }
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.P6).getValue()).r()).booleanValue() && (xwVar = (df2.xw) e30Var.U0(df2.xw.class)) != null && (j0Var = xwVar.f231813q) != null) {
                j0Var.postValue(java.lang.Boolean.valueOf(!xwVar.f231814r));
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLikeWidget$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
