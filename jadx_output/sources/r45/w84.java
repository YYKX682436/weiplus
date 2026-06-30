package r45;

/* loaded from: classes10.dex */
public class w84 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ha4 f388964d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ga4 f388965e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w84)) {
            return false;
        }
        r45.w84 w84Var = (r45.w84) fVar;
        return n51.f.a(this.f388964d, w84Var.f388964d) && n51.f.a(this.f388965e, w84Var.f388965e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ha4 ha4Var = this.f388964d;
            if (ha4Var != null) {
                fVar.i(1, ha4Var.computeSize());
                this.f388964d.writeFields(fVar);
            }
            r45.ga4 ga4Var = this.f388965e;
            if (ga4Var != null) {
                fVar.i(2, ga4Var.computeSize());
                this.f388965e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ha4 ha4Var2 = this.f388964d;
            int i18 = ha4Var2 != null ? 0 + b36.f.i(1, ha4Var2.computeSize()) : 0;
            r45.ga4 ga4Var2 = this.f388965e;
            return ga4Var2 != null ? i18 + b36.f.i(2, ga4Var2.computeSize()) : i18;
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
        r45.w84 w84Var = (r45.w84) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ha4 ha4Var3 = new r45.ha4();
                if (bArr != null && bArr.length > 0) {
                    ha4Var3.parseFrom(bArr);
                }
                w84Var.f388964d = ha4Var3;
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
            r45.ga4 ga4Var3 = new r45.ga4();
            if (bArr2 != null && bArr2.length > 0) {
                ga4Var3.parseFrom(bArr2);
            }
            w84Var.f388965e = ga4Var3;
        }
        return 0;
    }
}
