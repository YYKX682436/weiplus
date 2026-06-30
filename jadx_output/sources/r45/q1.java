package r45;

/* loaded from: classes4.dex */
public class q1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383550d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383551e;

    /* renamed from: f, reason: collision with root package name */
    public int f383552f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383553g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383554h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383555i;

    /* renamed from: m, reason: collision with root package name */
    public r45.m1 f383556m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383557n;

    /* renamed from: o, reason: collision with root package name */
    public r45.g8 f383558o;

    /* renamed from: p, reason: collision with root package name */
    public r45.a9 f383559p;

    /* renamed from: q, reason: collision with root package name */
    public r45.z8 f383560q;

    /* renamed from: r, reason: collision with root package name */
    public r45.z8 f383561r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q1)) {
            return false;
        }
        r45.q1 q1Var = (r45.q1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383550d), java.lang.Integer.valueOf(q1Var.f383550d)) && n51.f.a(this.f383551e, q1Var.f383551e) && n51.f.a(java.lang.Integer.valueOf(this.f383552f), java.lang.Integer.valueOf(q1Var.f383552f)) && n51.f.a(this.f383553g, q1Var.f383553g) && n51.f.a(this.f383554h, q1Var.f383554h) && n51.f.a(this.f383555i, q1Var.f383555i) && n51.f.a(this.f383556m, q1Var.f383556m) && n51.f.a(this.f383557n, q1Var.f383557n) && n51.f.a(this.f383558o, q1Var.f383558o) && n51.f.a(this.f383559p, q1Var.f383559p) && n51.f.a(this.f383560q, q1Var.f383560q) && n51.f.a(this.f383561r, q1Var.f383561r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383550d);
            java.lang.String str = this.f383551e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f383552f);
            java.lang.String str2 = this.f383553g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f383554h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f383555i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.m1 m1Var = this.f383556m;
            if (m1Var != null) {
                fVar.i(7, m1Var.computeSize());
                this.f383556m.writeFields(fVar);
            }
            java.lang.String str5 = this.f383557n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            r45.g8 g8Var = this.f383558o;
            if (g8Var != null) {
                fVar.i(9, g8Var.computeSize());
                this.f383558o.writeFields(fVar);
            }
            r45.a9 a9Var = this.f383559p;
            if (a9Var != null) {
                fVar.i(10, a9Var.computeSize());
                this.f383559p.writeFields(fVar);
            }
            r45.z8 z8Var = this.f383560q;
            if (z8Var != null) {
                fVar.i(11, z8Var.computeSize());
                this.f383560q.writeFields(fVar);
            }
            r45.z8 z8Var2 = this.f383561r;
            if (z8Var2 != null) {
                fVar.i(12, z8Var2.computeSize());
                this.f383561r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383550d) + 0;
            java.lang.String str6 = this.f383551e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            int e18 = e17 + b36.f.e(3, this.f383552f);
            java.lang.String str7 = this.f383553g;
            if (str7 != null) {
                e18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f383554h;
            if (str8 != null) {
                e18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f383555i;
            if (str9 != null) {
                e18 += b36.f.j(6, str9);
            }
            r45.m1 m1Var2 = this.f383556m;
            if (m1Var2 != null) {
                e18 += b36.f.i(7, m1Var2.computeSize());
            }
            java.lang.String str10 = this.f383557n;
            if (str10 != null) {
                e18 += b36.f.j(8, str10);
            }
            r45.g8 g8Var2 = this.f383558o;
            if (g8Var2 != null) {
                e18 += b36.f.i(9, g8Var2.computeSize());
            }
            r45.a9 a9Var2 = this.f383559p;
            if (a9Var2 != null) {
                e18 += b36.f.i(10, a9Var2.computeSize());
            }
            r45.z8 z8Var3 = this.f383560q;
            if (z8Var3 != null) {
                e18 += b36.f.i(11, z8Var3.computeSize());
            }
            r45.z8 z8Var4 = this.f383561r;
            return z8Var4 != null ? e18 + b36.f.i(12, z8Var4.computeSize()) : e18;
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
        r45.q1 q1Var = (r45.q1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q1Var.f383550d = aVar2.g(intValue);
                return 0;
            case 2:
                q1Var.f383551e = aVar2.k(intValue);
                return 0;
            case 3:
                q1Var.f383552f = aVar2.g(intValue);
                return 0;
            case 4:
                q1Var.f383553g = aVar2.k(intValue);
                return 0;
            case 5:
                q1Var.f383554h = aVar2.k(intValue);
                return 0;
            case 6:
                q1Var.f383555i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.m1 m1Var3 = new r45.m1();
                    if (bArr != null && bArr.length > 0) {
                        m1Var3.parseFrom(bArr);
                    }
                    q1Var.f383556m = m1Var3;
                }
                return 0;
            case 8:
                q1Var.f383557n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.g8 g8Var3 = new r45.g8();
                    if (bArr2 != null && bArr2.length > 0) {
                        g8Var3.parseFrom(bArr2);
                    }
                    q1Var.f383558o = g8Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.a9 a9Var3 = new r45.a9();
                    if (bArr3 != null && bArr3.length > 0) {
                        a9Var3.parseFrom(bArr3);
                    }
                    q1Var.f383559p = a9Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.z8 z8Var5 = new r45.z8();
                    if (bArr4 != null && bArr4.length > 0) {
                        z8Var5.parseFrom(bArr4);
                    }
                    q1Var.f383560q = z8Var5;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.z8 z8Var6 = new r45.z8();
                    if (bArr5 != null && bArr5.length > 0) {
                        z8Var6.parseFrom(bArr5);
                    }
                    q1Var.f383561r = z8Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
