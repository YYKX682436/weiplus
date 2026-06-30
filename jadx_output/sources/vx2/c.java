package vx2;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx2.k f441238d;

    public c(vx2.k kVar) {
        this.f441238d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$attachFastSeek$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vx2.k kVar = this.f441238d;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = kVar.f441253e;
        if (finderThumbPlayerProxy != null) {
            long videoDurationMs = finderThumbPlayerProxy.getVideoDurationMs();
            long currentPlayMs = finderThumbPlayerProxy.getCurrentPlayMs();
            vx2.k.b(kVar, currentPlayMs, videoDurationMs - currentPlayMs < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT ? videoDurationMs - 1000 : 10000 + currentPlayMs, videoDurationMs);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/seek/FinderSeekHelper$attachFastSeek$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
