package r45;

/* loaded from: classes2.dex */
public class f95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374114d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f374115e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f374116f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f374117g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f95)) {
            return false;
        }
        r45.f95 f95Var = (r45.f95) fVar;
        return n51.f.a(this.f374114d, f95Var.f374114d) && n51.f.a(this.f374115e, f95Var.f374115e) && n51.f.a(this.f374116f, f95Var.f374116f) && n51.f.a(this.f374117g, f95Var.f374117g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374117g;
        java.util.LinkedList linkedList2 = this.f374116f;
        java.util.LinkedList linkedList3 = this.f374115e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374114d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList3);
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f374114d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList3) + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.f95 f95Var = (r45.f95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f95Var.f374114d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.g95 g95Var = new r45.g95();
                if (bArr2 != null && bArr2.length > 0) {
                    g95Var.parseFrom(bArr2);
                }
                f95Var.f374115e.add(g95Var);
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.m95 m95Var = new r45.m95();
                if (bArr3 != null && bArr3.length > 0) {
                    m95Var.parseFrom(bArr3);
                }
                f95Var.f374116f.add(m95Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.m95 m95Var2 = new r45.m95();
            if (bArr4 != null && bArr4.length > 0) {
                m95Var2.parseFrom(bArr4);
            }
            f95Var.f374117g.add(m95Var2);
        }
        return 0;
    }
}
