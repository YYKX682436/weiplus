package r45;

/* loaded from: classes7.dex */
public class dz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372864d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372865e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372866f;

    /* renamed from: g, reason: collision with root package name */
    public int f372867g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dz)) {
            return false;
        }
        r45.dz dzVar = (r45.dz) fVar;
        return n51.f.a(this.f372864d, dzVar.f372864d) && n51.f.a(this.f372865e, dzVar.f372865e) && n51.f.a(this.f372866f, dzVar.f372866f) && n51.f.a(java.lang.Integer.valueOf(this.f372867g), java.lang.Integer.valueOf(dzVar.f372867g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372864d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372865e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372866f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f372867g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f372864d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f372865e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f372866f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f372867g);
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
        r45.dz dzVar = (r45.dz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dzVar.f372864d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dzVar.f372865e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            dzVar.f372866f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        dzVar.f372867g = aVar2.g(intValue);
        return 0;
    }
}
