package r45;

/* loaded from: classes15.dex */
public class dg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f372437d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372439f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372440g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372441h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f372443m;

    /* renamed from: n, reason: collision with root package name */
    public int f372444n;

    /* renamed from: o, reason: collision with root package name */
    public int f372445o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f372446p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f372447q;

    /* renamed from: r, reason: collision with root package name */
    public r45.qx4 f372448r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372449s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f372450t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372451u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f372452v;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372438e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f372442i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dg5)) {
            return false;
        }
        r45.dg5 dg5Var = (r45.dg5) fVar;
        return n51.f.a(this.BaseResponse, dg5Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f372437d), java.lang.Boolean.valueOf(dg5Var.f372437d)) && n51.f.a(this.f372438e, dg5Var.f372438e) && n51.f.a(this.f372439f, dg5Var.f372439f) && n51.f.a(this.f372440g, dg5Var.f372440g) && n51.f.a(this.f372441h, dg5Var.f372441h) && n51.f.a(this.f372442i, dg5Var.f372442i) && n51.f.a(java.lang.Boolean.valueOf(this.f372443m), java.lang.Boolean.valueOf(dg5Var.f372443m)) && n51.f.a(java.lang.Integer.valueOf(this.f372444n), java.lang.Integer.valueOf(dg5Var.f372444n)) && n51.f.a(java.lang.Integer.valueOf(this.f372445o), java.lang.Integer.valueOf(dg5Var.f372445o)) && n51.f.a(this.f372446p, dg5Var.f372446p) && n51.f.a(this.f372447q, dg5Var.f372447q) && n51.f.a(this.f372448r, dg5Var.f372448r) && n51.f.a(this.f372449s, dg5Var.f372449s) && n51.f.a(java.lang.Boolean.valueOf(this.f372450t), java.lang.Boolean.valueOf(dg5Var.f372450t)) && n51.f.a(this.f372451u, dg5Var.f372451u) && n51.f.a(java.lang.Boolean.valueOf(this.f372452v), java.lang.Boolean.valueOf(dg5Var.f372452v));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372442i;
        java.util.LinkedList linkedList2 = this.f372438e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.a(2, this.f372437d);
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f372439f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f372440g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f372441h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.g(7, 8, linkedList);
            fVar.a(8, this.f372443m);
            fVar.e(9, this.f372444n);
            fVar.e(10, this.f372445o);
            java.lang.String str4 = this.f372446p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f372447q;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            r45.qx4 qx4Var = this.f372448r;
            if (qx4Var != null) {
                fVar.i(13, qx4Var.computeSize());
                this.f372448r.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f372449s;
            if (gVar != null) {
                fVar.b(14, gVar);
            }
            fVar.a(15, this.f372450t);
            com.tencent.mm.protobuf.g gVar2 = this.f372451u;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            fVar.a(17, this.f372452v);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.a(2, this.f372437d) + b36.f.g(3, 8, linkedList2);
            java.lang.String str6 = this.f372439f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f372440g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f372441h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList) + b36.f.a(8, this.f372443m) + b36.f.e(9, this.f372444n) + b36.f.e(10, this.f372445o);
            java.lang.String str9 = this.f372446p;
            if (str9 != null) {
                g17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f372447q;
            if (str10 != null) {
                g17 += b36.f.j(12, str10);
            }
            r45.qx4 qx4Var2 = this.f372448r;
            if (qx4Var2 != null) {
                g17 += b36.f.i(13, qx4Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f372449s;
            if (gVar3 != null) {
                g17 += b36.f.b(14, gVar3);
            }
            int a17 = g17 + b36.f.a(15, this.f372450t);
            com.tencent.mm.protobuf.g gVar4 = this.f372451u;
            if (gVar4 != null) {
                a17 += b36.f.b(16, gVar4);
            }
            return a17 + b36.f.a(17, this.f372452v);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.dg5 dg5Var = (r45.dg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    dg5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                dg5Var.f372437d = aVar2.c(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.px4 px4Var = new r45.px4();
                    if (bArr3 != null && bArr3.length > 0) {
                        px4Var.parseFrom(bArr3);
                    }
                    dg5Var.f372438e.add(px4Var);
                }
                return 0;
            case 4:
                dg5Var.f372439f = aVar2.k(intValue);
                return 0;
            case 5:
                dg5Var.f372440g = aVar2.k(intValue);
                return 0;
            case 6:
                dg5Var.f372441h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.mx4 mx4Var = new r45.mx4();
                    if (bArr4 != null && bArr4.length > 0) {
                        mx4Var.parseFrom(bArr4);
                    }
                    dg5Var.f372442i.add(mx4Var);
                }
                return 0;
            case 8:
                dg5Var.f372443m = aVar2.c(intValue);
                return 0;
            case 9:
                dg5Var.f372444n = aVar2.g(intValue);
                return 0;
            case 10:
                dg5Var.f372445o = aVar2.g(intValue);
                return 0;
            case 11:
                dg5Var.f372446p = aVar2.k(intValue);
                return 0;
            case 12:
                dg5Var.f372447q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qx4 qx4Var3 = new r45.qx4();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx4Var3.parseFrom(bArr5);
                    }
                    dg5Var.f372448r = qx4Var3;
                }
                return 0;
            case 14:
                dg5Var.f372449s = aVar2.d(intValue);
                return 0;
            case 15:
                dg5Var.f372450t = aVar2.c(intValue);
                return 0;
            case 16:
                dg5Var.f372451u = aVar2.d(intValue);
                return 0;
            case 17:
                dg5Var.f372452v = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
