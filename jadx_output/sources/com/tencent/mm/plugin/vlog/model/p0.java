package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f175708a;

    /* renamed from: b, reason: collision with root package name */
    public final long f175709b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f175710c;

    public p0(com.tencent.mm.plugin.vlog.model.x0 scaleType, com.tencent.mm.plugin.vlog.model.a0 filter, com.tencent.mm.plugin.vlog.model.e1 transition, long j17, long j18, long j19, java.lang.String path, java.util.List list, java.util.List list2, int i17, kotlin.jvm.internal.i iVar) {
        scaleType = (i17 & 1) != 0 ? com.tencent.mm.plugin.vlog.model.x0.f175782e : scaleType;
        filter = (i17 & 2) != 0 ? com.tencent.mm.plugin.vlog.model.a0.f175542d : filter;
        transition = (i17 & 4) != 0 ? com.tencent.mm.plugin.vlog.model.e1.f175587d : transition;
        path = (i17 & 64) != 0 ? "" : path;
        kotlin.jvm.internal.o.g(scaleType, "scaleType");
        kotlin.jvm.internal.o.g(filter, "filter");
        kotlin.jvm.internal.o.g(transition, "transition");
        kotlin.jvm.internal.o.g(path, "path");
        this.f175708a = j17;
        this.f175709b = j18;
        this.f175710c = path;
    }
}
