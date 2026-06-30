package dc2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout f228694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout) {
        super(1);
        this.f228694d = finderFixPhotoEditPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel it = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout = this.f228694d;
        android.content.Context context = finderFixPhotoEditPluginLayout.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.setResult(10013);
        }
        android.content.Context context2 = finderFixPhotoEditPluginLayout.getContext();
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity2 != null) {
            activity2.finish();
        }
        return jz5.f0.f302826a;
    }
}
