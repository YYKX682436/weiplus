package r45;

/* loaded from: classes11.dex */
public class vy4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388663d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388664e;

    /* renamed from: f, reason: collision with root package name */
    public int f388665f;

    /* renamed from: g, reason: collision with root package name */
    public int f388666g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388667h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388668i;

    /* renamed from: m, reason: collision with root package name */
    public int f388669m;

    /* renamed from: n, reason: collision with root package name */
    public r45.kk0 f388670n;

    /* renamed from: o, reason: collision with root package name */
    public r45.fn0 f388671o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f388672p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f388673q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vy4)) {
            return false;
        }
        r45.vy4 vy4Var = (r45.vy4) fVar;
        return n51.f.a(this.f388663d, vy4Var.f388663d) && n51.f.a(this.f388664e, vy4Var.f388664e) && n51.f.a(java.lang.Integer.valueOf(this.f388665f), java.lang.Integer.valueOf(vy4Var.f388665f)) && n51.f.a(java.lang.Integer.valueOf(this.f388666g), java.lang.Integer.valueOf(vy4Var.f388666g)) && n51.f.a(this.f388667h, vy4Var.f388667h) && n51.f.a(this.f388668i, vy4Var.f388668i) && n51.f.a(java.lang.Integer.valueOf(this.f388669m), java.lang.Integer.valueOf(vy4Var.f388669m)) && n51.f.a(this.f388670n, vy4Var.f388670n) && n51.f.a(this.f388671o, vy4Var.f388671o) && n51.f.a(this.f388672p, vy4Var.f388672p) && n51.f.a(this.f388673q, vy4Var.f388673q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388673q;
        java.util.LinkedList linkedList2 = this.f388672p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388663d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388664e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f388665f);
            fVar.e(4, this.f388666g);
            java.lang.String str3 = this.f388667h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f388668i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f388669m);
            r45.kk0 kk0Var = this.f388670n;
            if (kk0Var != null) {
                fVar.i(8, kk0Var.computeSize());
                this.f388670n.writeFields(fVar);
            }
            r45.fn0 fn0Var = this.f388671o;
            if (fn0Var != null) {
                fVar.i(9, fn0Var.computeSize());
                this.f388671o.writeFields(fVar);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f388663d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f388664e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f388665f) + b36.f.e(4, this.f388666g);
            java.lang.String str7 = this.f388667h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f388668i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int e18 = e17 + b36.f.e(7, this.f388669m);
            r45.kk0 kk0Var2 = this.f388670n;
            if (kk0Var2 != null) {
                e18 += b36.f.i(8, kk0Var2.computeSize());
            }
            r45.fn0 fn0Var2 = this.f388671o;
            if (fn0Var2 != null) {
                e18 += b36.f.i(9, fn0Var2.computeSize());
            }
            return e18 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList);
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
        r45.vy4 vy4Var = (r45.vy4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vy4Var.f388663d = aVar2.k(intValue);
                return 0;
            case 2:
                vy4Var.f388664e = aVar2.k(intValue);
                return 0;
            case 3:
                vy4Var.f388665f = aVar2.g(intValue);
                return 0;
            case 4:
                vy4Var.f388666g = aVar2.g(intValue);
                return 0;
            case 5:
                vy4Var.f388667h = aVar2.k(intValue);
                return 0;
            case 6:
                vy4Var.f388668i = aVar2.k(intValue);
                return 0;
            case 7:
                vy4Var.f388669m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.kk0 kk0Var3 = new r45.kk0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kk0Var3.parseFrom(bArr2);
                    }
                    vy4Var.f388670n = kk0Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.fn0 fn0Var3 = new r45.fn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        fn0Var3.parseFrom(bArr3);
                    }
                    vy4Var.f388671o = fn0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.hs5 hs5Var = new r45.hs5();
                    if (bArr4 != null && bArr4.length > 0) {
                        hs5Var.parseFrom(bArr4);
                    }
                    vy4Var.f388672p.add(hs5Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.hs5 hs5Var2 = new r45.hs5();
                    if (bArr5 != null && bArr5.length > 0) {
                        hs5Var2.parseFrom(bArr5);
                    }
                    vy4Var.f388673q.add(hs5Var2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
