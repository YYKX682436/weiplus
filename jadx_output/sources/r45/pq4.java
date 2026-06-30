package r45;

/* loaded from: classes2.dex */
public class pq4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383311e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383312f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pq4)) {
            return false;
        }
        r45.pq4 pq4Var = (r45.pq4) fVar;
        return n51.f.a(this.BaseResponse, pq4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383310d), java.lang.Integer.valueOf(pq4Var.f383310d)) && n51.f.a(this.f383311e, pq4Var.f383311e) && n51.f.a(this.f383312f, pq4Var.f383312f);
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
            fVar.e(2, this.f383310d);
            java.lang.String str = this.f383311e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383312f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383310d);
            java.lang.String str3 = this.f383311e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f383312f;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        r45.pq4 pq4Var = (r45.pq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                pq4Var.f383310d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                pq4Var.f383311e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            pq4Var.f383312f = aVar2.k(intValue);
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
            pq4Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
