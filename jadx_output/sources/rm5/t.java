package rm5;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f397568a;

    static {
        int[] iArr = new int[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.values().length];
        try {
            iArr[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCancelled.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusUnknown.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        f397568a = iArr;
    }
}
