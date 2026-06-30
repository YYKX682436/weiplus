package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.t f115669d;

    public s(com.tencent.mm.plugin.finder.live.util.t tVar) {
        this.f115669d = tVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/util/ContinuousClickManager$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        byte[] bArr = null;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f115669d.f115688j = false;
            int ordinal = this.f115669d.f115683e.ordinal();
            if (ordinal == 0) {
                long j17 = 0;
                if (this.f115669d.f115684f.f233466a <= 0) {
                    com.tencent.mm.plugin.finder.live.util.t tVar = this.f115669d;
                    com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                    if (k0Var != null && (e1Var = (mm2.e1) k0Var.business(mm2.e1.class)) != null && (nw1Var = e1Var.f328988r) != null) {
                        j17 = nw1Var.getLong(0);
                    }
                    tVar.f115684f = new dk2.g(j17);
                }
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                dk2.g gVar = this.f115669d.f115684f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String r17 = c01.z1.r();
                if (r17 != null) {
                    bArr = r17.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
                }
                sb6.append(kk.k.g(bArr));
                sb6.append('_');
                sb6.append(java.util.UUID.randomUUID());
                java.lang.String sb7 = sb6.toString();
                gVar.getClass();
                kotlin.jvm.internal.o.g(sb7, "<set-?>");
                gVar.f233467b = sb7;
                this.f115669d.e(com.tencent.mm.plugin.finder.live.util.n.f115632e);
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                com.tencent.mm.plugin.finder.live.util.t tVar2 = this.f115669d;
                if (!tVar2.f115688j || java.lang.System.currentTimeMillis() - tVar2.f115687i < 3000) {
                    this.f115669d.e(com.tencent.mm.plugin.finder.live.util.n.f115633f);
                } else {
                    this.f115669d.e(com.tencent.mm.plugin.finder.live.util.n.f115632e);
                }
            }
            com.tencent.mm.plugin.finder.live.util.t tVar3 = this.f115669d;
            pm0.v.U(tVar3.f115681c, tVar3.f115695q);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            this.f115669d.f115688j = false;
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                r2 = true;
            }
            if (r2) {
                com.tencent.mm.plugin.finder.live.util.t.a(this.f115669d);
                com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "on ACTION_UP or ACTION_CANCEL: " + motionEvent);
                this.f115669d.f115688j = true;
                this.f115669d.f115687i = java.lang.System.currentTimeMillis();
                if (this.f115669d.f115696r.e()) {
                    com.tencent.mm.plugin.finder.live.util.t.a(this.f115669d);
                    com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "single click start timer");
                    com.tencent.mm.plugin.finder.live.util.t tVar4 = this.f115669d;
                    com.tencent.mm.sdk.platformtools.b4 b4Var = tVar4.f115696r;
                    long j18 = tVar4.f115680b;
                    b4Var.c(j18, j18);
                }
                this.f115669d.b();
                com.tencent.mm.plugin.finder.live.util.m mVar = this.f115669d.f115690l;
                if (mVar != null) {
                    kotlin.jvm.internal.o.d(motionEvent);
                    com.tencent.mm.plugin.finder.live.plugin.dq dqVar = ((com.tencent.mm.plugin.finder.live.plugin.ep) mVar).f112443a;
                    com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn finderLiveGiftSendBtn = dqVar.M;
                    pm0.v.U(finderLiveGiftSendBtn.f115949e, finderLiveGiftSendBtn.singleClickPagTask);
                    ((je2.t) dqVar.P0(je2.t.class)).f299271q.postValue(java.lang.Boolean.TRUE);
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/util/ContinuousClickManager$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
