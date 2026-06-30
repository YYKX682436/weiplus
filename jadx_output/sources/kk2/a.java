package kk2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.d f308481d;

    public a(kk2.d dVar) {
        this.f308481d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel$openPanel$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("LiveNoticeGuidePanel", "onclick: leave");
        kk2.d dVar = this.f308481d;
        java.lang.String string = dVar.f308486i.getString(4);
        if (string == null) {
            string = "";
        }
        dVar.y(2, 1, string);
        dVar.a();
        ((df2.wv) dVar.f308485h).a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel$openPanel$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
