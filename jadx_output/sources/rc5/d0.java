package rc5;

/* loaded from: classes11.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f394152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rc5.f0 f394153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity appCompatActivity, rc5.f0 f0Var) {
        super(0);
        this.f394152d = appCompatActivity;
        this.f394153e = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        com.tencent.mm.ui.ga controller;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f394152d;
        com.tencent.mm.ui.chatting.ChattingUI chattingUI = appCompatActivity instanceof com.tencent.mm.ui.chatting.ChattingUI ? (com.tencent.mm.ui.chatting.ChattingUI) appCompatActivity : null;
        if (chattingUI != null && (chattingUIFragment = chattingUI.f198254h) != null && (controller = chattingUIFragment.getController()) != null) {
            controller.r0(this.f394153e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479784f5), true);
        }
        return null;
    }
}
