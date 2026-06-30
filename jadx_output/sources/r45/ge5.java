package r45;

/* loaded from: classes8.dex */
public class ge5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f375169d;

    /* renamed from: e, reason: collision with root package name */
    public long f375170e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375171f;

    /* renamed from: g, reason: collision with root package name */
    public long f375172g;

    /* renamed from: h, reason: collision with root package name */
    public int f375173h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375174i;

    /* renamed from: m, reason: collision with root package name */
    public long f375175m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ge5)) {
            return false;
        }
        r45.ge5 ge5Var = (r45.ge5) fVar;
        return n51.f.a(this.BaseRequest, ge5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f375169d), java.lang.Integer.valueOf(ge5Var.f375169d)) && n51.f.a(java.lang.Long.valueOf(this.f375170e), java.lang.Long.valueOf(ge5Var.f375170e)) && n51.f.a(this.f375171f, ge5Var.f375171f) && n51.f.a(java.lang.Long.valueOf(this.f375172g), java.lang.Long.valueOf(ge5Var.f375172g)) && n51.f.a(java.lang.Integer.valueOf(this.f375173h), java.lang.Integer.valueOf(ge5Var.f375173h)) && n51.f.a(this.f375174i, ge5Var.f375174i) && n51.f.a(java.lang.Long.valueOf(this.f375175m), java.lang.Long.valueOf(ge5Var.f375175m));
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
            fVar.e(2, this.f375169d);
            fVar.h(3, this.f375170e);
            java.lang.String str = this.f375171f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f375172g);
            fVar.e(6, this.f375173h);
            java.lang.String str2 = this.f375174i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.h(8, this.f375175m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f375169d) + b36.f.h(3, this.f375170e);
            java.lang.String str3 = this.f375171f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int h17 = i18 + b36.f.h(5, this.f375172g) + b36.f.e(6, this.f375173h);
            java.lang.String str4 = this.f375174i;
            if (str4 != null) {
                h17 += b36.f.j(7, str4);
            }
            return h17 + b36.f.h(8, this.f375175m);
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
        r45.ge5 ge5Var = (r45.ge5) objArr[1];
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
                    ge5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ge5Var.f375169d = aVar2.g(intValue);
                return 0;
            case 3:
                ge5Var.f375170e = aVar2.i(intValue);
                return 0;
            case 4:
                ge5Var.f375171f = aVar2.k(intValue);
                return 0;
            case 5:
                ge5Var.f375172g = aVar2.i(intValue);
                return 0;
            case 6:
                ge5Var.f375173h = aVar2.g(intValue);
                return 0;
            case 7:
                ge5Var.f375174i = aVar2.k(intValue);
                return 0;
            case 8:
                ge5Var.f375175m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
