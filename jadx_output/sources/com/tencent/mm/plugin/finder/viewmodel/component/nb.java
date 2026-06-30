package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nb implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final u26.w f135287a = u26.z.a(0, null, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f135288b;

    public nb(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar) {
        this.f135288b = ncVar;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlinx.coroutines.l.d(this.f135288b.getLifecycleScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.kb(this, mediaId, null), 3, null);
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        kotlinx.coroutines.l.d(this.f135288b.getLifecycleScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.ib(this, mediaId, null), 3, null);
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        kotlinx.coroutines.l.d(this.f135288b.getLifecycleScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.mb(this, mediaId, null), 3, null);
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(task, "task");
        kotlinx.coroutines.l.d(this.f135288b.getLifecycleScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.jb(this, mediaId, null), 3, null);
    }

    @Override // vr2.i
    public void f(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void g(java.lang.String mediaId, int i17, int i18, java.lang.String fileFormat, java.lang.String codingFormat, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        kotlin.jvm.internal.o.g(codingFormat, "codingFormat");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        kotlinx.coroutines.l.d(this.f135288b.getLifecycleScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.lb(this, mediaId, null), 3, null);
    }
}
