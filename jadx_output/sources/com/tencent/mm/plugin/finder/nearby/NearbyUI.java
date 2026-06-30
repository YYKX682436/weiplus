package com.tencent.mm.plugin.finder.nearby;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/NearbyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class NearbyUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109420v() {
        return "NearbyUI";
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        rq2.x.f398914a.a();
        super.finish();
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class, wo2.m0.class, wo2.n.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.rb.class)), xo2.b.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b8.class)), sp2.x3.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        rq2.s sVar = rq2.s.f398879a;
        rq2.s.f398881c = c01.id.c();
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "tickActivityOnCreate");
        so2.h3.f410392d.l();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyHomeUI)).Rj(this, iy1.a.NewNearBy);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.sdk.platformtools.u3.i(wo2.s0.f448125d, 1000L);
        rq2.v.f398892b.clear();
        rq2.v.f398893c.clear();
        rq2.v.f398894d.clear();
        rq2.v.f398895e.clear();
        rq2.v.f398896f.clear();
        rq2.v.f398897g.clear();
        rq2.v.f398898h.clear();
        rq2.v.f398899i.clear();
        rq2.v.f398900j.clear();
        rq2.v.f398901k.clear();
        if (!iq.b.l(null, false)) {
            zl2.r4.f473950a.s3(true, true);
            co0.b.f43709e2.a();
        }
        com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class));
        v4Var.getClass();
        pm0.v.X(new com.tencent.mm.feature.finder.live.z1(v4Var, 1));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }
}
