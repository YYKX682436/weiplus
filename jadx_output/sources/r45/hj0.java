package r45;

/* loaded from: classes12.dex */
public class hj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.zj0 f376210d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ij0 f376211e;

    static {
        new r45.hj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.hj0 parseFrom(byte[] bArr) {
        return (r45.hj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hj0)) {
            return false;
        }
        r45.hj0 hj0Var = (r45.hj0) fVar;
        return n51.f.a(this.f376210d, hj0Var.f376210d) && n51.f.a(this.f376211e, hj0Var.f376211e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.hj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.zj0 zj0Var = this.f376210d;
            if (zj0Var != null) {
                fVar.i(1, zj0Var.computeSize());
                this.f376210d.writeFields(fVar);
            }
            r45.ij0 ij0Var = this.f376211e;
            if (ij0Var != null) {
                fVar.i(2, ij0Var.computeSize());
                this.f376211e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.zj0 zj0Var2 = this.f376210d;
            int i18 = zj0Var2 != null ? 0 + b36.f.i(1, zj0Var2.computeSize()) : 0;
            r45.ij0 ij0Var2 = this.f376211e;
            return ij0Var2 != null ? i18 + b36.f.i(2, ij0Var2.computeSize()) : i18;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.zj0 zj0Var3 = new r45.zj0();
                if (bArr != null && bArr.length > 0) {
                    zj0Var3.parseFrom(bArr);
                }
                this.f376210d = zj0Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ij0 ij0Var3 = new r45.ij0();
            if (bArr2 != null && bArr2.length > 0) {
                ij0Var3.parseFrom(bArr2);
            }
            this.f376211e = ij0Var3;
        }
        return 0;
    }
}
