package kk2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.d f308484d;

    public c(kk2.d dVar) {
        this.f308484d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel$openPanel$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("LiveNoticeGuidePanel", "onclick: reserve and leave");
        kk2.d dVar = this.f308484d;
        java.lang.String str = ((mm2.c1) ((df2.wv) dVar.f308485h).b().a(mm2.c1.class)).f328852o;
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String string = dVar.f308486i.getString(4);
        if (string == null) {
            string = "";
        }
        pq5.g l17 = ((b92.d1) zbVar).Ri(str, string, 1, null, 103).l();
        java.lang.Object O6 = ((df2.wv) dVar.f308485h).f231723a.O6();
        im5.b bVar = O6 instanceof im5.b ? (im5.b) O6 : null;
        if (bVar != null) {
            l17.f(bVar);
        }
        l17.h(new kk2.b(dVar, str));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel$openPanel$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
