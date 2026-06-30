package pa2;

/* loaded from: classes2.dex */
public final class g extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public r45.r03 f352976c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f352977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity, r45.r03 r03Var) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f352976c = r03Var;
        this.f352977d = jz5.h.b(new pa2.f(this));
    }

    public final java.lang.String A() {
        java.lang.String string = this.f434158a.getResources().getString(com.tencent.mm.R.string.f8i, com.tencent.mm.plugin.finder.assist.w2.o((int) z(), false));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String B() {
        r45.rz6 rz6Var;
        r45.r23 D = D();
        java.lang.String str = (D == null || (rz6Var = (r45.rz6) D.getCustom(1)) == null) ? null : rz6Var.f385320d;
        return str == null ? "" : str;
    }

    public final r45.ub4 C() {
        r45.rz6 rz6Var;
        r45.ub4 ub4Var = new r45.ub4();
        r45.r03 r03Var = this.f352976c;
        int i17 = 0;
        ub4Var.set(0, pm0.v.u(r03Var != null ? r03Var.getLong(1) : 0L));
        r45.r23 D = D();
        if (D != null && (rz6Var = (r45.rz6) D.getCustom(1)) != null) {
            i17 = rz6Var.f385321e;
        }
        ub4Var.set(1, java.lang.Integer.valueOf(i17));
        return ub4Var;
    }

    public final r45.r23 D() {
        return (r45.r23) ((jz5.n) this.f352977d).getValue();
    }

    public final java.lang.String E() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 D = D();
        java.lang.String str = (D == null || (rz6Var = (r45.rz6) D.getCustom(1)) == null || (b70Var = rz6Var.f385323g) == null) ? null : b70Var.f370582d;
        return str == null ? "" : str;
    }

    @Override // v92.g
    public boolean f() {
        return B().length() == 0;
    }

    @Override // v92.g
    public boolean g() {
        return B().length() == 0;
    }

    @Override // v92.g
    public void h() {
        bd2.b bVar = bd2.b.f19244a;
        java.lang.String B = B();
        androidx.appcompat.app.AppCompatActivity context = this.f434158a;
        kotlin.jvm.internal.o.g(context, "context");
        bVar.l(context, bVar.h(context, com.tencent.thumbplayer.tmediacodec.codec.CodecError.RELEASEOUTPUTBUFFER_ILLEGAL, kz5.b1.e(new jz5.l("template_id", B))), false, null);
    }

    @Override // v92.g
    public void i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doUnpublish templateId:");
        sb6.append(B());
        sb6.append(" topicName:");
        sb6.append(E());
        sb6.append(" topicId:");
        r45.r03 r03Var = this.f352976c;
        sb6.append(r03Var != null ? new jz5.x(r03Var.getLong(1)) : null);
        com.tencent.mars.xlog.Log.i("FinderTemplateShareHandler", sb6.toString());
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) appCompatActivity, 1, true);
        java.lang.String string = appCompatActivity.getResources().getString(com.tencent.mm.R.string.p5p);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        k0Var.q(string, 17);
        k0Var.f211872n = new pa2.a(this);
        k0Var.f211881s = new pa2.b(this);
        k0Var.v();
    }

    @Override // v92.g
    public boolean o() {
        return this.f434158a.getIntent().getBooleanExtra("key_is_user_self", false);
    }

    @Override // v92.g
    public boolean p() {
        r45.r23 D = D();
        if (((D != null ? D.getInteger(5) : 0) & 1) == 0) {
            if (!(B().length() == 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // v92.g
    public void r() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToConversation templateId:");
        sb6.append(B());
        sb6.append(" topicName:");
        sb6.append(E());
        sb6.append(" topicId:");
        r45.r03 r03Var = this.f352976c;
        java.lang.String str = null;
        sb6.append(r03Var != null ? new jz5.x(r03Var.getLong(1)) : null);
        com.tencent.mars.xlog.Log.i("FinderTemplateShareHandler", sb6.toString());
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) appCompatActivity;
        java.lang.String E = E();
        long z17 = z();
        r45.r23 D = D();
        if (D != null && (rz6Var = (r45.rz6) D.getCustom(1)) != null && (b70Var = rz6Var.f385323g) != null) {
            str = b70Var.f370585g;
        }
        com.tencent.mm.plugin.finder.assist.n7.J(n7Var, mMActivity, E, 18, z17, str == null ? "" : str, A(), null, 195, null, null, null, C(), 1792, null);
    }

    @Override // v92.g
    public void t() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToSnsTimeLine templateId:");
        sb6.append(B());
        sb6.append(" topicName:");
        sb6.append(E());
        sb6.append(" topicId:");
        r45.r03 r03Var = this.f352976c;
        java.lang.String str = null;
        sb6.append(r03Var != null ? new jz5.x(r03Var.getLong(1)) : null);
        com.tencent.mars.xlog.Log.i("FinderTemplateShareHandler", sb6.toString());
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) appCompatActivity;
        java.lang.String E = E();
        long z17 = z();
        r45.r23 D = D();
        if (D != null && (rz6Var = (r45.rz6) D.getCustom(1)) != null && (b70Var = rz6Var.f385323g) != null) {
            str = b70Var.f370585g;
        }
        com.tencent.mm.plugin.finder.assist.n7.K(n7Var, mMActivity, E, 18, z17, str == null ? "" : str, A(), null, 195, null, null, null, C(), 1792, null);
    }

    @Override // v92.g
    public boolean v() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H8).getValue()).r()).booleanValue();
    }

    @Override // v92.g
    public boolean y() {
        return o();
    }

    public final long z() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 D = D();
        if (D == null || (rz6Var = (r45.rz6) D.getCustom(1)) == null || (b70Var = rz6Var.f385323g) == null) {
            return 0L;
        }
        return b70Var.f370583e;
    }
}
