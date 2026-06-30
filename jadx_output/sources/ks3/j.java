package ks3;

/* loaded from: classes8.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f311690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311691e;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f311696m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f311697n;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f311692f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f311693g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f311694h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f311695i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f311698o = 20;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.j)) {
            return false;
        }
        ks3.j jVar = (ks3.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f311690d), java.lang.Integer.valueOf(jVar.f311690d)) && n51.f.a(this.f311691e, jVar.f311691e) && n51.f.a(this.f311692f, jVar.f311692f) && n51.f.a(this.f311693g, jVar.f311693g) && n51.f.a(this.f311694h, jVar.f311694h) && n51.f.a(this.f311695i, jVar.f311695i) && n51.f.a(this.f311696m, jVar.f311696m) && n51.f.a(this.f311697n, jVar.f311697n) && n51.f.a(java.lang.Integer.valueOf(this.f311698o), java.lang.Integer.valueOf(jVar.f311698o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f311690d);
            java.lang.String str = this.f311691e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f311692f);
            fVar.g(4, 8, this.f311693g);
            fVar.g(5, 8, this.f311694h);
            fVar.g(6, 8, this.f311695i);
            java.lang.String str2 = this.f311696m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f311697n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f311698o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f311690d) + 0;
            java.lang.String str4 = this.f311691e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int g17 = e17 + b36.f.g(3, 8, this.f311692f) + b36.f.g(4, 8, this.f311693g) + b36.f.g(5, 8, this.f311694h) + b36.f.g(6, 8, this.f311695i);
            java.lang.String str5 = this.f311696m;
            if (str5 != null) {
                g17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f311697n;
            if (str6 != null) {
                g17 += b36.f.j(8, str6);
            }
            return g17 + b36.f.e(9, this.f311698o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f311692f.clear();
            this.f311693g.clear();
            this.f311694h.clear();
            this.f311695i.clear();
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
        ks3.j jVar = (ks3.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jVar.f311690d = aVar2.g(intValue);
                return 0;
            case 2:
                jVar.f311691e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ks3.u uVar = new ks3.u();
                    if (bArr2 != null && bArr2.length > 0) {
                        uVar.parseFrom(bArr2);
                    }
                    jVar.f311692f.add(uVar);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    ks3.u uVar2 = new ks3.u();
                    if (bArr3 != null && bArr3.length > 0) {
                        uVar2.parseFrom(bArr3);
                    }
                    jVar.f311693g.add(uVar2);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    ks3.u uVar3 = new ks3.u();
                    if (bArr4 != null && bArr4.length > 0) {
                        uVar3.parseFrom(bArr4);
                    }
                    jVar.f311694h.add(uVar3);
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    ks3.v0 v0Var = new ks3.v0();
                    if (bArr5 != null && bArr5.length > 0) {
                        v0Var.parseFrom(bArr5);
                    }
                    jVar.f311695i.add(v0Var);
                }
                return 0;
            case 7:
                jVar.f311696m = aVar2.k(intValue);
                return 0;
            case 8:
                jVar.f311697n = aVar2.k(intValue);
                return 0;
            case 9:
                jVar.f311698o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
