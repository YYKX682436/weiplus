package fg;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.plugin.appbrand.widget.input.u5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261809a;

    public t(fg.b0 b0Var) {
        this.f261809a = b0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public void a(boolean z17) {
        ((fg.s) this.f261809a.f261743t).a(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public int b() {
        return this.f261809a.f261732i;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public void d(int i17) {
        ((fg.s) this.f261809a.f261743t).d(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public android.app.Activity getActivity() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public android.view.View getContentView() {
        com.tencent.mm.plugin.appbrand.jsapi.t a17;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f261809a.f261727d;
        if (oaVar == null || (a17 = oaVar.a()) == null) {
            return null;
        }
        return a17.getContentView();
    }
}
