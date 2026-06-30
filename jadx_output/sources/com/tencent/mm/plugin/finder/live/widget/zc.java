package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zc implements e51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f120562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView f120563b;

    public zc(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView) {
        this.f120562a = bitmap;
        this.f120563b = finderLiveConfettiView;
    }

    @Override // e51.f
    public final f51.b a(java.util.Random random) {
        return new uo0.a(this.f120562a, this.f120563b.f117599s);
    }
}
