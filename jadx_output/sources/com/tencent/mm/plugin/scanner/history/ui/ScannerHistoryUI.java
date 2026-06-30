package com.tencent.mm.plugin.scanner.history.ui;

/* loaded from: classes15.dex */
public class ScannerHistoryUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f158734i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f158735d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f158736e;

    /* renamed from: f, reason: collision with root package name */
    public gz3.h f158737f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f158738g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f158739h;

    public final void T6() {
        if (com.tencent.mm.plugin.scanner.m1.Ai().Bi().getCount() > 0) {
            this.f158735d.setVisibility(0);
            android.view.View view = this.f158736e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f158739h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(true);
        } else {
            this.f158735d.setVisibility(8);
            android.view.View view3 = this.f158736e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f158739h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(false);
        }
        this.f158737f.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.chu;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.i9w);
        setBackBtn(new gz3.a(this));
        this.f158735d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.m_f);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.tencent.mm.R.layout.cht, null);
        this.f158738g = linearLayout;
        this.f158735d.addHeaderView(linearLayout);
        gz3.h hVar = new gz3.h(this);
        this.f158737f = hVar;
        this.f158735d.setAdapter((android.widget.ListAdapter) hVar);
        this.f158735d.setOnItemClickListener(new gz3.b(this));
        this.f158735d.setOnItemLongClickListener(new gz3.c(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.arp), new gz3.d(this));
        this.f158736e = findViewById(com.tencent.mm.R.id.cho);
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.chs, null);
        this.f158739h = inflate;
        android.widget.LinearLayout linearLayout2 = this.f158738g;
        if (linearLayout2 != null) {
            linearLayout2.addView(inflate);
        }
        ((android.widget.TextView) this.f158739h.findViewById(com.tencent.mm.R.id.h0q)).setText(com.tencent.mm.R.string.fwe);
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
