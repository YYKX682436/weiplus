package r45;

/* loaded from: classes2.dex */
public class ot4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bz3 f382507d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f382508e;

    /* renamed from: f, reason: collision with root package name */
    public int f382509f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ot4)) {
            return false;
        }
        r45.ot4 ot4Var = (r45.ot4) fVar;
        return n51.f.a(this.f382507d, ot4Var.f382507d) && n51.f.a(this.f382508e, ot4Var.f382508e) && n51.f.a(java.lang.Integer.valueOf(this.f382509f), java.lang.Integer.valueOf(ot4Var.f382509f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bz3 bz3Var = this.f382507d;
            if (bz3Var != null) {
                fVar.i(1, bz3Var.computeSize());
                this.f382507d.writeFields(fVar);
            }
            r45.rl6 rl6Var = this.f382508e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.computeSize());
                this.f382508e.writeFields(fVar);
            }
            fVar.e(3, this.f382509f);
            return 0;
        }
        if (i17 == 1) {
            r45.bz3 bz3Var2 = this.f382507d;
            int i18 = bz3Var2 != null ? 0 + b36.f.i(1, bz3Var2.computeSize()) : 0;
            r45.rl6 rl6Var2 = this.f382508e;
            if (rl6Var2 != null) {
                i18 += b36.f.i(2, rl6Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f382509f);
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
        r45.ot4 ot4Var = (r45.ot4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.bz3 bz3Var3 = new r45.bz3();
                if (bArr != null && bArr.length > 0) {
                    bz3Var3.parseFrom(bArr);
                }
                ot4Var.f382507d = bz3Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            ot4Var.f382509f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.rl6 rl6Var3 = new r45.rl6();
            if (bArr2 != null && bArr2.length > 0) {
                rl6Var3.parseFrom(bArr2);
            }
            ot4Var.f382508e = rl6Var3;
        }
        return 0;
    }
}
