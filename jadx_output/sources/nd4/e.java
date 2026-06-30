package nd4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final nd4.e f336476a = new nd4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f336477b = new java.util.HashMap();

    public final android.view.View a(java.lang.Class clazz, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        kotlin.jvm.internal.o.g(context, "context");
        java.util.HashMap hashMap = f336477b;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(clazz.getName());
        if (!(arrayList != null && (arrayList.isEmpty() ^ true))) {
            java.lang.Object newInstance = clazz.getConstructor(android.content.Context.class).newInstance(context);
            kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
            android.view.View view = (android.view.View) newInstance;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
            return view;
        }
        java.lang.Object obj = hashMap.get(clazz.getName());
        kotlin.jvm.internal.o.d(obj);
        java.lang.Object remove = ((java.util.ArrayList) obj).remove(0);
        kotlin.jvm.internal.o.e(remove, "null cannot be cast to non-null type T of com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool.obtainView");
        android.view.View view2 = (android.view.View) remove;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        if (view == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
            return;
        }
        if (view.getParent() != null) {
            android.view.ViewParent parent = view.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(view);
        }
        if (view instanceof nd4.d) {
            ((nd4.d) view).reset();
        }
        java.lang.String name = view.getClass().getName();
        java.util.HashMap hashMap = f336477b;
        if (!hashMap.containsKey(name)) {
            hashMap.put(name, new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(name);
        if (arrayList != null) {
            arrayList.add(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
    }
}
