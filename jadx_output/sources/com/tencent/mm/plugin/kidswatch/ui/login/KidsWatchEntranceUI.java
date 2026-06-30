package com.tencent.mm.plugin.kidswatch.ui.login;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class KidsWatchEntranceUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143106e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143107f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f143108g = jz5.h.b(new y83.b(this));

    public final w83.d T6() {
        return (w83.d) ((jz5.n) this.f143108g).getValue();
    }

    public final boolean U6(java.lang.String str) {
        char c17 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? '\b' : com.tencent.mm.storage.z3.k4(str) ? (char) 3 : com.tencent.mm.storage.z3.j4(str) ? (char) 5 : (c01.e2.U(str) || com.tencent.mm.storage.z3.D4(str) || com.tencent.mm.storage.z3.U4(str)) ? (char) 4 : com.tencent.mm.storage.z3.B3(str) ? (char) 6 : r26.i0.y(str, "gh_", false) ? (char) 7 : com.tencent.mm.storage.z3.R4(str) ? (char) 2 : (char) 1;
        return (1 == c17) | (2 == c17);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bmw;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchEntranceUI", "initView");
        setMMTitle("");
        this.f143105d = getIntent().getStringExtra("intent.key.login.url");
        this.f143106e = getIntent().getStringExtra("intent.key.device.name");
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = T6().f443969b;
        java.lang.String string = getString(com.tencent.mm.R.string.g7n);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kidsWatchHeadComponent.setTitle(string);
        T6().f443969b.setCloseBtnCallBack(new y83.a(this));
        T6().f443969b.f143110e.f443960c.setVisibility(0);
        android.widget.ProgressBar progressBar = T6().f443970c;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchEntranceUI", "doLoginConfirmGet, url:" + this.f143105d + ", device:" + this.f143106e);
        gm0.j1.d().a(5218, this);
        gm0.j1.d().g(new x83.j(this.f143105d, this.f143106e));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        supportActionBar.o();
        setSelfNavigationBarVisible(8);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.YellowK));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.YellowK));
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        T6().f443970c.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x048d  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r23, int r24, java.lang.String r25, com.tencent.mm.modelbase.m1 r26) {
        /*
            Method dump skipped, instructions count: 1297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchEntranceUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
