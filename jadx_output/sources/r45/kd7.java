package r45;

/* loaded from: classes7.dex */
public class kd7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378610d;

    /* renamed from: e, reason: collision with root package name */
    public int f378611e;

    /* renamed from: f, reason: collision with root package name */
    public int f378612f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378613g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378614h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kd7)) {
            return false;
        }
        r45.kd7 kd7Var = (r45.kd7) fVar;
        return n51.f.a(this.f378610d, kd7Var.f378610d) && n51.f.a(java.lang.Integer.valueOf(this.f378611e), java.lang.Integer.valueOf(kd7Var.f378611e)) && n51.f.a(java.lang.Integer.valueOf(this.f378612f), java.lang.Integer.valueOf(kd7Var.f378612f)) && n51.f.a(this.f378613g, kd7Var.f378613g) && n51.f.a(this.f378614h, kd7Var.f378614h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378610d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f378611e);
            fVar.e(3, this.f378612f);
            java.lang.String str2 = this.f378613g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378614h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f378610d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f378611e) + b36.f.e(3, this.f378612f);
            java.lang.String str5 = this.f378613g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f378614h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.kd7 kd7Var = (r45.kd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kd7Var.f378610d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kd7Var.f378611e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            kd7Var.f378612f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            kd7Var.f378613g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        kd7Var.f378614h = aVar2.k(intValue);
        return 0;
    }
}
