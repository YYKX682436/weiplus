package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public abstract class GameBaseActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final int f140664d = 1;

    /* renamed from: e, reason: collision with root package name */
    public long f140665e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f140666f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f140667g = 0;

    public abstract java.lang.String T6();

    public abstract java.lang.String U6();

    public abstract int V6();

    public abstract int W6();

    public abstract int X6();

    public boolean Y6() {
        return !(this instanceof com.tencent.mm.plugin.game.ui.tab.GameRouteUI);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f140666f != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f140666f;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameBaseActivity", "visit page(%s), stayTime:%sms, foregroundTime:%sms", getClass().getSimpleName(), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f140665e));
            if (Y6()) {
                int V6 = V6();
                int X6 = X6();
                long W6 = W6();
                jj0.b a17 = jj0.b.a(14683, java.lang.Integer.valueOf(this.f140664d), java.lang.Integer.valueOf(V6), java.lang.Integer.valueOf(X6), java.lang.Long.valueOf(W6), "", U6(), "", java.lang.Long.valueOf(currentTimeMillis / 1000), java.lang.Long.valueOf(this.f140665e / 1000), T6());
                ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
                com.tencent.mm.game.report.k.a(a17);
            }
        }
        super.onDestroy();
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f140665e += java.lang.System.currentTimeMillis() - this.f140667g;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.f140666f == 0) {
            this.f140666f = java.lang.System.currentTimeMillis();
        }
        this.f140667g = java.lang.System.currentTimeMillis();
        super.onResume();
    }
}
