package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class m8 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190490a;

    public m8(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var) {
        this.f190490a = h9Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190490a;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = h9Var.f190359e;
        float f17 = chatFooter.f190010k2 || chatFooter.D0() ? 0.48f : 0.6f;
        float f18 = i18;
        android.content.Context context = h9Var.f190360f;
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, f18, new int[]{context.getResources().getColor(com.tencent.mm.R.color.f479541an4), context.getResources().getColor(com.tencent.mm.R.color.f478489a), context.getResources().getColor(com.tencent.mm.R.color.f478489a)}, new float[]{0.0f, f17, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
    }
}
