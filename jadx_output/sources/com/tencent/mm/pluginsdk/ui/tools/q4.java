package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f191851d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f191852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.r4 f191853f;

    public q4(com.tencent.mm.pluginsdk.ui.tools.r4 r4Var, com.tencent.mm.pluginsdk.ui.tools.g4 g4Var) {
        this.f191853f = r4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f191851d != null) {
            android.graphics.Bitmap bitmap = this.f191852e;
            if (bitmap == null || !bitmap.isRecycled()) {
                if (this.f191852e != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageEngine", "RenderJob imageView width:%s, height:%s, bmp width:%s, height:%s", java.lang.Integer.valueOf(this.f191851d.getWidth()), java.lang.Integer.valueOf(this.f191851d.getHeight()), java.lang.Integer.valueOf(this.f191852e.getWidth()), java.lang.Integer.valueOf(this.f191852e.getHeight()));
                }
                com.tencent.mm.pluginsdk.ui.tools.p4.a(this.f191851d, this.f191852e);
            } else {
                com.tencent.mm.pluginsdk.ui.tools.p4.a(this.f191851d, null);
            }
        }
        this.f191851d = null;
        this.f191852e = null;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f191853f.f191872i.f191792c;
        n3Var.sendMessage(n3Var.obtainMessage(1, this));
    }
}
