package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class d2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final long f151807d;

    /* renamed from: e, reason: collision with root package name */
    public final fm3.u f151808e;

    /* renamed from: f, reason: collision with root package name */
    public final int f151809f;

    public d2(long j17, fm3.u musicMv, int i17) {
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        this.f151807d = j17;
        this.f151808e = musicMv;
        this.f151809f = i17;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f151807d;
    }

    @Override // in5.c
    public int h() {
        return 5;
    }
}
