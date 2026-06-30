package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class z4 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.b5 f141897b;

    public z4(com.tencent.mm.plugin.game.ui.b5 b5Var, java.lang.String str) {
        this.f141897b = b5Var;
        this.f141896a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f141897b.B.put(this.f141896a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
