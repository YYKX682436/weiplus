package q50;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f360142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f360144f;

    public f(yz5.a aVar, java.lang.String str, androidx.activity.ComponentActivity componentActivity) {
        this.f360142d = aVar;
        this.f360143e = str;
        this.f360144f = componentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f stateCenter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f360142d.invoke();
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.o(this.f360143e, 1);
        androidx.activity.ComponentActivity componentActivity = this.f360144f;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = componentActivity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) componentActivity : null;
        if (baseMvvmActivity != null && (stateCenter = baseMvvmActivity.getStateCenter()) != null) {
            stateCenter.B3(new wg5.c(true));
        }
        yj0.a.h(this, "com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
