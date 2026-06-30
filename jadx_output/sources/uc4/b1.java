package uc4;

/* loaded from: classes4.dex */
public class b1 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f426381f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.h1 f426382g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f426383h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426381f = jz5.h.b(new uc4.z0(context));
        this.f426382g = new uc4.a1(context, this);
        this.f426383h = "";
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        long j17;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            return;
        }
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        java.lang.Object tag = view.getTag();
        if (tag instanceof com.tencent.mm.plugin.sns.ui.oj) {
            com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) tag;
            ojVar.f170104c = j();
            android.content.Context context = b();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var = (com.tencent.mm.plugin.sns.ui.improve.component.f2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.f2.class);
            f2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            long h17 = f2Var.f168794d.h(ojVar.f170102a, 6);
            i17 = ojVar.f170103b;
            j17 = h17;
        } else {
            j17 = 0;
            i17 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDialogShowerMgr", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        com.tencent.mm.plugin.sns.ui.kj kjVar = (com.tencent.mm.plugin.sns.ui.kj) ((jz5.n) this.f426381f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDialogShowerMgr", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        kjVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        kjVar.e(view, 1, 0, null, j17, false, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        n(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        com.tencent.mm.protocal.protobuf.TimeLineObject h18 = c17.h1();
        r45.y8 y8Var = h18.AppInfo;
        java.lang.String str = y8Var == null ? null : y8Var.f390846d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ni(null, str, ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(str, false), h18.UserName, 2, 4, 4, h18.statisticsData, 0L, h18.Id);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = this.f426382g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        return h1Var;
    }

    @Override // uc4.g
    public boolean i(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 2) {
            xc4.p c17 = c();
            if (c17 == null) {
                super.i(menuItem, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                zy1.e.f477325a.e(12076, "ClickImageFeedCount", this.f426383h);
                return false;
            }
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "FavFeedCount", c17.a1());
        } else if (itemId == 21) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportClick$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            n(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportClick$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        }
        super.i(menuItem, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        return false;
    }

    @Override // uc4.g
    public void m(in5.s0 s0Var, xc4.p info, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        kotlin.jvm.internal.o.g(info, "info");
        super.m(s0Var, info, i17);
        this.f426383h = info.a1();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
    }

    public final void n(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
        xc4.p c17 = c();
        java.lang.String a17 = c17 != null ? c17.a1() : "";
        zy1.f fVar = (zy1.f) sVar;
        fVar.Bi(12076, "ClickFeedCount", 1);
        fVar.Di(12076, "ClickFeedId", a17);
        fVar.Di(12076, "ClickImageFeedCount", a17);
        fVar.Ni(12076, "BrowseFullScreenImageTime");
        yc4.b0 b0Var = yc4.b0.f460839a;
        xc4.p c18 = c();
        b0Var.b(c18 != null ? c18.a1() : "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
    }
}
