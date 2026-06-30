package ml2;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long f328027a;

    /* renamed from: b, reason: collision with root package name */
    public long f328028b;

    public final void a(java.lang.String adVideoId) {
        kotlin.jvm.internal.o.g(adVideoId, "adVideoId");
        if (android.text.TextUtils.isEmpty(adVideoId)) {
            com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportLivingVideoExit return for adVideoId:".concat(adVideoId));
        } else {
            com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportLivingVideoExit return for livingVideoEnter:0");
        }
    }
}
