package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes3.dex */
public class NearbyFriendShowSayHiUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f152082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152083e = "";

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f152084f = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c69;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.nearby.ui.m(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.k5n)).setOnClickListener(new com.tencent.mm.plugin.nearby.ui.n(this));
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(13L);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gta);
        this.f152084f = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f152084f.setOnClickListener(new com.tencent.mm.plugin.nearby.ui.o(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2009 && i18 == -1) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.h6j);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m9z);
        gm0.j1.b().c();
        int f17 = ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f();
        if (f17 == 0) {
            android.view.View view = this.f152084f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        textView.setText(getResources().getQuantityString(com.tencent.mm.R.plurals.f489691a1, f17, java.lang.Integer.valueOf(f17)));
        this.f152082d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485863jd0);
        com.tencent.mm.storage.t8 P0 = ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).P0();
        if (P0 != null) {
            this.f152083e = P0.field_sayhiuser;
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f152082d, this.f152083e, null);
        }
    }
}
