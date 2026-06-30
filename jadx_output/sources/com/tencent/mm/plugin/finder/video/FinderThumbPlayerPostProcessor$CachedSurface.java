package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/finder/video/FinderThumbPlayerPostProcessor$CachedSurface", "Landroid/view/Surface;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FinderThumbPlayerPostProcessor$CachedSurface extends android.view.Surface {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderThumbPlayerPostProcessor$CachedSurface(android.graphics.SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
    }

    public final void a() {
        super.release();
        toString();
    }

    @Override // android.view.Surface
    public void release() {
        toString();
    }
}
