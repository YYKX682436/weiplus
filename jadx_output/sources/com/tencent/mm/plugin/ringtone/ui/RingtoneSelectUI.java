package com.tencent.mm.plugin.ringtone.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneSelectUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class RingtoneSelectUI extends com.tencent.mm.plugin.ringtone.uic.BaseRingtoneUI {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f158334d = 0;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ch7;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.ringtone.uic.z1.class, com.tencent.mm.plugin.ringtone.uic.v.class, com.tencent.mm.plugin.ringtone.uic.b3.class, com.tencent.mm.plugin.ringtone.uic.g2.class, com.tencent.mm.plugin.ringtone.uic.g.class, com.tencent.mm.plugin.ringtone.uic.c3.class, com.tencent.mm.plugin.ringtone.uic.a2.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.ringtone.uic.BaseRingtoneUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        pf5.u uVar = pf5.u.f353936a;
        ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) ((iz2.c) uVar.e(zy2.b6.class).c(iz2.c.class))).f136733g.add(com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI.class);
        super.onCreate(bundle);
        if (getIntent().getIntExtra("ringtone_caller", 1) == 1) {
            setMMTitle(com.tencent.mm.R.string.f492838i30);
        } else {
            java.lang.String stringExtra = getIntent().getStringExtra("exclusvie_name");
            if (stringExtra != null) {
                if (c01.e2.l(stringExtra).I == 2) {
                    setMMTitle(com.tencent.mm.R.string.f492840i32);
                } else {
                    setMMTitle(com.tencent.mm.R.string.f492839i31);
                }
            }
        }
        setBackBtn(new ay3.k(this));
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            addIconOptionMenu(1, com.tencent.mm.R.raw.icons_outlined_umbrella, new ay3.l(this));
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_privacy_switch, true)) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new ay3.m(this));
        }
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
        setBackGroundColorResource(com.tencent.mm.R.color.f478489a);
        ((hy2.f) ((iz2.b) uVar.c(this).c(iz2.b.class))).f286057f = 7;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return;
        }
        removeOptionMenu(1);
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(iz2.b.class)));
    }
}
