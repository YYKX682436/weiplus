package pj4;

/* loaded from: classes11.dex */
public class p0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355236d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355237e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355238f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355239g;

    /* renamed from: h, reason: collision with root package name */
    public int f355240h;

    /* renamed from: i, reason: collision with root package name */
    public int f355241i;

    /* renamed from: m, reason: collision with root package name */
    public int f355242m;

    /* renamed from: n, reason: collision with root package name */
    public int f355243n;

    /* renamed from: o, reason: collision with root package name */
    public int f355244o;

    /* renamed from: p, reason: collision with root package name */
    public int f355245p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f355246q;

    /* renamed from: r, reason: collision with root package name */
    public long f355247r;

    /* renamed from: s, reason: collision with root package name */
    public long f355248s;

    /* renamed from: t, reason: collision with root package name */
    public long f355249t;

    /* renamed from: u, reason: collision with root package name */
    public int f355250u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.p0)) {
            return false;
        }
        pj4.p0 p0Var = (pj4.p0) fVar;
        return n51.f.a(this.f355236d, p0Var.f355236d) && n51.f.a(this.f355237e, p0Var.f355237e) && n51.f.a(this.f355238f, p0Var.f355238f) && n51.f.a(this.f355239g, p0Var.f355239g) && n51.f.a(java.lang.Integer.valueOf(this.f355240h), java.lang.Integer.valueOf(p0Var.f355240h)) && n51.f.a(java.lang.Integer.valueOf(this.f355241i), java.lang.Integer.valueOf(p0Var.f355241i)) && n51.f.a(java.lang.Integer.valueOf(this.f355242m), java.lang.Integer.valueOf(p0Var.f355242m)) && n51.f.a(java.lang.Integer.valueOf(this.f355243n), java.lang.Integer.valueOf(p0Var.f355243n)) && n51.f.a(java.lang.Integer.valueOf(this.f355244o), java.lang.Integer.valueOf(p0Var.f355244o)) && n51.f.a(java.lang.Integer.valueOf(this.f355245p), java.lang.Integer.valueOf(p0Var.f355245p)) && n51.f.a(this.f355246q, p0Var.f355246q) && n51.f.a(java.lang.Long.valueOf(this.f355247r), java.lang.Long.valueOf(p0Var.f355247r)) && n51.f.a(java.lang.Long.valueOf(this.f355248s), java.lang.Long.valueOf(p0Var.f355248s)) && n51.f.a(java.lang.Long.valueOf(this.f355249t), java.lang.Long.valueOf(p0Var.f355249t)) && n51.f.a(java.lang.Integer.valueOf(this.f355250u), java.lang.Integer.valueOf(p0Var.f355250u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355236d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f355237e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f355238f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f355239g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f355240h);
            fVar.e(6, this.f355241i);
            fVar.e(7, this.f355242m);
            fVar.e(8, this.f355243n);
            fVar.e(9, this.f355244o);
            fVar.e(10, this.f355245p);
            java.lang.String str5 = this.f355246q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            fVar.h(12, this.f355247r);
            fVar.h(13, this.f355248s);
            fVar.h(14, this.f355249t);
            fVar.e(15, this.f355250u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f355236d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f355237e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f355238f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f355239g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f355240h) + b36.f.e(6, this.f355241i) + b36.f.e(7, this.f355242m) + b36.f.e(8, this.f355243n) + b36.f.e(9, this.f355244o) + b36.f.e(10, this.f355245p);
            java.lang.String str10 = this.f355246q;
            if (str10 != null) {
                e17 += b36.f.j(11, str10);
            }
            return e17 + b36.f.h(12, this.f355247r) + b36.f.h(13, this.f355248s) + b36.f.h(14, this.f355249t) + b36.f.e(15, this.f355250u);
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
        pj4.p0 p0Var = (pj4.p0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p0Var.f355236d = aVar2.k(intValue);
                return 0;
            case 2:
                p0Var.f355237e = aVar2.k(intValue);
                return 0;
            case 3:
                p0Var.f355238f = aVar2.k(intValue);
                return 0;
            case 4:
                p0Var.f355239g = aVar2.k(intValue);
                return 0;
            case 5:
                p0Var.f355240h = aVar2.g(intValue);
                return 0;
            case 6:
                p0Var.f355241i = aVar2.g(intValue);
                return 0;
            case 7:
                p0Var.f355242m = aVar2.g(intValue);
                return 0;
            case 8:
                p0Var.f355243n = aVar2.g(intValue);
                return 0;
            case 9:
                p0Var.f355244o = aVar2.g(intValue);
                return 0;
            case 10:
                p0Var.f355245p = aVar2.g(intValue);
                return 0;
            case 11:
                p0Var.f355246q = aVar2.k(intValue);
                return 0;
            case 12:
                p0Var.f355247r = aVar2.i(intValue);
                return 0;
            case 13:
                p0Var.f355248s = aVar2.i(intValue);
                return 0;
            case 14:
                p0Var.f355249t = aVar2.i(intValue);
                return 0;
            case 15:
                p0Var.f355250u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355236d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str, false);
            eVar.d(jSONObject, dm.i4.COL_USERNAME, this.f355237e, false);
            eVar.d(jSONObject, "sourceExtraInfo", this.f355238f, false);
            eVar.d(jSONObject, "currLikeIcon", this.f355239g, false);
            eVar.d(jSONObject, "currSameFriCnt", java.lang.Integer.valueOf(this.f355240h), false);
            eVar.d(jSONObject, "currChattingCnt", java.lang.Integer.valueOf(this.f355241i), false);
            eVar.d(jSONObject, "currScene", java.lang.Integer.valueOf(this.f355242m), false);
            eVar.d(jSONObject, "newMsgNum", java.lang.Integer.valueOf(this.f355243n), false);
            eVar.d(jSONObject, "listPos", java.lang.Integer.valueOf(this.f355244o), false);
            eVar.d(jSONObject, "isInPullDownMode", java.lang.Integer.valueOf(this.f355245p), false);
            eVar.d(jSONObject, "sourceFeedId", this.f355246q, false);
            eVar.d(jSONObject, "broadcastDuration", java.lang.Long.valueOf(this.f355247r), false);
            eVar.d(jSONObject, "broadcastCycle", java.lang.Long.valueOf(this.f355248s), false);
            eVar.d(jSONObject, "sameFriendPageSource", java.lang.Long.valueOf(this.f355249t), false);
            eVar.d(jSONObject, "hasExpandFoldButton", java.lang.Integer.valueOf(this.f355250u), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
