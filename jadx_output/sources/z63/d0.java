package z63;

/* loaded from: classes5.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f470375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470376e;

    public d0(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI, int i17) {
        this.f470376e = groupSolitatireEditUI;
        this.f470375d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f470375d;
        if (i17 > 0) {
            com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470376e;
            groupSolitatireEditUI.f142219e.smoothScrollBy(0, i17 + ((com.tencent.mm.ui.widget.MMEditText) groupSolitatireEditUI.f142233v).getLineHeight());
        }
    }
}
