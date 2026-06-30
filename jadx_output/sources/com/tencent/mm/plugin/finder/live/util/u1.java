package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f115714a;

    public u1(int[] colors, float[] fArr) {
        kotlin.jvm.internal.o.g(colors, "colors");
        if (colors.length == 1) {
            int i17 = colors[0];
            colors = new int[]{i17, i17};
        }
        this.f115714a = new com.tencent.mm.plugin.finder.live.util.t1(colors, fArr);
    }

    public final android.graphics.LinearGradient a(int i17, int i18) {
        return (android.graphics.LinearGradient) this.f115714a.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public u1(yz5.p customGradientCreator) {
        kotlin.jvm.internal.o.g(customGradientCreator, "customGradientCreator");
        this.f115714a = customGradientCreator;
    }
}
