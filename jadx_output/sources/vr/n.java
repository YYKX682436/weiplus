package vr;

/* loaded from: classes8.dex */
public final class n implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vr.q f439417a;

    public n(vr.q qVar) {
        this.f439417a = qVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        vr.q qVar = this.f439417a;
        int i17 = qVar.f439421e;
        if (str == null) {
            str = "";
        }
        ym5.a1.f(new vr.k(qVar, str));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        vr.q qVar = this.f439417a;
        int i17 = qVar.f439421e;
        ym5.a1.f(new vr.l(qVar));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonBoardNativeView", "onTextOp onToSendTextEnable viewId=" + this.f439417a.f439421e + " enable=" + z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        vr.q qVar = this.f439417a;
        int i17 = qVar.f439421e;
        ym5.a1.f(new vr.m(qVar));
    }
}
