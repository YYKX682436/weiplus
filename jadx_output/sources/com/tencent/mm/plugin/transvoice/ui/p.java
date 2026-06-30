package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes14.dex */
public final class p implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final long f175455d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.transvoice.ui.o f175456e;

    public p(com.tencent.mm.plugin.transvoice.ui.v vVar, long j17, com.tencent.mm.plugin.transvoice.ui.o languageInfo) {
        kotlin.jvm.internal.o.g(languageInfo, "languageInfo");
        this.f175455d = j17;
        this.f175456e = languageInfo;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f175455d;
    }

    @Override // in5.c
    public int h() {
        return this.f175455d == 0 ? 1 : 2;
    }
}
