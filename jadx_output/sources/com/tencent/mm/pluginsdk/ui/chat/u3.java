package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class u3 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f190675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f190676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190677c;

    public u3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, float f17, float f18) {
        this.f190677c = chatFooter;
        this.f190675a = f17;
        this.f190676b = f18;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        float f17 = i18;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190677c;
        return new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, f17, new int[]{chatFooter.getResources().getColor(com.tencent.mm.R.color.f479540an3), chatFooter.getResources().getColor(com.tencent.mm.R.color.f479540an3), chatFooter.getResources().getColor(com.tencent.mm.R.color.f479539an2), chatFooter.getResources().getColor(com.tencent.mm.R.color.f479539an2)}, new float[]{0.0f, this.f190675a, this.f190676b, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
    }
}
