package r45;

/* loaded from: classes15.dex */
public class qf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383935d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383936e;

    /* renamed from: f, reason: collision with root package name */
    public int f383937f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383938g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383939h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383940i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383941m;

    /* renamed from: n, reason: collision with root package name */
    public int f383942n;

    /* renamed from: o, reason: collision with root package name */
    public int f383943o;

    /* renamed from: p, reason: collision with root package name */
    public r45.sx3 f383944p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf4)) {
            return false;
        }
        r45.qf4 qf4Var = (r45.qf4) fVar;
        return n51.f.a(this.f383935d, qf4Var.f383935d) && n51.f.a(this.f383936e, qf4Var.f383936e) && n51.f.a(java.lang.Integer.valueOf(this.f383937f), java.lang.Integer.valueOf(qf4Var.f383937f)) && n51.f.a(this.f383938g, qf4Var.f383938g) && n51.f.a(this.f383939h, qf4Var.f383939h) && n51.f.a(this.f383940i, qf4Var.f383940i) && n51.f.a(this.f383941m, qf4Var.f383941m) && n51.f.a(java.lang.Integer.valueOf(this.f383942n), java.lang.Integer.valueOf(qf4Var.f383942n)) && n51.f.a(java.lang.Integer.valueOf(this.f383943o), java.lang.Integer.valueOf(qf4Var.f383943o)) && n51.f.a(this.f383944p, qf4Var.f383944p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383935d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383936e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f383937f);
            java.lang.String str3 = this.f383938g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383939h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f383940i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f383941m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f383942n);
            fVar.e(9, this.f383943o);
            r45.sx3 sx3Var = this.f383944p;
            if (sx3Var != null) {
                fVar.i(10, sx3Var.computeSize());
                this.f383944p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f383935d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f383936e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f383937f);
            java.lang.String str9 = this.f383938g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f383939h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f383940i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f383941m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            int e18 = e17 + b36.f.e(8, this.f383942n) + b36.f.e(9, this.f383943o);
            r45.sx3 sx3Var2 = this.f383944p;
            return sx3Var2 != null ? e18 + b36.f.i(10, sx3Var2.computeSize()) : e18;
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
        r45.qf4 qf4Var = (r45.qf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qf4Var.f383935d = aVar2.k(intValue);
                return 0;
            case 2:
                qf4Var.f383936e = aVar2.k(intValue);
                return 0;
            case 3:
                qf4Var.f383937f = aVar2.g(intValue);
                return 0;
            case 4:
                qf4Var.f383938g = aVar2.k(intValue);
                return 0;
            case 5:
                qf4Var.f383939h = aVar2.k(intValue);
                return 0;
            case 6:
                qf4Var.f383940i = aVar2.k(intValue);
                return 0;
            case 7:
                qf4Var.f383941m = aVar2.k(intValue);
                return 0;
            case 8:
                qf4Var.f383942n = aVar2.g(intValue);
                return 0;
            case 9:
                qf4Var.f383943o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.sx3 sx3Var3 = new r45.sx3();
                    if (bArr != null && bArr.length > 0) {
                        sx3Var3.parseFrom(bArr);
                    }
                    qf4Var.f383944p = sx3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
