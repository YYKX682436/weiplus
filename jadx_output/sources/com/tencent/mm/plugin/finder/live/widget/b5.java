package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c5 f117832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.io f117833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.plugin.finder.live.widget.c5 c5Var, com.tencent.mm.plugin.finder.live.widget.io ioVar) {
        super(1);
        this.f117832d = c5Var;
        this.f117833e = ioVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.nz6 vp6 = (r45.nz6) obj;
        kotlin.jvm.internal.o.g(vp6, "vp");
        yz5.l lVar = this.f117832d.f117965b;
        if (lVar != null) {
            lVar.invoke(vp6);
        }
        this.f117833e.q();
        return jz5.f0.f302826a;
    }
}
