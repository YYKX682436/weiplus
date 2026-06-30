package r45;

/* loaded from: classes9.dex */
public class wv5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389529d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389530e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389531f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389532g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389533h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389534i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389535m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389536n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389537o;

    /* renamed from: p, reason: collision with root package name */
    public int f389538p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f389539q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389540r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f389541s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wv5)) {
            return false;
        }
        r45.wv5 wv5Var = (r45.wv5) fVar;
        return n51.f.a(this.BaseRequest, wv5Var.BaseRequest) && n51.f.a(this.f389529d, wv5Var.f389529d) && n51.f.a(this.f389530e, wv5Var.f389530e) && n51.f.a(this.f389531f, wv5Var.f389531f) && n51.f.a(this.f389532g, wv5Var.f389532g) && n51.f.a(this.f389533h, wv5Var.f389533h) && n51.f.a(this.f389534i, wv5Var.f389534i) && n51.f.a(this.f389535m, wv5Var.f389535m) && n51.f.a(this.f389536n, wv5Var.f389536n) && n51.f.a(this.f389537o, wv5Var.f389537o) && n51.f.a(java.lang.Integer.valueOf(this.f389538p), java.lang.Integer.valueOf(wv5Var.f389538p)) && n51.f.a(java.lang.Boolean.valueOf(this.f389539q), java.lang.Boolean.valueOf(wv5Var.f389539q)) && n51.f.a(this.f389540r, wv5Var.f389540r) && n51.f.a(java.lang.Boolean.valueOf(this.f389541s), java.lang.Boolean.valueOf(wv5Var.f389541s));
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
            java.lang.String str = this.f389529d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389530e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f389531f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f389532g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f389533h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f389534i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f389535m;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            com.tencent.mm.protobuf.g gVar = this.f389536n;
            if (gVar != null) {
                fVar.b(14, gVar);
            }
            java.lang.String str8 = this.f389537o;
            if (str8 != null) {
                fVar.j(15, str8);
            }
            fVar.e(16, this.f389538p);
            fVar.a(17, this.f389539q);
            com.tencent.mm.protobuf.g gVar2 = this.f389540r;
            if (gVar2 != null) {
                fVar.b(18, gVar2);
            }
            fVar.a(19, this.f389541s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str9 = this.f389529d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f389530e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f389531f;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f389532g;
            if (str12 != null) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f389533h;
            if (str13 != null) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f389534i;
            if (str14 != null) {
                i18 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f389535m;
            if (str15 != null) {
                i18 += b36.f.j(13, str15);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f389536n;
            if (gVar3 != null) {
                i18 += b36.f.b(14, gVar3);
            }
            java.lang.String str16 = this.f389537o;
            if (str16 != null) {
                i18 += b36.f.j(15, str16);
            }
            int e17 = i18 + b36.f.e(16, this.f389538p) + b36.f.a(17, this.f389539q);
            com.tencent.mm.protobuf.g gVar4 = this.f389540r;
            if (gVar4 != null) {
                e17 += b36.f.b(18, gVar4);
            }
            return e17 + b36.f.a(19, this.f389541s);
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
        r45.wv5 wv5Var = (r45.wv5) objArr[1];
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
                    wv5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wv5Var.f389529d = aVar2.k(intValue);
                return 0;
            case 3:
                wv5Var.f389530e = aVar2.k(intValue);
                return 0;
            case 4:
                wv5Var.f389531f = aVar2.k(intValue);
                return 0;
            case 5:
                wv5Var.f389532g = aVar2.k(intValue);
                return 0;
            case 6:
                wv5Var.f389533h = aVar2.k(intValue);
                return 0;
            case 7:
                wv5Var.f389534i = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 13:
                        wv5Var.f389535m = aVar2.k(intValue);
                        return 0;
                    case 14:
                        wv5Var.f389536n = aVar2.d(intValue);
                        return 0;
                    case 15:
                        wv5Var.f389537o = aVar2.k(intValue);
                        return 0;
                    case 16:
                        wv5Var.f389538p = aVar2.g(intValue);
                        return 0;
                    case 17:
                        wv5Var.f389539q = aVar2.c(intValue);
                        return 0;
                    case 18:
                        wv5Var.f389540r = aVar2.d(intValue);
                        return 0;
                    case 19:
                        wv5Var.f389541s = aVar2.c(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
