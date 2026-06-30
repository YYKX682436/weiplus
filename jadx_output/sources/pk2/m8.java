package pk2;

/* loaded from: classes3.dex */
public final class m8 implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356015b;

    public m8(pk2.d9 d9Var, pk2.o9 o9Var) {
        this.f356014a = d9Var;
        this.f356015b = o9Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        this.f356014a.f355674q = null;
        qk2.f fVar = this.f356015b.f356086h;
        if (fVar != null) {
            fVar.d();
        }
    }
}
