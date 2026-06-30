package r45;

/* loaded from: classes9.dex */
public class x26 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f389700d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f389701e;

    /* renamed from: f, reason: collision with root package name */
    public int f389702f;

    /* renamed from: g, reason: collision with root package name */
    public int f389703g;

    /* renamed from: h, reason: collision with root package name */
    public int f389704h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x26)) {
            return false;
        }
        r45.x26 x26Var = (r45.x26) fVar;
        return n51.f.a(this.BaseRequest, x26Var.BaseRequest) && n51.f.a(java.lang.Boolean.valueOf(this.f389700d), java.lang.Boolean.valueOf(x26Var.f389700d)) && n51.f.a(java.lang.Boolean.valueOf(this.f389701e), java.lang.Boolean.valueOf(x26Var.f389701e)) && n51.f.a(java.lang.Integer.valueOf(this.f389702f), java.lang.Integer.valueOf(x26Var.f389702f)) && n51.f.a(java.lang.Integer.valueOf(this.f389703g), java.lang.Integer.valueOf(x26Var.f389703g)) && n51.f.a(java.lang.Integer.valueOf(this.f389704h), java.lang.Integer.valueOf(x26Var.f389704h));
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
            fVar.a(2, this.f389700d);
            fVar.a(3, this.f389701e);
            fVar.e(4, this.f389702f);
            fVar.e(5, this.f389703g);
            fVar.e(6, this.f389704h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.a(2, this.f389700d) + b36.f.a(3, this.f389701e) + b36.f.e(4, this.f389702f) + b36.f.e(5, this.f389703g) + b36.f.e(6, this.f389704h);
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
        r45.x26 x26Var = (r45.x26) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    x26Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                x26Var.f389700d = aVar2.c(intValue);
                return 0;
            case 3:
                x26Var.f389701e = aVar2.c(intValue);
                return 0;
            case 4:
                x26Var.f389702f = aVar2.g(intValue);
                return 0;
            case 5:
                x26Var.f389703g = aVar2.g(intValue);
                return 0;
            case 6:
                x26Var.f389704h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
