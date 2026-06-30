package m53;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.l5 f323975d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f323976e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f323977f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323978g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323979h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.q0)) {
            return false;
        }
        m53.q0 q0Var = (m53.q0) fVar;
        return n51.f.a(this.f323975d, q0Var.f323975d) && n51.f.a(this.f323976e, q0Var.f323976e) && n51.f.a(java.lang.Boolean.valueOf(this.f323977f), java.lang.Boolean.valueOf(q0Var.f323977f)) && n51.f.a(java.lang.Boolean.valueOf(this.f323978g), java.lang.Boolean.valueOf(q0Var.f323978g)) && n51.f.a(java.lang.Boolean.valueOf(this.f323979h), java.lang.Boolean.valueOf(q0Var.f323979h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323976e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.l5 l5Var = this.f323975d;
            if (l5Var != null) {
                fVar.i(1, l5Var.computeSize());
                this.f323975d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f323977f);
            fVar.a(4, this.f323978g);
            fVar.a(5, this.f323979h);
            return 0;
        }
        if (i17 == 1) {
            m53.l5 l5Var2 = this.f323975d;
            return (l5Var2 != null ? 0 + b36.f.i(1, l5Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f323977f) + b36.f.a(4, this.f323978g) + b36.f.a(5, this.f323979h);
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
        m53.q0 q0Var = (m53.q0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.l5 l5Var3 = new m53.l5();
                if (bArr2 != null && bArr2.length > 0) {
                    l5Var3.parseFrom(bArr2);
                }
                q0Var.f323975d = l5Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                q0Var.f323977f = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 4) {
                q0Var.f323978g = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            q0Var.f323979h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            m53.s5 s5Var = new m53.s5();
            if (bArr3 != null && bArr3.length > 0) {
                s5Var.parseFrom(bArr3);
            }
            q0Var.f323976e.add(s5Var);
        }
        return 0;
    }
}
