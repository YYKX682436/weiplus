package ju5;

/* loaded from: classes15.dex */
public class y extends xt5.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.Signature f302165a;

    /* renamed from: b, reason: collision with root package name */
    public long f302166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju5.z f302167c;

    public y(ju5.z zVar, java.security.Signature signature, ju5.p pVar) {
        this.f302167c = zVar;
        this.f302165a = null;
        this.f302165a = signature;
    }

    @Override // xt5.c
    public void a() {
        zt5.h.c("Soter.TaskAuthentication", "soter: called onAuthenticationCancelled", new java.lang.Object[0]);
        ju5.z zVar = this.f302167c;
        if (zVar.f302176k) {
            zt5.h.e("Soter.TaskAuthentication", "soter: during ignore cancel period", new java.lang.Object[0]);
            return;
        }
        ju5.o.a().b(new ju5.x(this));
        zVar.b(new eu5.a(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST, "user cancelled authentication"));
        zVar.getClass();
    }

    @Override // xt5.c
    public void b(int i17, java.lang.CharSequence charSequence) {
        zt5.h.b("Soter.TaskAuthentication", "soter: on authentication fatal error: %d, %s", java.lang.Integer.valueOf(i17), charSequence);
        ju5.z zVar = this.f302167c;
        if (i17 != 10308) {
            ju5.o.a().b(new ju5.s(this, i17, charSequence));
            zVar.b(new eu5.a(1016, charSequence != null ? charSequence.toString() : "unknown error"));
        } else {
            zVar.b(new eu5.a(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER, charSequence != null ? charSequence.toString() : "unknown error"));
        }
        zVar.getClass();
        zt5.i.a(401, "on authentication fatal error: " + i17 + " " + ((java.lang.Object) charSequence));
    }

    @Override // xt5.c
    public void c() {
        zt5.h.f("Soter.TaskAuthentication", "soter: authentication failed once", new java.lang.Object[0]);
        ju5.o.a().b(new ju5.w(this));
        this.f302167c.getClass();
    }

    @Override // xt5.c
    public void d(int i17, java.lang.CharSequence charSequence) {
        zt5.h.f("Soter.TaskAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", java.lang.Integer.valueOf(i17), charSequence);
        ju5.o.a().b(new ju5.t(this, i17, charSequence));
    }

    @Override // xt5.c
    public void e(xt5.d dVar) {
        zt5.h.c("Soter.TaskAuthentication", "soter: authentication succeed. start sign and upload upload signature", new java.lang.Object[0]);
        ju5.o.a().c(new ju5.u(this));
        ju5.o.a().b(new ju5.v(this));
        this.f302167c.getClass();
    }
}
