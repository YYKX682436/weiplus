package r45;

/* loaded from: classes8.dex */
public class w74 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f388944d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ua4 f388945e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w74)) {
            return false;
        }
        r45.w74 w74Var = (r45.w74) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f388944d), java.lang.Long.valueOf(w74Var.f388944d)) && n51.f.a(this.f388945e, w74Var.f388945e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f388944d);
            r45.ua4 ua4Var = this.f388945e;
            if (ua4Var != null) {
                fVar.i(2, ua4Var.computeSize());
                this.f388945e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f388944d) + 0;
            r45.ua4 ua4Var2 = this.f388945e;
            return ua4Var2 != null ? h17 + b36.f.i(2, ua4Var2.computeSize()) : h17;
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
        r45.w74 w74Var = (r45.w74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w74Var.f388944d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ua4 ua4Var3 = new r45.ua4();
            if (bArr != null && bArr.length > 0) {
                ua4Var3.parseFrom(bArr);
            }
            w74Var.f388945e = ua4Var3;
        }
        return 0;
    }
}
