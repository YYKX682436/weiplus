package ed4;

/* loaded from: classes4.dex */
public class f implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f251293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.r0 f251294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f251296g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.l f251297h;

    public f(com.tencent.mm.plugin.sns.ui.item.l lVar, android.view.ViewGroup viewGroup, s34.r0 r0Var, java.lang.String str, int i17) {
        this.f251297h = lVar;
        this.f251293d = viewGroup;
        this.f251294e = r0Var;
        this.f251295f = str;
        this.f251296g = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$4");
        android.view.ViewGroup viewGroup = this.f251293d;
        if (!viewGroup.isAttachedToWindow()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$4");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.item.l lVar = this.f251297h;
        int height = com.tencent.mm.plugin.sns.ui.item.l.F(lVar).D0.getHeight();
        int height2 = viewGroup.getHeight();
        if (height <= 0 || height2 <= 0) {
            com.tencent.mars.xlog.Log.w("MiroMsg.CardAdTimeLineItem", "checkShowLivingAnim, contentH==0");
        } else {
            int b17 = (height - height2) + i65.a.b(lVar.f169249f, 8);
            com.tencent.mm.plugin.sns.ui.item.l.F(lVar).f169363e1.d(this.f251294e, this.f251295f, this.f251296g, b17);
            com.tencent.mm.plugin.sns.ui.item.l.F(lVar).f169363e1.setVisibility(0);
        }
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$4");
        return true;
    }
}
