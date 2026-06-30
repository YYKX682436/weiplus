package gg1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.l f271612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg1.w f271613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg1.p f271614f;

    public o(gg1.l lVar, gg1.w wVar, gg1.p pVar) {
        this.f271612d = lVar;
        this.f271613e = wVar;
        this.f271614f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.l lVar = this.f271612d;
        lVar.f271599e.setVisibility(8);
        android.widget.TextView textView = lVar.f271598d;
        gg1.w wVar = this.f271613e;
        boolean a17 = gg1.w.a(wVar);
        gg1.p pVar = this.f271614f;
        textView.setText(a17 ? pVar.y(com.tencent.mm.R.string.f490340s9) : wVar.f271635e.f271591d.isEmpty() ? pVar.y(com.tencent.mm.R.string.f490338s7) : pVar.y(com.tencent.mm.R.string.f490337s6));
    }
}
