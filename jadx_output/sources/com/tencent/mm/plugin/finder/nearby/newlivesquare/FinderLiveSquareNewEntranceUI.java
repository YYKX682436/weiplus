package com.tencent.mm.plugin.finder.nearby.newlivesquare;

@db5.a(4128)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public class FinderLiveSquareNewEntranceUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: x, reason: collision with root package name */
    public boolean f121546x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f121547y;

    /* renamed from: v, reason: collision with root package name */
    public int f121544v = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragment f121545w = new com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragment();

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f121548z = "";

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        int i17 = this.f121544v;
        return i17 != -1 ? i17 : d7() ? 182 : 135;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109545t() {
        return "FinderLiveSquareNewEntranceUI";
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI
    public boolean c7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public final boolean d7() {
        android.content.Intent intent = getIntent();
        return (intent != null ? (android.content.Intent) intent.getParcelableExtra("KEY_ENTER_LIVE_PARAM_INTENT_DATA") : null) != null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f121546x) {
            new com.tencent.mm.autogen.events.FinderLiveEndPageFinishedEvent().e();
        }
        if (this.f121547y) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.putExtra("preferred_tab", 2);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.avz;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{wo2.n.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.rb.class)), rq2.w.class, com.tencent.mm.plugin.finder.viewmodel.component.ny.class, sp2.b0.class, sp2.m3.class, sp2.x3.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.m8.class))});
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0300, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0318  */
    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 1873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (d7()) {
            setTheme(com.tencent.mm.R.style.f494372la);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ml2.m5.f327718a.d(this, this.f128818u);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f121545w.setArguments(intent != null ? intent.getExtras() : null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        sp2.h hVar = new sp2.h(this);
        if (((cy1.a) rVar).oj()) {
            sz1.i.b(hVar);
        }
    }
}
