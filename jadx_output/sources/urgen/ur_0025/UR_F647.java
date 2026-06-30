package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, d2 = {"Lurgen/ur_0025/UR_F647;", "", "<init>", "()V", "URB_E885", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "callback", "URB_48E9", "", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "", "URB_E787", "URB_6B92", "URB_045B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UR_F647 {
    public static final urgen.ur_0025.UR_F647 INSTANCE = new urgen.ur_0025.UR_F647();

    private UR_F647() {
    }

    public static final boolean URB_045B(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((kl4.k) ((jm4.w) obj)).f308925h.set(false);
        return true;
    }

    public static final boolean URB_48E9(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        ((kl4.k) ((jm4.w) obj)).f308924g = filePath;
        return true;
    }

    public static final boolean URB_6B92(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kl4.k kVar = (kl4.k) ((jm4.w) obj);
        if (kVar.f308925h.get()) {
            com.tencent.mars.xlog.Log.w(kVar.f308921d, "decode: already decoding, ignore");
            return false;
        }
        java.lang.String str = kVar.f308924g;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e(kVar.f308921d, "decode: file path is null or empty");
            return false;
        }
        synchronized (kVar.f308927m) {
            kVar.f308925h.set(true);
            kVar.f308926i = new java.util.concurrent.CountDownLatch(1);
            ((ku5.t0) ku5.t0.f312615d).h(new kl4.j(kVar), kVar.f308922e);
        }
        return true;
    }

    public static final void URB_E787(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kl4.k kVar = (kl4.k) ((jm4.w) obj);
        synchronized (kVar.f308927m) {
            kVar.f308925h.set(false);
            java.util.concurrent.CountDownLatch countDownLatch = kVar.f308926i;
            kVar.f308926i = null;
            if (countDownLatch != null) {
                try {
                    if (!countDownLatch.await(500L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        com.tencent.mars.xlog.Log.w(kVar.f308921d, "unInit: decode thread did not finish in 500ms");
                    }
                } catch (java.lang.InterruptedException unused) {
                    com.tencent.mars.xlog.Log.w(kVar.f308921d, "unInit: interrupted while waiting for decode thread");
                }
            }
            kVar.f308924g = null;
            kVar.f308923f = null;
        }
    }

    public static final void URB_E885(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef callback) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((kl4.k) ((jm4.w) obj)).f308923f = (jm4.x) callback;
    }
}
