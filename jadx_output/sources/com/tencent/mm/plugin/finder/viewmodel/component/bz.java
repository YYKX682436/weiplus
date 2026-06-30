package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class bz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderContinueWatchEvent f133935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f133936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(com.tencent.mm.autogen.events.FinderContinueWatchEvent finderContinueWatchEvent, com.tencent.mm.plugin.finder.viewmodel.component.iz izVar) {
        super(0);
        this.f133935d = finderContinueWatchEvent;
        this.f133936e = izVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderContinueWatchEvent finderContinueWatchEvent = this.f133935d;
        if (finderContinueWatchEvent.f54267g.f8369a == 1) {
            java.util.Iterator it = this.f133936e.f134774g.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                java.lang.Long a17 = ((so2.j0) it.next()).a();
                if (a17 != null && a17.longValue() == finderContinueWatchEvent.f54267g.f8370b) {
                    break;
                }
                i17++;
            }
            bu2.q qVar = bu2.q.f24556a;
            long j17 = this.f133935d.f54267g.f8370b;
            synchronized (qVar) {
                pm0.v.c0(bu2.q.f24557b, new bu2.p(j17));
            }
            if (i17 != -1) {
                this.f133936e.f134774g.remove(i17);
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f133936e.f134775h;
                if (wxRecyclerAdapter == null) {
                    kotlin.jvm.internal.o.o("continueWatchAdapter");
                    throw null;
                }
                wxRecyclerAdapter.notifyItemRemoved(i17);
                this.f133936e.O6();
            }
        }
        return jz5.f0.f302826a;
    }
}
