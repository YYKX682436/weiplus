package fl1;

/* loaded from: classes7.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f263745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.f f263746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fl1.b f263747f;

    public d(fl1.k kVar, java.util.ArrayList arrayList, fl1.f fVar, fl1.b bVar) {
        this.f263745d = arrayList;
        this.f263746e = fVar;
        this.f263747f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList3 = this.f263745d;
            if (i17 >= arrayList3.size()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeDialog", "stev rejectButton click!");
                this.f263746e.a(2, arrayList2);
                this.f263747f.dismiss();
                yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (((fl1.j) arrayList3.get(i17)).f263794b == 2 || ((fl1.j) arrayList3.get(i17)).f263794b == 3) {
                arrayList2.add(((fl1.j) arrayList3.get(i17)).f263793a);
            }
            i17++;
        }
    }
}
