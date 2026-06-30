package com.tencent.mm.plugin.transvoice.model;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f175365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.model.c f175366g;

    public b(com.tencent.mm.plugin.transvoice.model.c cVar, int i17, int i18, int i19) {
        this.f175366g = cVar;
        this.f175363d = i17;
        this.f175364e = i18;
        this.f175365f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceInputAddr2", "error localCode = %s, errType = %s, errCode = %s.", java.lang.Integer.valueOf(this.f175363d), java.lang.Integer.valueOf(this.f175364e), java.lang.Integer.valueOf(this.f175365f));
        com.tencent.mm.plugin.transvoice.model.c cVar = this.f175366g;
        z21.v vVar = cVar.f175368d;
        if (vVar != null) {
            vVar.e(this.f175363d, this.f175364e, this.f175365f, -1L);
        }
        cVar.c(false, true);
    }
}
