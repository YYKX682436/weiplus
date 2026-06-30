package yc2;

/* loaded from: classes2.dex */
public class f extends xc2.o {

    /* renamed from: g, reason: collision with root package name */
    public long f460829g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460830h = "";

    @Override // xc2.j, xc2.z2
    public void f(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.f(holder, jumpView, infoEx);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        if (baseFinderFeed != null) {
            com.tencent.mm.plugin.finder.view.er.f132052f.b(jumpView, baseFinderFeed, "view_exp");
        }
    }

    @Override // xc2.j, xc2.z2
    public void h(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        java.lang.String necessary_params;
        java.lang.String str = "";
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.h(z17, holder, jumpView, infoEx);
        if (z17) {
            this.f460829g = java.lang.System.currentTimeMillis();
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = infoEx.f453234a.getNative_info();
            if (native_info != null && (necessary_params = native_info.getNecessary_params()) != null) {
                try {
                    cl0.g gVar = new cl0.g(necessary_params);
                    java.lang.String str2 = null;
                    try {
                        if (gVar.has("object_id")) {
                            str2 = gVar.getString("object_id");
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                    this.f460830h = str;
                } catch (org.json.JSONException unused) {
                    com.tencent.mars.xlog.Log.e("FinderJumperLivingBaseEventHandler", "Failed to parse JSON from necessary_params:".concat(necessary_params));
                }
            }
        }
        if (z17 && ((java.lang.Number) ae2.in.f3688a.u().r()).intValue() == 1 && (baseFinderFeed = infoEx.f453244f) != null) {
            so2.k2 k2Var = so2.o2.f410517f;
            so2.o2 a17 = k2Var.a();
            so2.o2 a18 = k2Var.a();
            long id6 = baseFinderFeed.getFeedObject().getId();
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            a17.h(0, a18.c(id6, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n), null, null, jumpView);
        }
    }

    @Override // xc2.o, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.r(holder, jumpView, infoEx);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        if (baseFinderFeed != null) {
            com.tencent.mm.plugin.finder.view.er.f132052f.b(jumpView, baseFinderFeed, "view_clk");
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            if (V6 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("feed_living_item", "view_clk", kz5.c1.k(new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId())), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("session_buffer", r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), V6.getInteger(5)), ",", ";", false)), new jz5.l("expose_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f460829g)), new jz5.l("live_object_id", this.f460830h), new jz5.l("finder_username", baseFinderFeed.getFeedObject().getUserName()), new jz5.l("extra_info", V6.getString(11))), 1, false);
            }
        }
    }
}
