package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j90 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113071p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f113072q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f113073r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f113074s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(android.view.ViewGroup root, qo0.c statueMonitor) {
        super(root, statueMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statueMonitor, "statueMonitor");
        this.f113071p = statueMonitor;
        this.f113072q = "FinderLiveShadowPlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.ien);
        this.f113073r = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.iep);
        this.f113074s = findViewById2;
        if (!x0()) {
            findViewById.getLayoutParams().height = (int) (com.tencent.mm.ui.bl.b(root.getContext()).y * 0.463d);
            return;
        }
        int i17 = com.tencent.mm.ui.bl.b(root.getContext()).y;
        double d17 = i17;
        findViewById.getLayoutParams().height = (int) (0.463d * d17);
        findViewById2.getLayoutParams().height = (int) (d17 * 0.232d);
        com.tencent.mars.xlog.Log.i("FinderLiveShadowPlugin", "screenHeight:" + i17 + ",shadowDown.height:" + findViewById.getLayoutParams().height + ",shadowUp.height:" + findViewById2.getLayoutParams().height);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        this.f113327i = i17;
        android.view.ViewGroup viewGroup = this.f365323d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f;
        int i18 = 8;
        if (z17) {
            i17 = 0;
        } else if (this.f113328m == 8) {
            i17 = 8;
        }
        if (pm0.v.z(((mm2.e1) P0(mm2.e1.class)).f328988r.getInteger(37), 4096)) {
            com.tencent.mars.xlog.Log.i(this.f113072q, "flag check Live_Flag_Weakening_Shadows = true, gone");
        } else {
            i18 = i17;
        }
        viewGroup.setVisibility(i18);
        if (i18 == 0) {
            viewGroup.setAlpha(1.0f);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                if (this.f113071p.getLiveRole() != 1) {
                    K0(4);
                    return;
                }
                return;
            } else {
                if (ordinal == 7) {
                    K0(0);
                    if (((mm2.e1) P0(mm2.e1.class)).g7()) {
                        this.f113073r.setBackgroundResource(com.tencent.mm.R.raw.live_anchor_bottom_shadow_new);
                        return;
                    }
                    return;
                }
                if (ordinal != 27 && ordinal != 28) {
                    return;
                }
            }
        }
        K0(4);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void c1(boolean z17) {
        K0(this.f113327i);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        android.view.View view = this.f113073r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f113074s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        K0(0);
        this.f365323d.post(new com.tencent.mm.plugin.finder.live.plugin.i90(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        ((mm2.e1) S0().a(mm2.e1.class)).f328986p.observe(this, new com.tencent.mm.plugin.finder.live.plugin.h90(this));
    }
}
