package cy3;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f224775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f224776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224777f;

    public h(kotlin.jvm.internal.c0 c0Var, android.widget.ImageView imageView, android.content.Context context) {
        this.f224775d = c0Var;
        this.f224776e = imageView;
        this.f224777f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.c0 c0Var = this.f224775d;
        boolean z17 = !c0Var.f310112d;
        c0Var.f310112d = z17;
        android.widget.ImageView imageView = this.f224776e;
        if (imageView != null) {
            android.content.Context context = this.f224777f;
            if (z17) {
                imageView.setImageDrawable(i65.a.i(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.checkbox_selected_filled));
                imageView.setContentDescription(context.getString(com.tencent.mm.R.string.d_));
            } else {
                imageView.setImageDrawable(i65.a.i(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.f481256oo));
                imageView.setContentDescription(context.getString(com.tencent.mm.R.string.f489843db));
            }
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_RINGTONE_SET_AS_STATUS_WHEN_USE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(c0Var.f310112d));
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
