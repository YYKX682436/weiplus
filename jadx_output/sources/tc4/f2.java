package tc4;

/* loaded from: classes4.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f417330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc4.i2 f417331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f417332f;

    public f2(xc4.p pVar, tc4.i2 i2Var, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f417330d = pVar;
        this.f417331e = i2Var;
        this.f417332f = timeLineObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadFestivalTail$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure$loadFestivalTail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xa4.c cVar = xa4.c.f452822a;
        xc4.p pVar = this.f417330d;
        cVar.b(pVar.c1(), 1);
        android.content.Context context = this.f417331e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xa4.g.D(context, this.f417332f, pVar.isAd());
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure$loadFestivalTail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadFestivalTail$1");
    }
}
