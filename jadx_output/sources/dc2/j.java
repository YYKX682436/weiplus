package dc2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout f228703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        super(1);
        this.f228703d = finderLiveFixRatioPhoneEditPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel it = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout = this.f228703d;
        android.content.Context context = finderLiveFixRatioPhoneEditPluginLayout.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.setResult(10012);
        }
        android.content.Context context2 = finderLiveFixRatioPhoneEditPluginLayout.getContext();
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity2 != null) {
            activity2.finish();
        }
        return jz5.f0.f302826a;
    }
}
