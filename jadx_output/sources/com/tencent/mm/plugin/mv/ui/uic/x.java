package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im3.j f151520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(im3.j jVar) {
        super(1);
        this.f151520d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<im3.j> it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        for (im3.j jVar : it) {
            jVar.f292703i = kotlin.jvm.internal.o.b(jVar.v(), this.f151520d.v());
        }
        return jz5.f0.f302826a;
    }
}
