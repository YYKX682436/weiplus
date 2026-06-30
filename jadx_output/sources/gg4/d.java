package gg4;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg4.i f271742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gg4.i iVar) {
        super(0);
        this.f271742d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        gg4.i iVar = this.f271742d;
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(new jz5.l("key_report_session_id", iVar.O6()), new jz5.l("view_id", "friends_add_button")), 33926);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(iVar.getActivity());
        cy1.a aVar2 = (cy1.a) aVar.ak(iVar.getActivity(), iy1.c.AddFriendsPage);
        aVar2.dk(iVar.getActivity(), "AddFriendsPage");
        aVar2.fk(iVar.getActivity(), "add_friends_sessionid", iVar.O6());
        aVar2.Wj(iVar.getActivity(), "page_in", "", "");
        aVar2.ik(iVar.getActivity(), 4, 33926);
        return jz5.f0.f302826a;
    }
}
