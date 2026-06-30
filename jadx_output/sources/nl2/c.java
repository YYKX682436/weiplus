package nl2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m3 f338172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nl2.g f338173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bm2.m3 m3Var, nl2.g gVar) {
        super(1);
        this.f338172d = m3Var;
        this.f338173e = gVar;
    }

    public static final void a(nl2.g gVar, bm2.j3 j3Var) {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = (com.tencent.mm.plugin.finder.live.plugin.et) gVar.R6(com.tencent.mm.plugin.finder.live.plugin.et.class);
        if (etVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendFastOuterCommentMsg ");
            sb6.append(j3Var != null ? j3Var.f22005a : null);
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", sb6.toString());
            etVar.V1(j3Var, ((mm2.j2) etVar.P0(mm2.j2.class)).S6());
        }
        ((mm2.u0) gVar.business(mm2.u0.class)).O6(j3Var.f22008d, j3Var.f22005a, j3Var.f22009e);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String l17;
        int intValue = ((java.lang.Number) obj).intValue();
        bm2.j3 j3Var = (bm2.j3) kz5.n0.a0(this.f338172d.f22097f, intValue);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (j3Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveOuterShortcutWordingController", "cannot get fastCommentInfo at " + intValue);
        } else {
            nl2.g gVar = this.f338173e;
            com.tencent.mm.plugin.finder.live.widget.bq bqVar = new com.tencent.mm.plugin.finder.live.widget.bq(gVar.O6(), gVar.getStore().getLiveRoomData(), false, 4, null);
            zl2.r4 r4Var = zl2.r4.f473950a;
            int i17 = r4Var.I0().getInt("finder_live_fast_comment_guide_show_cnt", 0);
            com.tencent.mars.xlog.Log.i("FinderLiveOuterShortcutWordingController", "shouldShowQuickCommentGuide " + i17);
            jz5.f0 f0Var2 = null;
            com.tencent.mm.plugin.finder.live.widget.bq bqVar2 = i17 == 0 ? bqVar : null;
            if (bqVar2 != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveOuterShortcutWordingController", "open guide panel");
                r4Var.I0().putInt("finder_live_fast_comment_guide_show_cnt", 1);
                gk2.e eVar = dk2.ef.I;
                if (eVar == null || (l17 = r4Var.m0(eVar).getNickname()) == null) {
                    l17 = c01.z1.l();
                }
                java.lang.String content = j3Var.f22005a;
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mm.pluginsdk.ui.span.f0 f0Var3 = new com.tencent.mm.pluginsdk.ui.span.f0(l17 + ": " + content);
                android.content.Context context = bqVar2.f118183e;
                f0Var3.c(new android.text.style.ForegroundColorSpan(context.getColor(com.tencent.mm.R.color.adi)), 0, l17.length() + 1, 33);
                f0Var3.c(new android.text.style.ForegroundColorSpan(context.getColor(com.tencent.mm.R.color.adh)), l17.length() + 1, f0Var3.length(), 33);
                bqVar2.L = f0Var3;
                bqVar2.K = new nl2.b(j3Var, gVar);
                com.tencent.mm.plugin.finder.live.widget.e0.W(bqVar2, null, false, 0, 7, null);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                a(gVar, j3Var);
            }
        }
        return f0Var;
    }
}
