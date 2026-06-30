package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ak0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dk0 f111901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2.c f111902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var, xh2.c cVar) {
        super(0);
        this.f111901d = dk0Var;
        this.f111902e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        java.lang.Object obj;
        java.lang.Object obj2;
        kn0.p pVar;
        com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var = this.f111901d;
        java.lang.String m86 = ((mm2.c1) dk0Var.P0(mm2.c1.class)).m8();
        if (m86 == null) {
            m86 = "";
        }
        xh2.c cVar = this.f111902e;
        java.util.LinkedList linkedList = cVar.f454531a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            xh2.a aVar = (xh2.a) it.next();
            java.lang.String b17 = aVar.b();
            xh2.i iVar = aVar.f454521b;
            arrayList.add(new jo0.a(b17, new hn5.b(iVar.f282609a, iVar.f282610b, iVar.f282611c, iVar.f282612d), false));
        }
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = dk0Var.f112299p;
        java.util.Iterator<T> it6 = livePreviewView.getTRTCDataList().iterator();
        while (true) {
            obj = null;
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            jo0.a aVar2 = (jo0.a) obj2;
            if (aVar2.f300872c && kotlin.jvm.internal.o.b(aVar2.f300870a, m86)) {
                break;
            }
        }
        jo0.a aVar3 = (jo0.a) obj2;
        if (aVar3 != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "micCoverDataChangeEvent fakeData selfId: ".concat(m86));
            java.util.Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                java.lang.Object next = it7.next();
                if (kotlin.jvm.internal.o.b(((jo0.a) next).f300870a, m86)) {
                    obj = next;
                    break;
                }
            }
            if (obj == null) {
                arrayList.add(aVar3);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "micCoverDataChangeEvent fakeData selfId not exist, add");
            }
        }
        co0.s u17 = dk0Var.u1();
        if (u17 != null && (pVar = u17.D) != null && pVar.f309589i) {
            z17 = true;
        }
        livePreviewView.d(arrayList, cVar.f454532b, z17);
        return jz5.f0.f302826a;
    }
}
