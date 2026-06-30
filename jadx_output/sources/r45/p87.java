package r45;

/* loaded from: classes4.dex */
public class p87 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382858d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382859e;

    /* renamed from: f, reason: collision with root package name */
    public int f382860f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p87)) {
            return false;
        }
        r45.p87 p87Var = (r45.p87) fVar;
        return n51.f.a(this.BaseRequest, p87Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f382858d), java.lang.Integer.valueOf(p87Var.f382858d)) && n51.f.a(this.f382859e, p87Var.f382859e) && n51.f.a(java.lang.Integer.valueOf(this.f382860f), java.lang.Integer.valueOf(p87Var.f382860f));
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
            fVar.e(2, this.f382858d);
            java.lang.String str = this.f382859e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f382860f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f382858d);
            java.lang.String str2 = this.f382859e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f382860f);
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
        r45.p87 p87Var = (r45.p87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                p87Var.f382858d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                p87Var.f382859e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            p87Var.f382860f = aVar2.g(intValue);
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
            p87Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
