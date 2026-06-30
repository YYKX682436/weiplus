package wd4;

/* loaded from: classes.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog f444909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f444910f;

    public g2(android.view.View view, long j17, com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog, int i17) {
        this.f444908d = view;
        this.f444909e = snsGroupDialog;
        this.f444910f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f444908d;
        view2.setClickable(false);
        view2.postDelayed(new wd4.f2(view2), 1000L);
        com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog = this.f444909e;
        wd4.t0 a17 = ((wd4.s0) com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.K(snsGroupDialog).get(this.f444910f)).a();
        if (a17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            str = java.lang.Integer.valueOf(a17.f445027a).toString();
        } else {
            str = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", "showLabelDetailDialog:".concat(str));
            m80.j jVar = (m80.j) i95.n0.c(m80.j.class);
            android.content.Context context = snsGroupDialog.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((l80.k) jVar).getClass();
            new f93.p5(context, str).show();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1");
    }
}
