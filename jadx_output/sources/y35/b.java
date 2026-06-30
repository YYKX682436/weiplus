package y35;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference f459186d;

    public b(com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference) {
        this.f459186d = accountInfoPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
        android.content.Context context = this.f459186d.f197770d;
        c01.ka kaVar = new c01.ka(1);
        ((hs.d0) i2Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        e04.g2.a(context, kaVar);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
