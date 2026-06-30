package hb5;

/* loaded from: classes11.dex */
public class p0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s01.g0 f280250d;

    public p0(com.tencent.mm.ui.bizchat.BizChatSelectConversationUI bizChatSelectConversationUI, s01.g0 g0Var) {
        this.f280250d = g0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f280250d);
    }
}
