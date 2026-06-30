package rg5;

/* loaded from: classes2.dex */
public final class n extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rg5.o f395260a;

    public n(rg5.o oVar) {
        this.f395260a = oVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        rg5.o oVar = this.f395260a;
        if (!z17) {
            oVar.f395272l = "";
            return;
        }
        ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Ai("expose");
        rg5.g[] gVarArr = rg5.g.f395253d;
        oVar.h(1);
    }
}
