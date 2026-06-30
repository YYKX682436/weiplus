package r45;

/* loaded from: classes4.dex */
public class y57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f390812d;

    /* renamed from: e, reason: collision with root package name */
    public int f390813e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f390814f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f390815g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390816h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390817i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y57)) {
            return false;
        }
        r45.y57 y57Var = (r45.y57) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f390812d), java.lang.Long.valueOf(y57Var.f390812d)) && n51.f.a(java.lang.Integer.valueOf(this.f390813e), java.lang.Integer.valueOf(y57Var.f390813e)) && n51.f.a(this.f390814f, y57Var.f390814f) && n51.f.a(this.f390815g, y57Var.f390815g) && n51.f.a(this.f390816h, y57Var.f390816h) && n51.f.a(this.f390817i, y57Var.f390817i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390815g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f390812d);
            fVar.e(2, this.f390813e);
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f390814f;
            if (snsObject != null) {
                fVar.i(3, snsObject.computeSize());
                this.f390814f.writeFields(fVar);
            }
            fVar.g(4, 3, linkedList);
            java.lang.String str = this.f390816h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f390817i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f390812d) + 0 + b36.f.e(2, this.f390813e);
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f390814f;
            if (snsObject2 != null) {
                h17 += b36.f.i(3, snsObject2.computeSize());
            }
            int g17 = h17 + b36.f.g(4, 3, linkedList);
            java.lang.String str3 = this.f390816h;
            if (str3 != null) {
                g17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f390817i;
            return str4 != null ? g17 + b36.f.j(6, str4) : g17;
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
        r45.y57 y57Var = (r45.y57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y57Var.f390812d = aVar2.i(intValue);
                return 0;
            case 2:
                y57Var.f390813e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject3 = new com.tencent.mm.protocal.protobuf.SnsObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        snsObject3.parseFrom(bArr2);
                    }
                    y57Var.f390814f = snsObject3;
                }
                return 0;
            case 4:
                y57Var.f390815g.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 5:
                y57Var.f390816h = aVar2.k(intValue);
                return 0;
            case 6:
                y57Var.f390817i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
