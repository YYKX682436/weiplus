package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class g1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f134455d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f134456e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f134457f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f134458g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134455d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.e1(activity));
        this.f134456e = O6();
    }

    public final boolean O6() {
        return ((java.lang.Boolean) this.f134455d.getValue()).booleanValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).wi(getActivity());
        super.onBeforeFinish(intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        final androidx.appcompat.app.AppCompatActivity activity = getActivity();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent>(activity) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderActivityToggleAnimUIC$onCreateAfter$1
            {
                this.__eventId = 2063121603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent activityToggleAnimEndEvent) {
                com.tencent.mm.view.RefreshLoadMoreLayout h17;
                com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent event = activityToggleAnimEndEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = com.tencent.mm.plugin.finder.viewmodel.component.g1.this;
                if (g1Var.getActivity().hashCode() == event.f53967g.f6715a) {
                    com.tencent.mars.xlog.Log.i("Finder.ActivityToggleAnimUIC", "ActivityToggleAnimEndEvent: notify resize banner and adjust seekbar");
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    android.view.View rootView = g1Var.getRootView();
                    android.view.ViewGroup viewGroup = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
                    if (viewGroup != null && (h17 = hc2.f1.h(viewGroup)) != null) {
                        androidx.recyclerview.widget.f2 adapter = h17.getRecyclerView().getAdapter();
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                        if (wxRecyclerAdapter != null && wxRecyclerAdapter.getItemCount() > 0) {
                            wxRecyclerAdapter.notifyItemRangeChanged(0, wxRecyclerAdapter.getItemCount(), new jz5.l(30, 1));
                        }
                    }
                }
                return false;
            }
        }.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onInterceptFinish() {
        java.lang.Object m521constructorimpl;
        if (!this.f134458g && !this.f134457f && this.f134456e) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).wi(getActivity());
                wa2.x.f(getActivity(), 0L, new com.tencent.mm.plugin.finder.viewmodel.component.f1(this), 1, null);
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mm.sdk.platformtools.Log.c("Finder.ActivityToggleAnimUIC", "", m524exceptionOrNullimpl);
                this.f134456e = false;
                getActivity().finish();
            }
        }
        return (this.f134458g || this.f134457f || !this.f134456e) ? false : true;
    }
}
