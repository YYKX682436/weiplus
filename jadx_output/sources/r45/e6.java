package r45;

/* loaded from: classes8.dex */
public class e6 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final r45.e6 f373037f = new r45.e6();

    /* renamed from: d, reason: collision with root package name */
    public r45.s5 f373038d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f6 f373039e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e6)) {
            return false;
        }
        r45.e6 e6Var = (r45.e6) fVar;
        return n51.f.a(this.f373038d, e6Var.f373038d) && n51.f.a(this.f373039e, e6Var.f373039e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.e6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.s5 s5Var = this.f373038d;
            if (s5Var != null) {
                fVar.i(1, s5Var.computeSize());
                this.f373038d.writeFields(fVar);
            }
            r45.f6 f6Var = this.f373039e;
            if (f6Var != null) {
                fVar.i(2, f6Var.computeSize());
                this.f373039e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.s5 s5Var2 = this.f373038d;
            int i18 = s5Var2 != null ? 0 + b36.f.i(1, s5Var2.computeSize()) : 0;
            r45.f6 f6Var2 = this.f373039e;
            return f6Var2 != null ? i18 + b36.f.i(2, f6Var2.computeSize()) : i18;
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
                r45.s5 s5Var3 = new r45.s5();
                if (bArr != null && bArr.length > 0) {
                    s5Var3.parseFrom(bArr);
                }
                this.f373038d = s5Var3;
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
            r45.f6 f6Var3 = new r45.f6();
            if (bArr2 != null && bArr2.length > 0) {
                f6Var3.parseFrom(bArr2);
            }
            this.f373039e = f6Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.e6) super.parseFrom(bArr);
    }
}
