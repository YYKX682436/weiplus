package r45;

/* loaded from: classes8.dex */
public class wv4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389518d;

    /* renamed from: e, reason: collision with root package name */
    public int f389519e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389520f;

    /* renamed from: g, reason: collision with root package name */
    public int f389521g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389522h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389523i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389524m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f389525n;

    /* renamed from: o, reason: collision with root package name */
    public int f389526o;

    /* renamed from: p, reason: collision with root package name */
    public int f389527p;

    /* renamed from: q, reason: collision with root package name */
    public int f389528q = 2;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wv4)) {
            return false;
        }
        r45.wv4 wv4Var = (r45.wv4) fVar;
        return n51.f.a(this.BaseRequest, wv4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f389518d), java.lang.Integer.valueOf(wv4Var.f389518d)) && n51.f.a(java.lang.Integer.valueOf(this.f389519e), java.lang.Integer.valueOf(wv4Var.f389519e)) && n51.f.a(this.f389520f, wv4Var.f389520f) && n51.f.a(java.lang.Integer.valueOf(this.f389521g), java.lang.Integer.valueOf(wv4Var.f389521g)) && n51.f.a(this.f389522h, wv4Var.f389522h) && n51.f.a(this.f389523i, wv4Var.f389523i) && n51.f.a(this.f389524m, wv4Var.f389524m) && n51.f.a(this.f389525n, wv4Var.f389525n) && n51.f.a(java.lang.Integer.valueOf(this.f389526o), java.lang.Integer.valueOf(wv4Var.f389526o)) && n51.f.a(java.lang.Integer.valueOf(this.f389527p), java.lang.Integer.valueOf(wv4Var.f389527p)) && n51.f.a(java.lang.Integer.valueOf(this.f389528q), java.lang.Integer.valueOf(wv4Var.f389528q));
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
            fVar.e(2, this.f389518d);
            fVar.e(3, this.f389519e);
            com.tencent.mm.protobuf.g gVar = this.f389520f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f389521g);
            com.tencent.mm.protobuf.g gVar2 = this.f389522h;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            java.lang.String str = this.f389523i;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f389524m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f389525n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f389526o);
            fVar.e(11, this.f389527p);
            fVar.e(12, this.f389528q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f389518d) + b36.f.e(3, this.f389519e);
            com.tencent.mm.protobuf.g gVar3 = this.f389520f;
            if (gVar3 != null) {
                i18 += b36.f.b(4, gVar3);
            }
            int e17 = i18 + b36.f.e(5, this.f389521g);
            com.tencent.mm.protobuf.g gVar4 = this.f389522h;
            if (gVar4 != null) {
                e17 += b36.f.b(6, gVar4);
            }
            java.lang.String str4 = this.f389523i;
            if (str4 != null) {
                e17 += b36.f.j(7, str4);
            }
            java.lang.String str5 = this.f389524m;
            if (str5 != null) {
                e17 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f389525n;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.e(10, this.f389526o) + b36.f.e(11, this.f389527p) + b36.f.e(12, this.f389528q);
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
        r45.wv4 wv4Var = (r45.wv4) objArr[1];
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
                    wv4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wv4Var.f389518d = aVar2.g(intValue);
                return 0;
            case 3:
                wv4Var.f389519e = aVar2.g(intValue);
                return 0;
            case 4:
                wv4Var.f389520f = aVar2.d(intValue);
                return 0;
            case 5:
                wv4Var.f389521g = aVar2.g(intValue);
                return 0;
            case 6:
                wv4Var.f389522h = aVar2.d(intValue);
                return 0;
            case 7:
                wv4Var.f389523i = aVar2.k(intValue);
                return 0;
            case 8:
                wv4Var.f389524m = aVar2.k(intValue);
                return 0;
            case 9:
                wv4Var.f389525n = aVar2.k(intValue);
                return 0;
            case 10:
                wv4Var.f389526o = aVar2.g(intValue);
                return 0;
            case 11:
                wv4Var.f389527p = aVar2.g(intValue);
                return 0;
            case 12:
                wv4Var.f389528q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
