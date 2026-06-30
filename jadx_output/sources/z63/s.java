package z63;

/* loaded from: classes5.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470440d;

    public s(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470440d = groupSolitatireEditUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f470440d.f142235x;
        if (f5Var != null) {
            f5Var.f();
        }
    }
}
