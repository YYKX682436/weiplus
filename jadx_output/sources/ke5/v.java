package ke5;

/* loaded from: classes9.dex */
public class v implements he5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke5.x f307133a;

    public v(ke5.x xVar) {
        this.f307133a = xVar;
    }

    public boolean a(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2) {
        ke5.x xVar = this.f307133a;
        yb5.d dVar = xVar.f307041b;
        if (dVar == null || dVar.f460708c.a(sb5.g0.class) == null) {
            return false;
        }
        com.tencent.mm.ui.chatting.component.n7 n7Var = (com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) xVar.f307041b.f460708c.a(sb5.g0.class));
        n7Var.getClass();
        java.lang.String str = xVar.f307042c;
        if (!(com.tencent.mm.sdk.platformtools.t8.K0(str) ? false : com.tencent.mm.storage.z3.j4(str))) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "checkIfNeedGroupMsg");
        n7Var.r0();
        return n7Var.m0(f9Var, f9Var2);
    }
}
