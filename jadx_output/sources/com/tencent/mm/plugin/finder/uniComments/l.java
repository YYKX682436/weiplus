package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes5.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130290b;

    public l(yz5.a aVar, yz5.a aVar2) {
        this.f130289a = aVar;
        this.f130290b = aVar2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            this.f130289a.invoke();
        } else {
            this.f130290b.invoke();
        }
        return jz5.f0.f302826a;
    }
}
