package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class mc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f209121f;

    public mc(int i17, java.lang.String str, android.content.Context context) {
        this.f209119d = i17;
        this.f209120e = str;
        this.f209121f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f209119d == 4 && com.tencent.mm.pluginsdk.model.app.b.c() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMErrorProcessor", "alphaUpdateInfo expired");
        } else if (i95.n0.c(mi3.f.class) != null) {
            ((com.tencent.mm.plugin.sandbox.SubCoreSandBox) ((mi3.f) i95.n0.c(mi3.f.class))).getClass();
            if (com.tencent.mm.sandbox.monitor.l.c(this.f209120e, false) != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.lc(this));
            }
        }
    }
}
