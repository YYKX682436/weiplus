package r45;

/* loaded from: classes9.dex */
public class c17 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371223d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f371224e;

    /* renamed from: f, reason: collision with root package name */
    public int f371225f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371226g;

    /* renamed from: h, reason: collision with root package name */
    public int f371227h;

    /* renamed from: i, reason: collision with root package name */
    public int f371228i;

    /* renamed from: m, reason: collision with root package name */
    public int f371229m;

    /* renamed from: n, reason: collision with root package name */
    public int f371230n;

    /* renamed from: o, reason: collision with root package name */
    public int f371231o;

    /* renamed from: p, reason: collision with root package name */
    public int f371232p;

    /* renamed from: q, reason: collision with root package name */
    public int f371233q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f371234r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f371235s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c17)) {
            return false;
        }
        r45.c17 c17Var = (r45.c17) fVar;
        return n51.f.a(this.BaseRequest, c17Var.BaseRequest) && n51.f.a(this.f371223d, c17Var.f371223d) && n51.f.a(this.f371224e, c17Var.f371224e) && n51.f.a(java.lang.Integer.valueOf(this.f371225f), java.lang.Integer.valueOf(c17Var.f371225f)) && n51.f.a(this.f371226g, c17Var.f371226g) && n51.f.a(java.lang.Integer.valueOf(this.f371227h), java.lang.Integer.valueOf(c17Var.f371227h)) && n51.f.a(java.lang.Integer.valueOf(this.f371228i), java.lang.Integer.valueOf(c17Var.f371228i)) && n51.f.a(java.lang.Integer.valueOf(this.f371229m), java.lang.Integer.valueOf(c17Var.f371229m)) && n51.f.a(java.lang.Integer.valueOf(this.f371230n), java.lang.Integer.valueOf(c17Var.f371230n)) && n51.f.a(java.lang.Integer.valueOf(this.f371231o), java.lang.Integer.valueOf(c17Var.f371231o)) && n51.f.a(java.lang.Integer.valueOf(this.f371232p), java.lang.Integer.valueOf(c17Var.f371232p)) && n51.f.a(java.lang.Integer.valueOf(this.f371233q), java.lang.Integer.valueOf(c17Var.f371233q)) && n51.f.a(this.f371234r, c17Var.f371234r) && n51.f.a(this.f371235s, c17Var.f371235s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371235s;
        java.util.LinkedList linkedList2 = this.f371234r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f371223d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f371224e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f371224e.writeFields(fVar);
            }
            fVar.e(4, this.f371225f);
            java.lang.String str2 = this.f371226g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f371227h);
            fVar.e(7, this.f371228i);
            fVar.e(8, this.f371229m);
            fVar.e(9, this.f371230n);
            fVar.e(10, this.f371231o);
            fVar.e(11, this.f371232p);
            fVar.e(12, this.f371233q);
            fVar.g(13, 8, linkedList2);
            fVar.g(14, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str3 = this.f371223d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            r45.cu5 cu5Var2 = this.f371224e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f371225f);
            java.lang.String str4 = this.f371226g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f371227h) + b36.f.e(7, this.f371228i) + b36.f.e(8, this.f371229m) + b36.f.e(9, this.f371230n) + b36.f.e(10, this.f371231o) + b36.f.e(11, this.f371232p) + b36.f.e(12, this.f371233q) + b36.f.g(13, 8, linkedList2) + b36.f.g(14, 8, linkedList);
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
        r45.c17 c17Var = (r45.c17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    c17Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                c17Var.f371223d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    c17Var.f371224e = cu5Var3;
                }
                return 0;
            case 4:
                c17Var.f371225f = aVar2.g(intValue);
                return 0;
            case 5:
                c17Var.f371226g = aVar2.k(intValue);
                return 0;
            case 6:
                c17Var.f371227h = aVar2.g(intValue);
                return 0;
            case 7:
                c17Var.f371228i = aVar2.g(intValue);
                return 0;
            case 8:
                c17Var.f371229m = aVar2.g(intValue);
                return 0;
            case 9:
                c17Var.f371230n = aVar2.g(intValue);
                return 0;
            case 10:
                c17Var.f371231o = aVar2.g(intValue);
                return 0;
            case 11:
                c17Var.f371232p = aVar2.g(intValue);
                return 0;
            case 12:
                c17Var.f371233q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var.b(bArr4);
                    }
                    c17Var.f371234r.add(du5Var);
                }
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var4 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var4.b(bArr5);
                    }
                    c17Var.f371235s.add(cu5Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}
