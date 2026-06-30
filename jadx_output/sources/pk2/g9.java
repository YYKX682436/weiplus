package pk2;

/* loaded from: classes3.dex */
public final class g9 implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.j9 f355788b;

    public g9(pk2.o9 o9Var, pk2.j9 j9Var) {
        this.f355787a = o9Var;
        this.f355788b = j9Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        pk2.o9 o9Var = this.f355787a;
        qo0.c.a(o9Var.f356080e, qo0.b.f365335c3, null, 2, null);
        pk2.j9 j9Var = this.f355788b;
        j9Var.f355888d = null;
        qk2.f fVar = o9Var.f356086h;
        if (fVar != null) {
            fVar.d();
        }
        j9Var.f355889e = null;
        j9Var.f355890f = false;
    }
}
