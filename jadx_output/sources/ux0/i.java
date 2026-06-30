package ux0;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f431812a;

    /* renamed from: b, reason: collision with root package name */
    public final ux0.c[] f431813b;

    /* renamed from: c, reason: collision with root package name */
    public int f431814c;

    public i(int i17, xr0.j frameSize) {
        kotlin.jvm.internal.o.g(frameSize, "frameSize");
        this.f431812a = i17;
        ux0.c[] cVarArr = new ux0.c[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            is0.c cVar = new is0.c(true, 24L);
            cVar.a(frameSize.f456173a, frameSize.f456174b, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, null, 9729, 33071);
            cVarArr[i18] = new ux0.c(cVar, Long.MIN_VALUE);
        }
        this.f431813b = cVarArr;
    }
}
