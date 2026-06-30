package lm3;

/* loaded from: classes10.dex */
public final class t implements com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm3.e f319508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f319509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f319510c;

    public t(lm3.e eVar, lm3.b0 b0Var, in5.s0 s0Var) {
        this.f319508a = eVar;
        this.f319509b = b0Var;
        this.f319510c = s0Var;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback
    public void a(int i17, java.util.List data, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        lm3.e eVar = this.f319508a;
        eVar.f319482d.f264133m = i17;
        this.f319509b.q(this.f319510c, eVar);
    }
}
