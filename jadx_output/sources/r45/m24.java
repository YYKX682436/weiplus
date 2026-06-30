package r45;

/* loaded from: classes7.dex */
public class m24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380089d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380090e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380091f;

    /* renamed from: g, reason: collision with root package name */
    public int f380092g;

    /* renamed from: h, reason: collision with root package name */
    public int f380093h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nd7 f380094i;

    /* renamed from: m, reason: collision with root package name */
    public int f380095m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380096n;

    /* renamed from: o, reason: collision with root package name */
    public int f380097o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f380098p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f380099q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m24)) {
            return false;
        }
        r45.m24 m24Var = (r45.m24) fVar;
        return n51.f.a(this.BaseRequest, m24Var.BaseRequest) && n51.f.a(this.f380089d, m24Var.f380089d) && n51.f.a(this.f380090e, m24Var.f380090e) && n51.f.a(this.f380091f, m24Var.f380091f) && n51.f.a(java.lang.Integer.valueOf(this.f380092g), java.lang.Integer.valueOf(m24Var.f380092g)) && n51.f.a(java.lang.Integer.valueOf(this.f380093h), java.lang.Integer.valueOf(m24Var.f380093h)) && n51.f.a(this.f380094i, m24Var.f380094i) && n51.f.a(java.lang.Integer.valueOf(this.f380095m), java.lang.Integer.valueOf(m24Var.f380095m)) && n51.f.a(this.f380096n, m24Var.f380096n) && n51.f.a(java.lang.Integer.valueOf(this.f380097o), java.lang.Integer.valueOf(m24Var.f380097o)) && n51.f.a(java.lang.Boolean.valueOf(this.f380098p), java.lang.Boolean.valueOf(m24Var.f380098p)) && n51.f.a(java.lang.Boolean.valueOf(this.f380099q), java.lang.Boolean.valueOf(m24Var.f380099q));
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
            java.lang.String str = this.f380089d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f380090e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f380091f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f380092g);
            fVar.e(6, this.f380093h);
            r45.nd7 nd7Var = this.f380094i;
            if (nd7Var != null) {
                fVar.i(7, nd7Var.computeSize());
                this.f380094i.writeFields(fVar);
            }
            fVar.e(8, this.f380095m);
            java.lang.String str3 = this.f380096n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f380097o);
            fVar.a(11, this.f380098p);
            fVar.a(12, this.f380099q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f380089d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f380090e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str5 = this.f380091f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int e17 = i18 + b36.f.e(5, this.f380092g) + b36.f.e(6, this.f380093h);
            r45.nd7 nd7Var2 = this.f380094i;
            if (nd7Var2 != null) {
                e17 += b36.f.i(7, nd7Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f380095m);
            java.lang.String str6 = this.f380096n;
            if (str6 != null) {
                e18 += b36.f.j(9, str6);
            }
            return e18 + b36.f.e(10, this.f380097o) + b36.f.a(11, this.f380098p) + b36.f.a(12, this.f380099q);
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
        r45.m24 m24Var = (r45.m24) objArr[1];
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
                    m24Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                m24Var.f380089d = aVar2.k(intValue);
                return 0;
            case 3:
                m24Var.f380090e = aVar2.d(intValue);
                return 0;
            case 4:
                m24Var.f380091f = aVar2.k(intValue);
                return 0;
            case 5:
                m24Var.f380092g = aVar2.g(intValue);
                return 0;
            case 6:
                m24Var.f380093h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.nd7 nd7Var3 = new r45.nd7();
                    if (bArr2 != null && bArr2.length > 0) {
                        nd7Var3.parseFrom(bArr2);
                    }
                    m24Var.f380094i = nd7Var3;
                }
                return 0;
            case 8:
                m24Var.f380095m = aVar2.g(intValue);
                return 0;
            case 9:
                m24Var.f380096n = aVar2.k(intValue);
                return 0;
            case 10:
                m24Var.f380097o = aVar2.g(intValue);
                return 0;
            case 11:
                m24Var.f380098p = aVar2.c(intValue);
                return 0;
            case 12:
                m24Var.f380099q = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
