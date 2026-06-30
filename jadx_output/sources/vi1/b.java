package vi1;

/* loaded from: classes7.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.f f437272d;

    public b(vi1.f fVar) {
        this.f437272d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.f fVar = this.f437272d;
        boolean c17 = fVar.f437302f.c();
        fl1.s sVar = fVar.f437302f;
        if (!(!c17 ? true : sVar.a())) {
            if (sVar.c() && !sVar.a()) {
                ((android.widget.ScrollView) fVar.f437301e.findViewById(com.tencent.mm.R.id.mcm)).fullScroll(130);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        vi1.c cVar = fVar.f437315v;
        if (cVar != null) {
            ((vi1.m1) cVar).b(1, sVar.a());
        }
        fl1.g2 g2Var = fVar.f437314u;
        if (g2Var != null) {
            g2Var.a(fVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
