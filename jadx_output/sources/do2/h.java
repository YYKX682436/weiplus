package do2;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView f242084d;

    public h(com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView) {
        this.f242084d = finderMegaVideoMiniView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        do2.c cVar = com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView.f121046s;
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView = this.f242084d;
        android.util.Size a17 = cVar.a(resources, finderMegaVideoMiniView.getShapeType());
        finderMegaVideoMiniView.getPhotoIV().getLayoutParams().width = a17.getWidth();
        finderMegaVideoMiniView.getPhotoIV().getLayoutParams().height = a17.getHeight();
        finderMegaVideoMiniView.getPhotoIV().requestLayout();
    }
}
