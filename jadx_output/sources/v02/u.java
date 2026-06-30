package v02;

/* loaded from: classes8.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f432286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v02.f0 f0Var, java.util.List list) {
        super(0);
        this.f432285d = f0Var;
        this.f432286e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("same_file_link_chatname", kz5.n0.g0(this.f432286e, "#", null, null, 0, null, null, 62, null)), new jz5.l("exp_chat_cnt", java.lang.Integer.valueOf(this.f432286e.size())), new jz5.l("doc_half_screen_sessionid", java.util.UUID.randomUUID().toString()));
        v02.f0 f0Var = this.f432285d;
        f0Var.hj(k17);
        ((cy1.a) f0Var.rj()).Hj("doc_details_half_screen_exp", "view_exp", f0Var.f432248m, 36223);
        return jz5.f0.f302826a;
    }
}
