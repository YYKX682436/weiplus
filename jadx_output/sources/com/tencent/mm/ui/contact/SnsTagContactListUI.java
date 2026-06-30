package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class SnsTagContactListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f206570d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.contact.ic f206571e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f206572f = new java.util.ArrayList();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487985db;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.jfy);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.imk);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/SnsTagContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/contact/SnsTagContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f206570d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482735mf);
        long[] longArrayExtra = getIntent().getLongArrayExtra("sns_tag_list");
        if (longArrayExtra == null) {
            finish();
            return;
        }
        int i17 = 0;
        while (true) {
            int length = longArrayExtra.length;
            java.util.List list = this.f206572f;
            if (i17 >= length) {
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f484222df4)).setVisibility(8);
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482748mx);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/SnsTagContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/SnsTagContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f206570d.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
                ((android.view.View) this.f206570d.getParent()).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
                com.tencent.mm.ui.contact.ic icVar = new com.tencent.mm.ui.contact.ic(this, list);
                this.f206571e = icVar;
                this.f206570d.setAdapter((android.widget.ListAdapter) icVar);
                this.f206570d.setVisibility(0);
                this.f206570d.setOnItemClickListener(new com.tencent.mm.ui.contact.gc(this));
                setBackBtn(new com.tencent.mm.ui.contact.hc(this));
                showOptionMenu(false);
                return;
            }
            ((java.util.ArrayList) list).add(java.lang.Long.valueOf(longArrayExtra[i17]));
            i17++;
        }
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
        com.tencent.mm.ui.contact.ic icVar = this.f206571e;
        if (icVar != null) {
            icVar.notifyDataSetChanged();
        }
    }
}
