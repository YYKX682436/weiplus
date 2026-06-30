package hb5;

/* loaded from: classes4.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatroomInfoUI f280261e;

    public u0(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI, int i17) {
        this.f280261e = bizChatroomInfoUI;
        this.f280260d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI = this.f280261e;
        android.view.View x17 = ((com.tencent.mm.ui.base.preference.b) bizChatroomInfoUI.f197937e).x(this.f280260d, bizChatroomInfoUI.getListView());
        if (x17 != null) {
            zg5.a.a(bizChatroomInfoUI.getContext(), x17);
        }
    }
}
