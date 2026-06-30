package pk2;

/* loaded from: classes3.dex */
public final class a3 implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.b3 f355541a;

    public a3(pk2.b3 b3Var) {
        this.f355541a = b3Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        kotlinx.coroutines.r2 r2Var = this.f355541a.f355575i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
