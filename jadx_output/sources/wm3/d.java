package wm3;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm3.j f447263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f447264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wm3.j jVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f447263d = jVar;
        this.f447264e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wm3.j jVar = this.f447263d;
        java.util.Iterator it = ((java.util.List) ((jz5.n) jVar.f447277m).getValue()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) ((java.lang.ref.WeakReference) it.next()).get();
            if (preference != null) {
                android.view.View p17 = preference.p(null, null);
                p17.setTag(preference.f197780q);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$makeSureFloatViewExist$2", "invoke", "()Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$makeSureFloatViewExist$2", "invoke", "()Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setOnClickListener(new wm3.c(this.f447264e, preference));
                jVar.T6().addView(p17);
            }
        }
        return null;
    }
}
