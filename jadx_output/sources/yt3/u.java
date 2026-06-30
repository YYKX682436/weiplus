package yt3;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.z f465685d;

    public u(yt3.z zVar) {
        this.f465685d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zu3.b0 b0Var = view instanceof zu3.b0 ? (zu3.b0) view : null;
        yt3.z zVar = this.f465685d;
        zVar.f465734f = b0Var;
        if (b0Var != null) {
            b0Var.setVisibility(8);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", b0Var.getText());
            bundle.putInt("PARAM_EDIT_TEXT_COLOR", b0Var.getColor());
            bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", b0Var.getTextBg());
            zVar.f465733e.w(ju3.c0.P, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
