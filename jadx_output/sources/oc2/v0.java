package oc2;

/* loaded from: classes8.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f344288e;

    public v0(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, long j17) {
        this.f344287d = renderView;
        this.f344288e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = this.f344287d;
        java.lang.String h17 = renderView.h();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setRenderNodes](");
        sb6.append(renderView.hashCode());
        sb6.append(") ");
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo = renderView.getCtrlInfo();
        sb6.append(ctrlInfo != null ? ctrlInfo.field_tips_uuid : null);
        sb6.append(" path=");
        r45.f03 showInfo = renderView.getShowInfo();
        sb6.append(showInfo != null ? showInfo.f373892i : null);
        sb6.append(" render cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f344288e);
        sb6.append("ms maxWidth=");
        sb6.append(renderView.getWidth());
        sb6.append(" textMaxWidth=");
        android.widget.TextView textView = (android.widget.TextView) renderView.findViewById(com.tencent.mm.R.id.f484136d52);
        sb6.append(textView != null ? java.lang.Integer.valueOf(textView.getMaxWidth()) : null);
        com.tencent.mars.xlog.Log.i(h17, sb6.toString());
    }
}
