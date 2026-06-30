package cy3;

/* loaded from: classes.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f224782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f224783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f224784g;

    public j(android.content.Context context, yz5.q qVar, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f224781d = context;
        this.f224782e = qVar;
        this.f224783f = c0Var;
        this.f224784g = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        new dy3.n(this.f224781d, new cy3.i(this.f224782e, this.f224783f, this.f224784g)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
