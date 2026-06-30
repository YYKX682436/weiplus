package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationParentUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderConversationParentUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment f128536t;

    public androidx.fragment.app.Fragment c7() {
        if (this.f128536t == null) {
            this.f128536t = new com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment();
        }
        com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment finderBaseConversationFragment = this.f128536t;
        kotlin.jvm.internal.o.d(finderBaseConversationFragment);
        return finderBaseConversationFragment;
    }

    public java.lang.String d7() {
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afq;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        ((ty.o0) i95.n0.c(ty.o0.class)).getClass();
        return kz5.o1.c(wn.u.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.Fragment c76 = c7();
        if (c76 != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("KEY_TALKER_TYPE", getIntent().getIntExtra("KEY_TALKER_TYPE", -1));
            bundle2.putInt("KEY_TALKER_SCENE", getIntent().getIntExtra("KEY_TALKER_SCENE", -1));
            c76.setArguments(bundle2);
            androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
            kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
            beginTransaction.k(com.tencent.mm.R.id.gd9, c76, null);
            beginTransaction.f();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setMMTitle(d7());
    }
}
