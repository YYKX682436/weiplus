package r45;

/* loaded from: classes9.dex */
public class uv5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387672d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f387673e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387674f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387675g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387676h;

    /* renamed from: i, reason: collision with root package name */
    public int f387677i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387678m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387679n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387680o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387681p;

    /* renamed from: q, reason: collision with root package name */
    public int f387682q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387683r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f387684s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f387685t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uv5)) {
            return false;
        }
        r45.uv5 uv5Var = (r45.uv5) fVar;
        return n51.f.a(this.BaseRequest, uv5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f387672d), java.lang.Integer.valueOf(uv5Var.f387672d)) && n51.f.a(this.f387673e, uv5Var.f387673e) && n51.f.a(this.f387674f, uv5Var.f387674f) && n51.f.a(this.f387675g, uv5Var.f387675g) && n51.f.a(this.f387676h, uv5Var.f387676h) && n51.f.a(java.lang.Integer.valueOf(this.f387677i), java.lang.Integer.valueOf(uv5Var.f387677i)) && n51.f.a(this.f387678m, uv5Var.f387678m) && n51.f.a(this.f387679n, uv5Var.f387679n) && n51.f.a(this.f387680o, uv5Var.f387680o) && n51.f.a(this.f387681p, uv5Var.f387681p) && n51.f.a(java.lang.Integer.valueOf(this.f387682q), java.lang.Integer.valueOf(uv5Var.f387682q)) && n51.f.a(this.f387683r, uv5Var.f387683r) && n51.f.a(java.lang.Boolean.valueOf(this.f387684s), java.lang.Boolean.valueOf(uv5Var.f387684s)) && n51.f.a(java.lang.Boolean.valueOf(this.f387685t), java.lang.Boolean.valueOf(uv5Var.f387685t));
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
            fVar.e(3, this.f387672d);
            fVar.g(4, 1, this.f387673e);
            java.lang.String str = this.f387674f;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f387675g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f387676h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f387677i);
            java.lang.String str4 = this.f387678m;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f387679n;
            if (gVar != null) {
                fVar.b(15, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f387680o;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            java.lang.String str5 = this.f387681p;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            fVar.e(18, this.f387682q);
            com.tencent.mm.protobuf.g gVar3 = this.f387683r;
            if (gVar3 != null) {
                fVar.b(19, gVar3);
            }
            fVar.a(20, this.f387684s);
            fVar.a(21, this.f387685t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(3, this.f387672d) + b36.f.g(4, 1, this.f387673e);
            java.lang.String str6 = this.f387674f;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f387675g;
            if (str7 != null) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f387676h;
            if (str8 != null) {
                i18 += b36.f.j(7, str8);
            }
            int e17 = i18 + b36.f.e(8, this.f387677i);
            java.lang.String str9 = this.f387678m;
            if (str9 != null) {
                e17 += b36.f.j(14, str9);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f387679n;
            if (gVar4 != null) {
                e17 += b36.f.b(15, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f387680o;
            if (gVar5 != null) {
                e17 += b36.f.b(16, gVar5);
            }
            java.lang.String str10 = this.f387681p;
            if (str10 != null) {
                e17 += b36.f.j(17, str10);
            }
            int e18 = e17 + b36.f.e(18, this.f387682q);
            com.tencent.mm.protobuf.g gVar6 = this.f387683r;
            if (gVar6 != null) {
                e18 += b36.f.b(19, gVar6);
            }
            return e18 + b36.f.a(20, this.f387684s) + b36.f.a(21, this.f387685t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f387673e.clear();
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
        r45.uv5 uv5Var = (r45.uv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                uv5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        switch (intValue) {
            case 3:
                uv5Var.f387672d = aVar2.g(intValue);
                return 0;
            case 4:
                uv5Var.f387673e.add(aVar2.k(intValue));
                return 0;
            case 5:
                uv5Var.f387674f = aVar2.k(intValue);
                return 0;
            case 6:
                uv5Var.f387675g = aVar2.k(intValue);
                return 0;
            case 7:
                uv5Var.f387676h = aVar2.k(intValue);
                return 0;
            case 8:
                uv5Var.f387677i = aVar2.g(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 14:
                        uv5Var.f387678m = aVar2.k(intValue);
                        return 0;
                    case 15:
                        uv5Var.f387679n = aVar2.d(intValue);
                        return 0;
                    case 16:
                        uv5Var.f387680o = aVar2.d(intValue);
                        return 0;
                    case 17:
                        uv5Var.f387681p = aVar2.k(intValue);
                        return 0;
                    case 18:
                        uv5Var.f387682q = aVar2.g(intValue);
                        return 0;
                    case 19:
                        uv5Var.f387683r = aVar2.d(intValue);
                        return 0;
                    case 20:
                        uv5Var.f387684s = aVar2.c(intValue);
                        return 0;
                    case 21:
                        uv5Var.f387685t = aVar2.c(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
