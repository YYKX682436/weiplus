package gu1;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu1.d f275868d;

    public b(gu1.d dVar) {
        this.f275868d = dVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeController$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getId() == com.tencent.mm.R.id.c0u) {
            gu1.d dVar = this.f275868d;
            com.tencent.mm.sdk.platformtools.b0.d(dVar.f275870b, null, dVar.f275879k.i0().f385189o, null);
            com.tencent.mm.ui.MMActivity mMActivity = dVar.f275870b;
            db5.e1.T(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490361st));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeController$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
