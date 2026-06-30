package qt2;

/* loaded from: classes2.dex */
public final class o extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qt2.u f366605a;

    public o(qt2.u uVar) {
        this.f366605a = uVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            return;
        }
        qt2.u uVar = this.f366605a;
        wu5.c cVar = uVar.f366622r;
        if (cVar != null) {
            cVar.cancel(false);
        }
        uVar.f366622r = null;
    }
}
