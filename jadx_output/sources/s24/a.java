package s24;

/* loaded from: classes.dex */
public abstract class a extends s24.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.b(M7(), "webview");
    }

    public abstract java.lang.String L7();

    public abstract java.lang.String M7();

    @Override // s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        android.content.Intent intent = this.f402359g;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("setting_level", m7() + 1);
        intent.putExtra("ui_version", 2);
        intent.putExtra("setting_from_source", getActivity().getIntent().getIntExtra("setting_from_source", 2));
        G7(context, intent);
        j45.l.j(context, M7(), L7(), intent, null);
    }
}
