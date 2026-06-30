package qy2;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter f367782d;

    public c(com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter finderEditFooter) {
        this.f367782d = finderEditFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter finderEditFooter = this.f367782d;
        int i17 = finderEditFooter.f136944m;
        if (i17 == 102) {
            finderEditFooter.f136944m = 101;
            android.widget.ImageButton imageButton = finderEditFooter.f136942h;
            if (imageButton == null) {
                kotlin.jvm.internal.o.o("alignBtn");
                throw null;
            }
            imageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_alignment_left);
        } else if (i17 == 101) {
            finderEditFooter.f136944m = 102;
            android.widget.ImageButton imageButton2 = finderEditFooter.f136942h;
            if (imageButton2 == null) {
                kotlin.jvm.internal.o.o("alignBtn");
                throw null;
            }
            imageButton2.setImageResource(com.tencent.mm.R.raw.icons_outlined_alignment_center);
        }
        qy2.a aVar = finderEditFooter.f136945n;
        if (aVar != null) {
            int i18 = finderEditFooter.f136944m;
            com.tencent.mm.plugin.finder.ui.FinderEditTextUI finderEditTextUI = ((com.tencent.mm.plugin.finder.ui.h5) aVar).f129316a;
            com.tencent.mars.xlog.Log.i(finderEditTextUI.f128565v, "alignMode changed to " + i18);
            finderEditTextUI.d7(i18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
