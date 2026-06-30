package dd4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final dd4.f f228995d;

    /* renamed from: e, reason: collision with root package name */
    public static final dd4.f f228996e;

    /* renamed from: f, reason: collision with root package name */
    public static final dd4.f f228997f;

    /* renamed from: g, reason: collision with root package name */
    public static final dd4.f f228998g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dd4.f[] f228999h;

    static {
        dd4.f fVar = new dd4.f("NORMAL", 0);
        f228995d = fVar;
        dd4.f fVar2 = new dd4.f("DOWNLOADING_BIG_IMG", 1);
        f228996e = fVar2;
        dd4.f fVar3 = new dd4.f("DOWNLOAD_BIG_IMAGE_FAIL", 2);
        f228997f = fVar3;
        dd4.f fVar4 = new dd4.f("DOWNLOAD_BIG_IMAGE_SUC", 3);
        f228998g = fVar4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$LivePhotoDownloadState");
        dd4.f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$LivePhotoDownloadState");
        f228999h = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static dd4.f valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$LivePhotoDownloadState");
        dd4.f fVar = (dd4.f) java.lang.Enum.valueOf(dd4.f.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$LivePhotoDownloadState");
        return fVar;
    }

    public static dd4.f[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$LivePhotoDownloadState");
        dd4.f[] fVarArr = (dd4.f[]) f228999h.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$LivePhotoDownloadState");
        return fVarArr;
    }
}
