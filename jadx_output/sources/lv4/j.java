package lv4;

/* loaded from: classes12.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lv4.m f321523d;

    public j(lv4.m mVar) {
        this.f321523d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lv4.m mVar = this.f321523d;
        rv4.h hVar = (rv4.h) mVar.f321527b;
        hVar.f400472a.f331675b.c(hVar.h(ov4.d.f349214p, "不再展示"));
        kv4.m mVar2 = mVar.f321526a;
        com.tencent.mm.ui.MMActivity mMActivity = ((qv4.r0) mVar2).f367008b;
        db5.e1.C(mMActivity, mMActivity.getString(com.tencent.mm.R.string.o4g), ((qv4.r0) mVar2).f367008b.getString(com.tencent.mm.R.string.o4h), ((qv4.r0) mVar2).f367008b.getString(com.tencent.mm.R.string.o4f), ((qv4.r0) mVar2).f367008b.getString(com.tencent.mm.R.string.f490347sg), true, new lv4.h(mVar), lv4.i.f321522d);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
