package r45;

/* loaded from: classes8.dex */
public class y83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390854d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f390855e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f390856f;

    /* renamed from: g, reason: collision with root package name */
    public int f390857g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y83)) {
            return false;
        }
        r45.y83 y83Var = (r45.y83) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390854d), java.lang.Integer.valueOf(y83Var.f390854d)) && n51.f.a(this.f390855e, y83Var.f390855e) && n51.f.a(java.lang.Integer.valueOf(this.f390856f), java.lang.Integer.valueOf(y83Var.f390856f)) && n51.f.a(java.lang.Integer.valueOf(this.f390857g), java.lang.Integer.valueOf(y83Var.f390857g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390854d);
            fVar.g(2, 8, this.f390855e);
            fVar.e(3, this.f390856f);
            fVar.e(4, this.f390857g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f390854d) + 0 + b36.f.g(2, 8, this.f390855e) + b36.f.e(3, this.f390856f) + b36.f.e(4, this.f390857g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f390855e.clear();
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
        r45.y83 y83Var = (r45.y83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y83Var.f390854d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                y83Var.f390856f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            y83Var.f390857g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.zl0 zl0Var = new r45.zl0();
            if (bArr2 != null && bArr2.length > 0) {
                zl0Var.parseFrom(bArr2);
            }
            y83Var.f390855e.add(zl0Var);
        }
        return 0;
    }
}
