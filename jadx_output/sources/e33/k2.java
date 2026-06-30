package e33;

/* loaded from: classes10.dex */
public class k2 implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.u2 f247303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f247304e;

    public k2(e33.v2 v2Var, e33.u2 u2Var) {
        this.f247304e = v2Var;
        this.f247303d = u2Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        e33.v2 v2Var = this.f247304e;
        e33.u2 u2Var = this.f247303d;
        v2Var.o(u2Var);
        u2Var.f247488f.stop();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        this.f247304e.o(this.f247303d);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        e33.u2 u2Var = this.f247303d;
        u2Var.f247488f.start();
        e33.v2 v2Var = this.f247304e;
        v2Var.getClass();
        u2Var.f247488f.setVisibility(0);
        u2Var.f247486d.setVisibility(8);
        u2Var.f247485c.setVisibility(8);
        u2Var.f247484b.setVisibility(8);
        android.os.Handler handler = v2Var.f247514y;
        handler.sendMessageDelayed(handler.obtainMessage(1, u2Var), 500L);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
