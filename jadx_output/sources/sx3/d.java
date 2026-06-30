package sx3;

/* loaded from: classes10.dex */
public final class d implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx3.m f413553d;

    public d(sx3.m mVar) {
        this.f413553d = mVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        sx3.m mVar = this.f413553d;
        androidx.appcompat.app.AppCompatActivity activity = mVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((sx3.b) pf5.z.f353948a.a(activity).a(sx3.b.class)).f413547e) {
            mVar.O6().e(true);
        } else {
            mVar.O6().f();
        }
        mVar.O6().i(true);
        mVar.O6().getCommonConfig().f330193c = false;
        if (list == null) {
            mVar.Q6();
            return;
        }
        java.lang.Object value = ((jz5.n) mVar.f413565d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mVar.P6().setVisibility(0);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.l.d(mVar.getMainScope(), null, null, new sx3.c(mVar, (ox3.g) it.next(), null), 3, null);
        }
    }
}
