package dk5;

/* loaded from: classes9.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234733d;

    public m4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234733d = selectConversationUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f234733d.finish();
    }
}
