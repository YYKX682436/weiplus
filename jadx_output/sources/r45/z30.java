package r45;

/* loaded from: classes8.dex */
public class z30 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f391661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391662e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391663f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391664g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f391665h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f391666i;

    /* renamed from: m, reason: collision with root package name */
    public int f391667m;

    /* renamed from: n, reason: collision with root package name */
    public r45.j16 f391668n;

    /* renamed from: o, reason: collision with root package name */
    public r45.l36 f391669o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f391670p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391671q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z30)) {
            return false;
        }
        r45.z30 z30Var = (r45.z30) fVar;
        return n51.f.a(this.BaseRequest, z30Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f391661d), java.lang.Integer.valueOf(z30Var.f391661d)) && n51.f.a(this.f391662e, z30Var.f391662e) && n51.f.a(this.f391663f, z30Var.f391663f) && n51.f.a(this.f391664g, z30Var.f391664g) && n51.f.a(this.f391665h, z30Var.f391665h) && n51.f.a(java.lang.Integer.valueOf(this.f391666i), java.lang.Integer.valueOf(z30Var.f391666i)) && n51.f.a(java.lang.Integer.valueOf(this.f391667m), java.lang.Integer.valueOf(z30Var.f391667m)) && n51.f.a(this.f391668n, z30Var.f391668n) && n51.f.a(this.f391669o, z30Var.f391669o) && n51.f.a(this.f391670p, z30Var.f391670p) && n51.f.a(this.f391671q, z30Var.f391671q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f391661d);
            java.lang.String str = this.f391662e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f391663f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f391664g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, this.f391665h);
            fVar.e(7, this.f391666i);
            fVar.e(8, this.f391667m);
            r45.j16 j16Var = this.f391668n;
            if (j16Var != null) {
                fVar.i(9, j16Var.computeSize());
                this.f391668n.writeFields(fVar);
            }
            r45.l36 l36Var = this.f391669o;
            if (l36Var != null) {
                fVar.i(10, l36Var.computeSize());
                this.f391669o.writeFields(fVar);
            }
            java.lang.String str4 = this.f391670p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f391671q;
            if (gVar != null) {
                fVar.b(12, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f391661d);
            java.lang.String str5 = this.f391662e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f391663f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f391664g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int g17 = i18 + b36.f.g(6, 8, this.f391665h) + b36.f.e(7, this.f391666i) + b36.f.e(8, this.f391667m);
            r45.j16 j16Var2 = this.f391668n;
            if (j16Var2 != null) {
                g17 += b36.f.i(9, j16Var2.computeSize());
            }
            r45.l36 l36Var2 = this.f391669o;
            if (l36Var2 != null) {
                g17 += b36.f.i(10, l36Var2.computeSize());
            }
            java.lang.String str8 = this.f391670p;
            if (str8 != null) {
                g17 += b36.f.j(11, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f391671q;
            return gVar2 != null ? g17 + b36.f.b(12, gVar2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f391665h.clear();
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
        r45.z30 z30Var = (r45.z30) objArr[1];
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
                    z30Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                z30Var.f391661d = aVar2.g(intValue);
                return 0;
            case 3:
                z30Var.f391662e = aVar2.k(intValue);
                return 0;
            case 4:
                z30Var.f391663f = aVar2.k(intValue);
                return 0;
            case 5:
                z30Var.f391664g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.y30 y30Var = new r45.y30();
                    if (bArr3 != null && bArr3.length > 0) {
                        y30Var.parseFrom(bArr3);
                    }
                    z30Var.f391665h.add(y30Var);
                }
                return 0;
            case 7:
                z30Var.f391666i = aVar2.g(intValue);
                return 0;
            case 8:
                z30Var.f391667m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.j16 j16Var3 = new r45.j16();
                    if (bArr4 != null && bArr4.length > 0) {
                        j16Var3.parseFrom(bArr4);
                    }
                    z30Var.f391668n = j16Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.l36 l36Var3 = new r45.l36();
                    if (bArr5 != null && bArr5.length > 0) {
                        l36Var3.parseFrom(bArr5);
                    }
                    z30Var.f391669o = l36Var3;
                }
                return 0;
            case 11:
                z30Var.f391670p = aVar2.k(intValue);
                return 0;
            case 12:
                z30Var.f391671q = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
