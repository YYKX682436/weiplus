package com.tencent.mm.plugin.sns.ui;

@db5.a(640)
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI;", "Lcom/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI;", "Lcom/tencent/mm/modelbase/u0;", "Lcom/tencent/mm/plugin/sns/ui/improve/component/k;", "Lcom/tencent/mm/plugin/sns/ui/n4;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsCommentImageFlowUI extends com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI implements com.tencent.mm.modelbase.u0, com.tencent.mm.plugin.sns.ui.improve.component.k {
    public static com.tencent.mm.ui.widget.dialog.u3 I1;
    public boolean A1;
    public boolean B1;
    public long C1;
    public int D1;
    public r45.e86 E1;
    public int F1;
    public int G1;
    public androidx.recyclerview.widget.y1 H1;
    public com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView S;
    public com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager T;
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout U;
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter V;
    public java.lang.String W;
    public com.tencent.mm.plugin.sns.ui.nh X;
    public int Y;
    public int Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f167125l1;

    /* renamed from: p0, reason: collision with root package name */
    public int f167126p0;

    /* renamed from: x0, reason: collision with root package name */
    public int f167128x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f167129x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.graphics.Rect f167130y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f167131y1;

    /* renamed from: p1, reason: collision with root package name */
    public float f167127p1 = 1.0f;

    /* renamed from: z1, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f167132z1 = new com.tencent.mm.sdk.platformtools.n3();

    public SnsCommentImageFlowUI() {
        new java.util.LinkedHashSet();
    }

    public static final void r7(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI, r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        snsCommentImageFlowUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (e86Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        } else {
            if (snsCommentImageFlowUI.W == null) {
                kotlin.jvm.internal.o.o("snsId");
                throw null;
            }
            snsCommentImageFlowUI.E1 = e86Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicDelEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            ta4.t tVar = new ta4.t();
            com.tencent.mm.plugin.sns.ui.nh nhVar = snsCommentImageFlowUI.X;
            if (nhVar == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = nhVar.f169994e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
            tVar.c(snsInfo);
            tVar.b(e86Var);
            tVar.d(snsCommentImageFlowUI.F1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicDelEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            java.util.Map e17 = tVar.e();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                tVar.a();
                ((cy1.a) rVar).Ej("cmt_big_pic_del", e17, 36244);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicDelEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicDelEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            java.lang.String str = snsCommentImageFlowUI.W;
            if (str == null) {
                kotlin.jvm.internal.o.o("snsId");
                throw null;
            }
            long n17 = com.tencent.mm.plugin.sns.storage.w2.n(str);
            java.lang.String str2 = snsCommentImageFlowUI.W;
            if (str2 == null) {
                kotlin.jvm.internal.o.o("snsId");
                throw null;
            }
            com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(n17, com.tencent.mm.plugin.sns.storage.w2.g(str2) ? 4 : 6, e86Var);
            gm0.j1.n().f273288b.g(q2Var);
            I1 = db5.e1.Q(snsCommentImageFlowUI, snsCommentImageFlowUI.getString(com.tencent.mm.R.string.f490573yv), snsCommentImageFlowUI.getString(com.tencent.mm.R.string.j9z), true, true, new com.tencent.mm.plugin.sns.ui.ug(q2Var));
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.Q().f60458r = 4L;
            java.lang.String str3 = snsCommentImageFlowUI.W;
            if (str3 == null) {
                kotlin.jvm.internal.o.o("snsId");
                throw null;
            }
            s0Var.I(com.tencent.mm.plugin.sns.storage.l1.a(str3), e86Var.f373132m, e86Var.f373126d, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    public static final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 s7(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHandler$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.sdk.platformtools.n3 n3Var = snsCommentImageFlowUI.f167132z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHandler$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return n3Var;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView t7(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRecyclerView$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView = snsCommentImageFlowUI.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRecyclerView$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return passThroughRecyclerView;
    }

    public static final /* synthetic */ int u7(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScreenHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int i17 = snsCommentImageFlowUI.f167128x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScreenHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return i17;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.nh v7(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewModel$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.nh nhVar = snsCommentImageFlowUI.X;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewModel$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return nhVar;
    }

    public static final /* synthetic */ void w7(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBottomBgVisibilityImmediate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        snsCommentImageFlowUI.E7(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBottomBgVisibilityImmediate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    public final void A7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.sns.ui.improve.component.t) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.sns.ui.improve.component.t.class)).R6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    public final boolean B7(com.tencent.mm.plugin.sns.ui.ei eiVar) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnterComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (eiVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnterComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.nh nhVar = this.X;
        if (nhVar == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        if (((int) nhVar.O6()) == 0) {
            z17 = eiVar.a().f373131i == this.D1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnterComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            return z17;
        }
        com.tencent.mm.plugin.sns.ui.nh nhVar2 = this.X;
        if (nhVar2 == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        boolean z18 = nhVar2.f169998i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        if (z18) {
            long j17 = eiVar.a().f373137r;
            com.tencent.mm.plugin.sns.ui.nh nhVar3 = this.X;
            if (nhVar3 == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            z17 = j17 == nhVar3.O6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnterComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            return z17;
        }
        long j18 = eiVar.a().f373132m;
        com.tencent.mm.plugin.sns.ui.nh nhVar4 = this.X;
        if (nhVar4 == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        z17 = j18 == nhVar4.O6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnterComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n4
    public void C2(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    public final void C7(com.tencent.mm.plugin.sns.ui.ei item, ta4.s exposeType) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicExpEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(exposeType, "exposeType");
        ta4.t tVar = new ta4.t();
        tVar.c(item.b());
        tVar.b(item.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsScene", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScene", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        tVar.d(item.f168246i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPicExpType", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        tVar.f416834e = exposeType;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPicExpType", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.tencent.mm.plugin.sns.ui.nh nhVar = this.X;
        if (nhVar == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        int size = nhVar.N6().size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTotalCommentImageCount", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        tVar.f416833d = size;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTotalCommentImageCount", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicExpEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        java.util.Map e17 = tVar.e();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            tVar.a();
            ((cy1.a) rVar).Ej("cmt_big_pic_exp", e17, 36244);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicExpEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicExpEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    public final void D7() {
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip;
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        android.graphics.Rect rect;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (x7()) {
            A7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            return;
        }
        if (this.f167130y0 == null) {
            this.f167130y0 = new android.graphics.Rect();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentCommentItem", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int y76 = y7();
        com.tencent.mm.plugin.sns.ui.ei eiVar = null;
        if (y76 >= 0) {
            com.tencent.mm.plugin.sns.ui.nh nhVar = this.X;
            if (nhVar == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            if (y76 < nhVar.N6().size()) {
                com.tencent.mm.plugin.sns.ui.nh nhVar2 = this.X;
                if (nhVar2 == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                java.lang.Object obj = nhVar2.N6().get(y76);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                eiVar = (com.tencent.mm.plugin.sns.ui.ei) obj;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentCommentItem", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                snsInfoFlip = this.f166810o;
                n3Var = this.f167132z1;
                if (snsInfoFlip != null || !B7(eiVar)) {
                    n3Var.post(new com.tencent.mm.plugin.sns.ui.wg(this));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                }
                this.Y = this.f166810o.getWidth();
                this.Z = this.f166810o.getHeight();
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f166810o;
                if (snsInfoFlip2 != null) {
                    snsInfoFlip2.S();
                }
                java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(this.f166810o.getCntMedia());
                if (l17 != null) {
                    if (!(l17.length() == 0)) {
                        if (com.tencent.mm.sdk.platformtools.x.n0(l17) != null) {
                            int i17 = (int) ((this.Y / r0.outWidth) * r0.outHeight);
                            this.Z = i17;
                            if (i17 > this.f166810o.getHeight()) {
                                if (this.Z < this.f166810o.getHeight() * 2.5d) {
                                    this.f167125l1 = this.Z - this.f166810o.getHeight();
                                    if (this.f166810o.getCount() == 1 && (rect = this.f167130y0) != null) {
                                        rect.bottom = rect.top + ((this.f166810o.getHeight() * rect.height()) / this.Z);
                                        this.f167125l1 = 0;
                                    }
                                }
                                this.Z = this.f166810o.getHeight();
                            }
                        }
                        com.tencent.mm.ui.tools.s4 z76 = z7();
                        int i18 = this.Y;
                        int i19 = this.Z;
                        z76.f210699f = i18;
                        z76.f210700g = i19;
                        android.graphics.Rect rect2 = this.f167130y0;
                        if (rect2 != null) {
                            z7().e(rect2.left, rect2.top, rect2.width(), rect2.height());
                        }
                        android.view.View currentImageView = this.f166810o.getCurrentImageView();
                        com.tencent.mm.ui.base.MMViewPager gallery = this.f166810o.getGallery();
                        android.view.View selectedView = gallery.getSelectedView();
                        if (selectedView == null) {
                            n3Var.post(new com.tencent.mm.plugin.sns.ui.yg(this));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                            return;
                        }
                        float width = this.f167130y0 != null ? (r1.width() * 1.0f) / gallery.getWidth() : 1.0f;
                        float f17 = 1;
                        float f18 = f17 - width;
                        float f19 = 2;
                        float height = ((this.f167130y0 != null ? r1.top : 0.0f) - ((gallery.getHeight() * f18) / f19)) - (((gallery.getHeight() - gallery.getWidth()) * width) / f19);
                        float width2 = (this.f167130y0 != null ? r1.left : 0.0f) - ((gallery.getWidth() * f18) / f19);
                        java.util.Objects.toString(this.f167130y0);
                        gallery.getWidth();
                        gallery.getHeight();
                        E7(false);
                        if (!(this.f167127p1 == 1.0f)) {
                            z7().f210707n = f17 / this.f167127p1;
                        }
                        z7().f210711r = this.f167125l1;
                        z7().d(selectedView, this.f167129x1, false, new com.tencent.mm.plugin.sns.ui.ch(this, currentImageView, selectedView, width2, height, width), new com.tencent.mm.plugin.sns.ui.dh(this));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                        return;
                    }
                }
                n3Var.post(new com.tencent.mm.plugin.sns.ui.xg(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentCommentItem", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        snsInfoFlip = this.f166810o;
        n3Var = this.f167132z1;
        if (snsInfoFlip != null) {
        }
        n3Var.post(new com.tencent.mm.plugin.sns.ui.wg(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    public final void E7(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBottomBgVisibilityImmediate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnapView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView = this.S;
        if (passThroughRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = passThroughRecyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        androidx.recyclerview.widget.y1 y1Var = this.H1;
        if (y1Var == null) {
            kotlin.jvm.internal.o.o("snapHelper");
            throw null;
        }
        android.view.View f17 = y1Var.f(linearLayoutManager);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnapView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (f17 != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) f17.findViewById(com.tencent.mm.R.id.v8a);
            if (linearLayout == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBottomBgVisibilityImmediate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                return;
            }
            linearLayout.setAlpha(z17 ? 1.0f : 0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBottomBgVisibilityImmediate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public void L0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        super.L0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getKeyCode() != 4) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(event);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            return dispatchKeyEvent;
        }
        if (getF65848t()) {
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
            boolean z17 = false;
            if (swipeBackLayout != null) {
                swipeBackLayout.a();
                if (swipeBackLayout.f211441v) {
                    z17 = true;
                }
            }
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                return true;
            }
        }
        if (event.getAction() == 0) {
            X6();
            D7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public boolean g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return com.tencent.mm.R.layout.eoy;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void h6(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        java.util.Set c17 = kz5.o1.c(com.tencent.mm.plugin.sns.ui.improve.component.t.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return c17;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHideStatusBar", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHideStatusBar", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public void l5() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exitTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        super.l5();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exitTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        java.util.LinkedList<r45.e86> linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        setTheme(com.tencent.mm.R.style.f494395lx);
        super.onCreate(bundle);
        java.lang.Throwable th6 = null;
        db5.f.c(this, null);
        overridePendingTransition(0, 0);
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBgColor(0);
        }
        ul5.k bounceView2 = getBounceView();
        if (bounceView2 != null) {
            bounceView2.setBounceEnabled(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("transparentStatusBar", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        if (!com.tencent.mm.ui.b4.c(this) || !enableEdgeToEdgeWrapperLayout()) {
            com.tencent.mm.ui.r0.a(this, false);
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        com.tencent.mm.ui.bk.i0(getWindow(), false);
        com.tencent.mm.ui.bk.h0(getWindow(), false);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("transparentStatusBar", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        getWindow().setSoftInputMode(48);
        hideTitleView();
        com.tencent.mm.ui.tools.s4 s4Var = new com.tencent.mm.ui.tools.s4(getContext());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImagePreviewAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        this.f167131y1 = s4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImagePreviewAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        this.f167129x1 = findViewById(com.tencent.mm.R.id.swg);
        setLightNavigationbarIcon();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupViewModel", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        java.lang.String stringExtra = getIntent().getStringExtra("sns_gallery_pcid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.W = stringExtra;
        this.C1 = getIntent().getLongExtra("K_comment_id", 0L);
        this.D1 = getIntent().getIntExtra("K_comment_create_time", 0);
        this.F1 = getIntent().getIntExtra("K_page_source", ta4.z0.f416869f.h());
        com.tencent.mm.plugin.sns.ui.nh nhVar = new com.tencent.mm.plugin.sns.ui.nh();
        this.X = nhVar;
        int i17 = this.F1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsScene", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        nhVar.f170000n = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsScene", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        com.tencent.mm.plugin.sns.ui.nh nhVar2 = this.X;
        if (nhVar2 == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        java.lang.String str = this.W;
        if (str == null) {
            kotlin.jvm.internal.o.o("snsId");
            throw null;
        }
        long j17 = this.C1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContext", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        nhVar2.f169997h = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContext", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        nhVar2.f169995f = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        nhVar2.f169996g = j17;
        nhVar2.f169999m = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupDataSource", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsObjBySnsId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        try {
            nhVar2.P6();
            com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(nhVar2.P6());
            nhVar2.f169994e = b17;
            nhVar2.f169998i = b17 != null && b17.isAd();
            snsObject = com.tencent.mm.plugin.sns.model.s5.f(nhVar2.f169994e);
        } catch (java.lang.Exception unused) {
            nhVar2.P6();
            snsObject = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObjBySnsId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        nhVar2.f169993d = snsObject;
        java.util.ArrayList arrayList = nhVar2.f170001o;
        arrayList.clear();
        com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = nhVar2.f169993d;
        if (snsObject2 != null && (linkedList = snsObject2.CommentUserList) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.e86 e86Var = (r45.e86) it.next();
                if (e86Var.f373145z > 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                    android.content.Context context = nhVar2.f169997h;
                    if (context == null) {
                        java.lang.Throwable th7 = th6;
                        kotlin.jvm.internal.o.o("context");
                        throw th7;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = nhVar2.f169994e;
                    if (snsInfo == null) {
                        java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("Required value was null.".toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupDataSource", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                        throw illegalArgumentException;
                    }
                    java.lang.String P6 = nhVar2.P6();
                    com.tencent.mm.plugin.sns.ui.n4 n4Var = nhVar2.f169999m;
                    if (n4Var == null) {
                        kotlin.jvm.internal.o.o("galleryTitleM");
                        throw null;
                    }
                    arrayList.add(new com.tencent.mm.plugin.sns.ui.ei(context, snsInfo, P6, e86Var, n4Var, nhVar2.f170000n));
                    it = it;
                    th6 = null;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupDataSource", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupViewModel", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupRecyclerView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.v8f);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.S = (com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView) findViewById;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById(com.tencent.mm.R.id.m6e);
        this.U = wxRefreshLayout;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.f();
        }
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemConvert", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1");
                com.tencent.mm.plugin.sns.ui.kg kgVar = new com.tencent.mm.plugin.sns.ui.kg(new com.tencent.mm.plugin.sns.ui.hh(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.this), new com.tencent.mm.plugin.sns.ui.ih(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.this), new com.tencent.mm.plugin.sns.ui.jh(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemConvert", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1");
                return kgVar;
            }
        };
        com.tencent.mm.plugin.sns.ui.nh nhVar3 = this.X;
        if (nhVar3 == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        this.V = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, nhVar3.N6(), true);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.T = new com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager(context2, 1, false);
        com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView = this.S;
        if (passThroughRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        passThroughRecyclerView.setAdapter(this.V);
        com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager snsScrollControllableLinearLayoutManager = this.T;
        if (snsScrollControllableLinearLayoutManager == null) {
            kotlin.jvm.internal.o.o("scrollControllableLinearLayoutManager");
            throw null;
        }
        passThroughRecyclerView.setLayoutManager(snsScrollControllableLinearLayoutManager);
        androidx.recyclerview.widget.y1 y1Var = new androidx.recyclerview.widget.y1();
        this.H1 = y1Var;
        y1Var.b(passThroughRecyclerView);
        passThroughRecyclerView.setVerticalScrollBarEnabled(false);
        passThroughRecyclerView.setHasFixedSize(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFirstItemRunDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (this.X == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        if (!r9.N6().isEmpty()) {
            com.tencent.mm.plugin.sns.ui.nh nhVar4 = this.X;
            if (nhVar4 == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip c17 = ((com.tencent.mm.plugin.sns.ui.ei) nhVar4.N6().get(0)).c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.ui.base.MMViewPager gallery = c17.getGallery();
            gallery.setGalleryScaleListener(new com.tencent.mm.plugin.sns.ui.vg(this, c17, gallery));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFirstItemRunDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView2 = this.S;
        if (passThroughRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        passThroughRecyclerView2.i(new com.tencent.mm.plugin.sns.ui.kh(this));
        if (com.tencent.mm.ui.b4.c(this) && enableEdgeToEdgeWrapperLayout()) {
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = this.U;
            on5.c loadMoreFooter = wxRefreshLayout2 != null ? wxRefreshLayout2.getLoadMoreFooter() : null;
            com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter snsCommentImageLoadMoreFooter = loadMoreFooter instanceof com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter ? (com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter) loadMoreFooter : null;
            if (snsCommentImageLoadMoreFooter != null) {
                com.tencent.mm.ui.a4.e(snsCommentImageLoadMoreFooter, true, false, 2, null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupRecyclerView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collectFlows", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        kotlinx.coroutines.y0 b18 = v65.m.b(this);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        kotlinx.coroutines.l.d(b18, g3Var, null, new com.tencent.mm.plugin.sns.ui.ng(this, null), 2, null);
        kotlinx.coroutines.l.d(v65.m.b(this), g3Var, null, new com.tencent.mm.plugin.sns.ui.pg(this, null), 2, null);
        kotlinx.coroutines.l.d(v65.m.b(this), g3Var, null, new com.tencent.mm.plugin.sns.ui.tg(this, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collectFlows", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerInterfaceCallbacks", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        gm0.j1.n().f273288b.a(218, this);
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.sns.ui.improve.component.t tVar = (com.tencent.mm.plugin.sns.ui.improve.component.t) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.sns.ui.improve.component.t.class);
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerCommentInputCallback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        tVar.f168991d = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerCommentInputCallback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerInterfaceCallbacks", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.nh nhVar5 = this.X;
        if (nhVar5 == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        nhVar5.O6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.nh nhVar6 = this.X;
        if (nhVar6 == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        java.util.Iterator it6 = nhVar6.N6().iterator();
        int i18 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i18 = -1;
                break;
            } else if (B7((com.tencent.mm.plugin.sns.ui.ei) it6.next())) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 >= 0) {
            com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView3 = this.S;
            if (passThroughRecyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(passThroughRecyclerView3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI", "scrollToComment", "(JZ)V", "Undefined", "scrollToPosition", "(I)V");
            passThroughRecyclerView3.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(passThroughRecyclerView3, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI", "scrollToComment", "(JZ)V", "Undefined", "scrollToPosition", "(I)V");
            com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView4 = this.S;
            if (passThroughRecyclerView4 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = passThroughRecyclerView4.getLayoutManager();
            com.tencent.mm.plugin.sns.ui.nh nhVar7 = this.X;
            if (nhVar7 == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            if (i18 < nhVar7.N6().size()) {
                com.tencent.mm.plugin.sns.ui.nh nhVar8 = this.X;
                if (nhVar8 == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip c18 = ((com.tencent.mm.plugin.sns.ui.ei) nhVar8.N6().get(i18)).c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsInfoFlipView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                this.f166810o = c18;
                k7(c18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsInfoFlipView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
            if (layoutManager != null) {
                this.f166810o.getGallery().setAlpha(0.0f);
                com.tencent.mm.plugin.sns.ui.nh nhVar9 = this.X;
                if (nhVar9 == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                java.lang.Object obj = nhVar9.N6().get(i18);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                C7((com.tencent.mm.plugin.sns.ui.ei) obj, ta4.s.f416819f);
                this.G1 = i18;
                com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView5 = this.S;
                if (passThroughRecyclerView5 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                android.view.ViewTreeObserver viewTreeObserver = passThroughRecyclerView5.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.eh(this, layoutManager, i18));
                }
            } else {
                if (i18 < this.G1) {
                    com.tencent.mm.plugin.sns.ui.nh nhVar10 = this.X;
                    if (nhVar10 == null) {
                        kotlin.jvm.internal.o.o("viewModel");
                        throw null;
                    }
                    java.lang.Object obj2 = nhVar10.N6().get(i18);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    C7((com.tencent.mm.plugin.sns.ui.ei) obj2, ta4.s.f416820g);
                } else {
                    com.tencent.mm.plugin.sns.ui.nh nhVar11 = this.X;
                    if (nhVar11 == null) {
                        kotlin.jvm.internal.o.o("viewModel");
                        throw null;
                    }
                    java.lang.Object obj3 = nhVar11.N6().get(i18);
                    kotlin.jvm.internal.o.f(obj3, "get(...)");
                    C7((com.tencent.mm.plugin.sns.ui.ei) obj3, ta4.s.f416821h);
                }
                this.G1 = i18;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unRegisterInterfaceCallbacks", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        gm0.j1.n().f273288b.q(218, this);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.ui.improve.component.t tVar = (com.tencent.mm.plugin.sns.ui.improve.component.t) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.sns.ui.improve.component.t.class);
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unRegisterCommentInputCallback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        tVar.f168991d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unRegisterCommentInputCallback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unRegisterInterfaceCallbacks", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.nh nhVar = this.X;
        if (nhVar == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        nhVar.clear();
        this.f166810o = null;
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        super.onPause();
        this.A1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRestoreInstanceState", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        kotlin.jvm.internal.o.g(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRestoreInstanceState", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (m1Var != null && m1Var.getType() == 218 && (u3Var = I1) != null) {
            kotlin.jvm.internal.o.d(u3Var);
            u3Var.dismiss();
            r45.e86 e86Var = this.E1;
            if (e86Var != null) {
                java.lang.String str2 = this.W;
                if (str2 == null) {
                    kotlin.jvm.internal.o.o("snsId");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDeleteCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
                e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
                e4Var.f211776c = getString(com.tencent.mm.R.string.md7);
                e4Var.c();
                com.tencent.mm.plugin.sns.ui.nh nhVar = this.X;
                if (nhVar == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                if (e86Var == null || !kotlin.jvm.internal.o.b(str2, nhVar.P6())) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                } else {
                    long j17 = e86Var.f373132m;
                    if (nhVar.f169998i) {
                        j17 = e86Var.f373137r;
                    }
                    java.util.ArrayList arrayList = nhVar.f170001o;
                    java.util.Iterator it = arrayList.iterator();
                    int i27 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i28 = i27 + 1;
                        com.tencent.mm.plugin.sns.ui.ei eiVar = (com.tencent.mm.plugin.sns.ui.ei) it.next();
                        if (eiVar.getItemId() == j17) {
                            arrayList.remove(i27);
                            eiVar.d();
                            ((kotlinx.coroutines.flow.q2) nhVar.f170004r).e(new jz5.l(eiVar, java.lang.Integer.valueOf(i27)));
                            break;
                        }
                        i27 = i28;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDeleteCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                this.E1 = null;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        super.onStart();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        super.onStop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public void p7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("titleBarGone", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("titleBarGone", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    public final boolean x7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.ui.improve.component.t tVar = (com.tencent.mm.plugin.sns.ui.improve.component.t) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.sns.ui.improve.component.t.class);
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        boolean z17 = tVar.P6().getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void y0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void y1(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
    }

    public final int y7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentSnapPosition", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView = this.S;
        if (passThroughRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = passThroughRecyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        androidx.recyclerview.widget.y1 y1Var = this.H1;
        if (y1Var == null) {
            kotlin.jvm.internal.o.o("snapHelper");
            throw null;
        }
        android.view.View f17 = y1Var.f(linearLayoutManager);
        int position = f17 != null ? linearLayoutManager.getPosition(f17) : -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentSnapPosition", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        return position;
    }

    public final com.tencent.mm.ui.tools.s4 z7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImagePreviewAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.ui.tools.s4 s4Var = this.f167131y1;
        if (s4Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagePreviewAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            return s4Var;
        }
        kotlin.jvm.internal.o.o("imagePreviewAnimation");
        throw null;
    }
}
