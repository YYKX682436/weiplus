package kf3;

/* loaded from: classes5.dex */
public class p1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.l0 f307412d;

    public p1(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI, t21.l0 l0Var) {
        this.f307412d = l0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f307412d.f414821b = null;
    }
}
