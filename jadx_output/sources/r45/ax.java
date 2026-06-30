package r45;

/* loaded from: classes9.dex */
public class ax extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370319d;

    /* renamed from: e, reason: collision with root package name */
    public int f370320e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370321f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370322g;

    /* renamed from: h, reason: collision with root package name */
    public int f370323h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370324i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f370325m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370326n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ax)) {
            return false;
        }
        r45.ax axVar = (r45.ax) fVar;
        return n51.f.a(this.BaseRequest, axVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f370319d), java.lang.Integer.valueOf(axVar.f370319d)) && n51.f.a(java.lang.Integer.valueOf(this.f370320e), java.lang.Integer.valueOf(axVar.f370320e)) && n51.f.a(this.f370321f, axVar.f370321f) && n51.f.a(this.f370322g, axVar.f370322g) && n51.f.a(java.lang.Integer.valueOf(this.f370323h), java.lang.Integer.valueOf(axVar.f370323h)) && n51.f.a(this.f370324i, axVar.f370324i) && n51.f.a(java.lang.Boolean.valueOf(this.f370325m), java.lang.Boolean.valueOf(axVar.f370325m)) && n51.f.a(this.f370326n, axVar.f370326n);
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
            fVar.e(2, this.f370319d);
            fVar.e(3, this.f370320e);
            java.lang.String str = this.f370321f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f370322g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f370323h);
            com.tencent.mm.protobuf.g gVar = this.f370324i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.a(8, this.f370325m);
            java.lang.String str3 = this.f370326n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f370319d) + b36.f.e(3, this.f370320e);
            java.lang.String str4 = this.f370321f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f370322g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int e17 = i18 + b36.f.e(6, this.f370323h);
            com.tencent.mm.protobuf.g gVar2 = this.f370324i;
            if (gVar2 != null) {
                e17 += b36.f.b(7, gVar2);
            }
            int a17 = e17 + b36.f.a(8, this.f370325m);
            java.lang.String str6 = this.f370326n;
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
        r45.ax axVar = (r45.ax) objArr[1];
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
                    axVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                axVar.f370319d = aVar2.g(intValue);
                return 0;
            case 3:
                axVar.f370320e = aVar2.g(intValue);
                return 0;
            case 4:
                axVar.f370321f = aVar2.k(intValue);
                return 0;
            case 5:
                axVar.f370322g = aVar2.k(intValue);
                return 0;
            case 6:
                axVar.f370323h = aVar2.g(intValue);
                return 0;
            case 7:
                axVar.f370324i = aVar2.d(intValue);
                return 0;
            case 8:
                axVar.f370325m = aVar2.c(intValue);
                return 0;
            case 9:
                axVar.f370326n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
