package vu4;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final vu4.d f440310a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f440311b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440312c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440313d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f440314e;

    /* renamed from: f, reason: collision with root package name */
    public final vu4.e f440315f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f440316g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f440317h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f440318i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f440319j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f440320k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f440321l;

    /* renamed from: m, reason: collision with root package name */
    public final vu4.g f440322m;

    public f(vu4.d actionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String pageId, vu4.e boxinfo, java.lang.String docInfo, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, vu4.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        java.lang.String str9 = (i17 & 2) != 0 ? "" : str;
        java.lang.String str10 = (i17 & 4) != 0 ? "" : str2;
        java.lang.String str11 = (i17 & 8) != 0 ? "" : str3;
        java.lang.String str12 = (i17 & 128) != 0 ? "" : str4;
        java.lang.String str13 = (i17 & 256) != 0 ? "" : str5;
        java.lang.String str14 = (i17 & 512) != 0 ? "" : str6;
        java.lang.String str15 = (i17 & 1024) != 0 ? "" : str7;
        java.lang.String str16 = (i17 & 2048) == 0 ? str8 : "";
        vu4.g msgPageType = (i17 & 4096) != 0 ? vu4.g.f440323e : gVar;
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(pageId, "pageId");
        kotlin.jvm.internal.o.g(boxinfo, "boxinfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(msgPageType, "msgPageType");
        this.f440310a = actionType;
        this.f440311b = str9;
        this.f440312c = str10;
        this.f440313d = str11;
        this.f440314e = pageId;
        this.f440315f = boxinfo;
        this.f440316g = docInfo;
        this.f440317h = str12;
        this.f440318i = str13;
        this.f440319j = str14;
        this.f440320k = str15;
        this.f440321l = str16;
        this.f440322m = msgPageType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:(3:66|67|(1:69)(26:70|(1:61)(1:65)|62|9|(1:11)|12|(1:(1:15)(2:54|55))(1:56)|16|(1:18)(1:53)|(3:20|(1:22)(1:25)|(1:24))|26|(1:28)|29|30|31|32|34|35|36|(1:38)|39|(1:41)|42|(1:44)|45|46))|59|(0)(0)|62|9|(0)|12|(0)(0)|16|(0)(0)|(0)|26|(0)|29|30|31|32|34|35|36|(0)|39|(0)|42|(0)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0052, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0050, code lost:
    
        if (r9 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r9 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0030 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:67:0x0024, B:61:0x0030, B:62:0x003b, B:65:0x0036), top: B:66:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0036 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:67:0x0024, B:61:0x0030, B:62:0x003b, B:65:0x0036), top: B:66:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vu4.f.a():java.util.List");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4.f)) {
            return false;
        }
        vu4.f fVar = (vu4.f) obj;
        return this.f440310a == fVar.f440310a && kotlin.jvm.internal.o.b(this.f440311b, fVar.f440311b) && kotlin.jvm.internal.o.b(this.f440312c, fVar.f440312c) && kotlin.jvm.internal.o.b(this.f440313d, fVar.f440313d) && kotlin.jvm.internal.o.b(this.f440314e, fVar.f440314e) && this.f440315f == fVar.f440315f && kotlin.jvm.internal.o.b(this.f440316g, fVar.f440316g) && kotlin.jvm.internal.o.b(this.f440317h, fVar.f440317h) && kotlin.jvm.internal.o.b(this.f440318i, fVar.f440318i) && kotlin.jvm.internal.o.b(this.f440319j, fVar.f440319j) && kotlin.jvm.internal.o.b(this.f440320k, fVar.f440320k) && kotlin.jvm.internal.o.b(this.f440321l, fVar.f440321l) && this.f440322m == fVar.f440322m;
    }

    public int hashCode() {
        int hashCode = this.f440310a.hashCode() * 31;
        java.lang.String str = this.f440311b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f440312c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f440313d;
        int hashCode4 = (((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f440314e.hashCode()) * 31) + this.f440315f.hashCode()) * 31) + this.f440316g.hashCode()) * 31;
        java.lang.String str4 = this.f440317h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f440318i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f440319j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f440320k;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f440321l;
        return ((hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.f440322m.hashCode();
    }

    public java.lang.String toString() {
        return "Report28760Item(actionType=" + this.f440310a + ", scene=" + this.f440311b + ", sceneNote=" + this.f440312c + ", sessionId=" + this.f440313d + ", pageId=" + this.f440314e + ", boxinfo=" + this.f440315f + ", docInfo=" + this.f440316g + ", itemInfo=" + this.f440317h + ", boxExtInfo=" + this.f440318i + ", extInfo=" + this.f440319j + ", clickId=" + this.f440320k + ", msgSessionId=" + this.f440321l + ", msgPageType=" + this.f440322m + ')';
    }
}
