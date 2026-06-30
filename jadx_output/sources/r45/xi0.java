package r45;

/* loaded from: classes8.dex */
public class xi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390115d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390116e;

    /* renamed from: f, reason: collision with root package name */
    public int f390117f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390118g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390119h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390120i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f390121m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390122n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390123o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f390124p;

    /* renamed from: q, reason: collision with root package name */
    public int f390125q;

    /* renamed from: r, reason: collision with root package name */
    public int f390126r;

    /* renamed from: s, reason: collision with root package name */
    public int f390127s;

    /* renamed from: t, reason: collision with root package name */
    public int f390128t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xi0)) {
            return false;
        }
        r45.xi0 xi0Var = (r45.xi0) fVar;
        return n51.f.a(this.f390115d, xi0Var.f390115d) && n51.f.a(this.f390116e, xi0Var.f390116e) && n51.f.a(java.lang.Integer.valueOf(this.f390117f), java.lang.Integer.valueOf(xi0Var.f390117f)) && n51.f.a(this.f390118g, xi0Var.f390118g) && n51.f.a(this.f390119h, xi0Var.f390119h) && n51.f.a(this.f390120i, xi0Var.f390120i) && n51.f.a(this.f390121m, xi0Var.f390121m) && n51.f.a(this.f390122n, xi0Var.f390122n) && n51.f.a(this.f390123o, xi0Var.f390123o) && n51.f.a(this.f390124p, xi0Var.f390124p) && n51.f.a(java.lang.Integer.valueOf(this.f390125q), java.lang.Integer.valueOf(xi0Var.f390125q)) && n51.f.a(java.lang.Integer.valueOf(this.f390126r), java.lang.Integer.valueOf(xi0Var.f390126r)) && n51.f.a(java.lang.Integer.valueOf(this.f390127s), java.lang.Integer.valueOf(xi0Var.f390127s)) && n51.f.a(java.lang.Integer.valueOf(this.f390128t), java.lang.Integer.valueOf(xi0Var.f390128t));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390121m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390115d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390116e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f390117f);
            java.lang.String str3 = this.f390118g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f390119h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f390120i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str6 = this.f390122n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f390123o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f390124p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f390125q);
            fVar.e(12, this.f390126r);
            fVar.e(13, this.f390127s);
            fVar.e(14, this.f390128t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f390115d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f390116e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            int e17 = j17 + b36.f.e(3, this.f390117f);
            java.lang.String str11 = this.f390118g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f390119h;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f390120i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList);
            java.lang.String str14 = this.f390122n;
            if (str14 != null) {
                g17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f390123o;
            if (str15 != null) {
                g17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f390124p;
            if (str16 != null) {
                g17 += b36.f.j(10, str16);
            }
            return g17 + b36.f.e(11, this.f390125q) + b36.f.e(12, this.f390126r) + b36.f.e(13, this.f390127s) + b36.f.e(14, this.f390128t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.xi0 xi0Var = (r45.xi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xi0Var.f390115d = aVar2.k(intValue);
                return 0;
            case 2:
                xi0Var.f390116e = aVar2.k(intValue);
                return 0;
            case 3:
                xi0Var.f390117f = aVar2.g(intValue);
                return 0;
            case 4:
                xi0Var.f390118g = aVar2.k(intValue);
                return 0;
            case 5:
                xi0Var.f390119h = aVar2.k(intValue);
                return 0;
            case 6:
                xi0Var.f390120i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr2 != null && bArr2.length > 0) {
                        x50Var.parseFrom(bArr2);
                    }
                    xi0Var.f390121m.add(x50Var);
                }
                return 0;
            case 8:
                xi0Var.f390122n = aVar2.k(intValue);
                return 0;
            case 9:
                xi0Var.f390123o = aVar2.k(intValue);
                return 0;
            case 10:
                xi0Var.f390124p = aVar2.k(intValue);
                return 0;
            case 11:
                xi0Var.f390125q = aVar2.g(intValue);
                return 0;
            case 12:
                xi0Var.f390126r = aVar2.g(intValue);
                return 0;
            case 13:
                xi0Var.f390127s = aVar2.g(intValue);
                return 0;
            case 14:
                xi0Var.f390128t = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f390115d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "searchId", str, false);
            eVar.d(jSONObject, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.f390116e, false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f390117f), false);
            eVar.d(jSONObject, "url", this.f390118g, false);
            eVar.d(jSONObject, "requestId", this.f390119h, false);
            eVar.d(jSONObject, "keyword", this.f390120i, false);
            eVar.d(jSONObject, "extReqParams", this.f390121m, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f390122n, false);
            eVar.d(jSONObject, "talker", this.f390123o, false);
            eVar.d(jSONObject, "toSendText", this.f390124p, false);
            eVar.d(jSONObject, "enterScene", java.lang.Integer.valueOf(this.f390125q), false);
            eVar.d(jSONObject, "needShowKeyboard", java.lang.Integer.valueOf(this.f390126r), false);
            eVar.d(jSONObject, "forceDarkMode", java.lang.Integer.valueOf(this.f390127s), false);
            eVar.d(jSONObject, "hideJumpMoreEntrance", java.lang.Integer.valueOf(this.f390128t), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
