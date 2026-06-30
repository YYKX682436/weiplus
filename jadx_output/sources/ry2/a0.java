package ry2;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ry2.q0 q0Var) {
        super(0);
        this.f401366d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f401366d.f401374d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = (com.tencent.mm.plugin.finder.post.PostMainUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class);
        aw2.m0 m0Var = postMainUIC.f122528t;
        if (m0Var != null) {
            m0Var.b(postMainUIC.f122522p != null, postMainUIC.q7());
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("postOriginWidget");
        throw null;
    }
}
