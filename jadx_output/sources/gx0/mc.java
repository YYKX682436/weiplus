package gx0;

/* loaded from: classes5.dex */
public final class mc extends gx0.gg {

    /* renamed from: t, reason: collision with root package name */
    public ou0.z f276721t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f276722u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276721t = new ou0.w(false);
        this.f276722u = jz5.h.b(new gx0.lc(this));
    }

    @Override // gx0.gg
    public void X6() {
        super.X6();
        d7().L7(false);
        d7().M7(false);
        d7().N7(false);
        jz5.g gVar = this.f276722u;
        this.f276721t = ((gx0.bh) ((jz5.n) gVar).getValue()).B;
        ((gx0.bh) ((jz5.n) gVar).getValue()).f7(new ou0.w(false));
    }

    @Override // gx0.gg
    public void a7() {
        super.a7();
        d7().L7(true);
        d7().M7(true);
        d7().N7(true);
        ((gx0.bh) ((jz5.n) this.f276722u).getValue()).f7(this.f276721t);
    }

    @Override // gx0.gg, nv0.f
    public void v4(boolean z17, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel, nv0.d stack) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        kotlin.jvm.internal.o.g(stack, "stack");
        super.v4(z17, composingPanel, stack);
        if (z17 && !(!stack.f340428b.isEmpty()) && this.f276483s == gx0.jf.f276597f) {
            ((gx0.bh) ((jz5.n) this.f276722u).getValue()).f7(new ou0.w(false));
        }
    }
}
