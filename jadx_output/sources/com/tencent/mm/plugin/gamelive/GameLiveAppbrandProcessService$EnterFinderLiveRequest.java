package com.tencent.mm.plugin.gamelive;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u00012BS\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\f\u0012\b\b\u0002\u0010%\u001a\u00020\f\u0012\b\b\u0002\u0010'\u001a\u00020\u0007\u0012\b\b\u0002\u0010-\u001a\u00020(¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b.\u00100J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\"\u0010\"\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010!R\"\u0010%\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b$\u0010!R\"\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b&\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010-\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010)\u001a\u0004\b*\u0010+\"\u0004\b\u001e\u0010,¨\u00063"}, d2 = {"com/tencent/mm/plugin/gamelive/GameLiveAppbrandProcessService$EnterFinderLiveRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lh63/u;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "", "d", "Ljava/lang/String;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "()Ljava/lang/String;", "appid", "e", "I", "f", "()I", "q", "(I)V", "versionType", "a", "g", "action", "m", "param", "h", "getPath", "n", "(Ljava/lang/String;)V", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "i", "o", "reportInfo", "c", "entranceType", "", "J", "b", "()J", "(J)V", "entranceId", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;IJ)V", "(Landroid/os/Parcel;)V", "CREATOR", "h63/q", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class GameLiveAppbrandProcessService$EnterFinderLiveRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final h63.q CREATOR = new h63.q(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String appid;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int versionType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int action;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int param;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private java.lang.String path;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private java.lang.String reportInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int entranceType;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long entranceId;

    public /* synthetic */ GameLiveAppbrandProcessService$EnterFinderLiveRequest(java.lang.String str, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3, int i27, long j17, int i28, kotlin.jvm.internal.i iVar) {
        this(str, (i28 & 2) != 0 ? 0 : i17, i18, (i28 & 8) != 0 ? 1 : i19, (i28 & 16) != 0 ? "" : str2, (i28 & 32) != 0 ? "" : str3, (i28 & 64) != 0 ? 0 : i27, (i28 & 128) != 0 ? 0L : j17);
    }

    /* renamed from: S, reason: from getter */
    public final java.lang.String getAppid() {
        return this.appid;
    }

    /* renamed from: a, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final long getEntranceId() {
        return this.entranceId;
    }

    /* renamed from: c, reason: from getter */
    public final int getEntranceType() {
        return this.entranceType;
    }

    /* renamed from: d, reason: from getter */
    public final int getParam() {
        return this.param;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final java.lang.String getReportInfo() {
        return this.reportInfo;
    }

    /* renamed from: f, reason: from getter */
    public final int getVersionType() {
        return this.versionType;
    }

    public final void g(int i17) {
        this.action = i17;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<h63.u> getTaskClass() {
        return h63.u.class;
    }

    public final void h(long j17) {
        this.entranceId = j17;
    }

    public final void i(int i17) {
        this.entranceType = i17;
    }

    public final void m(int i17) {
        this.param = i17;
    }

    public final void n(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.path = str;
    }

    public final void o(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.reportInfo = str;
    }

    public final void q(int i17) {
        this.versionType = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.appid);
        parcel.writeInt(this.versionType);
        parcel.writeInt(this.action);
        parcel.writeInt(this.param);
        parcel.writeString(this.path);
        parcel.writeString(this.reportInfo);
        parcel.writeInt(this.entranceType);
        parcel.writeLong(this.entranceId);
    }

    public GameLiveAppbrandProcessService$EnterFinderLiveRequest(java.lang.String appid, int i17, int i18, int i19, java.lang.String path, java.lang.String reportInfo, int i27, long j17) {
        kotlin.jvm.internal.o.g(appid, "appid");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        this.appid = appid;
        this.versionType = i17;
        this.action = i18;
        this.param = i19;
        this.path = path;
        this.reportInfo = reportInfo;
        this.entranceType = i27;
        this.entranceId = j17;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GameLiveAppbrandProcessService$EnterFinderLiveRequest(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = r13.readString()
            java.lang.String r1 = ""
            if (r0 != 0) goto Lf
            r3 = r1
            goto L10
        Lf:
            r3 = r0
        L10:
            int r4 = r13.readInt()
            int r5 = r13.readInt()
            int r6 = r13.readInt()
            java.lang.String r0 = r13.readString()
            if (r0 != 0) goto L24
            r7 = r1
            goto L25
        L24:
            r7 = r0
        L25:
            java.lang.String r0 = r13.readString()
            if (r0 != 0) goto L2d
            r8 = r1
            goto L2e
        L2d:
            r8 = r0
        L2e:
            int r9 = r13.readInt()
            long r10 = r13.readLong()
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest.<init>(android.os.Parcel):void");
    }
}
