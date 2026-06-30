package yt3;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.z f465694d;

    public v(yt3.z zVar) {
        this.f465694d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zu3.c0 c0Var = view instanceof zu3.c0 ? (zu3.c0) view : null;
        yt3.z zVar = this.f465694d;
        zVar.f465735g = c0Var;
        if (c0Var != null) {
            c0Var.setVisibility(8);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", c0Var.getText());
            bundle.putInt("PARAM_EDIT_TEXT_COLOR", c0Var.getColor());
            bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", c0Var.getTextBg());
            zVar.f465733e.w(ju3.c0.Q, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
