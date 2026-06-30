package ze5;

/* loaded from: classes9.dex */
public final class t7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f472208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f472210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(long j17, yb5.d dVar, android.view.View view) {
        super(2);
        this.f472208d = j17;
        this.f472209e = dVar;
        this.f472210f = view;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int height;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g((android.view.View) obj, "<anonymous parameter 0>");
        long j17 = this.f472208d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[LAYOUT_TRACE] smoothHeightChanged: svrId=%d, dy=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
        sb5.r2 r2Var = (sb5.r2) this.f472209e.f460708c.a(sb5.r2.class);
        if (r2Var != null) {
            com.tencent.mm.ui.chatting.component.hp hpVar = (com.tencent.mm.ui.chatting.component.hp) r2Var;
            android.view.View itemView = this.f472210f;
            kotlin.jvm.internal.o.g(itemView, "itemView");
            yb5.d dVar = hpVar.f198580d;
            boolean B = dVar != null ? dVar.B() : false;
            if (intValue > 0) {
                if (hpVar.f199201i) {
                    hpVar.f199201i = false;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMdScroll", "suppressNextDy consumed, svrId=%d", java.lang.Long.valueOf(j17));
                } else if (!hpVar.f199198f) {
                    if (B) {
                        com.tencent.mm.pluginsdk.ui.tools.v3 p17 = dVar != null ? dVar.p() : null;
                        if (p17 != null && (height = p17.getHeight()) > 0) {
                            android.util.DisplayMetrics displayMetrics = itemView.getResources().getDisplayMetrics();
                            int max = (int) (java.lang.Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels) * 0.25f);
                            int top = itemView.getTop();
                            int i17 = height - top;
                            if (!hpVar.f199200h) {
                                if (!hpVar.f199199g) {
                                    if (i17 >= max) {
                                        hpVar.f199199g = true;
                                        fd5.d m07 = hpVar.m0();
                                        if (m07 != null) {
                                            m07.c(false);
                                        }
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMdScroll", "enter CAPPED: svrId=%d, top=%d, rvH=%d, remain=%d, reserve=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(top), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(max));
                                    }
                                }
                            }
                            fd5.d m08 = hpVar.m0();
                            if (m08 != null) {
                                m08.c(true);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMdScroll", "follow layoutToLast: svrId=%d, dy=%d, top=%d, uncapped=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(top), java.lang.Boolean.valueOf(hpVar.f199200h));
                        }
                    } else {
                        fd5.d m09 = hpVar.m0();
                        if (m09 != null) {
                            m09.c(false);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMdScroll", "skip: not at bottom, svrId=%d, dy=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
