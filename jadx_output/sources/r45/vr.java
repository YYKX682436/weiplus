package r45;

/* loaded from: classes4.dex */
public class vr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388452d;

    /* renamed from: e, reason: collision with root package name */
    public long f388453e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vr)) {
            return false;
        }
        r45.vr vrVar = (r45.vr) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388452d), java.lang.Integer.valueOf(vrVar.f388452d)) && n51.f.a(java.lang.Long.valueOf(this.f388453e), java.lang.Long.valueOf(vrVar.f388453e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388452d);
            fVar.h(2, this.f388453e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f388452d) + 0 + b36.f.h(2, this.f388453e);
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
        r45.vr vrVar = (r45.vr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vrVar.f388452d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        vrVar.f388453e = aVar2.i(intValue);
        return 0;
    }
}
