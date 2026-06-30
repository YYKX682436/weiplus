package mk4;

/* loaded from: classes14.dex */
public final class d implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender f327146d;

    public d(com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender mMSurfaceViewRender) {
        this.f327146d = mMSurfaceViewRender;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender mMSurfaceViewRender = this.f327146d;
        com.tencent.mars.xlog.Log.i(mMSurfaceViewRender.getLogTag(), "surfaceChanged format:" + i17 + " [" + i18 + ' ' + i19 + "] listener:" + mMSurfaceViewRender.f174496e);
        mk4.a aVar = mMSurfaceViewRender.f174496e;
        if (aVar != null) {
            aVar.b(holder, i18, i19);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender mMSurfaceViewRender = this.f327146d;
        com.tencent.mars.xlog.Log.i(mMSurfaceViewRender.getLogTag(), "surfaceCreated listener:" + mMSurfaceViewRender.f174496e);
        mMSurfaceViewRender.f174502n = holder.getSurface();
        mk4.a aVar = mMSurfaceViewRender.f174496e;
        if (aVar != null) {
            aVar.c(holder, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender mMSurfaceViewRender = this.f327146d;
        com.tencent.mars.xlog.Log.i(mMSurfaceViewRender.getLogTag(), "surfaceDestroy listener:" + mMSurfaceViewRender.f174496e);
        mk4.a aVar = mMSurfaceViewRender.f174496e;
        if (aVar != null) {
            aVar.a(holder);
        }
    }
}
