package r45;

/* loaded from: classes9.dex */
public class m9 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380260e;

    /* renamed from: f, reason: collision with root package name */
    public long f380261f;

    /* renamed from: g, reason: collision with root package name */
    public int f380262g;

    /* renamed from: h, reason: collision with root package name */
    public int f380263h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380264i;

    /* renamed from: m, reason: collision with root package name */
    public int f380265m;

    /* renamed from: n, reason: collision with root package name */
    public int f380266n;

    /* renamed from: o, reason: collision with root package name */
    public int f380267o;

    /* renamed from: p, reason: collision with root package name */
    public int f380268p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380269q;

    /* renamed from: r, reason: collision with root package name */
    public long f380270r;

    /* renamed from: s, reason: collision with root package name */
    public int f380271s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m9)) {
            return false;
        }
        r45.m9 m9Var = (r45.m9) fVar;
        return n51.f.a(this.BaseRequest, m9Var.BaseRequest) && n51.f.a(this.f380259d, m9Var.f380259d) && n51.f.a(this.f380260e, m9Var.f380260e) && n51.f.a(java.lang.Long.valueOf(this.f380261f), java.lang.Long.valueOf(m9Var.f380261f)) && n51.f.a(java.lang.Integer.valueOf(this.f380262g), java.lang.Integer.valueOf(m9Var.f380262g)) && n51.f.a(java.lang.Integer.valueOf(this.f380263h), java.lang.Integer.valueOf(m9Var.f380263h)) && n51.f.a(this.f380264i, m9Var.f380264i) && n51.f.a(java.lang.Integer.valueOf(this.f380265m), java.lang.Integer.valueOf(m9Var.f380265m)) && n51.f.a(java.lang.Integer.valueOf(this.f380266n), java.lang.Integer.valueOf(m9Var.f380266n)) && n51.f.a(java.lang.Integer.valueOf(this.f380267o), java.lang.Integer.valueOf(m9Var.f380267o)) && n51.f.a(java.lang.Integer.valueOf(this.f380268p), java.lang.Integer.valueOf(m9Var.f380268p)) && n51.f.a(this.f380269q, m9Var.f380269q) && n51.f.a(java.lang.Long.valueOf(this.f380270r), java.lang.Long.valueOf(m9Var.f380270r)) && n51.f.a(java.lang.Integer.valueOf(this.f380271s), java.lang.Integer.valueOf(m9Var.f380271s));
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
            java.lang.String str = this.f380259d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380260e;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f380261f);
            fVar.e(6, this.f380262g);
            fVar.e(7, this.f380263h);
            java.lang.String str3 = this.f380264i;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f380265m);
            fVar.e(10, this.f380266n);
            fVar.e(11, this.f380267o);
            fVar.e(12, this.f380268p);
            java.lang.String str4 = this.f380269q;
            if (str4 != null) {
                fVar.j(13, str4);
            }
            fVar.h(14, this.f380270r);
            fVar.e(15, this.f380271s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str5 = this.f380259d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f380260e;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            int h17 = i18 + b36.f.h(5, this.f380261f) + b36.f.e(6, this.f380262g) + b36.f.e(7, this.f380263h);
            java.lang.String str7 = this.f380264i;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            int e17 = h17 + b36.f.e(9, this.f380265m) + b36.f.e(10, this.f380266n) + b36.f.e(11, this.f380267o) + b36.f.e(12, this.f380268p);
            java.lang.String str8 = this.f380269q;
            if (str8 != null) {
                e17 += b36.f.j(13, str8);
            }
            return e17 + b36.f.h(14, this.f380270r) + b36.f.e(15, this.f380271s);
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
        r45.m9 m9Var = (r45.m9) objArr[1];
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
                    m9Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                m9Var.f380259d = aVar2.k(intValue);
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                m9Var.f380260e = aVar2.k(intValue);
                return 0;
            case 5:
                m9Var.f380261f = aVar2.i(intValue);
                return 0;
            case 6:
                m9Var.f380262g = aVar2.g(intValue);
                return 0;
            case 7:
                m9Var.f380263h = aVar2.g(intValue);
                return 0;
            case 8:
                m9Var.f380264i = aVar2.k(intValue);
                return 0;
            case 9:
                m9Var.f380265m = aVar2.g(intValue);
                return 0;
            case 10:
                m9Var.f380266n = aVar2.g(intValue);
                return 0;
            case 11:
                m9Var.f380267o = aVar2.g(intValue);
                return 0;
            case 12:
                m9Var.f380268p = aVar2.g(intValue);
                return 0;
            case 13:
                m9Var.f380269q = aVar2.k(intValue);
                return 0;
            case 14:
                m9Var.f380270r = aVar2.i(intValue);
                return 0;
            case 15:
                m9Var.f380271s = aVar2.g(intValue);
                return 0;
        }
    }
}
