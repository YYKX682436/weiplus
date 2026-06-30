package uc4;

/* loaded from: classes4.dex */
public class t0 extends uc4.m0 {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f426454g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f426455h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426454g = jz5.h.b(new uc4.r0(this));
        this.f426455h = "";
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        super.a(view);
        xc4.p c17 = c();
        this.f426455h = c17 != null ? c17.a1() : "";
        if (view != null) {
            view.setTag(n());
        }
        o(view);
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "ClickMusicFeedCount", this.f426455h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        zy1.e.f477325a.e(12076, "ClickImageFeedCount", this.f426455h);
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLinkMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = (com.tencent.mm.plugin.sns.ui.listener.h1) ((jz5.n) this.f426454g).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLinkMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        return h1Var;
    }

    @Override // uc4.g
    public void k(android.view.View view, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        super.k(view, z17, z18, z19);
        if (view != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.bpo)) != null) {
            weImageView.setOnClickListener(new uc4.s0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
    }

    public com.tencent.mm.plugin.sns.ui.i2 n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        xc4.p c17 = c();
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = c17 != null ? c17.h1() : null;
        xc4.p c18 = c();
        com.tencent.mm.plugin.sns.ui.i2 i2Var = new com.tencent.mm.plugin.sns.ui.i2(h17, c18 != null ? c18.W0() : "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        return i2Var;
    }

    public void o(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMusicItemClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        com.tencent.mm.plugin.sns.ui.kw.h(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMusicItemClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
    }
}
