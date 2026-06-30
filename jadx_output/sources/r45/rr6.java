package r45;

/* loaded from: classes9.dex */
public class rr6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385154d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385155e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385156f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385157g;

    /* renamed from: h, reason: collision with root package name */
    public r45.b74 f385158h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f385159i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f385160m;

    /* renamed from: n, reason: collision with root package name */
    public int f385161n;

    /* renamed from: o, reason: collision with root package name */
    public r45.qr6 f385162o;

    /* renamed from: p, reason: collision with root package name */
    public r45.qr6 f385163p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rr6)) {
            return false;
        }
        r45.rr6 rr6Var = (r45.rr6) fVar;
        return n51.f.a(this.f385154d, rr6Var.f385154d) && n51.f.a(this.f385155e, rr6Var.f385155e) && n51.f.a(this.f385156f, rr6Var.f385156f) && n51.f.a(this.f385157g, rr6Var.f385157g) && n51.f.a(this.f385158h, rr6Var.f385158h) && n51.f.a(this.f385159i, rr6Var.f385159i) && n51.f.a(java.lang.Integer.valueOf(this.f385160m), java.lang.Integer.valueOf(rr6Var.f385160m)) && n51.f.a(java.lang.Integer.valueOf(this.f385161n), java.lang.Integer.valueOf(rr6Var.f385161n)) && n51.f.a(this.f385162o, rr6Var.f385162o) && n51.f.a(this.f385163p, rr6Var.f385163p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385159i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385154d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385155e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385156f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f385157g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.b74 b74Var = this.f385158h;
            if (b74Var != null) {
                fVar.i(5, b74Var.computeSize());
                this.f385158h.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f385160m);
            fVar.e(8, this.f385161n);
            r45.qr6 qr6Var = this.f385162o;
            if (qr6Var != null) {
                fVar.i(9, qr6Var.computeSize());
                this.f385162o.writeFields(fVar);
            }
            r45.qr6 qr6Var2 = this.f385163p;
            if (qr6Var2 != null) {
                fVar.i(10, qr6Var2.computeSize());
                this.f385163p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f385154d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f385155e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f385156f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f385157g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            r45.b74 b74Var2 = this.f385158h;
            if (b74Var2 != null) {
                j17 += b36.f.i(5, b74Var2.computeSize());
            }
            int g17 = j17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f385160m) + b36.f.e(8, this.f385161n);
            r45.qr6 qr6Var3 = this.f385162o;
            if (qr6Var3 != null) {
                g17 += b36.f.i(9, qr6Var3.computeSize());
            }
            r45.qr6 qr6Var4 = this.f385163p;
            return qr6Var4 != null ? g17 + b36.f.i(10, qr6Var4.computeSize()) : g17;
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
        r45.rr6 rr6Var = (r45.rr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rr6Var.f385154d = aVar2.k(intValue);
                return 0;
            case 2:
                rr6Var.f385155e = aVar2.k(intValue);
                return 0;
            case 3:
                rr6Var.f385156f = aVar2.k(intValue);
                return 0;
            case 4:
                rr6Var.f385157g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.b74 b74Var3 = new r45.b74();
                    if (bArr2 != null && bArr2.length > 0) {
                        b74Var3.parseFrom(bArr2);
                    }
                    rr6Var.f385158h = b74Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.pr6 pr6Var = new r45.pr6();
                    if (bArr3 != null && bArr3.length > 0) {
                        pr6Var.parseFrom(bArr3);
                    }
                    rr6Var.f385159i.add(pr6Var);
                }
                return 0;
            case 7:
                rr6Var.f385160m = aVar2.g(intValue);
                return 0;
            case 8:
                rr6Var.f385161n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.qr6 qr6Var5 = new r45.qr6();
                    if (bArr4 != null && bArr4.length > 0) {
                        qr6Var5.parseFrom(bArr4);
                    }
                    rr6Var.f385162o = qr6Var5;
                }
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.qr6 qr6Var6 = new r45.qr6();
                    if (bArr5 != null && bArr5.length > 0) {
                        qr6Var6.parseFrom(bArr5);
                    }
                    rr6Var.f385163p = qr6Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
