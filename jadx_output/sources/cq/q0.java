package cq;

/* loaded from: classes8.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f221261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f221263f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yz5.q qVar, int i17, yz5.q qVar2) {
        super(1);
        this.f221261d = qVar;
        this.f221262e = i17;
        this.f221263f = qVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            boolean b17 = fVar.b();
            int i17 = this.f221262e;
            if (b17) {
                yz5.q qVar = this.f221261d;
                if (qVar != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                    com.tencent.mm.protobuf.f fVar2 = fVar.f70620f.f70646f.f70710a.f70684a;
                    kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
                    com.tencent.mm.protobuf.f fVar3 = fVar.f70620f.f70646f.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
                    qVar.invoke(valueOf, (r45.zy2) fVar2, (r45.az2) fVar3);
                }
            } else {
                yz5.q qVar2 = this.f221263f;
                if (qVar2 != null) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                    com.tencent.mm.protobuf.f fVar4 = fVar.f70620f.f70646f.f70710a.f70684a;
                    kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
                    com.tencent.mm.protobuf.f fVar5 = fVar.f70620f.f70646f.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
                    qVar2.invoke(valueOf2, (r45.zy2) fVar4, (r45.az2) fVar5);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
