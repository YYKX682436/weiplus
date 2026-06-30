package mi4;

/* loaded from: classes.dex */
public final class e implements db5.s7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326780a;

    public e(android.content.Context context) {
        this.f326780a = context;
    }

    @Override // db5.s7
    public final void a(android.view.View view) {
        android.widget.TextView textView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = view != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f487356oe2) : null;
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_done);
        }
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487357oe3)) == null) {
            return;
        }
        textView.setTextSize(0, i65.a.f(this.f326780a, com.tencent.mm.R.dimen.f479628b3));
    }
}
