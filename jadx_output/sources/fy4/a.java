package fy4;

/* loaded from: classes8.dex */
public final class a extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fy4.e f267253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.inputmethod.InputConnection inputConnection, fy4.e eVar) {
        super(inputConnection, false);
        this.f267253a = eVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String action, android.os.Bundle data) {
        fy4.e eVar = this.f267253a;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewInputConnectionHelper", "performPrivateCommand action = %s", action);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewInputConnectionHelper", "canRevivedIMECommand， recieveIMECommand = " + eVar.f267260e);
            if (!eVar.f267260e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewInputConnectionHelper", "performPrivateCommand -> not support");
                return false;
            }
            return ((i05.n) ((p94.t0) i95.n0.c(p94.t0.class))).Bi(eVar.f267259d.f183815f, eVar, action, data);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewInputConnectionHelper", e17, null, new java.lang.Object[0]);
            return false;
        }
    }
}
