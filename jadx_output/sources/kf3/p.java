package kf3;

/* loaded from: classes5.dex */
public class p implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kf3.u f307410b;

    public p(kf3.u uVar, java.lang.String str) {
        this.f307410b = uVar;
        this.f307409a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        kf3.u uVar = this.f307410b;
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = uVar.f307436a;
        java.lang.String str = this.f307409a;
        massSendMsgUI.f148550q = str;
        uVar.f307437b.D();
        uVar.getClass();
        if3.y yVar = new if3.y();
        yVar.f291217m = uVar.f307442g;
        yVar.f291218n = uVar.f307443h.size();
        yVar.f291215h = str;
        yVar.f291219o = 1;
        if3.g0 g0Var = new if3.g0(yVar, uVar.f307444i, 0);
        c01.d9.e().g(g0Var);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI2 = uVar.f307436a;
        uVar.f307441f = db5.e1.Q(massSendMsgUI2, massSendMsgUI2.getString(com.tencent.mm.R.string.f490573yv), massSendMsgUI2.getString(com.tencent.mm.R.string.iin), true, true, new kf3.q(uVar, g0Var));
    }
}
