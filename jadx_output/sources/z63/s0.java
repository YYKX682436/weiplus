package z63;

/* loaded from: classes5.dex */
public class s0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470441d;

    public s0(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470441d = groupSolitatireEditUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470441d;
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "send group solitaire(sending:%s)", java.lang.Boolean.valueOf(groupSolitatireEditUI.N));
        if (groupSolitatireEditUI.N) {
            return true;
        }
        java.lang.String str = groupSolitatireEditUI.D;
        java.lang.String r17 = c01.z1.r();
        y63.a aVar = groupSolitatireEditUI.B;
        kk.j jVar = x63.g.f452235a;
        x63.g.f(str, r17, aVar, c01.id.e(), true);
        if (groupSolitatireEditUI.B.P) {
            db5.e1.A(groupSolitatireEditUI.getContext(), groupSolitatireEditUI.getString(com.tencent.mm.R.string.fsv), "", groupSolitatireEditUI.getString(com.tencent.mm.R.string.fsu), groupSolitatireEditUI.getString(com.tencent.mm.R.string.fst), new z63.q0(this), new z63.r0(this));
        } else {
            com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.V6(groupSolitatireEditUI);
        }
        return true;
    }
}
