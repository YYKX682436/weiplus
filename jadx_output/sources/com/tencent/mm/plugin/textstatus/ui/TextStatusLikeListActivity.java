package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Ll75/q0;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class TextStatusLikeListActivity extends com.tencent.mm.ui.vas.VASActivity implements l75.q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f173639f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f173640d = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.qc(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f173641e = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.rc(this));

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.czu;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        int i17 = 2;
        java.lang.String l17 = o13.n.l(2);
        kotlin.jvm.internal.o.f(l17, "getUnsignedMd5UInt(...)");
        hi4.m.f281556g = l17;
        super.onCreate(bundle);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(hi4.j.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        int intValue = ((java.lang.Number) ((jz5.n) ((hi4.j) a17).f281552e).getValue()).intValue();
        jz5.g gVar = this.f173640d;
        int i18 = 0;
        if (intValue > 1) {
            ((ui4.f) ((jz5.n) this.f173641e).getValue()).f428140b.setAdapter((androidx.fragment.app.e2) ((jz5.n) gVar).getValue());
        } else {
            androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.h(com.tencent.mm.R.id.j8i, ((androidx.fragment.app.e2) ((jz5.n) gVar).getValue()).getItem(0), null, 1);
            beginTransaction.d();
            if (getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) == 1) {
                setMMTitle(com.tencent.mm.R.string.jwe);
                i17 = 1;
            } else {
                setMMTitle(com.tencent.mm.R.string.f493372jx3);
            }
            setBackBtn(new com.tencent.mm.plugin.textstatus.ui.pc(this));
            i18 = i17;
        }
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TextStatusLikeListActivity);
        aVar.dk(this, "TextStatusLikeListActivity");
        ((cy1.a) aVar.ik(this, 4, 28809)).fk(this, "status_notif_page_source", java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(hi4.j.class);
        set.add(com.tencent.mm.plugin.textstatus.ui.k2.class);
        set.add(hi4.m.class);
        hi4.f fVar = hi4.j.f281550g;
        if (fVar.a(this) > 1) {
            set.add(wn.u.class);
            set.add(com.tencent.mm.plugin.textstatus.ui.tf.class);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "superImportUIComponents: pageCnt=" + fVar.a(this));
    }
}
