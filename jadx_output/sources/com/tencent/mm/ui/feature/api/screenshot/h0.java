package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class h0 implements qj5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f208481a;

    public h0(java.util.HashMap hashMap) {
        this.f208481a = hashMap;
    }

    public void a(long j17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        cy1.a aVar = (cy1.a) rVar;
        aVar.Ej("generate_image_finish", kz5.c1.n(this.f208481a, new jz5.l("finish_inelapsed_time", java.lang.Long.valueOf(j17))), 36458);
    }

    public void b(java.lang.String viewId, java.lang.String eventId) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, this.f208481a, 36458);
    }
}
