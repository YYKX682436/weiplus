package we5;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f445302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f445304g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(yb5.d dVar, int i17, kotlin.jvm.internal.h0 h0Var, boolean z17) {
        super(1);
        this.f445301d = dVar;
        this.f445302e = i17;
        this.f445303f = h0Var;
        this.f445304g = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f445303f.f310123d;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = it.f203379b;
        int i17 = this.f445302e;
        boolean z17 = this.f445304g;
        com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) mMNeat7extView.getTag();
        com.tencent.mm.ui.chatting.viewitems.a0.p(i17, charSequence, mMNeat7extView, z17, goVar != null ? goVar.c() : null, new com.tencent.mm.ui.chatting.viewitems.en(this.f445301d, goVar));
        return jz5.f0.f302826a;
    }
}
