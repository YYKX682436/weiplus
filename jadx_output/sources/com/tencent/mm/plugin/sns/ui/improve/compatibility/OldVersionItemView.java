package com.tencent.mm.plugin.sns.ui.improve.compatibility;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001fJ\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/compatibility/OldVersionItemView;", "Landroid/widget/FrameLayout;", "Ltc4/s0;", "Lxd4/c;", "Lkc4/a;", "Lzc4/b;", "getImproveListItem", "", "getPosition", "Lxc4/p;", "getSnsInfo", "Landroid/graphics/Rect;", "getDisplayRect", "Lcom/tencent/mm/plugin/sns/ui/improve/component/f2;", "p", "Ljz5/g;", "getUicHolder", "()Lcom/tencent/mm/plugin/sns/ui/improve/component/f2;", "uicHolder", "Lcom/tencent/mm/plugin/sns/ui/improve/component/z;", "q", "getFixUIC", "()Lcom/tencent/mm/plugin/sns/ui/improve/component/z;", "fixUIC", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OldVersionItemView extends android.widget.FrameLayout implements tc4.s0, xd4.c, kc4.a {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f168643r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f168644d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168645e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168646f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168647g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168648h;

    /* renamed from: i, reason: collision with root package name */
    public zc4.b f168649i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f168650m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f168651n;

    /* renamed from: o, reason: collision with root package name */
    public in5.s0 f168652o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g uicHolder;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final jz5.g fixUIC;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldVersionItemView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        final androidx.lifecycle.y yVar = (androidx.lifecycle.y) context2;
        this.f168644d = yVar;
        this.f168645e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsOldItemContactEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1
            {
                this.__eventId = 1557205740;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsOldItemContactEvent snsOldItemContactEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                com.tencent.mm.autogen.events.SnsOldItemContactEvent event = snsOldItemContactEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", "oldItemContactEvent");
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                    com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                return true;
            }
        };
        this.f168646f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateStartEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1
            {
                this.__eventId = 1200144606;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent) {
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                com.tencent.mm.autogen.events.SnsTranslateStartEvent event = snsTranslateStartEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.fx fxVar = event.f54849g;
                int i17 = fxVar.f6710a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(fxVar.f6711b)))) {
                        com.tencent.mm.plugin.sns.model.s6.a(fxVar.f6711b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        if (baseViewHolder != null && baseViewHolder.f169283m0 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
                            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = baseViewHolder.f169282m;
                            if (snsTranslateResultView != null) {
                                snsTranslateResultView.k(1);
                                baseViewHolder.f169282m.setVisibility(0);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                        return false;
                    }
                }
                if (fxVar.f6710a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.a(fxVar.f6711b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                return false;
            }
        };
        this.f168647g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateFinishEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1
            {
                this.__eventId = 2139223297;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem;
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                com.tencent.mm.autogen.events.SnsTranslateFinishEvent event = snsTranslateFinishEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.dx dxVar = event.f54847g;
                java.lang.String str = dxVar.f6506b;
                java.lang.String str2 = dxVar.f6507c;
                java.lang.String str3 = dxVar.f6508d;
                int i17 = dxVar.f6505a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(dxVar.f6506b)))) {
                        com.tencent.mm.plugin.sns.model.s6.a(dxVar.f6506b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(dxVar.f6506b);
                        if (baseViewHolder != null && (baseTimeLineItem = baseViewHolder.f169283m0) != null) {
                            baseTimeLineItem.v(f17, baseViewHolder, str2, str3);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                        return false;
                    }
                }
                if (dxVar.f6505a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.a(dxVar.f6506b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                return false;
            }
        };
        this.f168648h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUnTranslateEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1
            {
                this.__eventId = -868441523;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem;
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                com.tencent.mm.autogen.events.SnsUnTranslateEvent event = snsUnTranslateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.gx gxVar = event.f54850g;
                int i17 = gxVar.f6796a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(gxVar.f6797b)))) {
                        com.tencent.mm.plugin.sns.model.s6.k(gxVar.f6797b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        if (baseViewHolder != null && (baseTimeLineItem = baseViewHolder.f169283m0) != null) {
                            baseTimeLineItem.x(baseViewHolder);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                        return false;
                    }
                }
                if (gxVar.f6796a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.k(gxVar.f6797b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                return false;
            }
        };
        this.f168650m = "";
        this.uicHolder = jz5.h.b(new kc4.c(this));
        this.fixUIC = jz5.h.b(new kc4.b(this));
    }

    private final com.tencent.mm.plugin.sns.ui.improve.component.z getFixUIC() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixUIC", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        com.tencent.mm.plugin.sns.ui.improve.component.z zVar = (com.tencent.mm.plugin.sns.ui.improve.component.z) this.fixUIC.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixUIC", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return zVar;
    }

    private final com.tencent.mm.plugin.sns.ui.improve.component.f2 getUicHolder() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUicHolder", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var = (com.tencent.mm.plugin.sns.ui.improve.component.f2) this.uicHolder.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUicHolder", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return f2Var;
    }

    public static final /* synthetic */ in5.s0 i(com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        in5.s0 s0Var = oldVersionItemView.f168652o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return s0Var;
    }

    public static final /* synthetic */ void j(com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        oldVersionItemView.k(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    @Override // tc4.s0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    @Override // tc4.s0
    public void b() {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        android.view.View view = this.f168651n;
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if (baseViewHolder == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return;
        }
        zc4.b bVar = this.f168649i;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        } else {
            baseViewHolder.D.setText(n17.f1());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        }
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        int i18 = (baseViewHolder != null ? baseViewHolder.f169262c : 0) - 1;
        if (getContext() instanceof android.app.Activity) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play position:");
                sb6.append(i18);
                sb6.append(' ');
                zc4.b bVar = this.f168649i;
                sb6.append(bVar != null ? bVar.n() : null);
                com.tencent.mars.xlog.Log.e("MicroMsg.Improve.OldItem", sb6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                return;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("play position:");
        sb7.append(i18);
        sb7.append(' ');
        zc4.b bVar2 = this.f168649i;
        sb7.append(bVar2 != null ? bVar2.n() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", sb7.toString());
        android.view.View view = this.f168651n;
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder2 = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if ((baseViewHolder2 != null ? baseViewHolder2.f169283m0 : null) instanceof xd4.d) {
            java.lang.Object obj = baseViewHolder2.f169283m0;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            ((xd4.d) obj).c(baseViewHolder2, i18);
            if (baseViewHolder2.f169275i0.isAd()) {
                l44.b3 b3Var = l44.b3.f316041a;
                b3Var.h(baseViewHolder2.f169275i0);
                b3Var.i(new l44.d0(0, baseViewHolder2.f169275i0, true));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    @Override // tc4.s0
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewRecycleInMain", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewRecycleInMain", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        android.view.View view = this.f168651n;
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if ((baseViewHolder != null ? baseViewHolder.f169283m0 : null) instanceof xd4.d) {
            java.lang.Object obj = baseViewHolder.f169283m0;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            ((xd4.d) obj).e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    @Override // tc4.s0
    public boolean f(in5.s0 holder, zc4.b item, int i17) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measure", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isItemChanged", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        java.lang.String a17 = item.n().a1();
        zc4.b bVar = this.f168649i;
        boolean z17 = !kotlin.jvm.internal.o.b(a17, (bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isItemChanged", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        this.f168652o = holder;
        this.f168649i = item;
        this.f168650m = item.n().a1();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", "[" + hashCode() + "]onBindViewHolder pos:" + i17);
        k(i17 - 1);
        if (item.n().isAd()) {
            i64.u1.a(208, 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measure", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        zy1.e.f477325a.e(12076, "BrowseAdFeedCount", this.f168650m);
        return z17;
    }

    @Override // tc4.s0
    public java.lang.Object g(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", "[" + hashCode() + "]onViewRecycled");
        this.f168646f.dead();
        this.f168647g.dead();
        this.f168648h.dead();
        this.f168645e.dead();
        ad4.l.b(this.f168650m);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return f0Var;
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        android.view.View view = this.f168651n;
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if (!((baseViewHolder != null ? baseViewHolder.f169283m0 : null) instanceof xd4.d)) {
            android.graphics.Rect rect = new android.graphics.Rect();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return rect;
        }
        java.lang.Object obj = baseViewHolder.f169283m0;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
        android.graphics.Rect displayRect = ((xd4.d) obj).getDisplayRect();
        if (displayRect == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getDisplayRect null rect! info:");
            zc4.b bVar = this.f168649i;
            sb6.append(bVar != null ? bVar.n() : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.OldItem", sb6.toString());
            displayRect = new android.graphics.Rect();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return displayRect;
    }

    @Override // tc4.s0
    public zc4.b getImproveListItem() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImproveListItem", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImproveListItem", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return null;
    }

    @Override // kc4.a
    public int getPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        in5.s0 s0Var = this.f168652o;
        int adapterPosition = (s0Var != null ? s0Var.getAdapterPosition() : 0) - 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return adapterPosition;
    }

    @Override // kc4.a
    public xc4.p getSnsInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        zc4.b bVar = this.f168649i;
        xc4.p n17 = bVar != null ? bVar.n() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return n17;
    }

    @Override // tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", "[" + hashCode() + "] onBindViewHolder: ");
        this.f168646f.alive();
        this.f168647g.alive();
        this.f168648h.alive();
        this.f168645e.alive();
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return f0Var;
    }

    public final void k(int i17) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        zc4.b bVar = this.f168649i;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return;
        }
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.OldItem", "invalid position:" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return;
        }
        int j17 = com.tencent.mm.plugin.sns.ui.bs.j(n17.c1());
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", "[" + hashCode() + "]loadView pos:" + i17 + " type:" + j17);
        com.tencent.mm.plugin.sns.ui.improve.component.f2 uicHolder = getUicHolder();
        android.view.View view = this.f168651n;
        uicHolder.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.bs bsVar = uicHolder.f168795e;
        android.view.View a17 = bsVar != null ? bsVar.a(n17.c1(), i17, j17, view) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        this.f168651n = a17;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Improve.OldItem", "loadView is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        } else {
            if ((a17 != null ? a17.getParent() : null) == null) {
                removeAllViews();
                addView(this.f168651n);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        }
    }

    @Override // tc4.s0
    public java.lang.String name() {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Old");
        zc4.b bVar = this.f168649i;
        if (bVar != null && (n17 = bVar.n()) != null) {
            android.view.View view = this.f168651n;
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
            if ((baseViewHolder != null ? baseViewHolder.f169283m0 : null) != null) {
                sb6.append("-");
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem = baseViewHolder.f169283m0;
                sb6.append(baseTimeLineItem != null ? baseTimeLineItem.u() : null);
            } else {
                if (n17.isAd()) {
                    sb6.append("-ad");
                }
                sb6.append("-type:" + com.tencent.mm.plugin.sns.ui.bs.j(n17.c1()));
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return sb7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        super.onAttachedToWindow();
        int position = getPosition();
        k(position);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", "[" + hashCode() + "]onAttachedToWindow position:" + position);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]onDetachedFromWindow id:");
        zc4.b bVar = this.f168649i;
        sb6.append((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1());
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", sb6.toString());
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        zc4.b bVar = this.f168649i;
        xc4.p n17 = bVar != null ? bVar.n() : null;
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            com.tencent.mm.plugin.sns.ui.improve.component.z fixUIC = getFixUIC();
            fixUIC.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
            boolean z18 = fixUIC.f169061d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
            if (z18) {
                com.tencent.mm.plugin.sns.ui.improve.component.z fixUIC2 = getFixUIC();
                if (n17 != null && n17.isAd()) {
                    z17 = true;
                }
                fixUIC2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
                fixUIC2.f169061d = !z17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fix rv scroll distance flag:");
                com.tencent.mm.plugin.sns.ui.improve.component.z fixUIC3 = getFixUIC();
                fixUIC3.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
                boolean z19 = fixUIC3.f169061d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
                sb6.append(z19);
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", sb6.toString());
            }
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return onInterceptTouchEvent;
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        android.view.View view = this.f168651n;
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if ((baseViewHolder != null ? baseViewHolder.f169283m0 : null) instanceof xd4.d) {
            java.lang.Object obj = baseViewHolder.f169283m0;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            ((xd4.d) obj).pause();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        android.view.View view = this.f168651n;
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if ((baseViewHolder != null ? baseViewHolder.f169283m0 : null) instanceof xd4.d) {
            java.lang.Object obj = baseViewHolder.f169283m0;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            ((xd4.d) obj).stop();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldVersionItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        final androidx.lifecycle.y yVar = (androidx.lifecycle.y) context2;
        this.f168644d = yVar;
        this.f168645e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsOldItemContactEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1
            {
                this.__eventId = 1557205740;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsOldItemContactEvent snsOldItemContactEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                com.tencent.mm.autogen.events.SnsOldItemContactEvent event = snsOldItemContactEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", "oldItemContactEvent");
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                    com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                return true;
            }
        };
        this.f168646f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateStartEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1
            {
                this.__eventId = 1200144606;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent) {
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                com.tencent.mm.autogen.events.SnsTranslateStartEvent event = snsTranslateStartEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.fx fxVar = event.f54849g;
                int i17 = fxVar.f6710a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(fxVar.f6711b)))) {
                        com.tencent.mm.plugin.sns.model.s6.a(fxVar.f6711b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        if (baseViewHolder != null && baseViewHolder.f169283m0 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
                            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = baseViewHolder.f169282m;
                            if (snsTranslateResultView != null) {
                                snsTranslateResultView.k(1);
                                baseViewHolder.f169282m.setVisibility(0);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                        return false;
                    }
                }
                if (fxVar.f6710a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.a(fxVar.f6711b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                return false;
            }
        };
        this.f168647g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateFinishEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1
            {
                this.__eventId = 2139223297;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem;
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                com.tencent.mm.autogen.events.SnsTranslateFinishEvent event = snsTranslateFinishEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.dx dxVar = event.f54847g;
                java.lang.String str = dxVar.f6506b;
                java.lang.String str2 = dxVar.f6507c;
                java.lang.String str3 = dxVar.f6508d;
                int i17 = dxVar.f6505a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(dxVar.f6506b)))) {
                        com.tencent.mm.plugin.sns.model.s6.a(dxVar.f6506b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(dxVar.f6506b);
                        if (baseViewHolder != null && (baseTimeLineItem = baseViewHolder.f169283m0) != null) {
                            baseTimeLineItem.v(f17, baseViewHolder, str2, str3);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                        return false;
                    }
                }
                if (dxVar.f6505a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.a(dxVar.f6506b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                return false;
            }
        };
        this.f168648h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUnTranslateEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1
            {
                this.__eventId = -868441523;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem;
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                com.tencent.mm.autogen.events.SnsUnTranslateEvent event = snsUnTranslateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.gx gxVar = event.f54850g;
                int i17 = gxVar.f6796a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(gxVar.f6797b)))) {
                        com.tencent.mm.plugin.sns.model.s6.k(gxVar.f6797b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        if (baseViewHolder != null && (baseTimeLineItem = baseViewHolder.f169283m0) != null) {
                            baseTimeLineItem.x(baseViewHolder);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                        return false;
                    }
                }
                if (gxVar.f6796a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.k(gxVar.f6797b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                return false;
            }
        };
        this.f168650m = "";
        this.uicHolder = jz5.h.b(new kc4.c(this));
        this.fixUIC = jz5.h.b(new kc4.b(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldVersionItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        final androidx.lifecycle.y yVar = (androidx.lifecycle.y) context2;
        this.f168644d = yVar;
        this.f168645e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsOldItemContactEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1
            {
                this.__eventId = 1557205740;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsOldItemContactEvent snsOldItemContactEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                com.tencent.mm.autogen.events.SnsOldItemContactEvent event = snsOldItemContactEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OldItem", "oldItemContactEvent");
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                    com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
                return true;
            }
        };
        this.f168646f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateStartEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1
            {
                this.__eventId = 1200144606;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent) {
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                com.tencent.mm.autogen.events.SnsTranslateStartEvent event = snsTranslateStartEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.fx fxVar = event.f54849g;
                int i172 = fxVar.f6710a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i172 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(fxVar.f6711b)))) {
                        com.tencent.mm.plugin.sns.model.s6.a(fxVar.f6711b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        if (baseViewHolder != null && baseViewHolder.f169283m0 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
                            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = baseViewHolder.f169282m;
                            if (snsTranslateResultView != null) {
                                snsTranslateResultView.k(1);
                                baseViewHolder.f169282m.setVisibility(0);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                        return false;
                    }
                }
                if (fxVar.f6710a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.a(fxVar.f6711b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateStartListener$1");
                return false;
            }
        };
        this.f168647g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateFinishEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1
            {
                this.__eventId = 2139223297;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem;
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                com.tencent.mm.autogen.events.SnsTranslateFinishEvent event = snsTranslateFinishEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.dx dxVar = event.f54847g;
                java.lang.String str = dxVar.f6506b;
                java.lang.String str2 = dxVar.f6507c;
                java.lang.String str3 = dxVar.f6508d;
                int i172 = dxVar.f6505a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i172 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(dxVar.f6506b)))) {
                        com.tencent.mm.plugin.sns.model.s6.a(dxVar.f6506b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(dxVar.f6506b);
                        if (baseViewHolder != null && (baseTimeLineItem = baseViewHolder.f169283m0) != null) {
                            baseTimeLineItem.v(f17, baseViewHolder, str2, str3);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                        return false;
                    }
                }
                if (dxVar.f6505a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.a(dxVar.f6506b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$translateFinishListener$1");
                return false;
            }
        };
        this.f168648h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUnTranslateEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1
            {
                this.__eventId = -868441523;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem;
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                com.tencent.mm.autogen.events.SnsUnTranslateEvent event = snsUnTranslateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.gx gxVar = event.f54850g;
                int i172 = gxVar.f6796a;
                com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.this;
                if (i172 == 1) {
                    int i18 = com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.f168643r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    zc4.b bVar = oldVersionItemView.f168649i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    if (kotlin.jvm.internal.o.b((bVar == null || (n17 = bVar.n()) == null) ? null : n17.a1(), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(gxVar.f6797b)))) {
                        com.tencent.mm.plugin.sns.model.s6.k(gxVar.f6797b, 2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        android.view.View view = oldVersionItemView.f168651n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemView$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
                        if (baseViewHolder != null && (baseTimeLineItem = baseViewHolder.f169283m0) != null) {
                            baseTimeLineItem.x(baseViewHolder);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                        return false;
                    }
                }
                if (gxVar.f6796a == 2) {
                    com.tencent.mm.plugin.sns.model.s6.k(gxVar.f6797b, 2);
                    if (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.i(oldVersionItemView) != null) {
                        com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView.j(oldVersionItemView, oldVersionItemView.getPosition());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$unTranslateListener$1");
                return false;
            }
        };
        this.f168650m = "";
        this.uicHolder = jz5.h.b(new kc4.c(this));
        this.fixUIC = jz5.h.b(new kc4.b(this));
    }
}
