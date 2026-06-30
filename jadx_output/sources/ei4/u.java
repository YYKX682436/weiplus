package ei4;

/* loaded from: classes9.dex */
public final class u implements bi4.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei4.v f253243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hi4.e f253245c;

    public u(ei4.v vVar, android.content.Context context, hi4.e eVar) {
        this.f253243a = vVar;
        this.f253244b = context;
        this.f253245c = eVar;
    }

    @Override // bi4.v0
    public final void a(boolean z17, java.util.List list) {
        ei4.v vVar = this.f253243a;
        android.content.Context context = this.f253244b;
        if (z17) {
            kotlin.jvm.internal.o.f(context, "$context");
            vVar.getClass();
            if (list != null && (!list.isEmpty())) {
                pj4.j jVar = (pj4.j) kz5.n0.X(list);
                ai4.m0 m0Var = ai4.m0.f5173a;
                hi4.e eVar = this.f253245c;
                mj4.h M = m0Var.M(eVar.field_session_id);
                hi4.k kVar = hi4.m.f281555f;
                if (M == null) {
                    new mi4.h(context, null, eVar, false, 10, null).C();
                    java.lang.String field_session_id = eVar.field_session_id;
                    kotlin.jvm.internal.o.f(field_session_id, "field_session_id");
                    kVar.d(field_session_id, 104);
                } else {
                    ki4.g0.f308132a.b(context, jVar.f355127f, "greeting", eVar);
                    java.lang.String field_session_id2 = eVar.field_session_id;
                    kotlin.jvm.internal.o.f(field_session_id2, "field_session_id");
                    kVar.d(field_session_id2, 103);
                }
            }
        } else {
            db5.e1.s(context, context.getString(com.tencent.mm.R.string.msg_net_error), "");
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = vVar.f253246d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
