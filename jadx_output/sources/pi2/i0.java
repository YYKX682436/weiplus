package pi2;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f354783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pi2.q0 q0Var) {
        super(2);
        this.f354783d = q0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.jf5 breakConfig = (r45.jf5) obj;
        java.lang.String text = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(breakConfig, "breakConfig");
        kotlin.jvm.internal.o.g(text, "text");
        this.f354783d.g0(breakConfig, text);
        com.tencent.mm.plugin.finder.live.widget.e0.W(this.f354783d, null, false, 0, 7, null);
        return jz5.f0.f302826a;
    }
}
