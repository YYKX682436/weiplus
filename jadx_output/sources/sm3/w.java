package sm3;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView f409914d;

    public w(com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView) {
        this.f409914d = mvTracksEditView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = this.f409914d;
        mvTracksEditView.f152011d.D0();
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "stopDragging: " + mvTracksEditView.getDraggingIndex());
        sm3.o oVar = mvTracksEditView.f152014g;
        oVar.notifyItemRangeChanged(0, oVar.getItemCount());
    }
}
