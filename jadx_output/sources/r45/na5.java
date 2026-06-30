package r45;

/* loaded from: classes9.dex */
public class na5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381199d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381200e;

    /* renamed from: f, reason: collision with root package name */
    public int f381201f;

    /* renamed from: g, reason: collision with root package name */
    public r45.c70 f381202g;

    /* renamed from: h, reason: collision with root package name */
    public r45.bq f381203h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bq f381204i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381205m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381206n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f381207o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381208p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f381209q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.na5)) {
            return false;
        }
        r45.na5 na5Var = (r45.na5) fVar;
        return n51.f.a(this.f381199d, na5Var.f381199d) && n51.f.a(this.f381200e, na5Var.f381200e) && n51.f.a(java.lang.Integer.valueOf(this.f381201f), java.lang.Integer.valueOf(na5Var.f381201f)) && n51.f.a(this.f381202g, na5Var.f381202g) && n51.f.a(this.f381203h, na5Var.f381203h) && n51.f.a(this.f381204i, na5Var.f381204i) && n51.f.a(this.f381205m, na5Var.f381205m) && n51.f.a(this.f381206n, na5Var.f381206n) && n51.f.a(this.f381207o, na5Var.f381207o) && n51.f.a(this.f381208p, na5Var.f381208p) && n51.f.a(this.f381209q, na5Var.f381209q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381199d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381200e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f381201f);
            r45.c70 c70Var = this.f381202g;
            if (c70Var != null) {
                fVar.i(4, c70Var.computeSize());
                this.f381202g.writeFields(fVar);
            }
            r45.bq bqVar = this.f381203h;
            if (bqVar != null) {
                fVar.i(5, bqVar.computeSize());
                this.f381203h.writeFields(fVar);
            }
            r45.bq bqVar2 = this.f381204i;
            if (bqVar2 != null) {
                fVar.i(6, bqVar2.computeSize());
                this.f381204i.writeFields(fVar);
            }
            java.lang.String str3 = this.f381205m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f381206n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f381207o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f381208p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f381209q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f381199d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f381200e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f381201f);
            r45.c70 c70Var2 = this.f381202g;
            if (c70Var2 != null) {
                e17 += b36.f.i(4, c70Var2.computeSize());
            }
            r45.bq bqVar3 = this.f381203h;
            if (bqVar3 != null) {
                e17 += b36.f.i(5, bqVar3.computeSize());
            }
            r45.bq bqVar4 = this.f381204i;
            if (bqVar4 != null) {
                e17 += b36.f.i(6, bqVar4.computeSize());
            }
            java.lang.String str10 = this.f381205m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f381206n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f381207o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f381208p;
            if (str13 != null) {
                e17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f381209q;
            return str14 != null ? e17 + b36.f.j(11, str14) : e17;
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
        r45.na5 na5Var = (r45.na5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                na5Var.f381199d = aVar2.k(intValue);
                return 0;
            case 2:
                na5Var.f381200e = aVar2.k(intValue);
                return 0;
            case 3:
                na5Var.f381201f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.c70 c70Var3 = new r45.c70();
                    if (bArr != null && bArr.length > 0) {
                        c70Var3.parseFrom(bArr);
                    }
                    na5Var.f381202g = c70Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.bq bqVar5 = new r45.bq();
                    if (bArr2 != null && bArr2.length > 0) {
                        bqVar5.parseFrom(bArr2);
                    }
                    na5Var.f381203h = bqVar5;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.bq bqVar6 = new r45.bq();
                    if (bArr3 != null && bArr3.length > 0) {
                        bqVar6.parseFrom(bArr3);
                    }
                    na5Var.f381204i = bqVar6;
                }
                return 0;
            case 7:
                na5Var.f381205m = aVar2.k(intValue);
                return 0;
            case 8:
                na5Var.f381206n = aVar2.k(intValue);
                return 0;
            case 9:
                na5Var.f381207o = aVar2.k(intValue);
                return 0;
            case 10:
                na5Var.f381208p = aVar2.k(intValue);
                return 0;
            case 11:
                na5Var.f381209q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
