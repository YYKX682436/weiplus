package df2;

/* loaded from: classes10.dex */
public final class vp extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public mn0.b0 f231620m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231621n;

    /* renamed from: o, reason: collision with root package name */
    public int f231622o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        if (this.f231621n) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.up(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        if (!this.f231621n) {
            if (this.f231622o == 0 && this.f231620m != null) {
                this.f231622o = 1;
            }
            com.tencent.mm.autogen.mmdata.rpt.LiveRoomPlayStatusStruct liveRoomPlayStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveRoomPlayStatusStruct();
            int i17 = this.f231622o;
            mn0.b0 b0Var = this.f231620m;
            if (b0Var == null || (str = ((mn0.y) b0Var).f329815q) == null) {
                str = "";
            }
            long m17 = b0Var != null ? ((mn0.y) b0Var).m() : 0L;
            java.lang.String valueOf = java.lang.String.valueOf(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0));
            ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) business(mm2.c1.class)).f328852o);
            java.lang.String w07 = b17 != null ? b17.w0() : null;
            if (w07 == null) {
                w07 = "";
            }
            df2.wp.a(liveRoomPlayStatusStruct, 1L, i17, str, m17, valueOf, w07);
            this.f231621n = true;
        }
        this.f231620m = null;
    }
}
