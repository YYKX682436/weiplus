package r45;

/* loaded from: classes10.dex */
public class jx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f378184d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378185e;

    /* renamed from: f, reason: collision with root package name */
    public long f378186f;

    /* renamed from: g, reason: collision with root package name */
    public long f378187g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378188h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378189i;

    /* renamed from: m, reason: collision with root package name */
    public int f378190m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f378191n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378192o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f378193p;

    /* renamed from: q, reason: collision with root package name */
    public long f378194q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f378195r;

    /* renamed from: s, reason: collision with root package name */
    public int f378196s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jx1)) {
            return false;
        }
        r45.jx1 jx1Var = (r45.jx1) fVar;
        return n51.f.a(this.BaseRequest, jx1Var.BaseRequest) && n51.f.a(this.f378184d, jx1Var.f378184d) && n51.f.a(this.f378185e, jx1Var.f378185e) && n51.f.a(java.lang.Long.valueOf(this.f378186f), java.lang.Long.valueOf(jx1Var.f378186f)) && n51.f.a(java.lang.Long.valueOf(this.f378187g), java.lang.Long.valueOf(jx1Var.f378187g)) && n51.f.a(this.f378188h, jx1Var.f378188h) && n51.f.a(this.f378189i, jx1Var.f378189i) && n51.f.a(java.lang.Integer.valueOf(this.f378190m), java.lang.Integer.valueOf(jx1Var.f378190m)) && n51.f.a(java.lang.Boolean.valueOf(this.f378191n), java.lang.Boolean.valueOf(jx1Var.f378191n)) && n51.f.a(this.f378192o, jx1Var.f378192o) && n51.f.a(java.lang.Boolean.valueOf(this.f378193p), java.lang.Boolean.valueOf(jx1Var.f378193p)) && n51.f.a(java.lang.Long.valueOf(this.f378194q), java.lang.Long.valueOf(jx1Var.f378194q)) && n51.f.a(this.f378195r, jx1Var.f378195r) && n51.f.a(java.lang.Integer.valueOf(this.f378196s), java.lang.Integer.valueOf(jx1Var.f378196s));
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
            r45.kv0 kv0Var = this.f378184d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f378184d.writeFields(fVar);
            }
            java.lang.String str = this.f378185e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f378186f);
            fVar.h(5, this.f378187g);
            java.lang.String str2 = this.f378188h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f378189i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f378190m);
            fVar.a(9, this.f378191n);
            com.tencent.mm.protobuf.g gVar2 = this.f378192o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            fVar.a(11, this.f378193p);
            fVar.h(12, this.f378194q);
            java.lang.String str3 = this.f378195r;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            fVar.e(14, this.f378196s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f378184d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str4 = this.f378185e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int h17 = i18 + b36.f.h(4, this.f378186f) + b36.f.h(5, this.f378187g);
            java.lang.String str5 = this.f378188h;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f378189i;
            if (gVar3 != null) {
                h17 += b36.f.b(7, gVar3);
            }
            int e17 = h17 + b36.f.e(8, this.f378190m) + b36.f.a(9, this.f378191n);
            com.tencent.mm.protobuf.g gVar4 = this.f378192o;
            if (gVar4 != null) {
                e17 += b36.f.b(10, gVar4);
            }
            int a17 = e17 + b36.f.a(11, this.f378193p) + b36.f.h(12, this.f378194q);
            java.lang.String str6 = this.f378195r;
            if (str6 != null) {
                a17 += b36.f.j(13, str6);
            }
            return a17 + b36.f.e(14, this.f378196s);
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
        r45.jx1 jx1Var = (r45.jx1) objArr[1];
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
                    jx1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    jx1Var.f378184d = kv0Var3;
                }
                return 0;
            case 3:
                jx1Var.f378185e = aVar2.k(intValue);
                return 0;
            case 4:
                jx1Var.f378186f = aVar2.i(intValue);
                return 0;
            case 5:
                jx1Var.f378187g = aVar2.i(intValue);
                return 0;
            case 6:
                jx1Var.f378188h = aVar2.k(intValue);
                return 0;
            case 7:
                jx1Var.f378189i = aVar2.d(intValue);
                return 0;
            case 8:
                jx1Var.f378190m = aVar2.g(intValue);
                return 0;
            case 9:
                jx1Var.f378191n = aVar2.c(intValue);
                return 0;
            case 10:
                jx1Var.f378192o = aVar2.d(intValue);
                return 0;
            case 11:
                jx1Var.f378193p = aVar2.c(intValue);
                return 0;
            case 12:
                jx1Var.f378194q = aVar2.i(intValue);
                return 0;
            case 13:
                jx1Var.f378195r = aVar2.k(intValue);
                return 0;
            case 14:
                jx1Var.f378196s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
