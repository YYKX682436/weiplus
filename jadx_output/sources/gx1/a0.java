package gx1;

/* loaded from: classes12.dex */
public class a0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx1.b0 f277292a;

    public a0(gx1.b0 b0Var) {
        this.f277292a = b0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        gx1.b0 b0Var = this.f277292a;
        if (b0Var.G.f295328q) {
            b0Var.H.removeMessages(4096);
            return;
        }
        b0Var.F.setText(" " + ((java.lang.String) com.tencent.mm.plugin.component.editor.u1.m(com.tencent.mm.sdk.platformtools.x2.f193071a, b0Var.G.f295343t)).toString());
        sendEmptyMessageDelayed(4096, 500L);
    }
}
