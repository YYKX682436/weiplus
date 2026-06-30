package f21;

/* loaded from: classes11.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f258911d;

    /* renamed from: e, reason: collision with root package name */
    public f21.h0 f258912e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof f21.i)) {
            return false;
        }
        f21.i iVar = (f21.i) fVar;
        return n51.f.a(this.f258911d, iVar.f258911d) && n51.f.a(this.f258912e, iVar.f258912e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f258911d;
            if (str != null) {
                fVar.j(1, str);
            }
            f21.h0 h0Var = this.f258912e;
            if (h0Var != null) {
                fVar.i(2, h0Var.computeSize());
                this.f258912e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f258911d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            f21.h0 h0Var2 = this.f258912e;
            return h0Var2 != null ? j17 + b36.f.i(2, h0Var2.computeSize()) : j17;
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
        f21.i iVar = (f21.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f258911d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            f21.h0 h0Var3 = new f21.h0();
            if (bArr != null && bArr.length > 0) {
                h0Var3.parseFrom(bArr);
            }
            iVar.f258912e = h0Var3;
        }
        return 0;
    }
}
