package r45;

/* loaded from: classes4.dex */
public class pr5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383333d;

    /* renamed from: e, reason: collision with root package name */
    public int f383334e;

    /* renamed from: f, reason: collision with root package name */
    public int f383335f;

    /* renamed from: g, reason: collision with root package name */
    public long f383336g;

    /* renamed from: h, reason: collision with root package name */
    public int f383337h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383338i;

    /* renamed from: m, reason: collision with root package name */
    public int f383339m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pr5)) {
            return false;
        }
        r45.pr5 pr5Var = (r45.pr5) fVar;
        return n51.f.a(this.BaseRequest, pr5Var.BaseRequest) && n51.f.a(this.f383333d, pr5Var.f383333d) && n51.f.a(java.lang.Integer.valueOf(this.f383334e), java.lang.Integer.valueOf(pr5Var.f383334e)) && n51.f.a(java.lang.Integer.valueOf(this.f383335f), java.lang.Integer.valueOf(pr5Var.f383335f)) && n51.f.a(java.lang.Long.valueOf(this.f383336g), java.lang.Long.valueOf(pr5Var.f383336g)) && n51.f.a(java.lang.Integer.valueOf(this.f383337h), java.lang.Integer.valueOf(pr5Var.f383337h)) && n51.f.a(this.f383338i, pr5Var.f383338i) && n51.f.a(java.lang.Integer.valueOf(this.f383339m), java.lang.Integer.valueOf(pr5Var.f383339m));
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
            java.lang.String str = this.f383333d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f383334e);
            fVar.e(4, this.f383335f);
            fVar.h(5, this.f383336g);
            fVar.e(6, this.f383337h);
            java.lang.String str2 = this.f383338i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f383339m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f383333d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f383334e) + b36.f.e(4, this.f383335f) + b36.f.h(5, this.f383336g) + b36.f.e(6, this.f383337h);
            java.lang.String str4 = this.f383338i;
            if (str4 != null) {
                e17 += b36.f.j(7, str4);
            }
            return e17 + b36.f.e(8, this.f383339m);
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
        r45.pr5 pr5Var = (r45.pr5) objArr[1];
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
                    pr5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                pr5Var.f383333d = aVar2.k(intValue);
                return 0;
            case 3:
                pr5Var.f383334e = aVar2.g(intValue);
                return 0;
            case 4:
                pr5Var.f383335f = aVar2.g(intValue);
                return 0;
            case 5:
                pr5Var.f383336g = aVar2.i(intValue);
                return 0;
            case 6:
                pr5Var.f383337h = aVar2.g(intValue);
                return 0;
            case 7:
                pr5Var.f383338i = aVar2.k(intValue);
                return 0;
            case 8:
                pr5Var.f383339m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
