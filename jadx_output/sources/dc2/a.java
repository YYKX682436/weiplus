package dc2;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout f228693d;

    public a(com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout) {
        this.f228693d = finderFixPhotoEditPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout = this.f228693d;
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
    }
}
