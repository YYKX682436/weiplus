package dk5;

/* loaded from: classes9.dex */
public class y2 implements k01.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f235002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f235003b;

    public y2(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, android.content.Intent intent) {
        this.f235003b = selectConversationUI;
        this.f235002a = intent;
    }

    @Override // k01.t0
    public void a(boolean z17) {
    }

    @Override // k01.t0
    public void b() {
        this.f235002a.putExtra("KShowTodoIntroduceView", 1);
        dk5.m7.b(this.f235003b, null);
    }
}
