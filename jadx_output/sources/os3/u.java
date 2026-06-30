package os3;

/* loaded from: classes8.dex */
public class u implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ os3.v f348215a;

    public u(os3.v vVar) {
        this.f348215a = vVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        os3.v vVar = this.f348215a;
        if (i17 == 0) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            androidx.appcompat.app.AppCompatActivity context = vVar.f348220d.getContext();
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a(context, "android.permission.CAMERA", 16, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), vVar.f348220d.getContext());
            if (a17) {
                com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = vVar.f348220d;
                java.util.List list = com.tencent.mm.plugin.qqmail.ui.ComposeUI.f154830p1;
                composeUI.b7();
                return;
            }
            return;
        }
        if (i17 == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("album_support_landscape_mode", vVar.f348220d.W);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI2 = vVar.f348220d;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.h(composeUI2, 4, intent);
            return;
        }
        if (i17 != 2) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("INTENT_MAX_SELECT_COUNT", 1);
        intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        intent2.putExtra("is_support_landscape_mode", vVar.f348220d.W);
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.STORAGE, new os3.t(this, intent2))) {
            return;
        }
        j45.l.v(vVar.f348220d.getContext(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent2, 6);
    }
}
