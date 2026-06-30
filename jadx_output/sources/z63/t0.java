package z63;

/* loaded from: classes5.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470443d;

    public t0(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470443d = groupSolitatireEditUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470443d;
        java.lang.String str = groupSolitatireEditUI.B.field_creator;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str);
        if (a17 == null) {
            groupSolitatireEditUI.f142220f.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            groupSolitatireEditUI.f142220f.setImageBitmap(a17);
        }
    }
}
