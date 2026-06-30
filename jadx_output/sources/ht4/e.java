package ht4;

/* loaded from: classes.dex */
public class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.i4 f284958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ECardJsApiCheckEvent f284959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ht4.g f284961g;

    public e(ht4.g gVar, am.i4 i4Var, com.tencent.mm.autogen.events.ECardJsApiCheckEvent eCardJsApiCheckEvent, java.lang.String str) {
        this.f284961g = gVar;
        this.f284958d = i4Var;
        this.f284959e = eCardJsApiCheckEvent;
        this.f284960f = str;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(580, this);
        com.tencent.mm.autogen.events.ECardJsApiCheckEvent eCardJsApiCheckEvent = this.f284959e;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreECard", "jsapi check fail");
            eCardJsApiCheckEvent.f54097h.f7009a = -1;
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.m4) eCardJsApiCheckEvent.f54096g.f6911l).run();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreECard", "jsapi check success");
        h45.y.f278968a = ((ss4.d) m1Var).H();
        android.content.Context context = (android.content.Context) this.f284958d.f6909j.get();
        if (context == null || !(context instanceof android.app.Activity)) {
            eCardJsApiCheckEvent.f54097h.f7009a = -1;
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.m4) eCardJsApiCheckEvent.f54096g.f6911l).run();
            return;
        }
        ht4.g gVar = this.f284961g;
        gVar.f284964d = new ht4.f(gVar, eCardJsApiCheckEvent);
        int P = com.tencent.mm.sdk.platformtools.t8.P(eCardJsApiCheckEvent.f54096g.f6908i, 0);
        am.i4 i4Var = eCardJsApiCheckEvent.f54096g;
        jt4.f.d(P, i4Var.f6910k, i4Var.f6907h, this.f284960f, context, gVar.f284964d);
    }
}
