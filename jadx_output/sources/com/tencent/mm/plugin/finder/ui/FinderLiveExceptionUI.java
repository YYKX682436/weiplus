package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderLiveExceptionUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveExceptionUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e_7;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getColor(com.tencent.mm.R.color.f478494f));
        setBackGroundColorResource(com.tencent.mm.R.color.f478494f);
        hideActionbarLine();
        setBounceEnabled(false);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.e8(this));
        int intExtra = getIntent().getIntExtra("Exception_UI_TYPE", 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveExceptionUI", "onCreate: type = " + intExtra);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.exd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.se.d(new com.tencent.mm.plugin.finder.live.widget.se(findViewById, null, null, null, 14, null), intExtra, null, 0, new com.tencent.mm.plugin.finder.ui.f8(this), 6, null);
    }
}
