package gx0;

/* loaded from: classes5.dex */
public final class yg implements nv0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f277249d;

    public yg(gx0.bh bhVar) {
        this.f277249d = bhVar;
    }

    @Override // nv0.f
    public void v4(boolean z17, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel, nv0.d stack) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        kotlin.jvm.internal.o.g(stack, "stack");
        gx0.bh bhVar = this.f277249d;
        if (!z17) {
            bhVar.f7(composingPanel.b());
        } else {
            if (!stack.f340428b.isEmpty()) {
                return;
            }
            bhVar.f7(new ou0.x(false));
        }
    }
}
