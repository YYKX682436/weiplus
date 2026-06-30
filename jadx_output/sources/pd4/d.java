package pd4;

/* loaded from: classes3.dex */
public abstract class d {
    public static final void a(android.view.ViewStub viewStub, android.view.View view, android.view.ViewGroup.LayoutParams param) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
        kotlin.jvm.internal.o.g(viewStub, "<this>");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(param, "param");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewStub.getParent();
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewAt(indexOfChild);
        viewGroup.addView(view, indexOfChild, param);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
    }
}
