package r45;

/* loaded from: classes4.dex */
public class l10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379066d;

    /* renamed from: e, reason: collision with root package name */
    public int f379067e;

    /* renamed from: f, reason: collision with root package name */
    public int f379068f;

    /* renamed from: g, reason: collision with root package name */
    public int f379069g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l10)) {
            return false;
        }
        r45.l10 l10Var = (r45.l10) fVar;
        return n51.f.a(this.BaseResponse, l10Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379066d), java.lang.Integer.valueOf(l10Var.f379066d)) && n51.f.a(java.lang.Integer.valueOf(this.f379067e), java.lang.Integer.valueOf(l10Var.f379067e)) && n51.f.a(java.lang.Integer.valueOf(this.f379068f), java.lang.Integer.valueOf(l10Var.f379068f)) && n51.f.a(java.lang.Integer.valueOf(this.f379069g), java.lang.Integer.valueOf(l10Var.f379069g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f379066d);
            fVar.e(3, this.f379067e);
            fVar.e(4, this.f379068f);
            fVar.e(5, this.f379069g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379066d) + b36.f.e(3, this.f379067e) + b36.f.e(4, this.f379068f) + b36.f.e(5, this.f379069g);
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
        r45.l10 l10Var = (r45.l10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                l10Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            l10Var.f379066d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            l10Var.f379067e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            l10Var.f379068f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        l10Var.f379069g = aVar2.g(intValue);
        return 0;
    }
}
