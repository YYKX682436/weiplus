package rp1;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        super(0);
        this.f398521d = contentFloatBallView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f398521d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new pp1.z(context);
    }
}
