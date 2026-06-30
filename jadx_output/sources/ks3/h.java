package ks3;

/* loaded from: classes4.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f311680d;

    /* renamed from: e, reason: collision with root package name */
    public long f311681e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.h)) {
            return false;
        }
        ks3.h hVar = (ks3.h) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f311680d), java.lang.Integer.valueOf(hVar.f311680d)) && n51.f.a(java.lang.Long.valueOf(this.f311681e), java.lang.Long.valueOf(hVar.f311681e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f311680d);
            fVar.h(2, this.f311681e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f311680d) + 0 + b36.f.h(2, this.f311681e);
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
        ks3.h hVar = (ks3.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hVar.f311680d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        hVar.f311681e = aVar2.i(intValue);
        return 0;
    }
}
