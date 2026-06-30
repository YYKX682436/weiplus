package r45;

/* loaded from: classes7.dex */
public class jr5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378070d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378071e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378072f;

    /* renamed from: g, reason: collision with root package name */
    public int f378073g;

    /* renamed from: h, reason: collision with root package name */
    public int f378074h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jr5)) {
            return false;
        }
        r45.jr5 jr5Var = (r45.jr5) fVar;
        return n51.f.a(this.f378070d, jr5Var.f378070d) && n51.f.a(this.f378071e, jr5Var.f378071e) && n51.f.a(this.f378072f, jr5Var.f378072f) && n51.f.a(java.lang.Integer.valueOf(this.f378073g), java.lang.Integer.valueOf(jr5Var.f378073g)) && n51.f.a(java.lang.Integer.valueOf(this.f378074h), java.lang.Integer.valueOf(jr5Var.f378074h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378070d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378071e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378072f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f378073g);
            fVar.e(5, this.f378074h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f378070d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f378071e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f378072f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f378073g) + b36.f.e(5, this.f378074h);
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
        r45.jr5 jr5Var = (r45.jr5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jr5Var.f378070d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jr5Var.f378071e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            jr5Var.f378072f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            jr5Var.f378073g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        jr5Var.f378074h = aVar2.g(intValue);
        return 0;
    }
}
