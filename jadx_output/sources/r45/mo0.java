package r45;

/* loaded from: classes2.dex */
public class mo0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380708d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380709e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380710f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mo0)) {
            return false;
        }
        r45.mo0 mo0Var = (r45.mo0) fVar;
        return n51.f.a(this.BaseRequest, mo0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f380708d), java.lang.Integer.valueOf(mo0Var.f380708d)) && n51.f.a(this.f380709e, mo0Var.f380709e) && n51.f.a(this.f380710f, mo0Var.f380710f);
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
            fVar.e(2, this.f380708d);
            java.lang.String str = this.f380709e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f380710f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f380708d);
            java.lang.String str3 = this.f380709e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f380710f;
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
        r45.mo0 mo0Var = (r45.mo0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                mo0Var.f380708d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                mo0Var.f380709e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            mo0Var.f380710f = aVar2.k(intValue);
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
            mo0Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
