package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class z0 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.c1 f141667b;

    public z0(com.tencent.mm.plugin.game.ui.message.c1 c1Var, java.lang.String str) {
        this.f141667b = c1Var;
        this.f141666a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((jt0.i) this.f141667b.f141537e2).put(this.f141666a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
