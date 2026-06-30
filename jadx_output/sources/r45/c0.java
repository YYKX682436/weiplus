package r45;

/* loaded from: classes8.dex */
public class c0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371187d;

    /* renamed from: e, reason: collision with root package name */
    public int f371188e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371189f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371190g;

    /* renamed from: h, reason: collision with root package name */
    public int f371191h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c0)) {
            return false;
        }
        r45.c0 c0Var = (r45.c0) fVar;
        return n51.f.a(this.BaseRequest, c0Var.BaseRequest) && n51.f.a(this.f371187d, c0Var.f371187d) && n51.f.a(java.lang.Integer.valueOf(this.f371188e), java.lang.Integer.valueOf(c0Var.f371188e)) && n51.f.a(this.f371189f, c0Var.f371189f) && n51.f.a(this.f371190g, c0Var.f371190g) && n51.f.a(java.lang.Integer.valueOf(this.f371191h), java.lang.Integer.valueOf(c0Var.f371191h));
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
            java.lang.String str = this.f371187d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f371188e);
            java.lang.String str2 = this.f371189f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371190g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f371191h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f371187d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f371188e);
            java.lang.String str5 = this.f371189f;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f371190g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f371191h);
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
        r45.c0 c0Var = (r45.c0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    c0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                c0Var.f371187d = aVar2.k(intValue);
                return 0;
            case 3:
                c0Var.f371188e = aVar2.g(intValue);
                return 0;
            case 4:
                c0Var.f371189f = aVar2.k(intValue);
                return 0;
            case 5:
                c0Var.f371190g = aVar2.k(intValue);
                return 0;
            case 6:
                c0Var.f371191h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
