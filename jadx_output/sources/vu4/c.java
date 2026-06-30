package vu4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final vu4.a f440278a;

    /* renamed from: b, reason: collision with root package name */
    public final vu4.b f440279b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440280c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440281d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f440282e;

    /* renamed from: f, reason: collision with root package name */
    public final int f440283f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f440284g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f440285h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f440286i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f440287j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f440288k;

    /* renamed from: l, reason: collision with root package name */
    public int f440289l;

    /* renamed from: m, reason: collision with root package name */
    public int f440290m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f440291n;

    public c(vu4.a actionId, vu4.b actionType, java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId, int i17, java.lang.String query, java.lang.String docInfo, java.lang.String itemInfo, java.lang.String h5Version, boolean z17) {
        kotlin.jvm.internal.o.g(actionId, "actionId");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(h5Version, "h5Version");
        this.f440278a = actionId;
        this.f440279b = actionType;
        this.f440280c = sessionId;
        this.f440281d = searchId;
        this.f440282e = requestId;
        this.f440283f = i17;
        this.f440284g = query;
        this.f440285h = docInfo;
        this.f440286i = itemInfo;
        this.f440287j = h5Version;
        this.f440288k = z17;
        this.f440289l = 3;
        this.f440290m = 6;
        this.f440291n = "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final vu4.k a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        int i18;
        java.lang.String str5;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ?? r37 = new java.lang.Object[17];
        r37[0] = "";
        r37[1] = this.f440280c;
        r37[2] = this.f440281d;
        r37[3] = "";
        r37[4] = this.f440282e;
        r37[5] = java.lang.Long.valueOf(currentTimeMillis);
        r37[6] = java.lang.Integer.valueOf(this.f440278a.f440257d);
        java.lang.String str6 = this.f440286i;
        boolean z17 = str6.length() > 0;
        vu4.b bVar = this.f440279b;
        if (!z17) {
            int ordinal = bVar.ordinal();
            int i19 = 65;
            switch (ordinal) {
                case 15:
                    str5 = "navbar";
                    break;
                case 16:
                    str5 = fp.s0.b("AI搜索", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(str5, "encode(...)");
                    break;
                case 17:
                    str5 = fp.s0.b("问AI", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(str5, "encode(...)");
                    break;
                default:
                    switch (ordinal) {
                        case 24:
                            str5 = fp.s0.b("按住搜索或提问", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                            kotlin.jvm.internal.o.f(str5, "encode(...)");
                            i19 = 66;
                            break;
                        case 25:
                            str5 = fp.s0.b("搜索框内语音", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                            kotlin.jvm.internal.o.f(str5, "encode(...)");
                            i19 = 64;
                            break;
                        case 26:
                            str5 = fp.s0.b("搜索指定内容", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                            kotlin.jvm.internal.o.f(str5, "encode(...)");
                            i19 = 55;
                            break;
                        case 27:
                            str5 = fp.s0.b("搜索框", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                            kotlin.jvm.internal.o.f(str5, "encode(...)");
                            i19 = 64;
                            break;
                        default:
                            str5 = fp.s0.b("搜索框", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                            kotlin.jvm.internal.o.f(str5, "encode(...)");
                            i19 = 64;
                            break;
                    }
            }
            str6 = "1|" + i19 + '|' + str5;
        }
        r37[7] = str6;
        java.lang.String str7 = this.f440285h;
        if (!(str7.length() > 0)) {
            int ordinal2 = bVar.ordinal();
            java.lang.String str8 = "aisearch";
            java.lang.String str9 = "photo";
            java.lang.String str10 = "voice";
            switch (ordinal2) {
                case 0:
                    str10 = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
                    str = str10;
                    str2 = str;
                    i18 = 0;
                    break;
                case 1:
                    str = str10;
                    str2 = str;
                    i18 = 0;
                    break;
                case 2:
                    str3 = ya.a.SEARCH;
                    str8 = str3;
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 3:
                    str3 = "txtbox";
                    str8 = str3;
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 4:
                    str9 = fp.s0.b("深度思考", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(str9, "encode(...)");
                    str8 = "deepthink";
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 5:
                    str9 = fp.s0.b("问真人", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(str9, "encode(...)");
                    str8 = "ask_realpeople";
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 6:
                    str = str9;
                    str2 = str9;
                    i18 = 2;
                    break;
                case 7:
                    str3 = "phototake";
                    str8 = str3;
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 8:
                    str4 = "photoselect";
                    str9 = str4;
                    str = str9;
                    str2 = str9;
                    i18 = 2;
                    break;
                case 9:
                    str = "photocancel";
                    i17 = 3;
                    str2 = str;
                    i18 = i17;
                    break;
                case 10:
                    str = "add";
                    i17 = 3;
                    str2 = str;
                    i18 = i17;
                    break;
                case 11:
                    str3 = "addfile";
                    str8 = str3;
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 12:
                    str4 = "addbiz";
                    str9 = str4;
                    str = str9;
                    str2 = str9;
                    i18 = 2;
                    break;
                case 13:
                    str = "addfinder";
                    i17 = 3;
                    str2 = str;
                    i18 = i17;
                    break;
                case 14:
                    str = "addcancel";
                    i17 = 4;
                    str2 = str;
                    i18 = i17;
                    break;
                case 15:
                    java.lang.String b17 = fp.s0.b("问元宝", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(b17, "encode(...)");
                    str9 = "askyuanbao";
                    str = b17;
                    str2 = str9;
                    i18 = 2;
                    break;
                case 16:
                    str9 = fp.s0.b("AI搜索", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(str9, "encode(...)");
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 17:
                    str9 = fp.s0.b("问AI", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(str9, "encode(...)");
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 18:
                    str8 = "gesture_back";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 19:
                    str8 = "swipe_back";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 20:
                    str8 = "upbutton_back";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 21:
                    str8 = "h5_back";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 22:
                    str8 = "cancle";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 23:
                    str = fp.s0.b("大家在搜", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(str, "encode(...)");
                    str2 = "hotsearch";
                    i18 = 3;
                    break;
                case 24:
                case 25:
                    str8 = "voice";
                    str9 = str8;
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                case 26:
                    str = fp.s0.b("搜索指定内容", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(str, "encode(...)");
                    str2 = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                    i18 = 0;
                    break;
                case 27:
                    str8 = "photo";
                    str2 = str8;
                    str = str9;
                    i18 = 1;
                    break;
                default:
                    str10 = "";
                    str = str10;
                    str2 = str;
                    i18 = 0;
                    break;
            }
            str7 = i18 + '|' + i18 + '|' + str + "||||||" + str2 + '|';
        }
        r37[8] = str7;
        ?? r47 = this.f440287j;
        if (!(r47.length() > 0)) {
            r47 = java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0));
        }
        r37[9] = r47;
        r37[10] = java.lang.Integer.valueOf(this.f440289l);
        r37[11] = java.lang.Integer.valueOf(this.f440283f);
        r37[12] = java.lang.Integer.valueOf(this.f440290m);
        r37[13] = fp.s0.b(this.f440291n, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        r37[14] = java.lang.Long.valueOf(currentTimeMillis);
        r37[15] = this.f440288k ? "1" : "0";
        java.lang.String str11 = this.f440284g;
        r37[16] = fp.s0.b(str11 != null ? str11 : "", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        return new vu4.k(26897, kz5.n0.g0(kz5.c0.i(r37), ",", null, null, 0, null, null, 62, null));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4.c)) {
            return false;
        }
        vu4.c cVar = (vu4.c) obj;
        return this.f440278a == cVar.f440278a && this.f440279b == cVar.f440279b && kotlin.jvm.internal.o.b(this.f440280c, cVar.f440280c) && kotlin.jvm.internal.o.b(this.f440281d, cVar.f440281d) && kotlin.jvm.internal.o.b(this.f440282e, cVar.f440282e) && this.f440283f == cVar.f440283f && kotlin.jvm.internal.o.b(this.f440284g, cVar.f440284g) && kotlin.jvm.internal.o.b(this.f440285h, cVar.f440285h) && kotlin.jvm.internal.o.b(this.f440286i, cVar.f440286i) && kotlin.jvm.internal.o.b(this.f440287j, cVar.f440287j) && this.f440288k == cVar.f440288k;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f440278a.hashCode() * 31) + this.f440279b.hashCode()) * 31) + this.f440280c.hashCode()) * 31) + this.f440281d.hashCode()) * 31) + this.f440282e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f440283f)) * 31) + this.f440284g.hashCode()) * 31) + this.f440285h.hashCode()) * 31) + this.f440286i.hashCode()) * 31) + this.f440287j.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f440288k);
    }

    public java.lang.String toString() {
        return "Report26897Item(actionId=" + this.f440278a + ", actionType=" + this.f440279b + ", sessionId=" + this.f440280c + ", searchId=" + this.f440281d + ", requestId=" + this.f440282e + ", bizType=" + this.f440283f + ", query=" + this.f440284g + ", docInfo=" + this.f440285h + ", itemInfo=" + this.f440286i + ", h5Version=" + this.f440287j + ", isCache=" + this.f440288k + ')';
    }

    public /* synthetic */ c(vu4.a aVar, vu4.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this(aVar, bVar, str, str2, str3, i17, (i18 & 64) != 0 ? "" : str4, (i18 & 128) != 0 ? "" : str5, (i18 & 256) != 0 ? "" : str6, (i18 & 512) != 0 ? "" : str7, (i18 & 1024) != 0 ? false : z17);
    }
}
