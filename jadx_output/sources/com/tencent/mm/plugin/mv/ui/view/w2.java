package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class w2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.v2 f151979d;

    public w2(com.tencent.mm.plugin.mv.ui.view.v2 lyricInfo) {
        kotlin.jvm.internal.o.g(lyricInfo, "lyricInfo");
        this.f151979d = lyricInfo;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f151979d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 7;
    }
}
