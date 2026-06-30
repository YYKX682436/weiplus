package com.tencent.mm.plugin.music.ui;

/* loaded from: classes5.dex */
public class q extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150774a;

    public q(com.tencent.mm.plugin.music.ui.t tVar, int i17) {
        this.f150774a = i17;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, new int[]{this.f150774a, 0}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.REPEAT);
    }
}
