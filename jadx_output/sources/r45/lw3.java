package r45;

/* loaded from: classes15.dex */
public class lw3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f379876d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f379877e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f379878f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f379879g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f379880h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f379881i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f379882m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f379883n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f379884o = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lw3)) {
            return false;
        }
        r45.lw3 lw3Var = (r45.lw3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f379876d), java.lang.Long.valueOf(lw3Var.f379876d)) && n51.f.a(java.lang.Long.valueOf(this.f379877e), java.lang.Long.valueOf(lw3Var.f379877e)) && n51.f.a(this.f379878f, lw3Var.f379878f) && n51.f.a(java.lang.Integer.valueOf(this.f379879g), java.lang.Integer.valueOf(lw3Var.f379879g)) && n51.f.a(this.f379880h, lw3Var.f379880h) && n51.f.a(java.lang.Integer.valueOf(this.f379881i), java.lang.Integer.valueOf(lw3Var.f379881i)) && n51.f.a(java.lang.Integer.valueOf(this.f379882m), java.lang.Integer.valueOf(lw3Var.f379882m)) && n51.f.a(java.lang.Long.valueOf(this.f379883n), java.lang.Long.valueOf(lw3Var.f379883n)) && n51.f.a(java.lang.Boolean.valueOf(this.f379884o), java.lang.Boolean.valueOf(lw3Var.f379884o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379880h;
        java.util.LinkedList linkedList2 = this.f379878f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f379876d);
            fVar.h(2, this.f379877e);
            fVar.g(3, 8, linkedList2);
            fVar.e(4, this.f379879g);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f379881i);
            fVar.e(7, this.f379882m);
            fVar.h(8, this.f379883n);
            fVar.a(9, this.f379884o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f379876d) + 0 + b36.f.h(2, this.f379877e) + b36.f.g(3, 8, linkedList2) + b36.f.e(4, this.f379879g) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f379881i) + b36.f.e(7, this.f379882m) + b36.f.h(8, this.f379883n) + b36.f.a(9, this.f379884o);
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
        r45.lw3 lw3Var = (r45.lw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lw3Var.f379876d = aVar2.i(intValue);
                return 0;
            case 2:
                lw3Var.f379877e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.c45 c45Var = new r45.c45();
                    if (bArr2 != null && bArr2.length > 0) {
                        c45Var.parseFrom(bArr2);
                    }
                    lw3Var.f379878f.add(c45Var);
                }
                return 0;
            case 4:
                lw3Var.f379879g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.w35 w35Var = new r45.w35();
                    if (bArr3 != null && bArr3.length > 0) {
                        w35Var.parseFrom(bArr3);
                    }
                    lw3Var.f379880h.add(w35Var);
                }
                return 0;
            case 6:
                lw3Var.f379881i = aVar2.g(intValue);
                return 0;
            case 7:
                lw3Var.f379882m = aVar2.g(intValue);
                return 0;
            case 8:
                lw3Var.f379883n = aVar2.i(intValue);
                return 0;
            case 9:
                lw3Var.f379884o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
