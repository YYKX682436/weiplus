package cq;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yz5.l lVar, yz5.l lVar2) {
        super(1);
        this.f221252d = lVar;
        this.f221253e = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            if (fVar.b()) {
                yz5.l lVar = this.f221252d;
                if (lVar != null) {
                    com.tencent.mm.protobuf.f resp = fVar.f70618d;
                    kotlin.jvm.internal.o.f(resp, "resp");
                    lVar.invoke(resp);
                }
            } else {
                yz5.l lVar2 = this.f221253e;
                if (lVar2 != null) {
                    lVar2.invoke(fVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
