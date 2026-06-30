package r45;

/* loaded from: classes4.dex */
public class yb extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390939d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f390940e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f390941f;

    /* renamed from: g, reason: collision with root package name */
    public int f390942g;

    /* renamed from: h, reason: collision with root package name */
    public int f390943h;

    /* renamed from: i, reason: collision with root package name */
    public int f390944i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yb)) {
            return false;
        }
        r45.yb ybVar = (r45.yb) fVar;
        return n51.f.a(this.BaseRequest, ybVar.BaseRequest) && n51.f.a(this.f390939d, ybVar.f390939d) && n51.f.a(this.f390940e, ybVar.f390940e) && n51.f.a(java.lang.Boolean.valueOf(this.f390941f), java.lang.Boolean.valueOf(ybVar.f390941f)) && n51.f.a(java.lang.Integer.valueOf(this.f390942g), java.lang.Integer.valueOf(ybVar.f390942g)) && n51.f.a(java.lang.Integer.valueOf(this.f390943h), java.lang.Integer.valueOf(ybVar.f390943h)) && n51.f.a(java.lang.Integer.valueOf(this.f390944i), java.lang.Integer.valueOf(ybVar.f390944i));
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
            java.lang.String str = this.f390939d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f390940e);
            fVar.a(4, this.f390941f);
            fVar.e(5, this.f390942g);
            fVar.e(6, this.f390943h);
            fVar.e(7, this.f390944i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f390939d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 1, this.f390940e) + b36.f.a(4, this.f390941f) + b36.f.e(5, this.f390942g) + b36.f.e(6, this.f390943h) + b36.f.e(7, this.f390944i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f390940e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.yb ybVar = (r45.yb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    ybVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ybVar.f390939d = aVar2.k(intValue);
                return 0;
            case 3:
                ybVar.f390940e.add(aVar2.k(intValue));
                return 0;
            case 4:
                ybVar.f390941f = aVar2.c(intValue);
                return 0;
            case 5:
                ybVar.f390942g = aVar2.g(intValue);
                return 0;
            case 6:
                ybVar.f390943h = aVar2.g(intValue);
                return 0;
            case 7:
                ybVar.f390944i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
