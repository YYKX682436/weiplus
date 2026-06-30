package cy3;

/* loaded from: classes.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f224810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f224811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f224813g;

    public n(yz5.q qVar, kotlin.jvm.internal.c0 c0Var, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f224810d = qVar;
        this.f224811e = c0Var;
        this.f224812f = str;
        this.f224813g = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f224811e.f310112d);
        java.lang.String str = this.f224812f;
        if (str.length() == 0) {
            str = c01.z1.r();
        }
        kotlin.jvm.internal.o.f(str, "ifEmpty(...)");
        this.f224810d.invoke(valueOf, str, this.f224813g.f310123d);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
