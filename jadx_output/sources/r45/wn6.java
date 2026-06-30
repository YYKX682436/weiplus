package r45;

/* loaded from: classes15.dex */
public class wn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389313d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389314e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389315f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389316g;

    /* renamed from: h, reason: collision with root package name */
    public r45.x56 f389317h;

    /* renamed from: i, reason: collision with root package name */
    public long f389318i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389319m;

    /* renamed from: n, reason: collision with root package name */
    public int f389320n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f389321o;

    /* renamed from: p, reason: collision with root package name */
    public int f389322p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389323q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f389324r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f389325s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wn6)) {
            return false;
        }
        r45.wn6 wn6Var = (r45.wn6) fVar;
        return n51.f.a(this.f389313d, wn6Var.f389313d) && n51.f.a(this.f389314e, wn6Var.f389314e) && n51.f.a(this.f389315f, wn6Var.f389315f) && n51.f.a(this.f389316g, wn6Var.f389316g) && n51.f.a(this.f389317h, wn6Var.f389317h) && n51.f.a(java.lang.Long.valueOf(this.f389318i), java.lang.Long.valueOf(wn6Var.f389318i)) && n51.f.a(this.f389319m, wn6Var.f389319m) && n51.f.a(java.lang.Integer.valueOf(this.f389320n), java.lang.Integer.valueOf(wn6Var.f389320n)) && n51.f.a(java.lang.Boolean.valueOf(this.f389321o), java.lang.Boolean.valueOf(wn6Var.f389321o)) && n51.f.a(java.lang.Integer.valueOf(this.f389322p), java.lang.Integer.valueOf(wn6Var.f389322p)) && n51.f.a(this.f389323q, wn6Var.f389323q) && n51.f.a(this.f389324r, wn6Var.f389324r) && n51.f.a(this.f389325s, wn6Var.f389325s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389324r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389313d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389314e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f389315f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f389316g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.x56 x56Var = this.f389317h;
            if (x56Var != null) {
                fVar.i(5, x56Var.computeSize());
                this.f389317h.writeFields(fVar);
            }
            fVar.h(6, this.f389318i);
            java.lang.String str5 = this.f389319m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f389320n);
            fVar.a(9, this.f389321o);
            fVar.e(10, this.f389322p);
            java.lang.String str6 = this.f389323q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.g(12, 8, linkedList);
            fVar.g(13, 8, this.f389325s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f389313d;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.f389314e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f389315f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f389316g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            r45.x56 x56Var2 = this.f389317h;
            if (x56Var2 != null) {
                j17 += b36.f.i(5, x56Var2.computeSize());
            }
            int h17 = j17 + b36.f.h(6, this.f389318i);
            java.lang.String str11 = this.f389319m;
            if (str11 != null) {
                h17 += b36.f.j(7, str11);
            }
            int e17 = h17 + b36.f.e(8, this.f389320n) + b36.f.a(9, this.f389321o) + b36.f.e(10, this.f389322p);
            java.lang.String str12 = this.f389323q;
            if (str12 != null) {
                e17 += b36.f.j(11, str12);
            }
            return e17 + b36.f.g(12, 8, linkedList) + b36.f.g(13, 8, this.f389325s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f389325s.clear();
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
        r45.wn6 wn6Var = (r45.wn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wn6Var.f389313d = aVar2.k(intValue);
                return 0;
            case 2:
                wn6Var.f389314e = aVar2.k(intValue);
                return 0;
            case 3:
                wn6Var.f389315f = aVar2.k(intValue);
                return 0;
            case 4:
                wn6Var.f389316g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.x56 x56Var3 = new r45.x56();
                    if (bArr2 != null && bArr2.length > 0) {
                        x56Var3.parseFrom(bArr2);
                    }
                    wn6Var.f389317h = x56Var3;
                }
                return 0;
            case 6:
                wn6Var.f389318i = aVar2.i(intValue);
                return 0;
            case 7:
                wn6Var.f389319m = aVar2.k(intValue);
                return 0;
            case 8:
                wn6Var.f389320n = aVar2.g(intValue);
                return 0;
            case 9:
                wn6Var.f389321o = aVar2.c(intValue);
                return 0;
            case 10:
                wn6Var.f389322p = aVar2.g(intValue);
                return 0;
            case 11:
                wn6Var.f389323q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.xn6 xn6Var = new r45.xn6();
                    if (bArr3 != null && bArr3.length > 0) {
                        xn6Var.parseFrom(bArr3);
                    }
                    wn6Var.f389324r.add(xn6Var);
                }
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr4 != null && bArr4.length > 0) {
                        x50Var.parseFrom(bArr4);
                    }
                    wn6Var.f389325s.add(x50Var);
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f389313d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "relevantVid", str, false);
            eVar.d(jSONObject, "relevantExpand", this.f389314e, false);
            eVar.d(jSONObject, "relevantPreSearchId", this.f389315f, false);
            eVar.d(jSONObject, "relevantSharedOpenID", this.f389316g, false);
            eVar.d(jSONObject, "clickTag", this.f389317h, false);
            eVar.d(jSONObject, "recCategory", java.lang.Long.valueOf(this.f389318i), false);
            eVar.d(jSONObject, "contextId", this.f389319m, false);
            eVar.d(jSONObject, "offset", java.lang.Integer.valueOf(this.f389320n), false);
            eVar.d(jSONObject, "isSinglePage", java.lang.Boolean.valueOf(this.f389321o), false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f389322p), false);
            eVar.d(jSONObject, "keyword", this.f389323q, false);
            eVar.d(jSONObject, "cacheVideoList", this.f389324r, false);
            eVar.d(jSONObject, "extReqParams", this.f389325s, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
