package fg;

/* loaded from: classes7.dex */
public final class a implements com.tenpay.miniapp.MiniAppSecureEditText.OnPasswdInputListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg.f f261721a;

    public a(fg.f fVar) {
        this.f261721a = fVar;
    }

    @Override // com.tenpay.miniapp.MiniAppSecureEditText.OnPasswdInputListener
    public final void onDone() {
        fg.c listener = this.f261721a.getListener();
        if (listener != null) {
            fg.h0 h0Var = (fg.h0) listener;
            if (h0Var.f261764a.f261775f) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new fg.g0(h0Var.f261764a));
        }
    }
}
