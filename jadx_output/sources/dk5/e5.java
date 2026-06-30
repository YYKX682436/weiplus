package dk5;

/* loaded from: classes9.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f234608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234610g;

    public e5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.lang.String str, java.util.LinkedList linkedList, int i17) {
        this.f234610g = sendAppMessageWrapperUI;
        this.f234607d = str;
        this.f234608e = linkedList;
        this.f234609f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234610g;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = sendAppMessageWrapperUI.f211024m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        sendAppMessageWrapperUI.b7(this.f234607d, this.f234608e, this.f234609f);
    }
}
