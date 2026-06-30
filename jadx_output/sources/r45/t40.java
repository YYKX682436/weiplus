package r45;

/* loaded from: classes4.dex */
public class t40 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386130d;

    /* renamed from: e, reason: collision with root package name */
    public int f386131e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386132f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t40)) {
            return false;
        }
        r45.t40 t40Var = (r45.t40) fVar;
        return n51.f.a(this.BaseRequest, t40Var.BaseRequest) && n51.f.a(this.f386130d, t40Var.f386130d) && n51.f.a(java.lang.Integer.valueOf(this.f386131e), java.lang.Integer.valueOf(t40Var.f386131e)) && n51.f.a(this.f386132f, t40Var.f386132f);
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
            java.lang.String str = this.f386130d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f386131e);
            java.lang.String str2 = this.f386132f;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f386130d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f386131e);
            java.lang.String str4 = this.f386132f;
            return str4 != null ? e17 + b36.f.j(100, str4) : e17;
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
        r45.t40 t40Var = (r45.t40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                t40Var.f386130d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                t40Var.f386131e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 100) {
                return -1;
            }
            t40Var.f386132f = aVar2.k(intValue);
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
            t40Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
