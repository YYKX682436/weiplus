package f93;

/* loaded from: classes11.dex */
public final class x4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.u4 f260508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.b5 f260509e;

    public x4(f93.u4 u4Var, f93.b5 b5Var) {
        this.f260508d = u4Var;
        this.f260509e = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/HeaderLabelDataItem$HeaderLabelViewItem$setHolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        f93.u4 u4Var = this.f260508d;
        u4Var.a();
        u4Var.a().setText(" ");
        f93.a5 a5Var = this.f260509e.G;
        if (a5Var == null) {
            kotlin.jvm.internal.o.o("textListener");
            throw null;
        }
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = ((f93.x) a5Var).f260499a;
        contactEditLabel.f143195h = "";
        contactEditLabel.enableOptionMenu(!com.tencent.mm.sdk.platformtools.t8.K0(""));
        if (u4Var.b().getVisibility() == 0) {
            u4Var.b().setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/HeaderLabelDataItem$HeaderLabelViewItem$setHolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
