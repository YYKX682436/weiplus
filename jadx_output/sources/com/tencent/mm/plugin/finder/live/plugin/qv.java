package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qv implements e51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f114050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f114051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f114052c;

    public qv(android.graphics.Bitmap bitmap, boolean z17, float f17) {
        this.f114050a = bitmap;
        this.f114051b = z17;
        this.f114052c = f17;
    }

    @Override // e51.f
    public final f51.b a(java.util.Random random) {
        uo0.a aVar = new uo0.a(this.f114050a, this.f114051b ? 0.5f : 1.0f);
        aVar.R = this.f114052c;
        return aVar;
    }
}
