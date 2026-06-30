package wu;

/* loaded from: classes9.dex */
public final class j0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String string = containerView.getContext().getString(com.tencent.mm.R.string.odn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.widget.TextView textView = (android.widget.TextView) containerView.findViewById(com.tencent.mm.R.id.uxh);
        if (textView == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = containerView.getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize));
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        com.tencent.mm.ui.id.b(containerView.getContext()).inflate(com.tencent.mm.R.layout.f489379em1, (android.view.ViewGroup) containerView, true);
    }
}
