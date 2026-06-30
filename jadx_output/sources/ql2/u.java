package ql2;

/* loaded from: classes10.dex */
public final class u extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public int f364557c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f364558d;

    /* renamed from: e, reason: collision with root package name */
    public r45.g92 f364559e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.e0 f364560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ql2.v f364561g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, ql2.v vVar) {
        super(str);
        this.f364561g = vVar;
        this.f364557c = 1;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(context, "context");
        pj4.e0 e0Var = this.f364560f;
        if (e0Var == null || !kotlin.jvm.internal.o.b(this.f21074b.f355139d, "18")) {
            return false;
        }
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(11, 8, 65);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3.f435921a.i(0, new android.content.Intent(), e0Var.f355027d, pm0.v.Z(e0Var.f355030g), e0Var.f355029f, Gj, "");
        return true;
    }

    @Override // bi4.o0
    public java.lang.CharSequence i() {
        r45.g92 g92Var = this.f364559e;
        java.lang.String string = g92Var != null ? g92Var.getString(4) : null;
        return string == null ? "" : string;
    }

    @Override // bi4.o0
    public boolean j() {
        return true;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        super.m(str, j0Var);
        if (j0Var == null) {
            return;
        }
        if (!kotlin.jvm.internal.o.b(j0Var.f355139d, "18")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Finder3rdLiveStatusService", "jumpInfo type check fail,type:" + j0Var.f355139d);
            return;
        }
        byte[] decode = android.util.Base64.decode(j0Var.f355142g, 0);
        pj4.e0 e0Var = new pj4.e0();
        e0Var.parseFrom(decode);
        this.f364560f = e0Var;
        ql2.v vVar = this.f364561g;
        if (vVar.f364563e.containsKey(e0Var.f355030g)) {
            this.f364559e = (r45.g92) vVar.f364563e.get(e0Var.f355030g);
            r();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder3rdLiveStatusService", "start cgi to get finderinfo,live id:" + e0Var.f355030g);
        i95.m c17 = i95.n0.c(m40.h0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        m40.h0 h0Var = (m40.h0) c17;
        java.lang.String str2 = e0Var.f355028e;
        java.lang.String username = e0Var.f355029f;
        kotlin.jvm.internal.o.f(username, "username");
        java.lang.String export_id = e0Var.f355027d;
        kotlin.jvm.internal.o.f(export_id, "export_id");
        m40.h0.ci(h0Var, 0L, str2, 65, 2, username, true, null, null, 0L, null, false, false, export_id, null, 0, null, 53184, null).l().h(new ql2.t(e0Var, vVar, this));
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        r();
        android.widget.ImageView imageView = new android.widget.ImageView(container.getContext());
        s(imageView);
        container.addView(imageView);
        container.setVisibility(0);
        this.f364558d = new java.lang.ref.WeakReference(imageView);
        return true;
    }

    public final void r() {
        java.lang.String string;
        r45.g92 g92Var = this.f364559e;
        if (g92Var == null || (string = g92Var.getString(0)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, com.tencent.mm.sdk.platformtools.t8.E1(string), false, null, new ql2.s(this), 0, null, null, null, 246, null);
    }

    public final void s(android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable;
        if (this.f364557c == 2) {
            drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.finder_live_icon);
            com.tencent.mm.ui.uk.f(drawable, -1);
        } else {
            drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.finder_live_icon);
        }
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
