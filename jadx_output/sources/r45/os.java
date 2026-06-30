package r45;

/* loaded from: classes2.dex */
public class os extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382476d;

    /* renamed from: e, reason: collision with root package name */
    public int f382477e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.os)) {
            return false;
        }
        r45.os osVar = (r45.os) fVar;
        return n51.f.a(this.f382476d, osVar.f382476d) && n51.f.a(java.lang.Integer.valueOf(this.f382477e), java.lang.Integer.valueOf(osVar.f382477e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382476d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382477e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f382476d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f382477e);
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
        r45.os osVar = (r45.os) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            osVar.f382476d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        osVar.f382477e = aVar2.g(intValue);
        return 0;
    }
}
