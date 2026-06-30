package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f125032a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f125033b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f125034c;

    public g(int i17, boolean z17, java.lang.String simpleDesc, java.lang.String complexDesc, int i18, kotlin.jvm.internal.i iVar) {
        complexDesc = (i18 & 8) != 0 ? "" : complexDesc;
        kotlin.jvm.internal.o.g(simpleDesc, "simpleDesc");
        kotlin.jvm.internal.o.g(complexDesc, "complexDesc");
        this.f125032a = i17;
        this.f125033b = z17;
        this.f125034c = simpleDesc;
    }
}
