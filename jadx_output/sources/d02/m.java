package d02;

/* loaded from: classes2.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f225339d;

    /* renamed from: e, reason: collision with root package name */
    public long f225340e;

    /* renamed from: f, reason: collision with root package name */
    public long f225341f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.m)) {
            return false;
        }
        d02.m mVar = (d02.m) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f225339d), java.lang.Long.valueOf(mVar.f225339d)) && n51.f.a(java.lang.Long.valueOf(this.f225340e), java.lang.Long.valueOf(mVar.f225340e)) && n51.f.a(java.lang.Long.valueOf(this.f225341f), java.lang.Long.valueOf(mVar.f225341f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f225339d);
            fVar.h(2, this.f225340e);
            fVar.h(3, this.f225341f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f225339d) + 0 + b36.f.h(2, this.f225340e) + b36.f.h(3, this.f225341f);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        d02.m mVar = (d02.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mVar.f225339d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            mVar.f225340e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        mVar.f225341f = aVar2.i(intValue);
        return 0;
    }
}
