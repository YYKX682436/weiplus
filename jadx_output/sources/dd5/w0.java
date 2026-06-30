package dd5;

/* loaded from: classes9.dex */
public final class w0 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.w0 f229323p = new dd5.w0();

    public w0() {
        super(dd5.z0.f229353b.f426539a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.y0 y0Var = (dd5.y0) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (y0Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        z(d17, context, y0Var.f229340a);
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        z(b17, context, y0Var.f229343d);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView c17 = binding.c();
        kotlin.jvm.internal.o.f(c17, "getIconIv(...)");
        a17.c(y0Var.f229341b, c17, g1Var.h(mn2.f1.f329962p));
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.y0 y0Var = (dd5.y0) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (y0Var == null) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = y0Var.f229344e;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        x05.c cVar = (x05.c) bVar.getCustom(bVar.f432315e + 57);
        if (cVar == null) {
            return;
        }
        java.lang.String username = cVar.getUsername();
        if (username == null || r26.n0.N(username)) {
            return;
        }
        boolean R4 = com.tencent.mm.storage.z3.R4(f9Var.Q0());
        android.content.Intent intent = new android.content.Intent();
        if (R4) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(R4 ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_from_comment_scene", 11);
        intent.putExtra("from_user", f9Var.Q0());
        intent.putExtra("key_to_user_name", f9Var.Q0());
        intent.putExtra("finder_username", cVar.getUsername());
        intent.putExtra("key_ec_source", cVar.n());
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", cVar.getNickname());
        intent.putExtra("key_finder_teen_mode_user_id", cVar.getUsername());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(context, intent);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String U1 = f9Var.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        x05.c cVar = (x05.c) bVar.getCustom(bVar.f432315e + 57);
        if (cVar == null) {
            return null;
        }
        java.lang.String nickname = cVar.getNickname();
        java.lang.String str = nickname == null ? "" : nickname;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        mn2.h3 e17 = ya2.l.f460502a.e(cVar.l(), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        java.lang.String username = cVar.getUsername();
        java.lang.String str2 = username == null ? "" : username;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490438v1);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return new dd5.y0(str, e17, str2, r26.n0.a0(string, "[", "]"), f9Var);
    }
}
