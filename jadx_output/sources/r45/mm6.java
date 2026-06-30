package r45;

/* loaded from: classes11.dex */
public class mm6 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380668d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380669e;

    /* renamed from: f, reason: collision with root package name */
    public int f380670f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380671g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380672h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380673i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380674m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380675n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380676o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380677p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380678q;

    /* renamed from: r, reason: collision with root package name */
    public int f380679r;

    /* renamed from: s, reason: collision with root package name */
    public int f380680s;

    /* renamed from: t, reason: collision with root package name */
    public int f380681t;

    /* renamed from: u, reason: collision with root package name */
    public int f380682u;

    /* renamed from: v, reason: collision with root package name */
    public int f380683v;

    /* renamed from: w, reason: collision with root package name */
    public int f380684w;

    /* renamed from: x, reason: collision with root package name */
    public int f380685x;

    /* renamed from: y, reason: collision with root package name */
    public int f380686y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f380687z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mm6)) {
            return false;
        }
        r45.mm6 mm6Var = (r45.mm6) fVar;
        return n51.f.a(this.f380668d, mm6Var.f380668d) && n51.f.a(this.f380669e, mm6Var.f380669e) && n51.f.a(java.lang.Integer.valueOf(this.f380670f), java.lang.Integer.valueOf(mm6Var.f380670f)) && n51.f.a(this.f380671g, mm6Var.f380671g) && n51.f.a(this.f380672h, mm6Var.f380672h) && n51.f.a(this.f380673i, mm6Var.f380673i) && n51.f.a(this.f380674m, mm6Var.f380674m) && n51.f.a(this.f380675n, mm6Var.f380675n) && n51.f.a(this.f380676o, mm6Var.f380676o) && n51.f.a(this.f380677p, mm6Var.f380677p) && n51.f.a(this.f380678q, mm6Var.f380678q) && n51.f.a(java.lang.Integer.valueOf(this.f380679r), java.lang.Integer.valueOf(mm6Var.f380679r)) && n51.f.a(java.lang.Integer.valueOf(this.f380680s), java.lang.Integer.valueOf(mm6Var.f380680s)) && n51.f.a(java.lang.Integer.valueOf(this.f380681t), java.lang.Integer.valueOf(mm6Var.f380681t)) && n51.f.a(java.lang.Integer.valueOf(this.f380682u), java.lang.Integer.valueOf(mm6Var.f380682u)) && n51.f.a(java.lang.Integer.valueOf(this.f380683v), java.lang.Integer.valueOf(mm6Var.f380683v)) && n51.f.a(java.lang.Integer.valueOf(this.f380684w), java.lang.Integer.valueOf(mm6Var.f380684w)) && n51.f.a(java.lang.Integer.valueOf(this.f380685x), java.lang.Integer.valueOf(mm6Var.f380685x)) && n51.f.a(java.lang.Integer.valueOf(this.f380686y), java.lang.Integer.valueOf(mm6Var.f380686y)) && n51.f.a(this.f380687z, mm6Var.f380687z) && n51.f.a(this.A, mm6Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -1780691089:
                            if (next.equals("isShowDialog")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -1364966910:
                            if (next.equals("cdnUrl")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1114961022:
                            if (next.equals("newApkMd5")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -791595133:
                            if (next.equals("patchId")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -737365201:
                            if (next.equals("isShowRedot")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case -722265993:
                            if (next.equals("showDialogIntervalTime")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case -519374818:
                            if (next.equals("downloadingTitle")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -513404823:
                            if (next.equals("patchSize")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -500633081:
                            if (next.equals("showDialogMaxTimes")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -203964767:
                            if (next.equals("newApkPath")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 108417:
                            if (next.equals("msg")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 105765600:
                            if (next.equals("okBtn")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 476548482:
                            if (next.equals("cancelBtn")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 688591589:
                            if (next.equals(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE)) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 719273028:
                            if (next.equals("updateClientVersion")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case 908960928:
                            if (next.equals("packageType")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case 1004621513:
                            if (next.equals("oldApkMd5")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1230358550:
                            if (next.equals("patchMd5")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1268725447:
                            if (next.equals("downloadingMsg")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case 2062213586:
                            if (next.equals("isShowNotification")) {
                                c17 = 14;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f380668d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f380669e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f380670f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f380671g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f380672h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f380673i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f380674m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f380675n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f380676o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            this.f380677p = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\n':
                            this.f380678q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f380679r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f380680s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\r':
                            this.f380681t = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 14:
                            this.f380682u = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 15:
                            this.f380683v = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            this.f380684w = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 17:
                            this.f380685x = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 18:
                            this.f380686y = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f380687z = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 20:
                            this.A = (java.lang.String) jSONObject.opt(next);
                            break;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380668d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380669e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f380670f);
            java.lang.String str3 = this.f380671g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f380672h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f380673i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f380674m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f380675n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f380676o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f380677p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f380678q;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            fVar.e(12, this.f380679r);
            fVar.e(13, this.f380680s);
            fVar.e(14, this.f380681t);
            fVar.e(15, this.f380682u);
            fVar.e(16, this.f380683v);
            fVar.e(17, this.f380684w);
            fVar.e(18, this.f380685x);
            fVar.e(19, this.f380686y);
            java.lang.String str11 = this.f380687z;
            if (str11 != null) {
                fVar.j(20, str11);
            }
            java.lang.String str12 = this.A;
            if (str12 != null) {
                fVar.j(21, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f380668d;
            int j17 = str13 != null ? b36.f.j(1, str13) + 0 : 0;
            java.lang.String str14 = this.f380669e;
            if (str14 != null) {
                j17 += b36.f.j(2, str14);
            }
            int e17 = j17 + b36.f.e(3, this.f380670f);
            java.lang.String str15 = this.f380671g;
            if (str15 != null) {
                e17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f380672h;
            if (str16 != null) {
                e17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f380673i;
            if (str17 != null) {
                e17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f380674m;
            if (str18 != null) {
                e17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f380675n;
            if (str19 != null) {
                e17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f380676o;
            if (str20 != null) {
                e17 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f380677p;
            if (str21 != null) {
                e17 += b36.f.j(10, str21);
            }
            java.lang.String str22 = this.f380678q;
            if (str22 != null) {
                e17 += b36.f.j(11, str22);
            }
            int e18 = e17 + b36.f.e(12, this.f380679r) + b36.f.e(13, this.f380680s) + b36.f.e(14, this.f380681t) + b36.f.e(15, this.f380682u) + b36.f.e(16, this.f380683v) + b36.f.e(17, this.f380684w) + b36.f.e(18, this.f380685x) + b36.f.e(19, this.f380686y);
            java.lang.String str23 = this.f380687z;
            if (str23 != null) {
                e18 += b36.f.j(20, str23);
            }
            java.lang.String str24 = this.A;
            return str24 != null ? e18 + b36.f.j(21, str24) : e18;
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
        r45.mm6 mm6Var = (r45.mm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mm6Var.f380668d = aVar2.k(intValue);
                return 0;
            case 2:
                mm6Var.f380669e = aVar2.k(intValue);
                return 0;
            case 3:
                mm6Var.f380670f = aVar2.g(intValue);
                return 0;
            case 4:
                mm6Var.f380671g = aVar2.k(intValue);
                return 0;
            case 5:
                mm6Var.f380672h = aVar2.k(intValue);
                return 0;
            case 6:
                mm6Var.f380673i = aVar2.k(intValue);
                return 0;
            case 7:
                mm6Var.f380674m = aVar2.k(intValue);
                return 0;
            case 8:
                mm6Var.f380675n = aVar2.k(intValue);
                return 0;
            case 9:
                mm6Var.f380676o = aVar2.k(intValue);
                return 0;
            case 10:
                mm6Var.f380677p = aVar2.k(intValue);
                return 0;
            case 11:
                mm6Var.f380678q = aVar2.k(intValue);
                return 0;
            case 12:
                mm6Var.f380679r = aVar2.g(intValue);
                return 0;
            case 13:
                mm6Var.f380680s = aVar2.g(intValue);
                return 0;
            case 14:
                mm6Var.f380681t = aVar2.g(intValue);
                return 0;
            case 15:
                mm6Var.f380682u = aVar2.g(intValue);
                return 0;
            case 16:
                mm6Var.f380683v = aVar2.g(intValue);
                return 0;
            case 17:
                mm6Var.f380684w = aVar2.g(intValue);
                return 0;
            case 18:
                mm6Var.f380685x = aVar2.g(intValue);
                return 0;
            case 19:
                mm6Var.f380686y = aVar2.g(intValue);
                return 0;
            case 20:
                mm6Var.f380687z = aVar2.k(intValue);
                return 0;
            case 21:
                mm6Var.A = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f380668d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "patchId", str, false);
            eVar.d(jSONObject, "newApkPath", this.f380669e, false);
            eVar.d(jSONObject, "patchSize", java.lang.Integer.valueOf(this.f380670f), false);
            eVar.d(jSONObject, "newApkMd5", this.f380671g, false);
            eVar.d(jSONObject, "oldApkMd5", this.f380672h, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f380673i, false);
            eVar.d(jSONObject, "msg", this.f380674m, false);
            eVar.d(jSONObject, "okBtn", this.f380675n, false);
            eVar.d(jSONObject, "cancelBtn", this.f380676o, false);
            eVar.d(jSONObject, "cdnUrl", this.f380677p, false);
            eVar.d(jSONObject, "patchMd5", this.f380678q, false);
            eVar.d(jSONObject, com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, java.lang.Integer.valueOf(this.f380679r), false);
            eVar.d(jSONObject, "updateClientVersion", java.lang.Integer.valueOf(this.f380680s), false);
            eVar.d(jSONObject, "packageType", java.lang.Integer.valueOf(this.f380681t), false);
            eVar.d(jSONObject, "isShowNotification", java.lang.Integer.valueOf(this.f380682u), false);
            eVar.d(jSONObject, "isShowRedot", java.lang.Integer.valueOf(this.f380683v), false);
            eVar.d(jSONObject, "isShowDialog", java.lang.Integer.valueOf(this.f380684w), false);
            eVar.d(jSONObject, "showDialogMaxTimes", java.lang.Integer.valueOf(this.f380685x), false);
            eVar.d(jSONObject, "showDialogIntervalTime", java.lang.Integer.valueOf(this.f380686y), false);
            eVar.d(jSONObject, "downloadingTitle", this.f380687z, false);
            eVar.d(jSONObject, "downloadingMsg", this.A, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
