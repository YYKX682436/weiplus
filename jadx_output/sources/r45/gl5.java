package r45;

/* loaded from: classes4.dex */
public class gl5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375333d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375334e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375335f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375336g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375337h;

    /* renamed from: i, reason: collision with root package name */
    public int f375338i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375339m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375340n;

    /* renamed from: o, reason: collision with root package name */
    public int f375341o;

    static {
        new r45.gl5();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gl5)) {
            return false;
        }
        r45.gl5 gl5Var = (r45.gl5) fVar;
        return n51.f.a(this.f375333d, gl5Var.f375333d) && n51.f.a(this.f375334e, gl5Var.f375334e) && n51.f.a(this.f375335f, gl5Var.f375335f) && n51.f.a(this.f375336g, gl5Var.f375336g) && n51.f.a(this.f375337h, gl5Var.f375337h) && n51.f.a(java.lang.Integer.valueOf(this.f375338i), java.lang.Integer.valueOf(gl5Var.f375338i)) && n51.f.a(this.f375339m, gl5Var.f375339m) && n51.f.a(this.f375340n, gl5Var.f375340n) && n51.f.a(java.lang.Integer.valueOf(this.f375341o), java.lang.Integer.valueOf(gl5Var.f375341o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.gl5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375333d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375334e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f375335f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f375336g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f375337h;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            fVar.e(6, this.f375338i);
            com.tencent.mm.protobuf.g gVar3 = this.f375339m;
            if (gVar3 != null) {
                fVar.b(7, gVar3);
            }
            java.lang.String str4 = this.f375340n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f375341o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f375333d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f375334e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f375335f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f375336g;
            if (gVar4 != null) {
                j17 += b36.f.b(4, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f375337h;
            if (gVar5 != null) {
                j17 += b36.f.b(5, gVar5);
            }
            int e17 = j17 + b36.f.e(6, this.f375338i);
            com.tencent.mm.protobuf.g gVar6 = this.f375339m;
            if (gVar6 != null) {
                e17 += b36.f.b(7, gVar6);
            }
            java.lang.String str8 = this.f375340n;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.e(9, this.f375341o);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f375333d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f375334e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f375335f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f375336g = aVar2.d(intValue);
                return 0;
            case 5:
                this.f375337h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f375338i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f375339m = aVar2.d(intValue);
                return 0;
            case 8:
                this.f375340n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f375341o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.gl5) super.parseFrom(bArr);
    }
}
