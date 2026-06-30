package r45;

/* loaded from: classes7.dex */
public class l83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379226d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f379227e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f379228f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f379229g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l83)) {
            return false;
        }
        r45.l83 l83Var = (r45.l83) fVar;
        return n51.f.a(this.f379226d, l83Var.f379226d) && n51.f.a(this.f379227e, l83Var.f379227e) && n51.f.a(this.f379228f, l83Var.f379228f) && n51.f.a(java.lang.Integer.valueOf(this.f379229g), java.lang.Integer.valueOf(l83Var.f379229g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379227e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379226d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList);
            fVar.g(3, 8, this.f379228f);
            fVar.e(4, this.f379229g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f379226d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 1, linkedList) + b36.f.g(3, 8, this.f379228f) + b36.f.e(4, this.f379229g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f379228f.clear();
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
        r45.l83 l83Var = (r45.l83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l83Var.f379226d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l83Var.f379227e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            l83Var.f379229g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.m83 m83Var = new r45.m83();
            if (bArr2 != null && bArr2.length > 0) {
                m83Var.parseFrom(bArr2);
            }
            l83Var.f379228f.add(m83Var);
        }
        return 0;
    }
}
