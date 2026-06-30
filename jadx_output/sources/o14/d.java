package o14;

/* loaded from: classes11.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI f342274d;

    public d(com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI fixSearchUI) {
        this.f342274d = fixSearchUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FixSearchUI", "delete web search template, and kill process");
        com.tencent.mm.vfs.w6.f(((uv4.b) com.tencent.mm.plugin.websearch.l2.g(0)).o());
        su4.k3.e(30);
        com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI fixSearchUI = this.f342274d;
        fixSearchUI.finish();
        k35.o oVar = k35.p.f303943a;
        if (oVar != null) {
            androidx.appcompat.app.AppCompatActivity context = fixSearchUI.getContext();
            ((bt.b1) oVar).getClass();
            com.tencent.mm.ui.vb.c(context);
        }
    }
}
