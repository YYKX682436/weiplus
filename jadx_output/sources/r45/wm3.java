package r45;

/* loaded from: classes8.dex */
public class wm3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389272e;

    /* renamed from: f, reason: collision with root package name */
    public int f389273f;

    /* renamed from: g, reason: collision with root package name */
    public int f389274g;

    /* renamed from: h, reason: collision with root package name */
    public int f389275h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389276i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wm3)) {
            return false;
        }
        r45.wm3 wm3Var = (r45.wm3) fVar;
        return n51.f.a(this.BaseRequest, wm3Var.BaseRequest) && n51.f.a(this.f389271d, wm3Var.f389271d) && n51.f.a(this.f389272e, wm3Var.f389272e) && n51.f.a(java.lang.Integer.valueOf(this.f389273f), java.lang.Integer.valueOf(wm3Var.f389273f)) && n51.f.a(java.lang.Integer.valueOf(this.f389274g), java.lang.Integer.valueOf(wm3Var.f389274g)) && n51.f.a(java.lang.Integer.valueOf(this.f389275h), java.lang.Integer.valueOf(wm3Var.f389275h)) && n51.f.a(this.f389276i, wm3Var.f389276i);
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
            java.lang.String str = this.f389271d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389272e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f389273f);
            fVar.e(5, this.f389274g);
            fVar.e(6, this.f389275h);
            com.tencent.mm.protobuf.g gVar = this.f389276i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f389271d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f389272e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f389273f) + b36.f.e(5, this.f389274g) + b36.f.e(6, this.f389275h);
            com.tencent.mm.protobuf.g gVar2 = this.f389276i;
            return gVar2 != null ? e17 + b36.f.b(7, gVar2) : e17;
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
        r45.wm3 wm3Var = (r45.wm3) objArr[1];
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
                    wm3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wm3Var.f389271d = aVar2.k(intValue);
                return 0;
            case 3:
                wm3Var.f389272e = aVar2.k(intValue);
                return 0;
            case 4:
                wm3Var.f389273f = aVar2.g(intValue);
                return 0;
            case 5:
                wm3Var.f389274g = aVar2.g(intValue);
                return 0;
            case 6:
                wm3Var.f389275h = aVar2.g(intValue);
                return 0;
            case 7:
                wm3Var.f389276i = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
