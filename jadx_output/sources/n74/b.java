package n74;

/* loaded from: classes4.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n74.d f335302d;

    public b(n74.d dVar) {
        this.f335302d = dVar;
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener] */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/helper/ActionBtnFollowFinderHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("ActionBtnFollowFinderHelper", "onBtnClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        n74.d dVar = this.f335302d;
        android.content.Context context = dVar.f335324a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        android.content.Context context2 = dVar.f335324a;
        java.lang.String string = context2.getString(com.tencent.mm.R.string.f490573yv);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, string, context2.getString(com.tencent.mm.R.string.bbj), true, true, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        dVar.f335326c = Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        int i17 = dVar.f335340q;
        if (i17 == 1000) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            s34.y yVar = dVar.f335329f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.model.t tVar = dVar.f335330g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            adLandingPagesProxy.addAdFinderContract(yVar, i17, tVar);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            s34.y yVar2 = dVar.f335329f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFollowFinder", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mars.xlog.Log.i("ActionBtnFollowFinderHelper", "doFollowFinder, userName=" + yVar2.f402829a);
            if (dVar.f335331h == null) {
                ?? r76 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(dVar) { // from class: com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener

                    /* renamed from: d, reason: collision with root package name */
                    public final java.lang.ref.WeakReference f163205d;

                    {
                        super(com.tencent.mm.app.a0.f53288d);
                        this.f163205d = new java.lang.ref.WeakReference(dVar);
                        this.__eventId = 398763182;
                    }

                    @Override // com.tencent.mm.sdk.event.IListener
                    public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                        am.zd zdVar;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener");
                        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent2 = followUserEvent;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener");
                        n74.d dVar2 = (n74.d) this.f163205d.get();
                        if (dVar2 == null) {
                            com.tencent.mars.xlog.Log.w("ActionBtnFollowFinderHelper", "FollowUserEventListener, helper==null");
                            dead();
                        } else if (followUserEvent2 == null || (zdVar = followUserEvent2.f54346g) == null) {
                            com.tencent.mars.xlog.Log.w("ActionBtnFollowFinderHelper", "FollowUserEventListener, event.data==null");
                        } else {
                            com.tencent.mars.xlog.Log.i("ActionBtnFollowFinderHelper", "FollowUserEventListener, result=" + zdVar.f8553c + ", opType=" + zdVar.f8552b + ", opScene=" + zdVar.f8554d + ", finderUserName=" + zdVar.f8551a);
                            if (zdVar.f8552b == 1 && zdVar.f8554d == 102 && dVar2.b().equals(zdVar.f8551a)) {
                                com.tencent.mm.sdk.platformtools.u3.h(new n74.c(this, followUserEvent2, dVar2));
                            } else {
                                com.tencent.mars.xlog.Log.w("ActionBtnFollowFinderHelper", "FollowUserEventListener, event from other");
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener");
                        return true;
                    }
                };
                dVar.f335331h = r76;
                r76.alive();
            }
            try {
                ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ni(yVar2.f402829a, 1, 0L, false, 102, 0);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("ActionBtnFollowFinderHelper", "doFollowFinder exp=" + th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFollowFinder", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/helper/ActionBtnFollowFinderHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$2");
    }
}
