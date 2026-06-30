package pj4;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.protobuf.f {
    public long A;
    public long B;
    public pj4.a0 C;
    public java.lang.String D;
    public java.lang.String E;
    public long F;
    public java.lang.String G;
    public boolean H;
    public boolean I;
    public int K;
    public int L;

    /* renamed from: d, reason: collision with root package name */
    public pj4.b0 f354937d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f354938e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f354939f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f354941h;

    /* renamed from: i, reason: collision with root package name */
    public long f354942i;

    /* renamed from: m, reason: collision with root package name */
    public long f354943m;

    /* renamed from: n, reason: collision with root package name */
    public int f354944n;

    /* renamed from: o, reason: collision with root package name */
    public int f354945o;

    /* renamed from: p, reason: collision with root package name */
    public int f354946p;

    /* renamed from: q, reason: collision with root package name */
    public int f354947q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f354948r;

    /* renamed from: s, reason: collision with root package name */
    public int f354949s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f354950t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f354951u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f354952v;

    /* renamed from: w, reason: collision with root package name */
    public int f354953w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f354954x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f354955y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f354956z;

    /* renamed from: g, reason: collision with root package name */
    public boolean f354940g = true;

    /* renamed from: J, reason: collision with root package name */
    public java.util.LinkedList f354936J = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.a)) {
            return false;
        }
        pj4.a aVar = (pj4.a) fVar;
        return n51.f.a(this.f354937d, aVar.f354937d) && n51.f.a(this.f354938e, aVar.f354938e) && n51.f.a(this.f354939f, aVar.f354939f) && n51.f.a(java.lang.Boolean.valueOf(this.f354940g), java.lang.Boolean.valueOf(aVar.f354940g)) && n51.f.a(this.f354941h, aVar.f354941h) && n51.f.a(java.lang.Long.valueOf(this.f354942i), java.lang.Long.valueOf(aVar.f354942i)) && n51.f.a(java.lang.Long.valueOf(this.f354943m), java.lang.Long.valueOf(aVar.f354943m)) && n51.f.a(java.lang.Integer.valueOf(this.f354944n), java.lang.Integer.valueOf(aVar.f354944n)) && n51.f.a(java.lang.Integer.valueOf(this.f354945o), java.lang.Integer.valueOf(aVar.f354945o)) && n51.f.a(java.lang.Integer.valueOf(this.f354946p), java.lang.Integer.valueOf(aVar.f354946p)) && n51.f.a(java.lang.Integer.valueOf(this.f354947q), java.lang.Integer.valueOf(aVar.f354947q)) && n51.f.a(this.f354948r, aVar.f354948r) && n51.f.a(java.lang.Integer.valueOf(this.f354949s), java.lang.Integer.valueOf(aVar.f354949s)) && n51.f.a(this.f354950t, aVar.f354950t) && n51.f.a(java.lang.Boolean.valueOf(this.f354951u), java.lang.Boolean.valueOf(aVar.f354951u)) && n51.f.a(java.lang.Boolean.valueOf(this.f354952v), java.lang.Boolean.valueOf(aVar.f354952v)) && n51.f.a(java.lang.Integer.valueOf(this.f354953w), java.lang.Integer.valueOf(aVar.f354953w)) && n51.f.a(this.f354954x, aVar.f354954x) && n51.f.a(this.f354955y, aVar.f354955y) && n51.f.a(java.lang.Boolean.valueOf(this.f354956z), java.lang.Boolean.valueOf(aVar.f354956z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(aVar.A)) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(aVar.B)) && n51.f.a(this.C, aVar.C) && n51.f.a(this.D, aVar.D) && n51.f.a(this.E, aVar.E) && n51.f.a(java.lang.Long.valueOf(this.F), java.lang.Long.valueOf(aVar.F)) && n51.f.a(this.G, aVar.G) && n51.f.a(java.lang.Boolean.valueOf(this.H), java.lang.Boolean.valueOf(aVar.H)) && n51.f.a(java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(aVar.I)) && n51.f.a(this.f354936J, aVar.f354936J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(aVar.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(aVar.L));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            pj4.b0 b0Var = this.f354937d;
            if (b0Var != null) {
                fVar.i(1, b0Var.computeSize());
                this.f354937d.writeFields(fVar);
            }
            java.lang.String str = this.f354938e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f354939f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f354940g);
            java.lang.String str3 = this.f354941h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f354942i);
            fVar.h(7, this.f354943m);
            fVar.e(8, this.f354944n);
            fVar.e(9, this.f354945o);
            fVar.e(10, this.f354946p);
            fVar.e(11, this.f354947q);
            java.lang.String str4 = this.f354948r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f354949s);
            java.lang.String str5 = this.f354950t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            fVar.a(15, this.f354951u);
            fVar.a(16, this.f354952v);
            fVar.e(17, this.f354953w);
            java.lang.String str6 = this.f354954x;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            java.lang.String str7 = this.f354955y;
            if (str7 != null) {
                fVar.j(19, str7);
            }
            fVar.a(20, this.f354956z);
            fVar.h(21, this.A);
            fVar.h(22, this.B);
            pj4.a0 a0Var = this.C;
            if (a0Var != null) {
                fVar.i(23, a0Var.computeSize());
                this.C.writeFields(fVar);
            }
            java.lang.String str8 = this.D;
            if (str8 != null) {
                fVar.j(24, str8);
            }
            java.lang.String str9 = this.E;
            if (str9 != null) {
                fVar.j(25, str9);
            }
            fVar.h(26, this.F);
            java.lang.String str10 = this.G;
            if (str10 != null) {
                fVar.j(27, str10);
            }
            fVar.a(28, this.H);
            fVar.a(29, this.I);
            fVar.g(30, 1, this.f354936J);
            fVar.e(31, this.K);
            fVar.e(32, this.L);
            return 0;
        }
        if (i17 == 1) {
            pj4.b0 b0Var2 = this.f354937d;
            int i18 = b0Var2 != null ? b36.f.i(1, b0Var2.computeSize()) + 0 : 0;
            java.lang.String str11 = this.f354938e;
            if (str11 != null) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f354939f;
            if (str12 != null) {
                i18 += b36.f.j(3, str12);
            }
            int a17 = i18 + b36.f.a(4, this.f354940g);
            java.lang.String str13 = this.f354941h;
            if (str13 != null) {
                a17 += b36.f.j(5, str13);
            }
            int h17 = a17 + b36.f.h(6, this.f354942i) + b36.f.h(7, this.f354943m) + b36.f.e(8, this.f354944n) + b36.f.e(9, this.f354945o) + b36.f.e(10, this.f354946p) + b36.f.e(11, this.f354947q);
            java.lang.String str14 = this.f354948r;
            if (str14 != null) {
                h17 += b36.f.j(12, str14);
            }
            int e17 = h17 + b36.f.e(13, this.f354949s);
            java.lang.String str15 = this.f354950t;
            if (str15 != null) {
                e17 += b36.f.j(14, str15);
            }
            int a18 = e17 + b36.f.a(15, this.f354951u) + b36.f.a(16, this.f354952v) + b36.f.e(17, this.f354953w);
            java.lang.String str16 = this.f354954x;
            if (str16 != null) {
                a18 += b36.f.j(18, str16);
            }
            java.lang.String str17 = this.f354955y;
            if (str17 != null) {
                a18 += b36.f.j(19, str17);
            }
            int a19 = a18 + b36.f.a(20, this.f354956z) + b36.f.h(21, this.A) + b36.f.h(22, this.B);
            pj4.a0 a0Var2 = this.C;
            if (a0Var2 != null) {
                a19 += b36.f.i(23, a0Var2.computeSize());
            }
            java.lang.String str18 = this.D;
            if (str18 != null) {
                a19 += b36.f.j(24, str18);
            }
            java.lang.String str19 = this.E;
            if (str19 != null) {
                a19 += b36.f.j(25, str19);
            }
            int h18 = a19 + b36.f.h(26, this.F);
            java.lang.String str20 = this.G;
            if (str20 != null) {
                h18 += b36.f.j(27, str20);
            }
            return h18 + b36.f.a(28, this.H) + b36.f.a(29, this.I) + b36.f.g(30, 1, this.f354936J) + b36.f.e(31, this.K) + b36.f.e(32, this.L);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f354936J.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        pj4.a aVar3 = (pj4.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    pj4.b0 b0Var3 = new pj4.b0();
                    if (bArr2 != null && bArr2.length > 0) {
                        b0Var3.parseFrom(bArr2);
                    }
                    aVar3.f354937d = b0Var3;
                }
                return 0;
            case 2:
                aVar3.f354938e = aVar2.k(intValue);
                return 0;
            case 3:
                aVar3.f354939f = aVar2.k(intValue);
                return 0;
            case 4:
                aVar3.f354940g = aVar2.c(intValue);
                return 0;
            case 5:
                aVar3.f354941h = aVar2.k(intValue);
                return 0;
            case 6:
                aVar3.f354942i = aVar2.i(intValue);
                return 0;
            case 7:
                aVar3.f354943m = aVar2.i(intValue);
                return 0;
            case 8:
                aVar3.f354944n = aVar2.g(intValue);
                return 0;
            case 9:
                aVar3.f354945o = aVar2.g(intValue);
                return 0;
            case 10:
                aVar3.f354946p = aVar2.g(intValue);
                return 0;
            case 11:
                aVar3.f354947q = aVar2.g(intValue);
                return 0;
            case 12:
                aVar3.f354948r = aVar2.k(intValue);
                return 0;
            case 13:
                aVar3.f354949s = aVar2.g(intValue);
                return 0;
            case 14:
                aVar3.f354950t = aVar2.k(intValue);
                return 0;
            case 15:
                aVar3.f354951u = aVar2.c(intValue);
                return 0;
            case 16:
                aVar3.f354952v = aVar2.c(intValue);
                return 0;
            case 17:
                aVar3.f354953w = aVar2.g(intValue);
                return 0;
            case 18:
                aVar3.f354954x = aVar2.k(intValue);
                return 0;
            case 19:
                aVar3.f354955y = aVar2.k(intValue);
                return 0;
            case 20:
                aVar3.f354956z = aVar2.c(intValue);
                return 0;
            case 21:
                aVar3.A = aVar2.i(intValue);
                return 0;
            case 22:
                aVar3.B = aVar2.i(intValue);
                return 0;
            case 23:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    pj4.a0 a0Var3 = new pj4.a0();
                    if (bArr3 != null && bArr3.length > 0) {
                        a0Var3.parseFrom(bArr3);
                    }
                    aVar3.C = a0Var3;
                }
                return 0;
            case 24:
                aVar3.D = aVar2.k(intValue);
                return 0;
            case 25:
                aVar3.E = aVar2.k(intValue);
                return 0;
            case 26:
                aVar3.F = aVar2.i(intValue);
                return 0;
            case 27:
                aVar3.G = aVar2.k(intValue);
                return 0;
            case 28:
                aVar3.H = aVar2.c(intValue);
                return 0;
            case 29:
                aVar3.I = aVar2.c(intValue);
                return 0;
            case 30:
                aVar3.f354936J.add(aVar2.k(intValue));
                return 0;
            case 31:
                aVar3.K = aVar2.g(intValue);
                return 0;
            case 32:
                aVar3.L = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            pj4.b0 b0Var = this.f354937d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "textExtInfo", b0Var, false);
            eVar.d(jSONObject, "mediaPath", this.f354938e, false);
            eVar.d(jSONObject, "fileUrl", this.f354939f, false);
            eVar.d(jSONObject, "canCapture", java.lang.Boolean.valueOf(this.f354940g), false);
            eVar.d(jSONObject, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.f354941h, false);
            eVar.d(jSONObject, "enterSource", java.lang.Long.valueOf(this.f354942i), false);
            eVar.d(jSONObject, "enterTime", java.lang.Long.valueOf(this.f354943m), false);
            eVar.d(jSONObject, "UserGuideShown", java.lang.Integer.valueOf(this.f354944n), false);
            eVar.d(jSONObject, "UserGuideKnownClicked", java.lang.Integer.valueOf(this.f354945o), false);
            eVar.d(jSONObject, "ClkCustomIconCount", java.lang.Integer.valueOf(this.f354946p), false);
            eVar.d(jSONObject, "CustomTitleTooLongCount", java.lang.Integer.valueOf(this.f354947q), false);
            eVar.d(jSONObject, "FinalCustomTitle", this.f354948r, false);
            eVar.d(jSONObject, "setStatusMode", java.lang.Integer.valueOf(this.f354949s), false);
            eVar.d(jSONObject, "statusModeUserName", this.f354950t, false);
            eVar.d(jSONObject, "isQuickPost", java.lang.Boolean.valueOf(this.f354951u), false);
            eVar.d(jSONObject, "isHideToast", java.lang.Boolean.valueOf(this.f354952v), false);
            eVar.d(jSONObject, "qrCodeScene", java.lang.Integer.valueOf(this.f354953w), false);
            eVar.d(jSONObject, "weRunInfo", this.f354954x, false);
            eVar.d(jSONObject, "paymentInfo", this.f354955y, false);
            eVar.d(jSONObject, "isHalfScreen", java.lang.Boolean.valueOf(this.f354956z), false);
            eVar.d(jSONObject, "ClkUserDefineIconCount", java.lang.Long.valueOf(this.A), false);
            eVar.d(jSONObject, "ClkAddIconToCustomTitleCount", java.lang.Long.valueOf(this.B), false);
            eVar.d(jSONObject, "emojiInfo", this.C, false);
            eVar.d(jSONObject, "enterSourceInfo", this.D, false);
            eVar.d(jSONObject, "statusModeStatusId", this.E, false);
            eVar.d(jSONObject, "EnterCoExistStatusCount", java.lang.Long.valueOf(this.F), false);
            eVar.d(jSONObject, "cliPostID", this.G, false);
            eVar.d(jSONObject, "isIconSelectFromPickerRecentUse", java.lang.Boolean.valueOf(this.H), false);
            eVar.d(jSONObject, "isIconSelectFromPickerCustomRecommend", java.lang.Boolean.valueOf(this.I), false);
            eVar.d(jSONObject, "customIconRecommendFromPicker", this.f354936J, false);
            eVar.d(jSONObject, "pickerCustomSwitchIconBreathAnimPlayCount", java.lang.Integer.valueOf(this.K), false);
            eVar.d(jSONObject, "publishActonSheetScene", java.lang.Integer.valueOf(this.L), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
