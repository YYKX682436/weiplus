package vt2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f439956a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439957b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f439958c;

    /* renamed from: d, reason: collision with root package name */
    public vt2.j f439959d;

    /* renamed from: e, reason: collision with root package name */
    public r45.i56 f439960e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter$feedChangeListener$1 f439961f;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter$feedChangeListener$1] */
    public g(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f439956a = activity;
        this.f439957b = "FinderLiveShoppingManagerPresenter";
        this.f439958c = new java.util.LinkedList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f439961f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMiniWindowEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter$feedChangeListener$1
            {
                this.__eventId = -1676225923;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderMiniWindowEvent finderMiniWindowEvent) {
                com.tencent.mm.autogen.events.FinderMiniWindowEvent event = finderMiniWindowEvent;
                kotlin.jvm.internal.o.g(event, "event");
                vt2.g gVar = vt2.g.this;
                java.lang.String str = gVar.f439957b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderMiniWindowEvent change isLive:");
                am.mc mcVar = event.f54307g;
                sb6.append(mcVar.f7335a);
                sb6.append(",isAnchor:");
                sb6.append(mcVar.f7336b);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (mcVar.f7335a != 1 || mcVar.f7336b != 1) {
                    return false;
                }
                gVar.b(3);
                gVar.f439956a.finish();
                return false;
            }
        };
    }

    public final void a(java.util.List allList, boolean z17) {
        kotlin.jvm.internal.o.g(allList, "allList");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.live.util.q1 q1Var = com.tencent.mm.plugin.finder.live.util.q1.f115653a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allList, 10));
        java.util.Iterator it = allList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.y46) it.next()).toByteArray());
        }
        q1Var.b(intent, "KEY_PRODUCTLIST", new java.util.ArrayList(arrayList));
        intent.putExtra("KEY_DELETE", z17);
        this.f439956a.setResult(-1, intent);
    }

    public final void b(int i17) {
        jz5.f0 f0Var;
        xt2.z3 z3Var;
        tt2.i iVar;
        vt2.j jVar = this.f439959d;
        java.lang.String str = this.f439957b;
        if (jVar == null || (z3Var = jVar.f439966c) == null || (iVar = z3Var.f457150q) == null) {
            f0Var = null;
        } else {
            com.tencent.mars.xlog.Log.i(str, "userBack source:" + i17 + ",productIdList:" + iVar.J());
            if (((java.util.ArrayList) iVar.J()).isEmpty()) {
                a(iVar.f421935i, true);
            } else {
                a(iVar.J(), false);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "userBack source:" + i17 + " editAdapter is null!");
        }
    }
}
