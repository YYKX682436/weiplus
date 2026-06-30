package ow0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.a0 f349354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f349355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ow0.a0 a0Var, float f17) {
        super(0);
        this.f349354d = a0Var;
        this.f349355e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView o76 = this.f349354d.o7();
        if (o76 != null) {
            o76.c(this.f349355e);
        }
        return jz5.f0.f302826a;
    }
}
