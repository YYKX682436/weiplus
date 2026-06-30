package r45;

/* loaded from: classes11.dex */
public class s70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f385534d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ge0 f385535e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ke0 f385536f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s70)) {
            return false;
        }
        r45.s70 s70Var = (r45.s70) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f385534d), java.lang.Long.valueOf(s70Var.f385534d)) && n51.f.a(this.f385535e, s70Var.f385535e) && n51.f.a(this.f385536f, s70Var.f385536f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f385534d);
            r45.ge0 ge0Var = this.f385535e;
            if (ge0Var != null) {
                fVar.i(2, ge0Var.computeSize());
                this.f385535e.writeFields(fVar);
            }
            r45.ke0 ke0Var = this.f385536f;
            if (ke0Var != null) {
                fVar.i(3, ke0Var.computeSize());
                this.f385536f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f385534d) + 0;
            r45.ge0 ge0Var2 = this.f385535e;
            if (ge0Var2 != null) {
                h17 += b36.f.i(2, ge0Var2.computeSize());
            }
            r45.ke0 ke0Var2 = this.f385536f;
            return ke0Var2 != null ? h17 + b36.f.i(3, ke0Var2.computeSize()) : h17;
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
        r45.s70 s70Var = (r45.s70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s70Var.f385534d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ge0 ge0Var3 = new r45.ge0();
                if (bArr != null && bArr.length > 0) {
                    ge0Var3.parseFrom(bArr);
                }
                s70Var.f385535e = ge0Var3;
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
            r45.ke0 ke0Var3 = new r45.ke0();
            if (bArr2 != null && bArr2.length > 0) {
                ke0Var3.parseFrom(bArr2);
            }
            s70Var.f385536f = ke0Var3;
        }
        return 0;
    }
}
