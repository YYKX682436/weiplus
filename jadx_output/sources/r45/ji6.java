package r45;

/* loaded from: classes4.dex */
public class ji6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377842d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377843e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f377844f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ji6)) {
            return false;
        }
        r45.ji6 ji6Var = (r45.ji6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377842d), java.lang.Integer.valueOf(ji6Var.f377842d)) && n51.f.a(this.f377843e, ji6Var.f377843e) && n51.f.a(this.f377844f, ji6Var.f377844f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377842d);
            java.lang.String str = this.f377843e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f377844f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377842d) + 0;
            java.lang.String str2 = this.f377843e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, this.f377844f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377844f.clear();
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
        r45.ji6 ji6Var = (r45.ji6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ji6Var.f377842d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ji6Var.f377843e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.oi6 oi6Var = new r45.oi6();
            if (bArr2 != null && bArr2.length > 0) {
                oi6Var.parseFrom(bArr2);
            }
            ji6Var.f377844f.add(oi6Var);
        }
        return 0;
    }
}
