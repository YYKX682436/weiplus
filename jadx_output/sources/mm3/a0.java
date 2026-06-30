package mm3;

/* loaded from: classes10.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.m implements yz5.l {
    public a0(java.lang.Object obj) {
        super(1, obj, mm3.n.class, "onVideoProgressUpdate", "onVideoProgressUpdate(J)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = ((mm3.n) this.receiver).f329653d;
        if (mvTracksEditView != null) {
            mvTracksEditView.setVideoProgress(longValue);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("tracksEditView");
        throw null;
    }
}
