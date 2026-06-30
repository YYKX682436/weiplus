package in4;

/* loaded from: classes9.dex */
public class n implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in4.p f292983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f292984e;

    public n(in4.q qVar, in4.p pVar, r45.xn6 xn6Var) {
        this.f292983d = pVar;
        this.f292984e = xn6Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.MorePopupWindow", "onLongClick favorite");
        in4.p pVar = this.f292983d;
        if (pVar != null) {
            pVar.b(this.f292984e);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
