package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes2.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f115706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f115707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int[] iArr, float[] fArr) {
        super(2);
        this.f115706d = iArr;
        this.f115707e = fArr;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, ((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue(), this.f115706d, this.f115707e, android.graphics.Shader.TileMode.CLAMP);
    }
}
