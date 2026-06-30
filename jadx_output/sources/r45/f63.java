package r45;

/* loaded from: classes4.dex */
public class f63 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374032d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374033e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374034f;

    /* renamed from: g, reason: collision with root package name */
    public int f374035g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374036h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f63)) {
            return false;
        }
        r45.f63 f63Var = (r45.f63) fVar;
        return n51.f.a(this.f374032d, f63Var.f374032d) && n51.f.a(this.f374033e, f63Var.f374033e) && n51.f.a(this.f374034f, f63Var.f374034f) && n51.f.a(java.lang.Integer.valueOf(this.f374035g), java.lang.Integer.valueOf(f63Var.f374035g)) && n51.f.a(this.f374036h, f63Var.f374036h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374032d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374033e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374034f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f374035g);
            java.lang.String str4 = this.f374036h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f374032d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f374033e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f374034f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f374035g);
            java.lang.String str8 = this.f374036h;
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
        r45.f63 f63Var = (r45.f63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f63Var.f374032d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            f63Var.f374033e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            f63Var.f374034f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            f63Var.f374035g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        f63Var.f374036h = aVar2.k(intValue);
        return 0;
    }
}
