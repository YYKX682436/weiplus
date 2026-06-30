package vw3;

/* loaded from: classes.dex */
public final class o7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f441058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.VideoSendDebugConfigUI f441060f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(android.widget.EditText editText, yz5.l lVar, com.tencent.mm.plugin.repairer.ui.VideoSendDebugConfigUI videoSendDebugConfigUI) {
        super(0);
        this.f441058d = editText;
        this.f441059e = lVar;
        this.f441060f = videoSendDebugConfigUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = jz5.f0.f302826a;
        android.text.Editable text = this.f441058d.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        java.lang.String obj = r26.n0.u0(text).toString();
        yz5.l lVar = this.f441059e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Integer h17 = r26.h0.h(obj);
            boolean z17 = true;
            if ((h17 != null ? h17.intValue() : 0) != 1) {
                z17 = false;
            }
            lVar.invoke(java.lang.Boolean.valueOf(z17));
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f441060f.d, m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
        return f0Var;
    }
}
