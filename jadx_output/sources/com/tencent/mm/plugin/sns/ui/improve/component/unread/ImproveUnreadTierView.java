package com.tencent.mm.plugin.sns.ui.improve.component.unread;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\u001d\u0010\b\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadTierView;", "Landroid/widget/LinearLayout;", "Ljava/util/Observer;", "Landroid/view/ViewGroup;", "d", "Ljz5/g;", "getUnreadTipView", "()Landroid/view/ViewGroup;", "unreadTipView", "Lcom/tencent/mm/ui/widget/StoryAvatarDotsView;", "e", "getUnreadAvatarView", "()Lcom/tencent/mm/ui/widget/StoryAvatarDotsView;", "unreadAvatarView", "", "h", "getLazyInflate", "()Z", "lazyInflate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveUnreadTierView extends android.widget.LinearLayout implements java.util.Observer {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f169003i = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g unreadTipView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g unreadAvatarView;

    /* renamed from: f, reason: collision with root package name */
    public zc4.b f169006f;

    /* renamed from: g, reason: collision with root package name */
    public in5.s0 f169007g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g lazyInflate;

    public ImproveUnreadTierView(android.content.Context context) {
        super(context);
        this.unreadTipView = jz5.h.b(new oc4.f(this));
        this.unreadAvatarView = jz5.h.b(new oc4.e(this));
        ym5.a1.h(this, new oc4.a(this));
        this.lazyInflate = jz5.h.b(new oc4.b(this));
    }

    private final boolean getLazyInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLazyInflate", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        boolean booleanValue = ((java.lang.Boolean) this.lazyInflate.getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLazyInflate", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        return booleanValue;
    }

    private final com.tencent.mm.ui.widget.StoryAvatarDotsView getUnreadAvatarView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnreadAvatarView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        com.tencent.mm.ui.widget.StoryAvatarDotsView storyAvatarDotsView = (com.tencent.mm.ui.widget.StoryAvatarDotsView) this.unreadAvatarView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadAvatarView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        return storyAvatarDotsView;
    }

    private final android.view.ViewGroup getUnreadTipView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnreadTipView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.unreadTipView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadTipView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        return viewGroup;
    }

    public final void a(oc4.v vVar, xc4.p pVar) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showUnreadTierView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = (com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) a17;
        java.util.ArrayList arrayList = improveDataUIC.S6().f152065o;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((zc4.b) obj).n().a1(), kz5.n0.X(vVar.a()))) {
                    break;
                }
            }
        }
        zc4.b bVar = (zc4.b) obj;
        int indexOf = arrayList.indexOf(bVar);
        int indexOf2 = arrayList.indexOf(this.f169006f);
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUnreadDataPrepared", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            boolean z17 = !improveDataUIC.f168767e.b().isEmpty();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUnreadDataPrepared", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImproveUnreadTierView", "jump data not prepare, curIndex:" + indexOf2 + " targetIndex:" + indexOf);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showUnreadTierView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("targetUserNames size:");
        vVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserNames", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserNames", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        sb6.append(vVar.f344371c.size());
        sb6.append(" inflate:");
        sb6.append(getLazyInflate());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveUnreadTierView", sb6.toString());
        in5.s0 s0Var = this.f169007g;
        i64.u1.a(203, (s0Var != null ? s0Var.getAdapterPosition() : 0) - 1);
        android.view.ViewGroup unreadTipView = getUnreadTipView();
        if (unreadTipView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showUnreadTierView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
            return;
        }
        com.tencent.mm.ui.widget.StoryAvatarDotsView unreadAvatarView = getUnreadAvatarView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserNames", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserNames", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        if (unreadAvatarView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        } else {
            unreadAvatarView.setVisibility(0);
            unreadAvatarView.setIconSize(i65.a.b(getContext(), 20));
            unreadAvatarView.setIconGap(i65.a.b(getContext(), 24));
            java.util.ArrayList arrayList2 = vVar.f344371c;
            if (arrayList2.size() > 0) {
                unreadAvatarView.setVisibility(0);
                unreadAvatarView.setIconLayerCount(java.lang.Math.min(arrayList2.size(), 3));
                int childCount = unreadAvatarView.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(unreadAvatarView.a(i17), (java.lang.String) arrayList2.get(i17), 0.1f);
                    unreadAvatarView.a(i17).setPadding(i65.a.b(getContext(), 1), i65.a.b(getContext(), 1), i65.a.b(getContext(), 1), i65.a.b(getContext(), 1));
                    i17++;
                    childCount = childCount;
                    arrayList2 = arrayList2;
                }
            } else {
                unreadAvatarView.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        }
        unreadTipView.invalidate();
        unreadTipView.post(new oc4.c(unreadTipView));
        unreadTipView.setTag(pVar.a1());
        unreadTipView.setOnClickListener(new oc4.d(this, indexOf, indexOf2, pVar, improveDataUIC));
        setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showUnreadTierView", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVisible", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        zc4.b bVar = this.f169006f;
        xc4.p n17 = bVar != null ? bVar.n() : null;
        oc4.g gVar = com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.f169009s;
        if (gVar.a()) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = (com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC) a17;
            in5.s0 s0Var = this.f169007g;
            boolean z17 = false;
            if (s0Var != null && s0Var.getPosition() == 4) {
                z17 = true;
            }
            if (z17 && !improveMainUIC.a7()) {
                oc4.v b17 = gVar.b();
                kotlin.jvm.internal.o.d(n17);
                a(b17, n17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVisible", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
                return;
            }
        }
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        oc4.v S6 = ((com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC) a18).S6();
        if (n17 == null || S6 == null || !kotlin.jvm.internal.o.b(S6.b(), n17.a1())) {
            setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVisible", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        } else {
            a(S6, n17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVisible", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        }
    }

    @Override // java.util.Observer
    public void update(java.util.Observable observable, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
    }

    public ImproveUnreadTierView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.unreadTipView = jz5.h.b(new oc4.f(this));
        this.unreadAvatarView = jz5.h.b(new oc4.e(this));
        ym5.a1.h(this, new oc4.a(this));
        this.lazyInflate = jz5.h.b(new oc4.b(this));
    }

    public ImproveUnreadTierView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.unreadTipView = jz5.h.b(new oc4.f(this));
        this.unreadAvatarView = jz5.h.b(new oc4.e(this));
        ym5.a1.h(this, new oc4.a(this));
        this.lazyInflate = jz5.h.b(new oc4.b(this));
    }
}
