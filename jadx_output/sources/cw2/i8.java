package cw2;

/* loaded from: classes2.dex */
public final class i8 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f223774a;

    public i8(java.lang.ref.WeakReference weakVideoLayout) {
        kotlin.jvm.internal.o.g(weakVideoLayout, "weakVideoLayout");
        this.f223774a = weakVideoLayout;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.widget.ImageView thumbView;
        android.widget.ImageView thumbView2;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) this.f223774a.get();
        if (finderVideoLayout != null) {
            if (bitmap != null) {
                java.lang.String fTPPTag = finderVideoLayout.getFTPPTag();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[convert] mediaId=");
                cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
                sb6.append(playInfo != null ? playInfo.f223746b : null);
                sb6.append(" thumb[");
                sb6.append(bitmap.getWidth());
                sb6.append(':');
                sb6.append(bitmap.getHeight());
                sb6.append("] view[");
                thumbView = finderVideoLayout.getThumbView();
                sb6.append(thumbView.getWidth());
                sb6.append(':');
                thumbView2 = finderVideoLayout.getThumbView();
                sb6.append(thumbView2.getHeight());
                sb6.append("] size=");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.f0(bitmap.getAllocationByteCount()));
                sb6.append(' ');
                com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("Finder.VideoLayout", "thumb load completer,but video layout is null!");
    }
}
