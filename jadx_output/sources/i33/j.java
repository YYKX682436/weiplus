package i33;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.u f288203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i33.u uVar) {
        super(0);
        this.f288203d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xm3.t0 t0Var = new xm3.t0((com.tencent.mm.plugin.gallery.ui.mvvm.AlbumFilePreviewLiveList) ((jz5.n) this.f288203d.f288270f).getValue(), new in5.s() { // from class: com.tencent.mm.plugin.gallery.ui.uic.AlbumFilePreviewUIC$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new h33.d();
            }
        }, false, 4, null);
        t0Var.setHasStableIds(true);
        return t0Var;
    }
}
