package com.tencent.mm.plugin.mv.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvAlbumPreviewUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvAlbumPreviewUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public static r45.oc5 f150859d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c4m;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.mv.ui.uic.b.class, com.tencent.mm.plugin.mv.ui.uic.q.class, com.tencent.mm.plugin.mv.ui.uic.c0.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((com.tencent.mm.plugin.mv.ui.uic.c0) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.c0.class)).Q6(0);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479163rn));
        hideTitleView();
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        findViewById(com.tencent.mm.R.id.aa8).setOnClickListener(new jm3.a(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        ll3.z0.a(ll3.z0.f319264a, false, 1, null);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        ((com.tencent.mm.plugin.mv.ui.uic.c0) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.c0.class)).Q6(0);
        super.onSwipeBack();
    }
}
