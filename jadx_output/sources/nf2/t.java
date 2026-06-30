package nf2;

/* loaded from: classes10.dex */
public final class t implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336798d;

    public t(nf2.w wVar) {
        this.f336798d = wVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.g94 g94Var = (r45.g94) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (g94Var != null) {
            nf2.w wVar = this.f336798d;
            wVar.getClass();
            boolean z17 = g94Var.f375022m;
            if (z17 && wVar.f336813r) {
                ko0.d0.f309840a.a("handleVisitorSEIData_collapse_event", 5, "FinderLiveLyricsController", "handleVisitorSEIData: sei is_collapsed=true");
                ko0.d0.f309841b.remove("handleVisitorSEIData_expand_event");
                nf2.d1 d1Var = wVar.f336808m;
                if (d1Var != null) {
                    com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = d1Var.f336698s;
                    if (finderLiveNormalRoomLyricsRenderView != null) {
                        finderLiveNormalRoomLyricsRenderView.i();
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "stopRender");
                }
                wVar.f336813r = false;
                wVar.b7();
            } else {
                if (!wVar.f336813r && !z17) {
                    ko0.d0.f309840a.a("handleVisitorSEIData_expand_event", 5, "FinderLiveLyricsController", "handleVisitorSEIData: sei is_collapsed=false, but not rendering");
                    ko0.d0.f309841b.remove("handleVisitorSEIData_collapse_event");
                    wVar.a7((mm2.j6) ((kotlinx.coroutines.flow.h3) wVar.Z6().f329251s).getValue());
                }
                nf2.d1 d1Var2 = wVar.f336808m;
                if (d1Var2 != null) {
                    int i17 = g94Var.f375018f;
                    com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView2 = d1Var2.f336698s;
                    if (finderLiveNormalRoomLyricsRenderView2 != null) {
                        finderLiveNormalRoomLyricsRenderView2.f111595i = i17;
                    }
                }
                r45.e94 e94Var = g94Var.f375019g;
                int i18 = e94Var != null ? e94Var.f373162d : 50;
                int i19 = e94Var != null ? e94Var.f373163e : 18;
                if (i18 != wVar.f336814s || i19 != wVar.f336815t) {
                    wVar.f336814s = i18;
                    wVar.f336815t = i19;
                    if (d1Var2 != null) {
                        d1Var2.l(i18 / 100.0f, i19 / 100.0f);
                    }
                }
                r45.f94 f94Var = g94Var.f375020h;
                if (f94Var != null) {
                    boolean z18 = f94Var.f374112d;
                    java.lang.String str = f94Var.f374113e;
                    if (!kotlin.jvm.internal.o.b(java.lang.Boolean.valueOf(z18), wVar.f336816u) || !kotlin.jvm.internal.o.b(str, wVar.f336817v)) {
                        com.tencent.mars.xlog.Log.i("FinderLiveLyricsController", "updateVisitorStyle: isVertical=" + z18 + ", colorRgba=" + str);
                        wVar.f336816u = java.lang.Boolean.valueOf(z18);
                        wVar.f336817v = str;
                        nf2.f1 a17 = nf2.f1.a(wVar.f336818w, 0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, z18 ? nf2.a.f336649f : nf2.a.f336648e, z18 ? nf2.k1.f336768e : nf2.k1.f336767d, null, 0L, wVar.e7(str), 106495, null);
                        wVar.f336818w = a17;
                        nf2.d1 d1Var3 = wVar.f336808m;
                        if (d1Var3 != null) {
                            d1Var3.j(a17);
                        }
                    }
                }
            }
        }
        return f0Var;
    }
}
