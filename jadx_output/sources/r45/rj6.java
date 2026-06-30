package r45;

/* loaded from: classes2.dex */
public class rj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384952d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hr0 f384953e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rj6)) {
            return false;
        }
        r45.rj6 rj6Var = (r45.rj6) fVar;
        return n51.f.a(this.f384952d, rj6Var.f384952d) && n51.f.a(this.f384953e, rj6Var.f384953e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384952d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.hr0 hr0Var = this.f384953e;
            if (hr0Var != null) {
                fVar.i(2, hr0Var.computeSize());
                this.f384953e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f384952d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.hr0 hr0Var2 = this.f384953e;
            return hr0Var2 != null ? j17 + b36.f.i(2, hr0Var2.computeSize()) : j17;
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
        r45.rj6 rj6Var = (r45.rj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rj6Var.f384952d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.hr0 hr0Var3 = new r45.hr0();
            if (bArr != null && bArr.length > 0) {
                hr0Var3.parseFrom(bArr);
            }
            rj6Var.f384953e = hr0Var3;
        }
        return 0;
    }
}
