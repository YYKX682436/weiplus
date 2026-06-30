package is1;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f294421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17) {
        super(0);
        this.f294421d = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 g17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g();
        is1.l lVar = is1.l.f294423a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("_tmpl_download_time_");
        int i17 = this.f294421d;
        sb6.append(i17);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.w.c(g17, sb6.toString());
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.k(i17);
        return jz5.f0.f302826a;
    }
}
