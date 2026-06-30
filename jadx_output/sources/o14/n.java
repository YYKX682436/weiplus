package o14;

/* loaded from: classes11.dex */
public class n implements xg3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f342292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI f342293b;

    public n(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI fixToolsUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f342293b = fixToolsUI;
        this.f342292a = u3Var;
    }

    @Override // xg3.t
    public void a(boolean z17, int i17, final int i18, java.lang.String str) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        final com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f342292a;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: o14.n$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = u3Var;
                o14.n nVar = o14.n.this;
                nVar.getClass();
                try {
                    u3Var2.dismiss();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FixToolsUI", e17, "fixAddFriendVerifyRecordRecover dismiss dialog err", new java.lang.Object[0]);
                }
                boolean z18 = i18 == 0;
                java.lang.String str2 = z18 ? "修复完成" : "修复失败";
                com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI fixToolsUI = nVar.f342293b;
                dp.a.makeText(fixToolsUI, str2, 1).show();
                if (z18) {
                    com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI.f160064e = true;
                    ((com.tencent.mm.ui.base.preference.h0) fixToolsUI.f160065d).m("fix_tools_add_friend_verify_record", true);
                    ((com.tencent.mm.ui.base.preference.h0) fixToolsUI.f160065d).notifyDataSetChanged();
                }
            }
        });
    }
}
