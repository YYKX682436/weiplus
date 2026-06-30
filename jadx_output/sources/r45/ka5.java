package r45;

/* loaded from: classes4.dex */
public class ka5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378561d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378562e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378563f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378564g;

    /* renamed from: h, reason: collision with root package name */
    public int f378565h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ka5)) {
            return false;
        }
        r45.ka5 ka5Var = (r45.ka5) fVar;
        return n51.f.a(this.f378561d, ka5Var.f378561d) && n51.f.a(this.f378562e, ka5Var.f378562e) && n51.f.a(this.f378563f, ka5Var.f378563f) && n51.f.a(this.f378564g, ka5Var.f378564g) && n51.f.a(java.lang.Integer.valueOf(this.f378565h), java.lang.Integer.valueOf(ka5Var.f378565h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378561d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378562e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378563f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f378564g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f378565h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f378561d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f378562e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f378563f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f378564g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f378565h);
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
        r45.ka5 ka5Var = (r45.ka5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ka5Var.f378561d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ka5Var.f378562e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ka5Var.f378563f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ka5Var.f378564g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ka5Var.f378565h = aVar2.g(intValue);
        return 0;
    }
}
