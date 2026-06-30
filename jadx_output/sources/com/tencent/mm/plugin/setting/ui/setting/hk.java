package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class hk extends hg5.d {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f161115r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f161116s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f161117t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI, android.content.Context context, java.lang.String title, java.lang.String empty, java.util.ArrayList data) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(empty, "empty");
        kotlin.jvm.internal.o.g(data, "data");
        this.f161115r = title;
        this.f161116s = empty;
        this.f161117t = data;
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bj6, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        super.G();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            textView.setText(this.f161115r);
        }
        java.util.ArrayList arrayList = this.f161117t;
        if (arrayList == null || arrayList.isEmpty()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.lqa);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484228dg2);
            if (textView2 != null) {
                textView2.setText(this.f161116s);
                textView2.setVisibility(0);
            }
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.lqa);
            if (wxRecyclerView != null) {
                wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView.getContext(), 1, false));
                wxRecyclerView.setAdapter(new com.tencent.mm.plugin.setting.ui.setting.fk(new in5.s() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg$buildItemConverts$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        return new com.tencent.mm.plugin.setting.ui.setting.ek(com.tencent.mm.plugin.setting.ui.setting.hk.this);
                    }
                }, arrayList));
            }
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483758bz2);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.gk(this));
        }
    }
}
