package v74;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f433912a;

    /* renamed from: b, reason: collision with root package name */
    public final i64.b1 f433913b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView f433914c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f433915d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f433916e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewStub f433917f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f433918g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewStub f433919h;

    public t(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewStub viewStub, android.widget.ImageView imageView, android.view.ViewStub viewStub2) {
        this.f433912a = activity;
        this.f433913b = b1Var;
        this.f433914c = overScrollRecyclerView;
        this.f433915d = viewGroup;
        this.f433916e = viewGroup2;
        this.f433917f = viewStub;
        this.f433918g = imageView;
        this.f433919h = viewStub2;
    }

    public final android.widget.ImageView a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCharmImageView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCharmImageView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        return this.f433918g;
    }

    public final com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        return this.f433914c;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return true;
        }
        if (!(obj instanceof v74.t)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return false;
        }
        v74.t tVar = (v74.t) obj;
        if (!kotlin.jvm.internal.o.b(this.f433912a, tVar.f433912a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f433913b, tVar.f433913b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f433914c, tVar.f433914c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f433915d, tVar.f433915d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f433916e, tVar.f433916e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f433917f, tVar.f433917f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f433918g, tVar.f433918g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f433919h, tVar.f433919h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        android.app.Activity activity = this.f433912a;
        int hashCode = (activity == null ? 0 : activity.hashCode()) * 31;
        i64.b1 b1Var = this.f433913b;
        int hashCode2 = (hashCode + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = this.f433914c;
        int hashCode3 = (hashCode2 + (overScrollRecyclerView == null ? 0 : overScrollRecyclerView.hashCode())) * 31;
        android.view.ViewGroup viewGroup = this.f433915d;
        int hashCode4 = (hashCode3 + (viewGroup == null ? 0 : viewGroup.hashCode())) * 31;
        android.view.ViewGroup viewGroup2 = this.f433916e;
        int hashCode5 = (hashCode4 + (viewGroup2 == null ? 0 : viewGroup2.hashCode())) * 31;
        android.view.ViewStub viewStub = this.f433917f;
        int hashCode6 = (hashCode5 + (viewStub == null ? 0 : viewStub.hashCode())) * 31;
        android.widget.ImageView imageView = this.f433918g;
        int hashCode7 = (hashCode6 + (imageView == null ? 0 : imageView.hashCode())) * 31;
        android.view.ViewStub viewStub2 = this.f433919h;
        int hashCode8 = hashCode7 + (viewStub2 != null ? viewStub2.hashCode() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        return hashCode8;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        java.lang.String str = "LookbookContext(activity=" + this.f433912a + ", snsAdStatistic=" + this.f433913b + ", recyclerView=" + this.f433914c + ", recyclerViewContainer=" + this.f433915d + ", contentKeeperLayout=" + this.f433916e + ", pagAnimContainerStub=" + this.f433917f + ", charmImageView=" + this.f433918g + ", splashCardStub=" + this.f433919h + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        return str;
    }
}
