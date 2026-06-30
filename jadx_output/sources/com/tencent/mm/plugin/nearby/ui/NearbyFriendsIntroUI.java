package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes8.dex */
public class NearbyFriendsIntroUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f152085d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f152086e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c67;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f152086e = android.view.View.inflate(this, com.tencent.mm.R.layout.bpr, null);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.k5n)).setOnClickListener(new com.tencent.mm.plugin.nearby.ui.q(this));
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(13L);
        setBackBtn(new com.tencent.mm.plugin.nearby.ui.r(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.h6j);
        initView();
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyPersonFragment);
        aVar.Rj(this, iy1.a.PeopleNearby);
        aVar.ik(this, 40, 24184);
    }
}
