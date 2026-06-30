package wd4;

/* loaded from: classes.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final wd4.h2 f444922d = new wd4.h2();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$1");
    }
}
