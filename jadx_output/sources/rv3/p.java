package rv3;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView f400408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView f400409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView, com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView2) {
        super(1);
        this.f400408d = musicLrcView;
        this.f400409e = musicLrcView2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView view = (com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView) obj;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView = this.f400408d;
        int a17 = musicLrcView.a();
        int i17 = a17 - ((musicLrcView.f156061h * 3) / 4);
        int i18 = musicLrcView.rndDuration;
        int i19 = (int) ((i18 * i17) / a17);
        if (i19 > 0) {
            i18 = i19;
        }
        float f17 = i17 / i18;
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView2 = this.f400409e;
        view.setRndDuration((int) ((musicLrcView2.a() - ((musicLrcView2.f156061h * 3) / 4)) / f17));
        return jz5.f0.f302826a;
    }
}
