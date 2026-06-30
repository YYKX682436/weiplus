package sj3;

/* loaded from: classes14.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f408655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408656e;

    public n4(sj3.a5 a5Var, boolean z17) {
        this.f408656e = a5Var;
        this.f408655d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.a5 a5Var = this.f408656e;
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = a5Var.f408436z;
        boolean z17 = this.f408655d;
        multiTalkControlIconLayout.setChecked(!z17);
        com.tencent.mm.plugin.multitalk.model.j jVar = a5Var.f408420g;
        jVar.getClass();
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        sj3.j g17 = jVar.g(r17);
        if (g17 != null) {
            if (!(g17.f408577d != null)) {
                g17 = null;
            }
            if (g17 != null) {
                g17.o(z17 ? 0 : 8);
            }
        }
    }
}
