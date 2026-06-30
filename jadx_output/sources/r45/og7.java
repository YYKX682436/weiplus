package r45;

/* loaded from: classes8.dex */
public class og7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382245d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382246e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382247f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382248g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382249h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382250i;

    /* renamed from: m, reason: collision with root package name */
    public int f382251m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.og7)) {
            return false;
        }
        r45.og7 og7Var = (r45.og7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382245d), java.lang.Integer.valueOf(og7Var.f382245d)) && n51.f.a(this.f382246e, og7Var.f382246e) && n51.f.a(this.f382247f, og7Var.f382247f) && n51.f.a(this.f382248g, og7Var.f382248g) && n51.f.a(this.f382249h, og7Var.f382249h) && n51.f.a(this.f382250i, og7Var.f382250i) && n51.f.a(java.lang.Integer.valueOf(this.f382251m), java.lang.Integer.valueOf(og7Var.f382251m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382245d);
            java.lang.String str = this.f382246e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382247f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382248g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f382249h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f382250i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f382251m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382245d) + 0;
            java.lang.String str6 = this.f382246e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f382247f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f382248g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f382249h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f382250i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f382251m);
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
        r45.og7 og7Var = (r45.og7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                og7Var.f382245d = aVar2.g(intValue);
                return 0;
            case 2:
                og7Var.f382246e = aVar2.k(intValue);
                return 0;
            case 3:
                og7Var.f382247f = aVar2.k(intValue);
                return 0;
            case 4:
                og7Var.f382248g = aVar2.k(intValue);
                return 0;
            case 5:
                og7Var.f382249h = aVar2.k(intValue);
                return 0;
            case 6:
                og7Var.f382250i = aVar2.k(intValue);
                return 0;
            case 7:
                og7Var.f382251m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
