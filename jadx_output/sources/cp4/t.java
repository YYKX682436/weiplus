package cp4;

/* loaded from: classes8.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.z f221079d;

    public t(cp4.z zVar) {
        this.f221079d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.z zVar = this.f221079d;
        yz5.p sureClickListener = zVar.getSureClickListener();
        if (sureClickListener != null) {
            sureClickListener.invoke(java.lang.Integer.valueOf(zVar.f221096d), zVar.f221098f.f221090e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
