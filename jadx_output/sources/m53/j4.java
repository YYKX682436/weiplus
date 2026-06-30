package m53;

/* loaded from: classes2.dex */
public class j4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f323821d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323822e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323823f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f323824g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.j4)) {
            return false;
        }
        m53.j4 j4Var = (m53.j4) fVar;
        return n51.f.a(this.f323821d, j4Var.f323821d) && n51.f.a(this.f323822e, j4Var.f323822e) && n51.f.a(java.lang.Boolean.valueOf(this.f323823f), java.lang.Boolean.valueOf(j4Var.f323823f)) && n51.f.a(this.f323824g, j4Var.f323824g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323824g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h hVar = this.f323821d;
            if (hVar != null) {
                fVar.i(1, hVar.computeSize());
                this.f323821d.writeFields(fVar);
            }
            java.lang.String str = this.f323822e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f323823f);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            m53.h hVar2 = this.f323821d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.computeSize()) : 0;
            java.lang.String str2 = this.f323822e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.a(3, this.f323823f) + b36.f.g(4, 1, linkedList);
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
        m53.j4 j4Var = (m53.j4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                j4Var.f323822e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                j4Var.f323823f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            j4Var.f323824g.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            m53.h hVar3 = new m53.h();
            if (bArr2 != null && bArr2.length > 0) {
                hVar3.parseFrom(bArr2);
            }
            j4Var.f323821d = hVar3;
        }
        return 0;
    }
}
