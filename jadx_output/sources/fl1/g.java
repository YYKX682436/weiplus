package fl1;

/* loaded from: classes7.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.j f263761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f263762e;

    public g(fl1.i iVar, fl1.j jVar, android.widget.ImageView imageView) {
        this.f263761d = jVar;
        this.f263762e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.j jVar = this.f263761d;
        int i17 = jVar.f263794b;
        android.widget.ImageView imageView = this.f263762e;
        if (i17 == 2) {
            imageView.setImageResource(com.tencent.mm.R.drawable.c8r);
            jVar.f263794b = 1;
        } else if (i17 == 1) {
            imageView.setImageResource(com.tencent.mm.R.drawable.c8p);
            jVar.f263794b = 2;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
