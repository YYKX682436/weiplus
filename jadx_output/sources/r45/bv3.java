package r45;

/* loaded from: classes9.dex */
public class bv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371079d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371080e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371081f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371082g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371083h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bv3)) {
            return false;
        }
        r45.bv3 bv3Var = (r45.bv3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371079d), java.lang.Integer.valueOf(bv3Var.f371079d)) && n51.f.a(this.f371080e, bv3Var.f371080e) && n51.f.a(this.f371081f, bv3Var.f371081f) && n51.f.a(this.f371082g, bv3Var.f371082g) && n51.f.a(this.f371083h, bv3Var.f371083h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371079d);
            java.lang.String str = this.f371080e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f371081f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f371082g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f371083h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371079d) + 0;
            java.lang.String str5 = this.f371080e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f371081f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f371082g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f371083h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.bv3 bv3Var = (r45.bv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bv3Var.f371079d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bv3Var.f371080e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bv3Var.f371081f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            bv3Var.f371082g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bv3Var.f371083h = aVar2.k(intValue);
        return 0;
    }
}
