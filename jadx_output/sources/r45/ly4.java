package r45;

/* loaded from: classes4.dex */
public class ly4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379973d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379974e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379975f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379976g;

    /* renamed from: h, reason: collision with root package name */
    public int f379977h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f379978i;

    /* renamed from: m, reason: collision with root package name */
    public int f379979m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ly4)) {
            return false;
        }
        r45.ly4 ly4Var = (r45.ly4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379973d), java.lang.Integer.valueOf(ly4Var.f379973d)) && n51.f.a(this.f379974e, ly4Var.f379974e) && n51.f.a(this.f379975f, ly4Var.f379975f) && n51.f.a(this.f379976g, ly4Var.f379976g) && n51.f.a(java.lang.Integer.valueOf(this.f379977h), java.lang.Integer.valueOf(ly4Var.f379977h)) && n51.f.a(java.lang.Boolean.valueOf(this.f379978i), java.lang.Boolean.valueOf(ly4Var.f379978i)) && n51.f.a(java.lang.Integer.valueOf(this.f379979m), java.lang.Integer.valueOf(ly4Var.f379979m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379973d);
            java.lang.String str = this.f379974e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379975f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f379976g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f379977h);
            fVar.a(6, this.f379978i);
            fVar.e(7, this.f379979m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379973d) + 0;
            java.lang.String str4 = this.f379974e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f379975f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f379976g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f379977h) + b36.f.a(6, this.f379978i) + b36.f.e(7, this.f379979m);
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
        r45.ly4 ly4Var = (r45.ly4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ly4Var.f379973d = aVar2.g(intValue);
                return 0;
            case 2:
                ly4Var.f379974e = aVar2.k(intValue);
                return 0;
            case 3:
                ly4Var.f379975f = aVar2.k(intValue);
                return 0;
            case 4:
                ly4Var.f379976g = aVar2.k(intValue);
                return 0;
            case 5:
                ly4Var.f379977h = aVar2.g(intValue);
                return 0;
            case 6:
                ly4Var.f379978i = aVar2.c(intValue);
                return 0;
            case 7:
                ly4Var.f379979m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
