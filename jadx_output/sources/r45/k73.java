package r45;

/* loaded from: classes4.dex */
public class k73 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f378451d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f378452e;

    /* renamed from: f, reason: collision with root package name */
    public r45.m73 f378453f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k73)) {
            return false;
        }
        r45.k73 k73Var = (r45.k73) fVar;
        return n51.f.a(this.f378451d, k73Var.f378451d) && n51.f.a(java.lang.Boolean.valueOf(this.f378452e), java.lang.Boolean.valueOf(k73Var.f378452e)) && n51.f.a(this.f378453f, k73Var.f378453f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f378451d);
            fVar.a(2, this.f378452e);
            r45.m73 m73Var = this.f378453f;
            if (m73Var != null) {
                fVar.i(3, m73Var.computeSize());
                this.f378453f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f378451d) + 0 + b36.f.a(2, this.f378452e);
            r45.m73 m73Var2 = this.f378453f;
            return m73Var2 != null ? g17 + b36.f.i(3, m73Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f378451d.clear();
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
        r45.k73 k73Var = (r45.k73) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.m73 m73Var3 = new r45.m73();
                if (bArr2 != null && bArr2.length > 0) {
                    m73Var3.parseFrom(bArr2);
                }
                k73Var.f378451d.add(m73Var3);
            }
            return 0;
        }
        if (intValue == 2) {
            k73Var.f378452e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.m73 m73Var4 = new r45.m73();
            if (bArr3 != null && bArr3.length > 0) {
                m73Var4.parseFrom(bArr3);
            }
            k73Var.f378453f = m73Var4;
        }
        return 0;
    }
}
