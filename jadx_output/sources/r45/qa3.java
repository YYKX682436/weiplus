package r45;

/* loaded from: classes8.dex */
public class qa3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f383791d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.r1 f383792e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383793f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qa3)) {
            return false;
        }
        r45.qa3 qa3Var = (r45.qa3) fVar;
        return n51.f.a(this.f383791d, qa3Var.f383791d) && n51.f.a(this.f383792e, qa3Var.f383792e) && n51.f.a(this.f383793f, qa3Var.f383793f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f383791d);
            r45.r1 r1Var = this.f383792e;
            if (r1Var != null) {
                fVar.i(2, r1Var.computeSize());
                this.f383792e.writeFields(fVar);
            }
            java.lang.String str = this.f383793f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f383791d) + 0;
            r45.r1 r1Var2 = this.f383792e;
            if (r1Var2 != null) {
                g17 += b36.f.i(2, r1Var2.computeSize());
            }
            java.lang.String str2 = this.f383793f;
            return str2 != null ? g17 + b36.f.j(3, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383791d.clear();
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
        r45.qa3 qa3Var = (r45.qa3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qa3Var.f383791d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            qa3Var.f383793f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.r1 r1Var3 = new r45.r1();
            if (bArr2 != null && bArr2.length > 0) {
                r1Var3.parseFrom(bArr2);
            }
            qa3Var.f383792e = r1Var3;
        }
        return 0;
    }
}
