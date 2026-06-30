package com.tencent.mm.plugin.finder.ui;

@db5.a(512)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderConversationParentUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderConversationUI extends com.tencent.mm.plugin.finder.ui.FinderConversationParentUI {

    /* renamed from: u, reason: collision with root package name */
    public boolean f128538u;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX;
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderConversationParentUI
    public androidx.fragment.app.Fragment c7() {
        return new com.tencent.mm.plugin.finder.ui.FinderConversationFragment();
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderConversationParentUI
    public java.lang.String d7() {
        java.lang.String string = getString(com.tencent.mm.R.string.cqm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void e7() {
        if (this.f128538u) {
            return;
        }
        this.f128538u = true;
        ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) i95.n0.c(c61.l7.class)).nk().S()).h(null, zy2.y8.f477620p);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        e7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderConversationParentUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Rj(this, iy1.a.Finder);
        aVar.ik(this, be1.r0.CTRL_INDEX, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.ui.y2(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e7();
    }
}
