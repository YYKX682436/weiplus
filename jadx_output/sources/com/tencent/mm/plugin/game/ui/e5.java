package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class e5 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameMessageListUserIconView f141376b;

    public e5(com.tencent.mm.plugin.game.ui.GameMessageListUserIconView gameMessageListUserIconView, java.lang.String str) {
        this.f141376b = gameMessageListUserIconView;
        this.f141375a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f141376b.f140929f.put(this.f141375a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
