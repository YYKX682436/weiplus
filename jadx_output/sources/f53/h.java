package f53;

/* loaded from: classes15.dex */
public class h implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f53.n f259653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView f259654b;

    public h(com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView, f53.n nVar) {
        this.f259654b = atSomeoneView;
        this.f259653a = nVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeoneView", "do GetRemindUserListResponse errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        f53.n nVar = this.f259653a;
        if (i17 != 0 || i18 != 0 || oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AtSomeoneView", "cgi request fail");
            if (nVar != null) {
                nVar.getClass();
                return;
            }
            return;
        }
        o33.b bVar = (o33.b) oVar.f70711b.f70700a;
        com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView = this.f259654b;
        ((java.util.LinkedList) atSomeoneView.f139979l2).addAll(bVar.f342726d);
        ((java.util.LinkedList) atSomeoneView.f139980m2).addAll(bVar.f342727e);
        if (bVar.f342729g) {
            atSomeoneView.f139982o2.putByteArray("context", bVar.f342728f.g());
            atSomeoneView.m1(nVar);
        } else {
            atSomeoneView.o1(atSomeoneView.f139979l2, atSomeoneView.f139980m2);
            if (nVar != null) {
                ((f53.c) nVar).a(true);
            }
        }
    }
}
