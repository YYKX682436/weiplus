package ur2;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f430399d;

    public j(ur2.o oVar) {
        this.f430399d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ur2.o oVar = this.f430399d;
        oVar.f430412i = true;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = oVar.f430407d;
        ry2.e eVar = oVar.f430408e;
        android.text.Editable text = oVar.f430415o.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        new ur2.c(appCompatActivity, eVar, str, new ur2.i(oVar)).b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
