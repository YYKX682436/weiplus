package re5;

/* loaded from: classes8.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.o2 f394601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394602e;

    public v(com.tencent.mm.pluginsdk.model.o2 o2Var, android.widget.TextView textView) {
        this.f394601d = o2Var;
        this.f394602e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerErrorPanelUIC$setErrorPanelVisibility$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f394602e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.pluginsdk.ui.otherway.u0) this.f394601d).n(context);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerErrorPanelUIC$setErrorPanelVisibility$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
