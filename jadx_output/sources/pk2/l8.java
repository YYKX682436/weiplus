package pk2;

/* loaded from: classes3.dex */
public final class l8 implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f355962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355963b;

    public l8(pk2.d9 d9Var, pk2.o9 o9Var) {
        this.f355962a = d9Var;
        this.f355963b = o9Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        this.f355962a.f355662e = null;
        qk2.f fVar = this.f355963b.f356086h;
        if (fVar != null) {
            fVar.d();
        }
    }
}
