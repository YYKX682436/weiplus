package r45;

/* loaded from: classes2.dex */
public class gh5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375252d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f375253e;

    /* renamed from: f, reason: collision with root package name */
    public int f375254f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gh5)) {
            return false;
        }
        r45.gh5 gh5Var = (r45.gh5) fVar;
        return n51.f.a(this.BaseRequest, gh5Var.BaseRequest) && n51.f.a(this.f375252d, gh5Var.f375252d) && n51.f.a(java.lang.Boolean.valueOf(this.f375253e), java.lang.Boolean.valueOf(gh5Var.f375253e)) && n51.f.a(java.lang.Integer.valueOf(this.f375254f), java.lang.Integer.valueOf(gh5Var.f375254f));
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
            java.lang.String str = this.f375252d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f375253e);
            fVar.e(4, this.f375254f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f375252d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.a(3, this.f375253e) + b36.f.e(4, this.f375254f);
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
        r45.gh5 gh5Var = (r45.gh5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                gh5Var.f375252d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                gh5Var.f375253e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            gh5Var.f375254f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            gh5Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
