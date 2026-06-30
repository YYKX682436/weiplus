package hb5;

/* loaded from: classes11.dex */
public class w0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s01.q0 f280264d;

    public w0(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI, s01.q0 q0Var) {
        this.f280264d = q0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f280264d);
    }
}
