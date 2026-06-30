package qg5;

/* loaded from: classes8.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362929a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f362930b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f362931c;

    public b3(java.lang.String shareSessionId, java.util.Map sharedReportParameters, java.util.Map extraInfo, int i17, kotlin.jvm.internal.i iVar) {
        sharedReportParameters = (i17 & 2) != 0 ? new java.util.concurrent.ConcurrentHashMap() : sharedReportParameters;
        extraInfo = (i17 & 4) != 0 ? new java.util.concurrent.ConcurrentHashMap() : extraInfo;
        kotlin.jvm.internal.o.g(shareSessionId, "shareSessionId");
        kotlin.jvm.internal.o.g(sharedReportParameters, "sharedReportParameters");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        this.f362929a = shareSessionId;
        this.f362930b = sharedReportParameters;
        this.f362931c = extraInfo;
    }
}
