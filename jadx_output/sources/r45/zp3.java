package r45;

/* loaded from: classes8.dex */
public class zp3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392267d;

    /* renamed from: e, reason: collision with root package name */
    public int f392268e;

    /* renamed from: f, reason: collision with root package name */
    public int f392269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392270g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392271h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392272i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp3)) {
            return false;
        }
        r45.zp3 zp3Var = (r45.zp3) fVar;
        return n51.f.a(this.f392267d, zp3Var.f392267d) && n51.f.a(java.lang.Integer.valueOf(this.f392268e), java.lang.Integer.valueOf(zp3Var.f392268e)) && n51.f.a(java.lang.Integer.valueOf(this.f392269f), java.lang.Integer.valueOf(zp3Var.f392269f)) && n51.f.a(this.f392270g, zp3Var.f392270g) && n51.f.a(this.f392271h, zp3Var.f392271h) && n51.f.a(this.f392272i, zp3Var.f392272i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392267d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f392268e);
            fVar.e(3, this.f392269f);
            java.lang.String str2 = this.f392270g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f392271h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f392272i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f392267d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f392268e) + b36.f.e(3, this.f392269f);
            java.lang.String str6 = this.f392270g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f392271h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f392272i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.zp3 zp3Var = (r45.zp3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zp3Var.f392267d = aVar2.k(intValue);
                return 0;
            case 2:
                zp3Var.f392268e = aVar2.g(intValue);
                return 0;
            case 3:
                zp3Var.f392269f = aVar2.g(intValue);
                return 0;
            case 4:
                zp3Var.f392270g = aVar2.k(intValue);
                return 0;
            case 5:
                zp3Var.f392271h = aVar2.k(intValue);
                return 0;
            case 6:
                zp3Var.f392272i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
