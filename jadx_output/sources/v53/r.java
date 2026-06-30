package v53;

/* loaded from: classes2.dex */
public class r extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433360d;

    /* renamed from: e, reason: collision with root package name */
    public long f433361e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f433362f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof v53.r)) {
            return false;
        }
        v53.r rVar = (v53.r) fVar;
        return n51.f.a(this.BaseRequest, rVar.BaseRequest) && n51.f.a(this.f433360d, rVar.f433360d) && n51.f.a(java.lang.Long.valueOf(this.f433361e), java.lang.Long.valueOf(rVar.f433361e)) && n51.f.a(java.lang.Boolean.valueOf(this.f433362f), java.lang.Boolean.valueOf(rVar.f433362f));
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
            java.lang.String str = this.f433360d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f433361e);
            fVar.a(4, this.f433362f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f433360d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.h(3, this.f433361e) + b36.f.a(4, this.f433362f);
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
        v53.r rVar = (v53.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                rVar.f433360d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                rVar.f433361e = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            rVar.f433362f = aVar2.c(intValue);
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
            rVar.BaseRequest = heVar3;
        }
        return 0;
    }
}
