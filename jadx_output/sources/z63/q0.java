package z63;

/* loaded from: classes5.dex */
public class q0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.s0 f470438d;

    public q0(z63.s0 s0Var) {
        this.f470438d = s0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "group solitatire repeat dialog ok");
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.V6(this.f470438d.f470441d);
    }
}
