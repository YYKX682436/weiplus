package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes5.dex */
public final class o2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130344b;

    public o2(yz5.a aVar, yz5.a aVar2) {
        this.f130343a = aVar;
        this.f130344b = aVar2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            this.f130343a.invoke();
        } else {
            this.f130344b.invoke();
        }
        return jz5.f0.f302826a;
    }
}
