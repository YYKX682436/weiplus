package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes10.dex */
public final class x1 extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.u1 f115745a;

    public x1(com.tencent.mm.plugin.finder.live.util.u1 u1Var) {
        this.f115745a = u1Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        return this.f115745a.a(i17, i18);
    }
}
