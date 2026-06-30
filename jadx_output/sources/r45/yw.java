package r45;

/* loaded from: classes8.dex */
public class yw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f391430d;

    /* renamed from: e, reason: collision with root package name */
    public int f391431e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391432f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391433g;

    /* renamed from: h, reason: collision with root package name */
    public long f391434h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391435i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f391436m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391437n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yw)) {
            return false;
        }
        r45.yw ywVar = (r45.yw) fVar;
        return n51.f.a(this.BaseRequest, ywVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f391430d), java.lang.Integer.valueOf(ywVar.f391430d)) && n51.f.a(java.lang.Integer.valueOf(this.f391431e), java.lang.Integer.valueOf(ywVar.f391431e)) && n51.f.a(this.f391432f, ywVar.f391432f) && n51.f.a(this.f391433g, ywVar.f391433g) && n51.f.a(java.lang.Long.valueOf(this.f391434h), java.lang.Long.valueOf(ywVar.f391434h)) && n51.f.a(this.f391435i, ywVar.f391435i) && n51.f.a(java.lang.Boolean.valueOf(this.f391436m), java.lang.Boolean.valueOf(ywVar.f391436m)) && n51.f.a(this.f391437n, ywVar.f391437n);
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
            fVar.e(2, this.f391430d);
            fVar.e(3, this.f391431e);
            java.lang.String str = this.f391432f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f391433g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f391434h);
            com.tencent.mm.protobuf.g gVar = this.f391435i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.a(8, this.f391436m);
            java.lang.String str3 = this.f391437n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f391430d) + b36.f.e(3, this.f391431e);
            java.lang.String str4 = this.f391432f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f391433g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int h17 = i18 + b36.f.h(6, this.f391434h);
            com.tencent.mm.protobuf.g gVar2 = this.f391435i;
            if (gVar2 != null) {
                h17 += b36.f.b(7, gVar2);
            }
            int a17 = h17 + b36.f.a(8, this.f391436m);
            java.lang.String str6 = this.f391437n;
            return str6 != null ? a17 + b36.f.j(9, str6) : a17;
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
        r45.yw ywVar = (r45.yw) objArr[1];
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
                    ywVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ywVar.f391430d = aVar2.g(intValue);
                return 0;
            case 3:
                ywVar.f391431e = aVar2.g(intValue);
                return 0;
            case 4:
                ywVar.f391432f = aVar2.k(intValue);
                return 0;
            case 5:
                ywVar.f391433g = aVar2.k(intValue);
                return 0;
            case 6:
                ywVar.f391434h = aVar2.i(intValue);
                return 0;
            case 7:
                ywVar.f391435i = aVar2.d(intValue);
                return 0;
            case 8:
                ywVar.f391436m = aVar2.c(intValue);
                return 0;
            case 9:
                ywVar.f391437n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
