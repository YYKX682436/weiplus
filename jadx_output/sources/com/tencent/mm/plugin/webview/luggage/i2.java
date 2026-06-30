package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f182223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f182225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f182226h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.y1 f182227i;

    public i2(com.tencent.mm.plugin.webview.luggage.y1 y1Var, boolean z17, android.graphics.Bitmap bitmap, java.lang.String str, int i17, boolean z18) {
        this.f182227i = y1Var;
        this.f182222d = z17;
        this.f182223e = bitmap;
        this.f182224f = str;
        this.f182225g = i17;
        this.f182226h = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = this.f182227i;
        if (y1Var == null || y1Var.f182693e == null) {
            return;
        }
        if (this.f182222d) {
            y1Var.a(true);
            return;
        }
        y1Var.a(false);
        if (y1Var.f182701p == null || y1Var.f182702q == null) {
            return;
        }
        y1Var.f182707v = false;
        android.graphics.Bitmap bitmap = this.f182223e;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.String str = this.f182224f;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                y1Var.f182701p.setVisibility(8);
                y1Var.f182702q.setVisibility(0);
                y1Var.f182702q.setText(str);
                int i17 = this.f182225g;
                if (i17 != -1) {
                    y1Var.f182702q.setTextColor(i17);
                }
            }
        } else {
            y1Var.f182701p.setVisibility(0);
            y1Var.f182701p.setImageBitmap(bitmap);
            y1Var.f182702q.setVisibility(8);
            y1Var.f182707v = true;
        }
        if (this.f182226h) {
            y1Var.f182701p.setOnClickListener(y1Var.D);
            y1Var.f182702q.setOnClickListener(y1Var.D);
        }
    }
}
