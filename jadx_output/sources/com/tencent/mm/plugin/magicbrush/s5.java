package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class s5 implements kc3.f {

    /* renamed from: a, reason: collision with root package name */
    public final long f148115a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f148116b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f148117c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f148118d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f148119e;

    public s5(com.tencent.mm.plugin.magicbrush.t5 t5Var, long j17, jc3.j0 magicBrush) {
        kotlin.jvm.internal.o.g(magicBrush, "magicBrush");
        this.f148115a = j17;
        this.f148117c = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f148116b = new java.lang.ref.WeakReference(magicBrush);
        this.f148118d = new com.tencent.mm.plugin.magicbrush.p5(this);
        this.f148119e = new com.tencent.mm.plugin.magicbrush.q5(this);
    }
}
