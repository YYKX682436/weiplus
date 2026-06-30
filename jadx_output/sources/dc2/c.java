package dc2;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout f228695d;

    public c(com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout) {
        this.f228695d = finderFixPhotoEditPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout.f105303w;
        com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout finderFixPhotoEditPluginLayout = this.f228695d;
        finderFixPhotoEditPluginLayout.getEditPhotoWrapper().c(new dc2.b(finderFixPhotoEditPluginLayout));
    }
}
