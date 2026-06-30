package mi4;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi4.h f326781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.w f326782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mi4.h hVar, mj4.w wVar, android.content.Context context) {
        super(1);
        this.f326781d = hVar;
        this.f326782e = wVar;
        this.f326783f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f326781d.L;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        android.content.Context context = this.f326783f;
        if (booleanValue) {
            mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(this.f326782e.field_sessionId);
            if (Ai != null) {
                Ai.field_canTalk = 1;
                ni4.x.f337776d.n().update(Ai, new java.lang.String[0]);
            }
            db5.t7.f(context, context.getString(com.tencent.mm.R.string.jvz), new mi4.e(context));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHalfBottomDialog", "greeting reply failed");
            db5.e1.s(context, context.getString(com.tencent.mm.R.string.msg_net_error), "");
        }
        return jz5.f0.f302826a;
    }
}
