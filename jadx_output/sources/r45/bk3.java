package r45;

/* loaded from: classes9.dex */
public class bk3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370819d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370820e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370821f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bk3)) {
            return false;
        }
        r45.bk3 bk3Var = (r45.bk3) fVar;
        return n51.f.a(this.f370819d, bk3Var.f370819d) && n51.f.a(this.f370820e, bk3Var.f370820e) && n51.f.a(this.f370821f, bk3Var.f370821f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370819d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370820e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370821f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f370819d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f370820e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f370821f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.bk3 bk3Var = (r45.bk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bk3Var.f370819d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bk3Var.f370820e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        bk3Var.f370821f = aVar2.k(intValue);
        return 0;
    }
}
