package r45;

/* loaded from: classes4.dex */
public class n25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381028d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jz5 f381029e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ik5 f381030f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n25)) {
            return false;
        }
        r45.n25 n25Var = (r45.n25) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381028d), java.lang.Integer.valueOf(n25Var.f381028d)) && n51.f.a(this.f381029e, n25Var.f381029e) && n51.f.a(this.f381030f, n25Var.f381030f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381028d);
            r45.jz5 jz5Var = this.f381029e;
            if (jz5Var != null) {
                fVar.i(2, jz5Var.computeSize());
                this.f381029e.writeFields(fVar);
            }
            r45.ik5 ik5Var = this.f381030f;
            if (ik5Var != null) {
                fVar.i(3, ik5Var.computeSize());
                this.f381030f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381028d) + 0;
            r45.jz5 jz5Var2 = this.f381029e;
            if (jz5Var2 != null) {
                e17 += b36.f.i(2, jz5Var2.computeSize());
            }
            r45.ik5 ik5Var2 = this.f381030f;
            return ik5Var2 != null ? e17 + b36.f.i(3, ik5Var2.computeSize()) : e17;
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
        r45.n25 n25Var = (r45.n25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n25Var.f381028d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.jz5 jz5Var3 = new r45.jz5();
                if (bArr != null && bArr.length > 0) {
                    jz5Var3.parseFrom(bArr);
                }
                n25Var.f381029e = jz5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ik5 ik5Var3 = new r45.ik5();
            if (bArr2 != null && bArr2.length > 0) {
                ik5Var3.parseFrom(bArr2);
            }
            n25Var.f381030f = ik5Var3;
        }
        return 0;
    }
}
