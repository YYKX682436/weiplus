package op4;

/* loaded from: classes10.dex */
public class h extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout f347281e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347282f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f347283g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f347284h;

    public h(com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f347281e = pluginLayout;
        this.f347282f = "";
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct();
        this.f347291d = finderShowInWXProfileStruct;
        finderShowInWXProfileStruct.p("101");
    }

    @Override // op4.k
    public java.lang.String g() {
        return "21875";
    }

    public final void j(boolean z17) {
        jx3.a aVar = this.f347291d;
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) aVar;
        if (finderShowInWXProfileStruct != null) {
            finderShowInWXProfileStruct.f57829g = 1;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) aVar;
        if (finderShowInWXProfileStruct2 != null) {
            finderShowInWXProfileStruct2.r(java.lang.String.valueOf(c01.id.c()));
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct3 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
        if (finderShowInWXProfileStruct3 != null) {
            finderShowInWXProfileStruct3.q("like_fav_feed_music");
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct4 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
        if (finderShowInWXProfileStruct4 != null) {
            cl0.g gVar = new cl0.g();
            gVar.o("if_show_reddot", z17 ? 1 : 0);
            java.lang.String gVar2 = gVar.h("editId", this.f347282f).toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            finderShowInWXProfileStruct4.t(r26.i0.t(gVar2, ",", ";", false));
        }
        e();
    }

    public final void l(boolean z17) {
        jx3.a aVar = this.f347291d;
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) aVar;
        if (finderShowInWXProfileStruct != null) {
            finderShowInWXProfileStruct.f57829g = 0;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) aVar;
        if (finderShowInWXProfileStruct2 != null) {
            finderShowInWXProfileStruct2.r(java.lang.String.valueOf(c01.id.c()));
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct3 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
        if (finderShowInWXProfileStruct3 != null) {
            finderShowInWXProfileStruct3.q("like_fav_feed_music");
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct4 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
        if (finderShowInWXProfileStruct4 != null) {
            cl0.g gVar = new cl0.g();
            gVar.o("if_show_reddot", z17 ? 1 : 0);
            java.lang.String gVar2 = gVar.h("editId", this.f347282f).toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            finderShowInWXProfileStruct4.t(r26.i0.t(gVar2, ",", ";", false));
        }
        e();
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = this.f347281e;
        if (ordinal != 48) {
            if (ordinal == 50) {
                yo4.p pVar = (yo4.p) basePluginLayout.j(yo4.p.class);
                if (pVar == null || !pVar.A().isShowFinderSelectPanel()) {
                    return;
                }
                j(pVar.A().getF155976p1());
                return;
            }
            if (ordinal == 69 || ordinal == 164) {
                if (status == ju3.c0.E1) {
                    this.f347283g = true;
                    this.f347284h = true;
                }
                yo4.p pVar2 = (yo4.p) basePluginLayout.j(yo4.p.class);
                if (pVar2 != null) {
                    int i17 = pVar2.f464286q.getVisibility() != 0 ? 0 : 1;
                    if (this.f347283g) {
                        this.f347283g = false;
                        return;
                    }
                    com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
                    if (finderShowInWXProfileStruct != null) {
                        finderShowInWXProfileStruct.f57829g = 0;
                    }
                    if (finderShowInWXProfileStruct != null) {
                        finderShowInWXProfileStruct.r(java.lang.String.valueOf(c01.id.c()));
                    }
                    com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
                    if (finderShowInWXProfileStruct2 != null) {
                        finderShowInWXProfileStruct2.q("music_use");
                    }
                    com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct3 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
                    if (finderShowInWXProfileStruct3 != null) {
                        cl0.g gVar = new cl0.g();
                        gVar.o("tips", i17);
                        java.lang.String gVar2 = gVar.h("editId", this.f347282f).toString();
                        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                        finderShowInWXProfileStruct3.t(r26.i0.t(gVar2, ",", ";", false));
                    }
                    e();
                    return;
                }
                return;
            }
            if (ordinal != 97 && ordinal != 98) {
                return;
            }
        }
        yo4.p pVar3 = (yo4.p) basePluginLayout.j(yo4.p.class);
        if (pVar3 != null) {
            if (status == ju3.c0.S) {
                boolean z17 = pVar3.f464294y;
                if (this.f347284h) {
                    this.f347284h = false;
                } else {
                    com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct4 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
                    if (finderShowInWXProfileStruct4 != null) {
                        finderShowInWXProfileStruct4.f57829g = 1;
                    }
                    if (finderShowInWXProfileStruct4 != null) {
                        finderShowInWXProfileStruct4.r(java.lang.String.valueOf(c01.id.c()));
                    }
                    com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct5 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
                    if (finderShowInWXProfileStruct5 != null) {
                        finderShowInWXProfileStruct5.q("music_use");
                    }
                    com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct6 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) this.f347291d;
                    if (finderShowInWXProfileStruct6 != null) {
                        cl0.g gVar3 = new cl0.g();
                        gVar3.o("tips", z17 ? 1 : 0);
                        java.lang.String gVar4 = gVar3.h("editId", this.f347282f).toString();
                        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
                        finderShowInWXProfileStruct6.t(r26.i0.t(gVar4, ",", ";", false));
                    }
                    e();
                }
            }
            if (com.tencent.mm.plugin.vlog.model.v0.a()) {
                l(pVar3.A().isShowFinderRedDot());
            }
        }
    }
}
