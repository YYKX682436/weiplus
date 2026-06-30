package r45;

/* loaded from: classes11.dex */
public class ly6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379980d;

    /* renamed from: e, reason: collision with root package name */
    public int f379981e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379983g;

    /* renamed from: h, reason: collision with root package name */
    public int f379984h;

    /* renamed from: m, reason: collision with root package name */
    public int f379986m;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f379988o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f379989p;

    /* renamed from: q, reason: collision with root package name */
    public int f379990q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379991r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379992s;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f379982f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f379985i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f379987n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ly6)) {
            return false;
        }
        r45.ly6 ly6Var = (r45.ly6) fVar;
        return n51.f.a(this.BaseRequest, ly6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f379980d), java.lang.Integer.valueOf(ly6Var.f379980d)) && n51.f.a(java.lang.Integer.valueOf(this.f379981e), java.lang.Integer.valueOf(ly6Var.f379981e)) && n51.f.a(this.f379982f, ly6Var.f379982f) && n51.f.a(this.f379983g, ly6Var.f379983g) && n51.f.a(java.lang.Integer.valueOf(this.f379984h), java.lang.Integer.valueOf(ly6Var.f379984h)) && n51.f.a(this.f379985i, ly6Var.f379985i) && n51.f.a(java.lang.Integer.valueOf(this.f379986m), java.lang.Integer.valueOf(ly6Var.f379986m)) && n51.f.a(this.f379987n, ly6Var.f379987n) && n51.f.a(this.f379988o, ly6Var.f379988o) && n51.f.a(this.f379989p, ly6Var.f379989p) && n51.f.a(java.lang.Integer.valueOf(this.f379990q), java.lang.Integer.valueOf(ly6Var.f379990q)) && n51.f.a(this.f379991r, ly6Var.f379991r) && n51.f.a(this.f379992s, ly6Var.f379992s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379987n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f379980d);
            fVar.e(3, this.f379981e);
            fVar.g(4, 8, this.f379982f);
            java.lang.String str = this.f379983g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f379984h);
            fVar.k(7, 2, this.f379985i);
            fVar.e(8, this.f379986m);
            fVar.g(9, 8, linkedList);
            r45.cu5 cu5Var = this.f379988o;
            if (cu5Var != null) {
                fVar.i(10, cu5Var.computeSize());
                this.f379988o.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f379989p;
            if (cu5Var2 != null) {
                fVar.i(11, cu5Var2.computeSize());
                this.f379989p.writeFields(fVar);
            }
            fVar.e(12, this.f379990q);
            java.lang.String str2 = this.f379991r;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            java.lang.String str3 = this.f379992s;
            if (str3 == null) {
                return 0;
            }
            fVar.j(14, str3);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f379980d) + b36.f.e(3, this.f379981e) + b36.f.g(4, 8, this.f379982f);
            java.lang.String str4 = this.f379983g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            int e17 = i18 + b36.f.e(6, this.f379984h) + b36.f.k(7, 2, this.f379985i) + b36.f.e(8, this.f379986m) + b36.f.g(9, 8, linkedList);
            r45.cu5 cu5Var3 = this.f379988o;
            if (cu5Var3 != null) {
                e17 += b36.f.i(10, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f379989p;
            if (cu5Var4 != null) {
                e17 += b36.f.i(11, cu5Var4.computeSize());
            }
            int e18 = e17 + b36.f.e(12, this.f379990q);
            java.lang.String str5 = this.f379991r;
            if (str5 != null) {
                e18 += b36.f.j(13, str5);
            }
            java.lang.String str6 = this.f379992s;
            return str6 != null ? e18 + b36.f.j(14, str6) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f379982f.clear();
            this.f379985i.clear();
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
        r45.ly6 ly6Var = (r45.ly6) objArr[1];
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
                    ly6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ly6Var.f379980d = aVar2.g(intValue);
                return 0;
            case 3:
                ly6Var.f379981e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gy6 gy6Var = new r45.gy6();
                    if (bArr3 != null && bArr3.length > 0) {
                        gy6Var.parseFrom(bArr3);
                    }
                    ly6Var.f379982f.add(gy6Var);
                }
                return 0;
            case 5:
                ly6Var.f379983g = aVar2.k(intValue);
                return 0;
            case 6:
                ly6Var.f379984h = aVar2.g(intValue);
                return 0;
            case 7:
                byte[] bArr4 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                ly6Var.f379985i = linkedList2;
                return 0;
            case 8:
                ly6Var.f379986m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr5 = (byte[]) j19.get(i28);
                    r45.iy6 iy6Var = new r45.iy6();
                    if (bArr5 != null && bArr5.length > 0) {
                        iy6Var.parseFrom(bArr5);
                    }
                    ly6Var.f379987n.add(iy6Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr6 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var5.b(bArr6);
                    }
                    ly6Var.f379988o = cu5Var5;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr7 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var6.b(bArr7);
                    }
                    ly6Var.f379989p = cu5Var6;
                }
                return 0;
            case 12:
                ly6Var.f379990q = aVar2.g(intValue);
                return 0;
            case 13:
                ly6Var.f379991r = aVar2.k(intValue);
                return 0;
            case 14:
                ly6Var.f379992s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
