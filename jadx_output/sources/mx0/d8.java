package mx0;

/* loaded from: classes5.dex */
public final class d8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f331920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.more_template.MoreTemplateFakeView f331921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331922f;

    public d8(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.mj_publisher.finder.shoot_composing.more_template.MoreTemplateFakeView moreTemplateFakeView, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        this.f331920d = c0Var;
        this.f331921e = moreTemplateFakeView;
        this.f331922f = shootComposingPluginLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingPluginLayout$openMoreTemplatePanel$fakeView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f331920d.f310112d = true;
        this.f331921e.setEnabled(false);
        xx0.n nVar = this.f331922f.K1;
        if (nVar != null) {
            nVar.b();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingPluginLayout$openMoreTemplatePanel$fakeView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
