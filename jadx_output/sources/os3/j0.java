package os3;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.k0 f348111d;

    public j0(os3.k0 k0Var) {
        this.f348111d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.k0 k0Var = this.f348111d;
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = k0Var.f348131e.f348140a;
        java.util.List list = com.tencent.mm.plugin.qqmail.ui.ComposeUI.f154830p1;
        composeUI.V6();
        k0Var.f348130d.requestFocus();
        k0Var.f348131e.f348140a.showVKB();
    }
}
