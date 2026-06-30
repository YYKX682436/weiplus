package com.tencent.mm.plugin.finder.view;

/* loaded from: classes15.dex */
public class t0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.z0 f133084a;

    public t0(com.tencent.mm.plugin.finder.view.z0 z0Var) {
        this.f133084a = z0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.finder.view.z0 z0Var = this.f133084a;
        boolean z17 = z0Var.f133429l;
        z0Var.getClass();
        int i18 = message.what;
        if (i18 == 1) {
            z0Var.f133426i.onShowPress(z0Var.f133434q);
            return;
        }
        if (i18 == 2) {
            z0Var.f133425h.removeMessages(3);
            z0Var.f133430m = false;
            z0Var.f133431n = true;
            z0Var.f133426i.onLongPress(z0Var.f133434q);
            return;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                z0Var.f133438u = false;
                return;
            } else {
                throw new java.lang.RuntimeException("Unknown message " + message);
            }
        }
        com.tencent.mm.plugin.finder.view.w0 w0Var = z0Var.f133428k;
        if (w0Var != null) {
            if (z0Var.f133429l) {
                z0Var.f133430m = true;
            } else {
                w0Var.onSingleTapConfirmed(z0Var.f133434q);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.view.z0 z0Var, android.os.Handler handler) {
        super(handler.getLooper());
        this.f133084a = z0Var;
    }
}
