package z63;

/* loaded from: classes5.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470436d;

    public p(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470436d = groupSolitatireEditUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "back_dialot ok");
        x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470436d;
        y63.a aVar = groupSolitatireEditUI.B;
        int i18 = groupSolitatireEditUI.H;
        if (i18 == 3 || i18 == 4) {
            i18 = 3;
        }
        Ai.g(aVar, i18, 2, groupSolitatireEditUI.F);
        groupSolitatireEditUI.finish();
    }
}
