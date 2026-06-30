package r45;

/* loaded from: classes9.dex */
public class hc2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376035d;

    /* renamed from: e, reason: collision with root package name */
    public long f376036e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f376037f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.qx1 f376038g;

    /* renamed from: h, reason: collision with root package name */
    public int f376039h;

    /* renamed from: i, reason: collision with root package name */
    public int f376040i;

    /* renamed from: m, reason: collision with root package name */
    public int f376041m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hc2)) {
            return false;
        }
        r45.hc2 hc2Var = (r45.hc2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376035d), java.lang.Integer.valueOf(hc2Var.f376035d)) && n51.f.a(java.lang.Long.valueOf(this.f376036e), java.lang.Long.valueOf(hc2Var.f376036e)) && n51.f.a(this.f376037f, hc2Var.f376037f) && n51.f.a(this.f376038g, hc2Var.f376038g) && n51.f.a(java.lang.Integer.valueOf(this.f376039h), java.lang.Integer.valueOf(hc2Var.f376039h)) && n51.f.a(java.lang.Integer.valueOf(this.f376040i), java.lang.Integer.valueOf(hc2Var.f376040i)) && n51.f.a(java.lang.Integer.valueOf(this.f376041m), java.lang.Integer.valueOf(hc2Var.f376041m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376037f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376035d);
            fVar.h(2, this.f376036e);
            fVar.g(3, 8, linkedList);
            r45.qx1 qx1Var = this.f376038g;
            if (qx1Var != null) {
                fVar.i(4, qx1Var.computeSize());
                this.f376038g.writeFields(fVar);
            }
            fVar.e(5, this.f376039h);
            fVar.e(6, this.f376040i);
            fVar.e(7, this.f376041m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376035d) + 0 + b36.f.h(2, this.f376036e) + b36.f.g(3, 8, linkedList);
            r45.qx1 qx1Var2 = this.f376038g;
            if (qx1Var2 != null) {
                e17 += b36.f.i(4, qx1Var2.computeSize());
            }
            return e17 + b36.f.e(5, this.f376039h) + b36.f.e(6, this.f376040i) + b36.f.e(7, this.f376041m);
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
        r45.hc2 hc2Var = (r45.hc2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hc2Var.f376035d = aVar2.g(intValue);
                return 0;
            case 2:
                hc2Var.f376036e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.yx1 yx1Var = new r45.yx1();
                    if (bArr2 != null && bArr2.length > 0) {
                        yx1Var.parseFrom(bArr2);
                    }
                    hc2Var.f376037f.add(yx1Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.qx1 qx1Var3 = new r45.qx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        qx1Var3.parseFrom(bArr3);
                    }
                    hc2Var.f376038g = qx1Var3;
                }
                return 0;
            case 5:
                hc2Var.f376039h = aVar2.g(intValue);
                return 0;
            case 6:
                hc2Var.f376040i = aVar2.g(intValue);
                return 0;
            case 7:
                hc2Var.f376041m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
