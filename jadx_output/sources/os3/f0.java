package os3;

/* loaded from: classes8.dex */
public class f0 extends ks3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348072a;

    public f0(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348072a = composeUI;
    }

    @Override // ks3.y
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "sync addr complete");
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348072a;
        os3.t2 t2Var = new os3.t2(composeUI, composeUI.f154851x.e(null));
        composeUI.f154833e.setAddrsAdapter(t2Var);
        composeUI.f154837i.setAddrsAdapter(t2Var);
        composeUI.f154841o.setAddrsAdapter(t2Var);
    }
}
