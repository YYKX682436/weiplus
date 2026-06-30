package m31;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f323172d;

    public o(com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI, com.tencent.mm.ui.widget.dialog.j0 j0Var) {
        this.f323172d = j0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f323172d.dismiss();
    }
}
