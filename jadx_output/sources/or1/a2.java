package or1;

/* loaded from: classes8.dex */
public class a2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr1.d0 f347456d;

    public a2(com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI receiveTemplateMsgMgrUI, lr1.d0 d0Var) {
        this.f347456d = d0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f347456d);
    }
}
