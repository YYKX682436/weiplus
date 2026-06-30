package r45;

/* loaded from: classes8.dex */
public class ak5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370067d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370068e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370069f;

    /* renamed from: g, reason: collision with root package name */
    public int f370070g;

    /* renamed from: h, reason: collision with root package name */
    public int f370071h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ak5)) {
            return false;
        }
        r45.ak5 ak5Var = (r45.ak5) fVar;
        return n51.f.a(this.f370067d, ak5Var.f370067d) && n51.f.a(this.f370068e, ak5Var.f370068e) && n51.f.a(this.f370069f, ak5Var.f370069f) && n51.f.a(java.lang.Integer.valueOf(this.f370070g), java.lang.Integer.valueOf(ak5Var.f370070g)) && n51.f.a(java.lang.Integer.valueOf(this.f370071h), java.lang.Integer.valueOf(ak5Var.f370071h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370067d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370068e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370069f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f370070g);
            fVar.e(5, this.f370071h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f370067d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f370068e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f370069f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f370070g) + b36.f.e(5, this.f370071h);
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
        r45.ak5 ak5Var = (r45.ak5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ak5Var.f370067d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ak5Var.f370068e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ak5Var.f370069f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ak5Var.f370070g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ak5Var.f370071h = aVar2.g(intValue);
        return 0;
    }
}
