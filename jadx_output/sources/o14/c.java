package o14;

/* loaded from: classes11.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI f342273d;

    public c(com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI fixSearchUI) {
        this.f342273d = fixSearchUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FixSearchUI", "delete fts db, and kill process");
        o13.p.e(24);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("FTS5IndexMicroMsg_encrypt.db");
        java.lang.String sb7 = sb6.toString();
        java.lang.String[] strArr = {"", "-journal", "-wal", "-shm"};
        for (int i18 = 0; i18 < 4; i18++) {
            java.lang.String str = sb7 + strArr[i18];
            com.tencent.mars.xlog.Log.i("MicroMsg.FixSearchUI", "deleteIndexDB %s %s", str, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str)));
            com.tencent.mm.vfs.w6.h(str);
        }
        com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI fixSearchUI = this.f342273d;
        fixSearchUI.finish();
        k35.o oVar = k35.p.f303943a;
        if (oVar != null) {
            androidx.appcompat.app.AppCompatActivity context = fixSearchUI.getContext();
            ((bt.b1) oVar).getClass();
            com.tencent.mm.ui.vb.c(context);
        }
    }
}
