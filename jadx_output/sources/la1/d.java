package la1;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final la1.d f317494d = new la1.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.magicbrush.ui.MagicBrushView it = (com.tencent.magicbrush.ui.MagicBrushView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "InsertVideoPlayer, info: change viewType to TextureView");
        if (it.getViewType() != gh.y.TextureView) {
            it.setRendererView(new qa1.s(it.getContext()));
            it.setOpaque(false);
        }
        return jz5.f0.f302826a;
    }
}
