package qy0;

/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f367610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f367611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy0.h0 f367612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f367613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0.v2 v2Var, boolean z17, qy0.h0 h0Var, n0.v2 v2Var2) {
        super(0);
        this.f367610d = v2Var;
        this.f367611e = z17;
        this.f367612f = h0Var;
        this.f367613g = v2Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f367613g.setValue(qy0.a.f367553e);
        this.f367610d.setValue(java.lang.Boolean.valueOf(!this.f367611e));
        qy0.t tVar = (qy0.t) this.f367612f;
        qy0.d0 d0Var = tVar.f367647a;
        if (d0Var.W6().f69770f) {
            dy1.a.b(tVar.f367648b, "view_clk", kz5.c1.k(new jz5.l("view_id", "edit_page_music_button"), new jz5.l("post_scene", 1), new jz5.l("editid", d0Var.f367576r), new jz5.l("comment_scene", 132), new jz5.l("behaviour_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri())), kz5.b0.c(25496), false, true);
        }
        return jz5.f0.f302826a;
    }
}
