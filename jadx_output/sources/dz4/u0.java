package dz4;

/* loaded from: classes12.dex */
public final class u0 implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dz4.v0 f245422a;

    public u0(dz4.v0 v0Var) {
        this.f245422a = v0Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        com.tencent.mars.xlog.Log.i(this.f245422a.f245435b, "handleAddFav: click add tag");
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        favoriteOperationEvent.f54243g.f8528a = 35;
        favoriteOperationEvent.e();
    }
}
