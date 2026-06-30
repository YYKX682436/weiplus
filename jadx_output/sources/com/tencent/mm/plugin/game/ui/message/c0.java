package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class c0 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView f141533b;

    public c0(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, java.lang.String str) {
        this.f141533b = interactiveMsgMRecycleView;
        this.f141532a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((jt0.i) this.f141533b.f141496i2).put(this.f141532a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
