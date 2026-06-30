package r45;

/* loaded from: classes4.dex */
public class ee extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373339d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373340e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373341f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373342g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373343h;

    /* renamed from: i, reason: collision with root package name */
    public int f373344i;

    /* renamed from: m, reason: collision with root package name */
    public int f373345m;

    /* renamed from: n, reason: collision with root package name */
    public int f373346n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373347o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f373348p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f373349q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f373350r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f373351s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f373352t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ee)) {
            return false;
        }
        r45.ee eeVar = (r45.ee) fVar;
        return n51.f.a(this.f373339d, eeVar.f373339d) && n51.f.a(this.f373340e, eeVar.f373340e) && n51.f.a(this.f373341f, eeVar.f373341f) && n51.f.a(this.f373342g, eeVar.f373342g) && n51.f.a(this.f373343h, eeVar.f373343h) && n51.f.a(java.lang.Integer.valueOf(this.f373344i), java.lang.Integer.valueOf(eeVar.f373344i)) && n51.f.a(java.lang.Integer.valueOf(this.f373345m), java.lang.Integer.valueOf(eeVar.f373345m)) && n51.f.a(java.lang.Integer.valueOf(this.f373346n), java.lang.Integer.valueOf(eeVar.f373346n)) && n51.f.a(this.f373347o, eeVar.f373347o) && n51.f.a(this.f373348p, eeVar.f373348p) && n51.f.a(this.f373349q, eeVar.f373349q) && n51.f.a(this.f373350r, eeVar.f373350r) && n51.f.a(this.f373351s, eeVar.f373351s) && n51.f.a(this.f373352t, eeVar.f373352t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373339d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373340e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f373341f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f373342g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f373343h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f373344i);
            fVar.e(7, this.f373345m);
            fVar.e(8, this.f373346n);
            java.lang.String str6 = this.f373347o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f373348p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f373349q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f373350r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f373351s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f373352t;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f373339d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f373340e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f373341f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f373342g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f373343h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            int e17 = j17 + b36.f.e(6, this.f373344i) + b36.f.e(7, this.f373345m) + b36.f.e(8, this.f373346n);
            java.lang.String str17 = this.f373347o;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f373348p;
            if (str18 != null) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f373349q;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f373350r;
            if (str20 != null) {
                e17 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f373351s;
            if (str21 != null) {
                e17 += b36.f.j(13, str21);
            }
            java.lang.String str22 = this.f373352t;
            return str22 != null ? e17 + b36.f.j(14, str22) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ee eeVar = (r45.ee) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eeVar.f373339d = aVar2.k(intValue);
                return 0;
            case 2:
                eeVar.f373340e = aVar2.k(intValue);
                return 0;
            case 3:
                eeVar.f373341f = aVar2.k(intValue);
                return 0;
            case 4:
                eeVar.f373342g = aVar2.k(intValue);
                return 0;
            case 5:
                eeVar.f373343h = aVar2.k(intValue);
                return 0;
            case 6:
                eeVar.f373344i = aVar2.g(intValue);
                return 0;
            case 7:
                eeVar.f373345m = aVar2.g(intValue);
                return 0;
            case 8:
                eeVar.f373346n = aVar2.g(intValue);
                return 0;
            case 9:
                eeVar.f373347o = aVar2.k(intValue);
                return 0;
            case 10:
                eeVar.f373348p = aVar2.k(intValue);
                return 0;
            case 11:
                eeVar.f373349q = aVar2.k(intValue);
                return 0;
            case 12:
                eeVar.f373350r = aVar2.k(intValue);
                return 0;
            case 13:
                eeVar.f373351s = aVar2.k(intValue);
                return 0;
            case 14:
                eeVar.f373352t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f373339d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "mpUrl", str, false);
            eVar.d(jSONObject, "videoUrl", this.f373340e, false);
            eVar.d(jSONObject, "videoVid", this.f373341f, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f373342g, false);
            eVar.d(jSONObject, "cover", this.f373343h, false);
            eVar.d(jSONObject, "videoDuration", java.lang.Integer.valueOf(this.f373344i), false);
            eVar.d(jSONObject, "width", java.lang.Integer.valueOf(this.f373345m), false);
            eVar.d(jSONObject, "height", java.lang.Integer.valueOf(this.f373346n), false);
            eVar.d(jSONObject, "url", this.f373347o, false);
            eVar.d(jSONObject, "srcUserName", this.f373348p, false);
            eVar.d(jSONObject, "srcDisplayName", this.f373349q, false);
            eVar.d(jSONObject, "publishId", this.f373350r, false);
            eVar.d(jSONObject, "preChatName", this.f373351s, false);
            eVar.d(jSONObject, "preUserName", this.f373352t, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
