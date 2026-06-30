package r45;

/* loaded from: classes4.dex */
public class vl0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388339d;

    /* renamed from: e, reason: collision with root package name */
    public long f388340e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388341f;

    /* renamed from: g, reason: collision with root package name */
    public int f388342g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vl0)) {
            return false;
        }
        r45.vl0 vl0Var = (r45.vl0) fVar;
        return n51.f.a(this.BaseRequest, vl0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f388339d), java.lang.Integer.valueOf(vl0Var.f388339d)) && n51.f.a(java.lang.Long.valueOf(this.f388340e), java.lang.Long.valueOf(vl0Var.f388340e)) && n51.f.a(this.f388341f, vl0Var.f388341f) && n51.f.a(java.lang.Integer.valueOf(this.f388342g), java.lang.Integer.valueOf(vl0Var.f388342g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f388339d);
            fVar.h(3, this.f388340e);
            java.lang.String str = this.f388341f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f388342g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f388339d) + b36.f.h(3, this.f388340e);
            java.lang.String str2 = this.f388341f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f388342g);
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
        r45.vl0 vl0Var = (r45.vl0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                vl0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            vl0Var.f388339d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            vl0Var.f388340e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            vl0Var.f388341f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        vl0Var.f388342g = aVar2.g(intValue);
        return 0;
    }
}
