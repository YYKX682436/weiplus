package kf3;

/* loaded from: classes5.dex */
public class o implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kf3.u f307406a;

    public o(kf3.u uVar) {
        this.f307406a = uVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        if3.y yVar = new if3.y();
        kf3.u uVar = this.f307406a;
        yVar.f291217m = uVar.f307442g;
        yVar.f291218n = uVar.f307443h.size();
        kf3.t tVar = uVar.f307438c;
        yVar.f291215h = tVar.f307430y;
        yVar.f291219o = 34;
        yVar.f291220p = tVar.f420080m;
        if3.g0 g0Var = new if3.g0(yVar, uVar.f307444i, 0);
        c01.d9.e().g(g0Var);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = uVar.f307436a;
        uVar.f307441f = db5.e1.Q(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.f490573yv), uVar.f307436a.getString(com.tencent.mm.R.string.iin), true, true, new kf3.n(this, g0Var));
        uVar.f307438c.stop();
    }
}
