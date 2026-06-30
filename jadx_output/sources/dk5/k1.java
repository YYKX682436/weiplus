package dk5;

/* loaded from: classes9.dex */
public class k1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.c2 f234701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234702e;

    public k1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI, dk5.c2 c2Var) {
        this.f234702e = msgRetransmitUI;
        this.f234701d = c2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f234701d.f234543c = true;
        this.f234702e.finish();
    }
}
