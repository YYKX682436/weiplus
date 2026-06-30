package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.h3 f188915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.f f188916f;

    public h(com.tencent.mm.pluginsdk.model.app.f fVar, int i17, com.tencent.mm.pluginsdk.model.app.h3 h3Var) {
        this.f188916f = fVar;
        this.f188914d = i17;
        this.f188915e = h3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.model.app.f fVar = this.f188916f;
        java.util.Map map = fVar.f188883d;
        int i17 = this.f188914d;
        if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null) {
            ((java.util.Set) ((java.util.HashMap) fVar.f188883d).get(java.lang.Integer.valueOf(i17))).remove(this.f188915e);
        }
    }
}
