package wx0;

/* loaded from: classes5.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.e0 f450467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.z f450468e;

    public d0(wx0.e0 e0Var, mx0.z zVar) {
        this.f450467d = e0Var;
        this.f450468e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/CameraSwitchPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f450467d.f331814d;
        kotlin.jvm.internal.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.f450468e).b1(!this.f450467d.f450474g);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/CameraSwitchPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
