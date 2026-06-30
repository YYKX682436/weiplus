package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f187834a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f187835b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f187836c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f187837d;

    public k(int i17, boolean z17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 2) != 0 ? false : z17;
        z18 = (i18 & 4) != 0 ? false : z18;
        this.f187834a = i17;
        this.f187835b = z17;
        this.f187836c = z18;
        this.f187837d = new java.util.LinkedList();
    }

    public java.lang.String toString() {
        return r26.b0.b("[worker #" + this.f187834a + "]\n                preload: " + this.f187835b + "\n                recycled: " + this.f187836c + "\n\n                " + kz5.n0.g0(this.f187837d, "\n\n", null, null, 0, null, null, 62, null) + "\n                ");
    }
}
