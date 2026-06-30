package pk2;

/* loaded from: classes3.dex */
public final class k8 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f355922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355923e;

    public k8(pk2.d9 d9Var, pk2.o9 o9Var) {
        this.f355922d = d9Var;
        this.f355923e = o9Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        this.f355922d.f355661d = null;
        qk2.f fVar = this.f355923e.f356086h;
        if (fVar != null) {
            fVar.d();
        }
    }
}
