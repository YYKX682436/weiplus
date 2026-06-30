package r45;

/* loaded from: classes4.dex */
public class ol extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382333d;

    /* renamed from: e, reason: collision with root package name */
    public int f382334e;

    /* renamed from: f, reason: collision with root package name */
    public int f382335f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382336g;

    /* renamed from: h, reason: collision with root package name */
    public int f382337h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ol)) {
            return false;
        }
        r45.ol olVar = (r45.ol) fVar;
        return n51.f.a(this.BaseRequest, olVar.BaseRequest) && n51.f.a(this.f382333d, olVar.f382333d) && n51.f.a(java.lang.Integer.valueOf(this.f382334e), java.lang.Integer.valueOf(olVar.f382334e)) && n51.f.a(java.lang.Integer.valueOf(this.f382335f), java.lang.Integer.valueOf(olVar.f382335f)) && n51.f.a(this.f382336g, olVar.f382336g) && n51.f.a(java.lang.Integer.valueOf(this.f382337h), java.lang.Integer.valueOf(olVar.f382337h));
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
            com.tencent.mm.protobuf.g gVar = this.f382333d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f382334e);
            fVar.e(4, this.f382335f);
            java.lang.String str = this.f382336g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f382337h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f382333d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            int e17 = i18 + b36.f.e(3, this.f382334e) + b36.f.e(4, this.f382335f);
            java.lang.String str2 = this.f382336g;
            if (str2 != null) {
                e17 += b36.f.j(5, str2);
            }
            return e17 + b36.f.e(6, this.f382337h);
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
        r45.ol olVar = (r45.ol) objArr[1];
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
                    olVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                olVar.f382333d = aVar2.d(intValue);
                return 0;
            case 3:
                olVar.f382334e = aVar2.g(intValue);
                return 0;
            case 4:
                olVar.f382335f = aVar2.g(intValue);
                return 0;
            case 5:
                olVar.f382336g = aVar2.k(intValue);
                return 0;
            case 6:
                olVar.f382337h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
