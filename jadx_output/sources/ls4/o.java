package ls4;

/* loaded from: classes8.dex */
public final class o implements com.tencent.mm.ui.widget.dialog.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321089a;

    public o(ls4.u uVar) {
        this.f321089a = uVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i2
    public final void onDismiss() {
        com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "consume panel cancel");
        ls4.u.a(this.f321089a);
    }
}
