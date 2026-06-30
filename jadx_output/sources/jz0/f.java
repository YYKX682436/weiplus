package jz0;

/* loaded from: classes5.dex */
public final class f implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.k f302572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s4 f302573e;

    public f(jz0.k kVar, com.tencent.mm.ui.tools.s4 s4Var) {
        this.f302572d = kVar;
        this.f302573e = s4Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        jz0.k kVar = this.f302572d;
        kVar.P6().getViewTreeObserver().removeOnPreDrawListener(this);
        this.f302573e.c(kVar.P6(), kVar.O6(), new jz0.e(kVar));
        return true;
    }
}
