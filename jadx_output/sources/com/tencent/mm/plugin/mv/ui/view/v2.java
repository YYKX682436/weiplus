package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class v2 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f151967d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f151968e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f151969f;

    public v2(long j17, java.lang.String text, boolean z17) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f151967d = j17;
        this.f151968e = text;
        this.f151969f = z17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.mv.ui.view.v2 entry = (com.tencent.mm.plugin.mv.ui.view.v2) obj;
        kotlin.jvm.internal.o.g(entry, "entry");
        return (int) (this.f151967d - entry.f151967d);
    }
}
