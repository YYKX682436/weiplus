package r45;

/* loaded from: classes4.dex */
public class u00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f386905d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f386906e;

    /* renamed from: f, reason: collision with root package name */
    public r45.eq0 f386907f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u00)) {
            return false;
        }
        r45.u00 u00Var = (r45.u00) fVar;
        return n51.f.a(this.f386905d, u00Var.f386905d) && n51.f.a(java.lang.Integer.valueOf(this.f386906e), java.lang.Integer.valueOf(u00Var.f386906e)) && n51.f.a(this.f386907f, u00Var.f386907f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f386905d);
            fVar.e(2, this.f386906e);
            r45.eq0 eq0Var = this.f386907f;
            if (eq0Var != null) {
                fVar.i(3, eq0Var.computeSize());
                this.f386907f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f386905d) + 0 + b36.f.e(2, this.f386906e);
            r45.eq0 eq0Var2 = this.f386907f;
            return eq0Var2 != null ? g17 + b36.f.i(3, eq0Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386905d.clear();
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
        r45.u00 u00Var = (r45.u00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.mp0 mp0Var = new r45.mp0();
                if (bArr2 != null && bArr2.length > 0) {
                    mp0Var.parseFrom(bArr2);
                }
                u00Var.f386905d.add(mp0Var);
            }
            return 0;
        }
        if (intValue == 2) {
            u00Var.f386906e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.eq0 eq0Var3 = new r45.eq0();
            if (bArr3 != null && bArr3.length > 0) {
                eq0Var3.parseFrom(bArr3);
            }
            u00Var.f386907f = eq0Var3;
        }
        return 0;
    }
}
