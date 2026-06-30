package r45;

/* loaded from: classes9.dex */
public class be4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370696d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f370697e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f370698f;

    /* renamed from: g, reason: collision with root package name */
    public r45.gd f370699g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370700h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f370701i;

    /* renamed from: m, reason: collision with root package name */
    public int f370702m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370703n;

    /* renamed from: o, reason: collision with root package name */
    public int f370704o;

    /* renamed from: p, reason: collision with root package name */
    public r45.qm6 f370705p;

    /* renamed from: q, reason: collision with root package name */
    public r45.c70 f370706q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f370707r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f370708s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.be4)) {
            return false;
        }
        r45.be4 be4Var = (r45.be4) fVar;
        return n51.f.a(this.f370696d, be4Var.f370696d) && n51.f.a(this.f370697e, be4Var.f370697e) && n51.f.a(java.lang.Boolean.valueOf(this.f370698f), java.lang.Boolean.valueOf(be4Var.f370698f)) && n51.f.a(this.f370699g, be4Var.f370699g) && n51.f.a(this.f370700h, be4Var.f370700h) && n51.f.a(java.lang.Boolean.valueOf(this.f370701i), java.lang.Boolean.valueOf(be4Var.f370701i)) && n51.f.a(java.lang.Integer.valueOf(this.f370702m), java.lang.Integer.valueOf(be4Var.f370702m)) && n51.f.a(this.f370703n, be4Var.f370703n) && n51.f.a(java.lang.Integer.valueOf(this.f370704o), java.lang.Integer.valueOf(be4Var.f370704o)) && n51.f.a(this.f370705p, be4Var.f370705p) && n51.f.a(this.f370706q, be4Var.f370706q) && n51.f.a(this.f370707r, be4Var.f370707r) && n51.f.a(this.f370708s, be4Var.f370708s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370697e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370696d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f370698f);
            r45.gd gdVar = this.f370699g;
            if (gdVar != null) {
                fVar.i(4, gdVar.computeSize());
                this.f370699g.writeFields(fVar);
            }
            java.lang.String str2 = this.f370700h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f370701i);
            fVar.e(7, this.f370702m);
            java.lang.String str3 = this.f370703n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f370704o);
            r45.qm6 qm6Var = this.f370705p;
            if (qm6Var != null) {
                fVar.i(10, qm6Var.computeSize());
                this.f370705p.writeFields(fVar);
            }
            r45.c70 c70Var = this.f370706q;
            if (c70Var != null) {
                fVar.i(11, c70Var.computeSize());
                this.f370706q.writeFields(fVar);
            }
            java.lang.String str4 = this.f370707r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f370708s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f370696d;
            int j17 = (str6 != null ? b36.f.j(1, str6) + 0 : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f370698f);
            r45.gd gdVar2 = this.f370699g;
            if (gdVar2 != null) {
                j17 += b36.f.i(4, gdVar2.computeSize());
            }
            java.lang.String str7 = this.f370700h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            int a17 = j17 + b36.f.a(6, this.f370701i) + b36.f.e(7, this.f370702m);
            java.lang.String str8 = this.f370703n;
            if (str8 != null) {
                a17 += b36.f.j(8, str8);
            }
            int e17 = a17 + b36.f.e(9, this.f370704o);
            r45.qm6 qm6Var2 = this.f370705p;
            if (qm6Var2 != null) {
                e17 += b36.f.i(10, qm6Var2.computeSize());
            }
            r45.c70 c70Var2 = this.f370706q;
            if (c70Var2 != null) {
                e17 += b36.f.i(11, c70Var2.computeSize());
            }
            java.lang.String str9 = this.f370707r;
            if (str9 != null) {
                e17 += b36.f.j(12, str9);
            }
            java.lang.String str10 = this.f370708s;
            return str10 != null ? e17 + b36.f.j(13, str10) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.be4 be4Var = (r45.be4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                be4Var.f370696d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.qv qvVar = new r45.qv();
                    if (bArr2 != null && bArr2.length > 0) {
                        qvVar.parseFrom(bArr2);
                    }
                    be4Var.f370697e.add(qvVar);
                }
                return 0;
            case 3:
                be4Var.f370698f = aVar2.c(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.gd gdVar3 = new r45.gd();
                    if (bArr3 != null && bArr3.length > 0) {
                        gdVar3.parseFrom(bArr3);
                    }
                    be4Var.f370699g = gdVar3;
                }
                return 0;
            case 5:
                be4Var.f370700h = aVar2.k(intValue);
                return 0;
            case 6:
                be4Var.f370701i = aVar2.c(intValue);
                return 0;
            case 7:
                be4Var.f370702m = aVar2.g(intValue);
                return 0;
            case 8:
                be4Var.f370703n = aVar2.k(intValue);
                return 0;
            case 9:
                be4Var.f370704o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.qm6 qm6Var3 = new r45.qm6();
                    if (bArr4 != null && bArr4.length > 0) {
                        qm6Var3.parseFrom(bArr4);
                    }
                    be4Var.f370705p = qm6Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.c70 c70Var3 = new r45.c70();
                    if (bArr5 != null && bArr5.length > 0) {
                        c70Var3.parseFrom(bArr5);
                    }
                    be4Var.f370706q = c70Var3;
                }
                return 0;
            case 12:
                be4Var.f370707r = aVar2.k(intValue);
                return 0;
            case 13:
                be4Var.f370708s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
