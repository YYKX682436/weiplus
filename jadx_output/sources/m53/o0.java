package m53;

/* loaded from: classes8.dex */
public class o0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f323932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f323933e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323934f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323935g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.o0)) {
            return false;
        }
        m53.o0 o0Var = (m53.o0) fVar;
        return n51.f.a(this.f323932d, o0Var.f323932d) && n51.f.a(this.f323933e, o0Var.f323933e) && n51.f.a(this.f323934f, o0Var.f323934f) && n51.f.a(this.f323935g, o0Var.f323935g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323933e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h hVar = this.f323932d;
            if (hVar != null) {
                fVar.i(1, hVar.computeSize());
                this.f323932d.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            java.lang.String str = this.f323934f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f323935g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.h hVar2 = this.f323932d;
            int i18 = (hVar2 != null ? 0 + b36.f.i(1, hVar2.computeSize()) : 0) + b36.f.g(2, 1, linkedList);
            java.lang.String str3 = this.f323934f;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f323935g;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        m53.o0 o0Var = (m53.o0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                o0Var.f323933e.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue == 3) {
                o0Var.f323934f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            o0Var.f323935g = aVar2.k(intValue);
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
            o0Var.f323932d = hVar3;
        }
        return 0;
    }
}
