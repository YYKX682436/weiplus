package r45;

/* loaded from: classes4.dex */
public class yj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391143d;

    /* renamed from: e, reason: collision with root package name */
    public int f391144e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391145f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f391146g;

    /* renamed from: h, reason: collision with root package name */
    public int f391147h;

    /* renamed from: m, reason: collision with root package name */
    public int f391149m;

    /* renamed from: o, reason: collision with root package name */
    public int f391151o;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f391148i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f391150n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f391152p = new java.util.LinkedList();

    static {
        new r45.yj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.yj0 parseFrom(byte[] bArr) {
        return (r45.yj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yj0)) {
            return false;
        }
        r45.yj0 yj0Var = (r45.yj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391143d), java.lang.Integer.valueOf(yj0Var.f391143d)) && n51.f.a(java.lang.Integer.valueOf(this.f391144e), java.lang.Integer.valueOf(yj0Var.f391144e)) && n51.f.a(this.f391145f, yj0Var.f391145f) && n51.f.a(this.f391146g, yj0Var.f391146g) && n51.f.a(java.lang.Integer.valueOf(this.f391147h), java.lang.Integer.valueOf(yj0Var.f391147h)) && n51.f.a(this.f391148i, yj0Var.f391148i) && n51.f.a(java.lang.Integer.valueOf(this.f391149m), java.lang.Integer.valueOf(yj0Var.f391149m)) && n51.f.a(this.f391150n, yj0Var.f391150n) && n51.f.a(java.lang.Integer.valueOf(this.f391151o), java.lang.Integer.valueOf(yj0Var.f391151o)) && n51.f.a(this.f391152p, yj0Var.f391152p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.yj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391152p;
        java.util.LinkedList linkedList2 = this.f391150n;
        java.util.LinkedList linkedList3 = this.f391148i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391143d);
            fVar.e(2, this.f391144e);
            java.lang.String str = this.f391145f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu5 cu5Var = this.f391146g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f391146g.writeFields(fVar);
            }
            fVar.e(5, this.f391147h);
            fVar.g(6, 8, linkedList3);
            fVar.e(7, this.f391149m);
            fVar.g(8, 8, linkedList2);
            fVar.e(9, this.f391151o);
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391143d) + 0 + b36.f.e(2, this.f391144e);
            java.lang.String str2 = this.f391145f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            r45.cu5 cu5Var2 = this.f391146g;
            if (cu5Var2 != null) {
                e17 += b36.f.i(4, cu5Var2.computeSize());
            }
            return e17 + b36.f.e(5, this.f391147h) + b36.f.g(6, 8, linkedList3) + b36.f.e(7, this.f391149m) + b36.f.g(8, 8, linkedList2) + b36.f.e(9, this.f391151o) + b36.f.g(10, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f391143d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f391144e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f391145f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f391146g = cu5Var3;
                }
                return 0;
            case 5:
                this.f391147h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.kj0 kj0Var = new r45.kj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kj0Var.parseFrom(bArr2);
                    }
                    linkedList3.add(kj0Var);
                }
                return 0;
            case 7:
                this.f391149m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.zj0 zj0Var = new r45.zj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zj0Var.parseFrom(bArr3);
                    }
                    linkedList2.add(zj0Var);
                }
                return 0;
            case 9:
                this.f391151o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.vi0 vi0Var = new r45.vi0();
                    if (bArr4 != null && bArr4.length > 0) {
                        vi0Var.parseFrom(bArr4);
                    }
                    linkedList.add(vi0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
