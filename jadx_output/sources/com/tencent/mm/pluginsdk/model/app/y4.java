package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class y4 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.z4 f189159a;

    public y4(com.tencent.mm.pluginsdk.model.app.z4 z4Var, com.tencent.mm.pluginsdk.model.app.x4 x4Var) {
        this.f189159a = z4Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            com.tencent.mm.pluginsdk.model.app.z4 z4Var = this.f189159a;
            if (z4Var.f189190n && z4Var.f189187h.field_status != 105 && ((d73.i) i95.n0.c(d73.i.class)).Wa(z4Var.f189186g, z4Var.f189188i)) {
                sendMessageDelayed(android.os.Message.obtain(this, 1, z4Var.f189186g), 5000L);
            }
        }
    }
}
