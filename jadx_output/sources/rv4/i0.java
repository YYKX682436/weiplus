package rv4;

/* loaded from: classes12.dex */
public final class i0 implements nv4.g {

    /* renamed from: m, reason: collision with root package name */
    public static final rv4.h0 f400489m = new rv4.h0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f400490a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f400491b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400492c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400493d;

    /* renamed from: e, reason: collision with root package name */
    public rv4.p f400494e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f400495f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f400496g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f400497h;

    /* renamed from: i, reason: collision with root package name */
    public final int f400498i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f400499j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f400500k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f400501l;

    public i0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, rv4.w wVar, java.lang.String str5, int i17, java.lang.String str6, int i18, int i19, rv4.p pVar, int i27, int i28, long j17, int i29, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i37, java.util.List list, java.util.List list2, int i38, kotlin.jvm.internal.i iVar) {
        java.lang.String word = (i38 & 1) != 0 ? "" : str;
        java.lang.String query = (i38 & 2) != 0 ? "" : str2;
        java.lang.String tagTitle = (i38 & 4) != 0 ? "" : str3;
        java.lang.String tagColor = (i38 & 8) != 0 ? "" : str4;
        java.lang.String requestId = (i38 & 32) != 0 ? "" : str5;
        java.lang.String mixerCommonContext = (i38 & 128) != 0 ? "" : str6;
        rv4.p pVar2 = (i38 & 1024) != 0 ? null : pVar;
        java.lang.String title = (32768 & i38) != 0 ? "" : str7;
        java.lang.String docInfo = (65536 & i38) != 0 ? "" : str8;
        java.lang.String firstImgUrl = (131072 & i38) != 0 ? "" : str9;
        java.lang.String secondImgUrl = (262144 & i38) == 0 ? str10 : "";
        int i39 = (524288 & i38) != 0 ? 0 : i37;
        int i47 = 1048576 & i38;
        java.util.List friendHeadImgUrls = kz5.p0.f313996d;
        java.util.List friendNicknames = i47 != 0 ? friendHeadImgUrls : list;
        friendHeadImgUrls = (i38 & 2097152) == 0 ? list2 : friendHeadImgUrls;
        kotlin.jvm.internal.o.g(word, "word");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(tagTitle, "tagTitle");
        kotlin.jvm.internal.o.g(tagColor, "tagColor");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(mixerCommonContext, "mixerCommonContext");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(firstImgUrl, "firstImgUrl");
        kotlin.jvm.internal.o.g(secondImgUrl, "secondImgUrl");
        kotlin.jvm.internal.o.g(friendNicknames, "friendNicknames");
        kotlin.jvm.internal.o.g(friendHeadImgUrls, "friendHeadImgUrls");
        this.f400490a = word;
        this.f400491b = query;
        this.f400492c = tagTitle;
        this.f400493d = mixerCommonContext;
        this.f400494e = pVar2;
        this.f400495f = docInfo;
        this.f400496g = firstImgUrl;
        this.f400497h = secondImgUrl;
        this.f400498i = i39;
        this.f400499j = friendNicknames;
        this.f400500k = friendHeadImgUrls;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return this.f400490a + '-' + this.f400492c + '-' + hashCode();
    }
}
