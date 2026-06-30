package r45;

/* loaded from: classes2.dex */
public class vw6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.i07 f388627d;

    /* renamed from: e, reason: collision with root package name */
    public int f388628e;

    /* renamed from: f, reason: collision with root package name */
    public int f388629f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vw6)) {
            return false;
        }
        r45.vw6 vw6Var = (r45.vw6) fVar;
        return n51.f.a(this.f388627d, vw6Var.f388627d) && n51.f.a(java.lang.Integer.valueOf(this.f388628e), java.lang.Integer.valueOf(vw6Var.f388628e)) && n51.f.a(java.lang.Integer.valueOf(this.f388629f), java.lang.Integer.valueOf(vw6Var.f388629f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.i07 i07Var = this.f388627d;
            if (i07Var != null) {
                fVar.i(1, i07Var.computeSize());
                this.f388627d.writeFields(fVar);
            }
            fVar.e(2, this.f388628e);
            fVar.e(3, this.f388629f);
            return 0;
        }
        if (i17 == 1) {
            r45.i07 i07Var2 = this.f388627d;
            return (i07Var2 != null ? 0 + b36.f.i(1, i07Var2.computeSize()) : 0) + b36.f.e(2, this.f388628e) + b36.f.e(3, this.f388629f);
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
        r45.vw6 vw6Var = (r45.vw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                vw6Var.f388628e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            vw6Var.f388629f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.i07 i07Var3 = new r45.i07();
            if (bArr != null && bArr.length > 0) {
                i07Var3.parseFrom(bArr);
            }
            vw6Var.f388627d = i07Var3;
        }
        return 0;
    }
}
