package r45;

/* loaded from: classes8.dex */
public class ck6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371623e;

    /* renamed from: f, reason: collision with root package name */
    public int f371624f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371625g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371626h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371627i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f371628m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371629n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371630o;

    /* renamed from: p, reason: collision with root package name */
    public int f371631p;

    /* renamed from: q, reason: collision with root package name */
    public int f371632q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ck6)) {
            return false;
        }
        r45.ck6 ck6Var = (r45.ck6) fVar;
        return n51.f.a(this.f371622d, ck6Var.f371622d) && n51.f.a(this.f371623e, ck6Var.f371623e) && n51.f.a(java.lang.Integer.valueOf(this.f371624f), java.lang.Integer.valueOf(ck6Var.f371624f)) && n51.f.a(this.f371625g, ck6Var.f371625g) && n51.f.a(this.f371626h, ck6Var.f371626h) && n51.f.a(this.f371627i, ck6Var.f371627i) && n51.f.a(this.f371628m, ck6Var.f371628m) && n51.f.a(this.f371629n, ck6Var.f371629n) && n51.f.a(this.f371630o, ck6Var.f371630o) && n51.f.a(java.lang.Integer.valueOf(this.f371631p), java.lang.Integer.valueOf(ck6Var.f371631p)) && n51.f.a(java.lang.Integer.valueOf(this.f371632q), java.lang.Integer.valueOf(ck6Var.f371632q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371628m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371622d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371623e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f371624f);
            java.lang.String str3 = this.f371625g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f371626h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f371627i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str6 = this.f371629n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f371630o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.e(10, this.f371631p);
            fVar.e(11, this.f371632q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f371622d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f371623e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f371624f);
            java.lang.String str10 = this.f371625g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f371626h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f371627i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList);
            java.lang.String str13 = this.f371629n;
            if (str13 != null) {
                g17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f371630o;
            if (str14 != null) {
                g17 += b36.f.j(9, str14);
            }
            return g17 + b36.f.e(10, this.f371631p) + b36.f.e(11, this.f371632q);
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
        r45.ck6 ck6Var = (r45.ck6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ck6Var.f371622d = aVar2.k(intValue);
                return 0;
            case 2:
                ck6Var.f371623e = aVar2.k(intValue);
                return 0;
            case 3:
                ck6Var.f371624f = aVar2.g(intValue);
                return 0;
            case 4:
                ck6Var.f371625g = aVar2.k(intValue);
                return 0;
            case 5:
                ck6Var.f371626h = aVar2.k(intValue);
                return 0;
            case 6:
                ck6Var.f371627i = aVar2.k(intValue);
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
                    ck6Var.f371628m.add(x50Var);
                }
                return 0;
            case 8:
                ck6Var.f371629n = aVar2.k(intValue);
                return 0;
            case 9:
                ck6Var.f371630o = aVar2.k(intValue);
                return 0;
            case 10:
                ck6Var.f371631p = aVar2.g(intValue);
                return 0;
            case 11:
                ck6Var.f371632q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f371622d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "searchId", str, false);
            eVar.d(jSONObject, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.f371623e, false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f371624f), false);
            eVar.d(jSONObject, "url", this.f371625g, false);
            eVar.d(jSONObject, "requestId", this.f371626h, false);
            eVar.d(jSONObject, "keyword", this.f371627i, false);
            eVar.d(jSONObject, "extReqParams", this.f371628m, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f371629n, false);
            eVar.d(jSONObject, "talker", this.f371630o, false);
            eVar.d(jSONObject, "enterType", java.lang.Integer.valueOf(this.f371631p), false);
            eVar.d(jSONObject, "dismissType", java.lang.Integer.valueOf(this.f371632q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
