package vh3;

/* loaded from: classes14.dex */
public final class d implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender f437045d;

    public d(com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender mMSurfaceViewRender) {
        this.f437045d = mMSurfaceViewRender;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender mMSurfaceViewRender = this.f437045d;
        com.tencent.mars.xlog.Log.i(mMSurfaceViewRender.getLogTag(), "surfaceChanged format:" + i17 + " [" + i18 + ' ' + i19 + "] listener:" + mMSurfaceViewRender.f148787e);
        vh3.a aVar = mMSurfaceViewRender.f148787e;
        if (aVar != null) {
            ((uh3.a) aVar).t(holder, i18, i19);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender mMSurfaceViewRender = this.f437045d;
        com.tencent.mars.xlog.Log.i(mMSurfaceViewRender.getLogTag(), "surfaceCreated listener:" + mMSurfaceViewRender.f148787e);
        mMSurfaceViewRender.f148795p = holder.getSurface();
        vh3.a aVar = mMSurfaceViewRender.f148787e;
        if (aVar != null) {
            ((uh3.a) aVar).s(holder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender mMSurfaceViewRender = this.f437045d;
        com.tencent.mars.xlog.Log.i(mMSurfaceViewRender.getLogTag(), "surfaceDestroy listener:" + mMSurfaceViewRender.f148787e);
        vh3.a aVar = mMSurfaceViewRender.f148787e;
        if (aVar != null) {
            ((uh3.a) aVar).u(holder);
        }
    }
}
