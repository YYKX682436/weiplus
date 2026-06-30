package hb5;

/* loaded from: classes11.dex */
public class b1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatroomInfoUI f280152d;

    public b1(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI) {
        this.f280152d = bizChatroomInfoUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f280152d.F = true;
    }
}
