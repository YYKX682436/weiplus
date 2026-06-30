package z63;

/* loaded from: classes5.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.a1 f470453d;

    public z0(z63.a1 a1Var) {
        this.f470453d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        z63.a1 a1Var = this.f470453d;
        z63.f1 f1Var = a1Var.f470365d;
        f1Var.f470385f.getLocationInWindow(f1Var.f470396q);
        z63.f1 f1Var2 = a1Var.f470365d;
        f1Var2.f470393n = (f1Var2.f470385f.getWidth() - f1Var2.f470384e.getWidth()) - i65.a.b(f1Var2.f470381b, 8);
        f1Var2.f470394o = (f1Var2.f470396q[1] - f1Var2.f470384e.getHeight()) - i65.a.b(f1Var2.f470381b, 8);
        z63.d1 d1Var = f1Var2.f470400u;
        if (d1Var != null) {
            if (!(((com.tencent.mm.pluginsdk.ui.chat.t2) d1Var).f190661a.f189970d2 == 0)) {
                com.tencent.mm.ui.chatting.component.ed edVar = ((com.tencent.mm.pluginsdk.ui.chat.t2) d1Var).f190661a.J2;
                f1Var2.f470394o += edVar != null ? ((com.tencent.mm.ui.chatting.component.ac) edVar).a() : 0;
            }
        }
        f1Var2.f470380a = android.animation.ValueAnimator.ofInt(f1Var2.f470395p, f1Var2.f470394o);
        f1Var2.f470380a.setDuration(175L);
        f1Var2.f470380a.setInterpolator(new y3.b());
        f1Var2.f470380a.addUpdateListener(new z63.y0(this));
        f1Var2.f470380a.start();
        f1Var2.f470395p = f1Var2.f470394o;
    }
}
