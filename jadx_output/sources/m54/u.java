package m54;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f324307a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f324308b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f324309c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324311e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324312f;

    public u(java.lang.String shareThumbUrl, java.lang.String shareTitle, java.lang.String shareDesc, java.lang.String shareWebUrl, java.lang.String shareAppId, java.lang.String shareType, java.lang.String shareUserInfo, int i17, java.lang.String canvasDynamicExtInfo, java.lang.String canvasDynamicLoadExtInfo, int i18, kotlin.jvm.internal.i iVar) {
        shareThumbUrl = (i18 & 1) != 0 ? "" : shareThumbUrl;
        shareTitle = (i18 & 2) != 0 ? "" : shareTitle;
        shareDesc = (i18 & 4) != 0 ? "" : shareDesc;
        shareWebUrl = (i18 & 8) != 0 ? "" : shareWebUrl;
        shareAppId = (i18 & 16) != 0 ? "" : shareAppId;
        shareType = (i18 & 32) != 0 ? "" : shareType;
        shareUserInfo = (i18 & 64) != 0 ? "" : shareUserInfo;
        canvasDynamicExtInfo = (i18 & 256) != 0 ? "" : canvasDynamicExtInfo;
        canvasDynamicLoadExtInfo = (i18 & 512) != 0 ? "" : canvasDynamicLoadExtInfo;
        kotlin.jvm.internal.o.g(shareThumbUrl, "shareThumbUrl");
        kotlin.jvm.internal.o.g(shareTitle, "shareTitle");
        kotlin.jvm.internal.o.g(shareDesc, "shareDesc");
        kotlin.jvm.internal.o.g(shareWebUrl, "shareWebUrl");
        kotlin.jvm.internal.o.g(shareAppId, "shareAppId");
        kotlin.jvm.internal.o.g(shareType, "shareType");
        kotlin.jvm.internal.o.g(shareUserInfo, "shareUserInfo");
        kotlin.jvm.internal.o.g(canvasDynamicExtInfo, "canvasDynamicExtInfo");
        kotlin.jvm.internal.o.g(canvasDynamicLoadExtInfo, "canvasDynamicLoadExtInfo");
        this.f324307a = shareThumbUrl;
        this.f324308b = shareTitle;
        this.f324309c = shareDesc;
        this.f324310d = shareWebUrl;
        this.f324311e = canvasDynamicExtInfo;
        this.f324312f = canvasDynamicLoadExtInfo;
    }
}
