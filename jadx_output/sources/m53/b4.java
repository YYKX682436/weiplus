package m53;

/* loaded from: classes4.dex */
public class b4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f323582d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public m53.t4 f323583e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323584f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.b4)) {
            return false;
        }
        m53.b4 b4Var = (m53.b4) fVar;
        return n51.f.a(this.f323582d, b4Var.f323582d) && n51.f.a(this.f323583e, b4Var.f323583e) && n51.f.a(java.lang.Boolean.valueOf(this.f323584f), java.lang.Boolean.valueOf(b4Var.f323584f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323582d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            m53.t4 t4Var = this.f323583e;
            if (t4Var != null) {
                fVar.i(2, t4Var.computeSize());
                this.f323583e.writeFields(fVar);
            }
            fVar.a(5, this.f323584f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            m53.t4 t4Var2 = this.f323583e;
            if (t4Var2 != null) {
                g17 += b36.f.i(2, t4Var2.computeSize());
            }
            return g17 + b36.f.a(5, this.f323584f);
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
        m53.b4 b4Var = (m53.b4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.w4 w4Var = new m53.w4();
                if (bArr2 != null && bArr2.length > 0) {
                    w4Var.parseFrom(bArr2);
                }
                b4Var.f323582d.add(w4Var);
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 5) {
                return -1;
            }
            b4Var.f323584f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            m53.t4 t4Var3 = new m53.t4();
            if (bArr3 != null && bArr3.length > 0) {
                t4Var3.parseFrom(bArr3);
            }
            b4Var.f323583e = t4Var3;
        }
        return 0;
    }
}
