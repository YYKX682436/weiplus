package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f112649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2.c f112650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var, xh2.c cVar) {
        super(0);
        this.f112649d = o9Var;
        this.f112650e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        kn0.p pVar;
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = this.f112649d;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = o9Var.f113717r;
        xh2.c cVar = this.f112650e;
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
        in0.q B1 = o9Var.B1();
        if (B1 != null && (pVar = B1.D) != null && pVar.f309589i) {
            z17 = true;
        }
        livePreviewView.d(arrayList, cVar.f454532b, z17);
        return jz5.f0.f302826a;
    }
}
