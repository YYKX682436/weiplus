package os3;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.i0 f348092d;

    public h0(os3.i0 i0Var) {
        this.f348092d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.i0 i0Var = this.f348092d;
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = i0Var.f348105e.f348140a;
        java.util.List list = com.tencent.mm.plugin.qqmail.ui.ComposeUI.f154830p1;
        composeUI.V6();
        i0Var.f348104d.requestFocus();
        i0Var.f348105e.f348140a.showVKB();
    }
}
