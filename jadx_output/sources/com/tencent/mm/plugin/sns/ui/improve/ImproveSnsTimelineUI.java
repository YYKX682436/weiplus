package com.tencent.mm.plugin.sns.ui.improve;

@db5.a(2208)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/ImproveSnsTimelineUI;", "Lcom/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ey1.c(scene = 1)
@gm0.a2
@ul5.d(0)
/* loaded from: classes4.dex */
public final class ImproveSnsTimelineUI extends com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f168640u = 0;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f168641s;

    /* renamed from: t, reason: collision with root package name */
    public final vj5.k f168642t = new hc4.d(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        int i17 = pc4.d.f353410a.y() ? com.tencent.mm.R.layout.ehe : com.tencent.mm.R.layout.f489181bl3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        return i17;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        java.util.Set D0 = kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.class, com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.class, com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.class, com.tencent.mm.plugin.sns.ui.improve.component.z.class, com.tencent.mm.plugin.sns.ui.improve.component.u.class, com.tencent.mm.plugin.sns.ui.improve.component.z1.class, com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class, nc4.d0.class, com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.class, com.tencent.mm.plugin.sns.ui.improve.component.w1.class, com.tencent.mm.plugin.sns.ui.improve.component.a2.class, com.tencent.mm.plugin.sns.ui.improve.component.v.class, com.tencent.mm.plugin.sns.ui.improve.component.b2.class, ic4.a.class, com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.class, com.tencent.mm.plugin.sns.ui.improve.component.f2.class, r44.f.class, sa4.a.class, com.tencent.mm.plugin.sns.ui.improve.component.m.class, com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.class});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        return D0;
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onCreate");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupStatusBarTransparent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        if (com.tencent.mm.ui.b4.c(this)) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupStatusBarTransparent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixActionBarStuff", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        this.f168641s = findViewById(com.tencent.mm.R.id.f482435ei);
        int i17 = com.tencent.mm.ui.bl.i(getContext(), -1);
        android.view.View view = this.f168641s;
        if (view != null) {
            view.setPadding(0, i17, 0, 0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fixActionBarStuff initPaddingTop=");
        sb6.append(i17);
        sb6.append(' ');
        boolean z17 = vj5.n.f437718k;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", sb6.toString());
        if (z17) {
            vj5.n.b(this).d(this.f168642t);
            getWindow().getDecorView().requestApplyInsets();
            vj5.o.e(getWindow());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixActionBarStuff", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixActionBarStuff", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        }
        if (!com.tencent.mm.ui.b4.c(this)) {
            com.tencent.mm.ui.a4.f197117a.i(this);
        }
        hideActionbarLine();
        setMMTitle(com.tencent.mm.R.string.jg9);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateOptionsMenu", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        kotlin.jvm.internal.o.g(menu, "menu");
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        ((nc4.d0) pf5.z.f353948a.a(this).a(nc4.d0.class)).T6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateOptionsMenu", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        return onCreateOptionsMenu;
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        super.onDestroy();
        wa4.b0 b0Var = wa4.b0.f444203a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
        ((java.util.LinkedHashMap) wa4.b0.f444204b).clear();
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        ((ox.e0) i95.n0.c(ox.e0.class)).wi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onNewIntent");
        super.onNewIntent(intent);
        if (intent == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("key_finder_bundle_info");
        if (bundleExtra != null) {
            android.content.Intent intent2 = new android.content.Intent();
            java.lang.String string = bundleExtra.getString("key_context_id");
            intent2.putExtra("key_finder_post_local_id", bundleExtra.getLong("key_finder_post_local_id"));
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).xj(intent);
            intent2.putExtra("KEY_POST_DIRECTLY_FROM_SNS", true);
            intent2.putExtra("key_finder_sns_post_within_30s", bundleExtra.getBoolean("key_finder_sns_post_within_30s", false));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                intent2.putExtra("key_context_id", string);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e1Var.C(context, intent2);
            finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onPause");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onResume");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        super.onStart();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onStart");
        kc2.g1 b17 = ((com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).b1();
        if (b17 != null) {
            b17.n();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        kc2.v1 n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        kc2.g1 b17 = ((com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).b1();
        if (b17 != null && (n17 = b17.n()) != null) {
            n17.f306500b.post(new kc2.s1(n17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onStop");
        super.onStop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setActionbarColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        super.setActionbarColor(i17);
        android.view.View view = this.f168641s;
        if (view != null) {
            view.setBackgroundColor(getWindow().getStatusBarColor());
        }
        vj5.o.e(getWindow());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }
}
