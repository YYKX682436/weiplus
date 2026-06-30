package r45;

/* loaded from: classes9.dex */
public class zp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392262e;

    /* renamed from: f, reason: collision with root package name */
    public int f392263f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392264g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392265h;

    /* renamed from: i, reason: collision with root package name */
    public int f392266i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp0)) {
            return false;
        }
        r45.zp0 zp0Var = (r45.zp0) fVar;
        return n51.f.a(this.f392261d, zp0Var.f392261d) && n51.f.a(this.f392262e, zp0Var.f392262e) && n51.f.a(java.lang.Integer.valueOf(this.f392263f), java.lang.Integer.valueOf(zp0Var.f392263f)) && n51.f.a(this.f392264g, zp0Var.f392264g) && n51.f.a(this.f392265h, zp0Var.f392265h) && n51.f.a(java.lang.Integer.valueOf(this.f392266i), java.lang.Integer.valueOf(zp0Var.f392266i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392261d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f392262e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f392263f);
            java.lang.String str3 = this.f392264g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f392265h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f392266i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f392261d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f392262e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f392263f);
            java.lang.String str7 = this.f392264g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f392265h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f392266i);
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
        r45.zp0 zp0Var = (r45.zp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zp0Var.f392261d = aVar2.k(intValue);
                return 0;
            case 2:
                zp0Var.f392262e = aVar2.k(intValue);
                return 0;
            case 3:
                zp0Var.f392263f = aVar2.g(intValue);
                return 0;
            case 4:
                zp0Var.f392264g = aVar2.k(intValue);
                return 0;
            case 5:
                zp0Var.f392265h = aVar2.k(intValue);
                return 0;
            case 6:
                zp0Var.f392266i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
