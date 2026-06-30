package vx2;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx2.k f441239d;

    public d(vx2.k kVar) {
        this.f441239d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$attachFastSeek$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vx2.k kVar = this.f441239d;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = kVar.f441253e;
        if (finderThumbPlayerProxy != null) {
            long currentPlayMs = finderThumbPlayerProxy.getCurrentPlayMs();
            vx2.k.b(kVar, currentPlayMs, currentPlayMs < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT ? 0L : currentPlayMs - 10000, finderThumbPlayerProxy.getVideoDurationMs());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$attachFastSeek$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
