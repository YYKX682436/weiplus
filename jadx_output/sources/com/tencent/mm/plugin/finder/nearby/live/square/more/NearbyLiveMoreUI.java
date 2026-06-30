package com.tencent.mm.plugin.finder.nearby.live.square.more;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/more/NearbyLiveMoreUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class NearbyLiveMoreUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public boolean f121513w;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.live.square.more.NearbyLiveSquareMoreFragment f121512v = new com.tencent.mm.plugin.finder.nearby.live.square.more.NearbyLiveSquareMoreFragment();

    /* renamed from: x, reason: collision with root package name */
    public final boolean f121514x = true;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109328v() {
        return "NearbyLiveMoreUI";
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        this.f121513w = true;
        rq2.x.f398914a.a();
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489344c73;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.rb.class)));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.h6z);
        setBackBtn(new mp2.a(this));
        boolean z17 = this.f121514x;
        if (z17) {
            getController().p0(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            setBackGroundColorResource(com.tencent.mm.R.color.f478512u);
            setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            findViewById(com.tencent.mm.R.id.m7r).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478512u));
        }
        android.content.Intent intent = getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        com.tencent.mm.plugin.finder.nearby.live.square.more.NearbyLiveSquareMoreFragment nearbyLiveSquareMoreFragment = this.f121512v;
        nearbyLiveSquareMoreFragment.setArguments(extras);
        android.os.Bundle arguments = nearbyLiveSquareMoreFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("key_use_dark_style", z17 ? 1 : 0);
        }
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.g7m, nearbyLiveSquareMoreFragment, null, 1);
        beginTransaction.n(nearbyLiveSquareMoreFragment);
        beginTransaction.e();
        this.f121513w = false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f121512v.setArguments(intent != null ? intent.getExtras() : null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f121513w) {
            p52.c cVar = p52.h.f352016a;
            p52.h.f352017b = false;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        p52.c cVar = p52.h.f352016a;
        p52.h.f352017b = true;
        super.onResume();
    }
}
