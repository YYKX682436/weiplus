package r45;

/* loaded from: classes2.dex */
public class px6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383467d;

    /* renamed from: e, reason: collision with root package name */
    public long f383468e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383469f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px6)) {
            return false;
        }
        r45.px6 px6Var = (r45.px6) fVar;
        return n51.f.a(this.BaseRequest, px6Var.BaseRequest) && n51.f.a(this.f383467d, px6Var.f383467d) && n51.f.a(java.lang.Long.valueOf(this.f383468e), java.lang.Long.valueOf(px6Var.f383468e)) && n51.f.a(this.f383469f, px6Var.f383469f);
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
            java.lang.String str = this.f383467d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f383468e);
            java.lang.String str2 = this.f383469f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f383467d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int h17 = i18 + b36.f.h(3, this.f383468e);
            java.lang.String str4 = this.f383469f;
            return str4 != null ? h17 + b36.f.j(4, str4) : h17;
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
        r45.px6 px6Var = (r45.px6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                px6Var.f383467d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                px6Var.f383468e = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            px6Var.f383469f = aVar2.k(intValue);
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
            px6Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
