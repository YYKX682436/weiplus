package com.tencent.mm.plugin.gamelive.playgame;

/* loaded from: classes8.dex */
public class f implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f142103d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142104e;

    public f(com.tencent.mm.plugin.gamelive.playgame.c cVar, int i17, java.lang.String str) {
        this.f142103d = str;
        this.f142104e = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var) {
        if (!(r0Var instanceof com.tencent.mm.plugin.gamelive.playgame.f)) {
            return 1;
        }
        com.tencent.mm.plugin.gamelive.playgame.f fVar = (com.tencent.mm.plugin.gamelive.playgame.f) r0Var;
        return (this.f142104e == fVar.f142104e && android.text.TextUtils.equals(this.f142103d, fVar.f142103d)) ? 0 : 1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f142104e;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
