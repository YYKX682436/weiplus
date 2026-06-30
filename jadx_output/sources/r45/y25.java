package r45;

/* loaded from: classes9.dex */
public class y25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vl5 f390730d;

    /* renamed from: e, reason: collision with root package name */
    public int f390731e;

    /* renamed from: f, reason: collision with root package name */
    public int f390732f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y25)) {
            return false;
        }
        r45.y25 y25Var = (r45.y25) fVar;
        return n51.f.a(this.f390730d, y25Var.f390730d) && n51.f.a(java.lang.Integer.valueOf(this.f390731e), java.lang.Integer.valueOf(y25Var.f390731e)) && n51.f.a(java.lang.Integer.valueOf(this.f390732f), java.lang.Integer.valueOf(y25Var.f390732f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vl5 vl5Var = this.f390730d;
            if (vl5Var != null) {
                fVar.i(1, vl5Var.computeSize());
                this.f390730d.writeFields(fVar);
            }
            fVar.e(2, this.f390731e);
            fVar.e(3, this.f390732f);
            return 0;
        }
        if (i17 == 1) {
            r45.vl5 vl5Var2 = this.f390730d;
            return (vl5Var2 != null ? 0 + b36.f.i(1, vl5Var2.computeSize()) : 0) + b36.f.e(2, this.f390731e) + b36.f.e(3, this.f390732f);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.y25 y25Var = (r45.y25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                y25Var.f390731e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            y25Var.f390732f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.vl5 vl5Var3 = new r45.vl5();
            if (bArr != null && bArr.length > 0) {
                vl5Var3.parseFrom(bArr);
            }
            y25Var.f390730d = vl5Var3;
        }
        return 0;
    }
}
