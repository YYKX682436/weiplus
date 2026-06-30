package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class h3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f208772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.j3 f208773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.tencent.mm.ui.j3 j3Var, android.os.Looper looper) {
        super(looper);
        this.f208773b = j3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (this.f208772a) {
            return;
        }
        synchronized (this.f208773b) {
            com.tencent.mm.ui.j3 j3Var = this.f208773b;
            j3Var.f208994d = j3Var.d();
            com.tencent.mm.ui.j3 j3Var2 = this.f208773b;
            com.tencent.mars.xlog.Log.i(j3Var2.f208995e.f209017d, "newcursor updateWorkerRefresh status:%d, what:%s", java.lang.Integer.valueOf(j3Var2.f208994d), java.lang.Integer.valueOf(message.what));
        }
        int i17 = message.what;
        if (i17 == 1) {
            this.f208773b.f208995e.l();
        } else if (i17 == 2) {
            this.f208773b.f208995e.m((com.tencent.mm.ui.f3) message.obj, false, true);
        }
    }
}
