package s24;

/* loaded from: classes.dex */
public abstract class e extends s24.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        getActivity().getIntent().putExtra("setting_page_time", java.lang.String.valueOf(c01.id.c()));
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
        android.content.Intent putExtra = intent.putExtra("key_config_item", a7());
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        putExtra.putExtra("page_name_kv", a7());
        putExtra.putExtra("ui_version", 2);
        putExtra.putExtra("setting_from_source", getActivity().getIntent().getIntExtra("setting_from_source", 2));
        putExtra.putExtra("setting_level", m7() + 1);
        putExtra.putExtra("setting_page_time", java.lang.String.valueOf(c01.id.c()));
        G7(context, putExtra);
        j45.l.j(context, "setting", ".ui.setting_new.CommonSettingsUI", putExtra, null);
    }
}
