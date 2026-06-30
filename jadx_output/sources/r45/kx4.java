package r45;

/* loaded from: classes8.dex */
public class kx4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379026e;

    /* renamed from: f, reason: collision with root package name */
    public int f379027f;

    /* renamed from: g, reason: collision with root package name */
    public int f379028g;

    /* renamed from: h, reason: collision with root package name */
    public int f379029h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379030i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kx4)) {
            return false;
        }
        r45.kx4 kx4Var = (r45.kx4) fVar;
        return n51.f.a(this.BaseRequest, kx4Var.BaseRequest) && n51.f.a(this.f379025d, kx4Var.f379025d) && n51.f.a(this.f379026e, kx4Var.f379026e) && n51.f.a(java.lang.Integer.valueOf(this.f379027f), java.lang.Integer.valueOf(kx4Var.f379027f)) && n51.f.a(java.lang.Integer.valueOf(this.f379028g), java.lang.Integer.valueOf(kx4Var.f379028g)) && n51.f.a(java.lang.Integer.valueOf(this.f379029h), java.lang.Integer.valueOf(kx4Var.f379029h)) && n51.f.a(this.f379030i, kx4Var.f379030i);
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
            java.lang.String str = this.f379025d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379026e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f379027f);
            fVar.e(5, this.f379028g);
            fVar.e(6, this.f379029h);
            java.lang.String str3 = this.f379030i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f379025d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f379026e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f379027f) + b36.f.e(5, this.f379028g) + b36.f.e(6, this.f379029h);
            java.lang.String str6 = this.f379030i;
            return str6 != null ? e17 + b36.f.j(7, str6) : e17;
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
        r45.kx4 kx4Var = (r45.kx4) objArr[1];
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
                    kx4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                kx4Var.f379025d = aVar2.k(intValue);
                return 0;
            case 3:
                kx4Var.f379026e = aVar2.k(intValue);
                return 0;
            case 4:
                kx4Var.f379027f = aVar2.g(intValue);
                return 0;
            case 5:
                kx4Var.f379028g = aVar2.g(intValue);
                return 0;
            case 6:
                kx4Var.f379029h = aVar2.g(intValue);
                return 0;
            case 7:
                kx4Var.f379030i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
