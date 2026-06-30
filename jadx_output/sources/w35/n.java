package w35;

/* loaded from: classes8.dex */
public final class n implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w35.q f442745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f442746b;

    public n(w35.q qVar, com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        this.f442745a = qVar;
        this.f442746b = wVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.k0 k0Var;
        com.tencent.mm.pluginsdk.model.p3 p3Var = this.f442745a.f442723a.f189319l;
        if (p3Var == null || (k0Var = p3Var.f189406c) == null) {
            return;
        }
        ((kb0.f) k0Var).a(false, this.f442746b);
    }
}
