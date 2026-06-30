package tm2;

/* loaded from: classes3.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420550d;

    public m2(tm2.s2 s2Var) {
        this.f420550d = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var;
        tm2.s2 s2Var = this.f420550d;
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = s2Var.f420597l;
        if (khVar == null || (view = khVar.f113249w) == null || (de0Var = s2Var.f420613x) == null) {
            return;
        }
        de0Var.f112283x = view;
        de0Var.x1(view);
    }
}
