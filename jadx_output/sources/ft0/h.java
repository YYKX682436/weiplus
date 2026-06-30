package ft0;

/* loaded from: classes14.dex */
public final class h extends ft0.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(et0.r view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // ft0.d
    public void i(ms0.c renderer) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        super.i(renderer);
        renderer.f330961q = new ft0.g(renderer, this);
        com.tencent.mars.xlog.Log.i(this.f266461b, "setPreviewRenderer: " + renderer.hashCode());
    }
}
