package r45;

/* loaded from: classes2.dex */
public class oh6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382272d;

    /* renamed from: e, reason: collision with root package name */
    public int f382273e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382274f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oh6)) {
            return false;
        }
        r45.oh6 oh6Var = (r45.oh6) fVar;
        return n51.f.a(this.BaseResponse, oh6Var.BaseResponse) && n51.f.a(this.f382272d, oh6Var.f382272d) && n51.f.a(java.lang.Integer.valueOf(this.f382273e), java.lang.Integer.valueOf(oh6Var.f382273e)) && n51.f.a(this.f382274f, oh6Var.f382274f);
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
            java.lang.String str = this.f382272d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f382273e);
            java.lang.String str2 = this.f382274f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f382272d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f382273e);
            java.lang.String str4 = this.f382274f;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.oh6 oh6Var = (r45.oh6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                oh6Var.f382272d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                oh6Var.f382273e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            oh6Var.f382274f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            oh6Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
