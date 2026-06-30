package dk5;

/* loaded from: classes9.dex */
public class j3 implements k01.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234688a;

    public j3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234688a = selectConversationUI;
    }

    @Override // k01.t0
    public void a(boolean z17) {
        this.f234688a.f210990j2 = z17;
    }

    @Override // k01.t0
    public void b() {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234688a;
        selectConversationUI.f210989i2 = 1;
        dk5.m7.b(selectConversationUI, null);
    }
}
