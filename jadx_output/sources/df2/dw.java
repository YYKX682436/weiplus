package df2;

/* loaded from: classes3.dex */
public final class dw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.kw f230004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(df2.kw kwVar) {
        super(0);
        this.f230004d = kwVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = (com.tencent.mm.plugin.finder.live.widget.e30) this.f230004d.R6(com.tencent.mm.plugin.finder.live.widget.e30.class);
        if (e30Var == null) {
            return null;
        }
        android.widget.FrameLayout likeContainer = e30Var.f118215t;
        kotlin.jvm.internal.o.f(likeContainer, "likeContainer");
        return likeContainer;
    }
}
