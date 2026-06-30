package r45;

/* loaded from: classes4.dex */
public class yc6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390966d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f390967e;

    /* renamed from: f, reason: collision with root package name */
    public int f390968f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390969g;

    /* renamed from: h, reason: collision with root package name */
    public int f390970h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yc6)) {
            return false;
        }
        r45.yc6 yc6Var = (r45.yc6) fVar;
        return n51.f.a(this.f390966d, yc6Var.f390966d) && n51.f.a(java.lang.Integer.valueOf(this.f390967e), java.lang.Integer.valueOf(yc6Var.f390967e)) && n51.f.a(java.lang.Integer.valueOf(this.f390968f), java.lang.Integer.valueOf(yc6Var.f390968f)) && n51.f.a(this.f390969g, yc6Var.f390969g) && n51.f.a(java.lang.Integer.valueOf(this.f390970h), java.lang.Integer.valueOf(yc6Var.f390970h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390966d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f390967e);
            fVar.e(3, this.f390968f);
            com.tencent.mm.protobuf.g gVar = this.f390969g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f390970h);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f390967e) + b36.f.e(3, this.f390968f);
            com.tencent.mm.protobuf.g gVar2 = this.f390969g;
            if (gVar2 != null) {
                g17 += b36.f.b(4, gVar2);
            }
            return g17 + b36.f.e(5, this.f390970h);
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
        r45.yc6 yc6Var = (r45.yc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.wc6 wc6Var = new r45.wc6();
                if (bArr2 != null && bArr2.length > 0) {
                    wc6Var.parseFrom(bArr2);
                }
                yc6Var.f390966d.add(wc6Var);
            }
            return 0;
        }
        if (intValue == 2) {
            yc6Var.f390967e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            yc6Var.f390968f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            yc6Var.f390969g = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yc6Var.f390970h = aVar2.g(intValue);
        return 0;
    }
}
