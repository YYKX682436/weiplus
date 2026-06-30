package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class q0 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.t0 f141618b;

    public q0(com.tencent.mm.plugin.game.ui.message.t0 t0Var, java.lang.String str) {
        this.f141618b = t0Var;
        this.f141617a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((jt0.i) this.f141618b.f141642e2).put(this.f141617a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
