package t74;

/* loaded from: classes4.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f416107a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f416108b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f416109c;

    /* renamed from: d, reason: collision with root package name */
    public final int f416110d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f416111e;

    /* renamed from: f, reason: collision with root package name */
    public final i64.b1 f416112f;

    /* renamed from: g, reason: collision with root package name */
    public final w64.n f416113g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f416114h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f416115i;

    /* renamed from: j, reason: collision with root package name */
    public final int f416116j;

    public b2(android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar, com.tencent.mm.plugin.sns.ui.listener.i iVar, android.content.Context context, int i18) {
        this.f416107a = viewGroup;
        this.f416108b = viewGroup2;
        this.f416109c = view;
        this.f416110d = i17;
        this.f416111e = z17;
        this.f416112f = b1Var;
        this.f416113g = nVar;
        this.f416114h = iVar;
        this.f416115i = context;
        this.f416116j = i18;
    }

    public final android.content.Context a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        return this.f416115i;
    }

    public final android.view.ViewGroup b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        return this.f416107a;
    }

    public final android.view.ViewGroup c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        return this.f416108b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return true;
        }
        if (!(obj instanceof t74.b2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        t74.b2 b2Var = (t74.b2) obj;
        if (!kotlin.jvm.internal.o.b(this.f416107a, b2Var.f416107a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f416108b, b2Var.f416108b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f416109c, b2Var.f416109c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        if (this.f416110d != b2Var.f416110d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        if (this.f416111e != b2Var.f416111e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f416112f, b2Var.f416112f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f416113g, b2Var.f416113g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f416114h, b2Var.f416114h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f416115i, b2Var.f416115i)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            return false;
        }
        int i17 = this.f416116j;
        int i18 = b2Var.f416116j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        android.view.ViewGroup viewGroup = this.f416107a;
        int hashCode = (viewGroup == null ? 0 : viewGroup.hashCode()) * 31;
        android.view.ViewGroup viewGroup2 = this.f416108b;
        int hashCode2 = (hashCode + (viewGroup2 == null ? 0 : viewGroup2.hashCode())) * 31;
        android.view.View view = this.f416109c;
        int hashCode3 = (((((hashCode2 + (view == null ? 0 : view.hashCode())) * 31) + java.lang.Integer.hashCode(this.f416110d)) * 31) + java.lang.Boolean.hashCode(this.f416111e)) * 31;
        i64.b1 b1Var = this.f416112f;
        int hashCode4 = (hashCode3 + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        w64.n nVar = this.f416113g;
        int hashCode5 = (hashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f416114h;
        int hashCode6 = (hashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        android.content.Context context = this.f416115i;
        int hashCode7 = ((hashCode6 + (context != null ? context.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f416116j);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        return hashCode7;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        java.lang.String str = "FlipCardContext(flipCardContainer=" + this.f416107a + ", flipCardTouchContainer=" + this.f416108b + ", itemRootView=" + this.f416109c + ", adDisplayWidth=" + this.f416110d + ", inLargeWindow=" + this.f416111e + ", snsAdStatistic=" + this.f416112f + ", adClickActionHandler=" + this.f416113g + ", timelineClickListener=" + this.f416114h + ", context=" + this.f416115i + ", source=" + this.f416116j + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        return str;
    }
}
