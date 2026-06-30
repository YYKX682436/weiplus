package op;

/* loaded from: classes11.dex */
public class c extends op.a {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f347222f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f347223g = new op.b(this);

    public c(boolean z17) {
        this.f347219d = z17;
    }

    public void a(xg3.q0 q0Var) {
        if (this.f347219d) {
            this.f347222f = new l41.c0(q0Var);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(q0Var);
        this.f347222f = new e21.k(linkedList);
    }

    public void b(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (this.f347222f == null) {
            return;
        }
        this.f347220e = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
        com.tencent.mm.modelbase.m1 m1Var = this.f347222f;
        if (m1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncOpLogCallbackFactory", "request scene %s", m1Var);
        if (this.f347220e != null || !((java.util.ArrayList) this.f347216a).isEmpty() || !((java.util.ArrayList) this.f347217b).isEmpty() || !((java.util.ArrayList) this.f347218c).isEmpty()) {
            gm0.j1.i();
            gm0.j1.n().f273288b.a(this.f347222f.getType(), this.f347223g);
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(this.f347222f);
    }
}
