package r45;

/* loaded from: classes9.dex */
public class am extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370113d;

    /* renamed from: e, reason: collision with root package name */
    public int f370114e;

    /* renamed from: f, reason: collision with root package name */
    public int f370115f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370116g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.am)) {
            return false;
        }
        r45.am amVar = (r45.am) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370113d), java.lang.Integer.valueOf(amVar.f370113d)) && n51.f.a(java.lang.Integer.valueOf(this.f370114e), java.lang.Integer.valueOf(amVar.f370114e)) && n51.f.a(java.lang.Integer.valueOf(this.f370115f), java.lang.Integer.valueOf(amVar.f370115f)) && n51.f.a(this.f370116g, amVar.f370116g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370113d);
            fVar.e(2, this.f370114e);
            fVar.e(3, this.f370115f);
            java.lang.String str = this.f370116g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370113d) + 0 + b36.f.e(2, this.f370114e) + b36.f.e(3, this.f370115f);
            java.lang.String str2 = this.f370116g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.am amVar = (r45.am) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            amVar.f370113d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            amVar.f370114e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            amVar.f370115f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        amVar.f370116g = aVar2.k(intValue);
        return 0;
    }
}
