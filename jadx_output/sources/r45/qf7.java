package r45;

/* loaded from: classes4.dex */
public class qf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f383956d;

    /* renamed from: e, reason: collision with root package name */
    public int f383957e;

    /* renamed from: f, reason: collision with root package name */
    public int f383958f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf7)) {
            return false;
        }
        r45.qf7 qf7Var = (r45.qf7) fVar;
        return n51.f.a(this.f383956d, qf7Var.f383956d) && n51.f.a(java.lang.Integer.valueOf(this.f383957e), java.lang.Integer.valueOf(qf7Var.f383957e)) && n51.f.a(java.lang.Integer.valueOf(this.f383958f), java.lang.Integer.valueOf(qf7Var.f383958f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f383956d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.computeSize());
                this.f383956d.writeFields(fVar);
            }
            fVar.e(2, this.f383957e);
            fVar.e(3, this.f383958f);
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f383956d;
            return (cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.computeSize()) : 0) + b36.f.e(2, this.f383957e) + b36.f.e(3, this.f383958f);
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
        r45.qf7 qf7Var = (r45.qf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                qf7Var.f383957e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            qf7Var.f383958f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cf7 cf7Var3 = new r45.cf7();
            if (bArr != null && bArr.length > 0) {
                cf7Var3.parseFrom(bArr);
            }
            qf7Var.f383956d = cf7Var3;
        }
        return 0;
    }
}
