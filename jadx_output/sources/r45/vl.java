package r45;

/* loaded from: classes9.dex */
public class vl extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388328d;

    /* renamed from: e, reason: collision with root package name */
    public int f388329e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388330f;

    /* renamed from: g, reason: collision with root package name */
    public int f388331g;

    /* renamed from: h, reason: collision with root package name */
    public long f388332h;

    /* renamed from: i, reason: collision with root package name */
    public int f388333i;

    /* renamed from: m, reason: collision with root package name */
    public int f388334m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388335n;

    /* renamed from: o, reason: collision with root package name */
    public int f388336o;

    /* renamed from: p, reason: collision with root package name */
    public int f388337p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f388338q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vl)) {
            return false;
        }
        r45.vl vlVar = (r45.vl) fVar;
        return n51.f.a(this.BaseRequest, vlVar.BaseRequest) && n51.f.a(this.f388328d, vlVar.f388328d) && n51.f.a(java.lang.Integer.valueOf(this.f388329e), java.lang.Integer.valueOf(vlVar.f388329e)) && n51.f.a(this.f388330f, vlVar.f388330f) && n51.f.a(java.lang.Integer.valueOf(this.f388331g), java.lang.Integer.valueOf(vlVar.f388331g)) && n51.f.a(java.lang.Long.valueOf(this.f388332h), java.lang.Long.valueOf(vlVar.f388332h)) && n51.f.a(java.lang.Integer.valueOf(this.f388333i), java.lang.Integer.valueOf(vlVar.f388333i)) && n51.f.a(java.lang.Integer.valueOf(this.f388334m), java.lang.Integer.valueOf(vlVar.f388334m)) && n51.f.a(this.f388335n, vlVar.f388335n) && n51.f.a(java.lang.Integer.valueOf(this.f388336o), java.lang.Integer.valueOf(vlVar.f388336o)) && n51.f.a(java.lang.Integer.valueOf(this.f388337p), java.lang.Integer.valueOf(vlVar.f388337p)) && n51.f.a(java.lang.Boolean.valueOf(this.f388338q), java.lang.Boolean.valueOf(vlVar.f388338q));
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
            java.lang.String str = this.f388328d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f388329e);
            com.tencent.mm.protobuf.g gVar = this.f388330f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f388331g);
            fVar.h(6, this.f388332h);
            fVar.e(7, this.f388333i);
            fVar.e(8, this.f388334m);
            java.lang.String str2 = this.f388335n;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            fVar.e(13, this.f388336o);
            fVar.e(14, this.f388337p);
            fVar.a(15, this.f388338q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f388328d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f388329e);
            com.tencent.mm.protobuf.g gVar2 = this.f388330f;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            int e18 = e17 + b36.f.e(5, this.f388331g) + b36.f.h(6, this.f388332h) + b36.f.e(7, this.f388333i) + b36.f.e(8, this.f388334m);
            java.lang.String str4 = this.f388335n;
            if (str4 != null) {
                e18 += b36.f.j(12, str4);
            }
            return e18 + b36.f.e(13, this.f388336o) + b36.f.e(14, this.f388337p) + b36.f.a(15, this.f388338q);
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
        r45.vl vlVar = (r45.vl) objArr[1];
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
                    vlVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                vlVar.f388328d = aVar2.k(intValue);
                return 0;
            case 3:
                vlVar.f388329e = aVar2.g(intValue);
                return 0;
            case 4:
                vlVar.f388330f = aVar2.d(intValue);
                return 0;
            case 5:
                vlVar.f388331g = aVar2.g(intValue);
                return 0;
            case 6:
                vlVar.f388332h = aVar2.i(intValue);
                return 0;
            case 7:
                vlVar.f388333i = aVar2.g(intValue);
                return 0;
            case 8:
                vlVar.f388334m = aVar2.g(intValue);
                return 0;
            case 9:
            case 10:
            case 11:
            default:
                return -1;
            case 12:
                vlVar.f388335n = aVar2.k(intValue);
                return 0;
            case 13:
                vlVar.f388336o = aVar2.g(intValue);
                return 0;
            case 14:
                vlVar.f388337p = aVar2.g(intValue);
                return 0;
            case 15:
                vlVar.f388338q = aVar2.c(intValue);
                return 0;
        }
    }
}
