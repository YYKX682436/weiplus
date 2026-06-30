package com.tencent.mm.plugin.profile.ui.mod;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/mod/ContactAssembleModRemarkUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ContactAssembleModRemarkUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e3v;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((vf5.j) component(vf5.j.class)).f436426g = i65.a.h(this, com.tencent.mm.R.dimen.f479649bo);
        ((hr3.w1) component(hr3.w1.class)).P6(iy1.c.WeChatNotesandTabsPage);
        setActionbarColor(i65.a.d(this, com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean onVasBackPressed() {
        if (j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigProfileWxContact()) == 1) {
            if (((kr3.q1) pf5.z.f353948a.a(this).a(kr3.q1.class)).V6()) {
                return false;
            }
        } else if (((kr3.q0) pf5.z.f353948a.a(this).a(kr3.q0.class)).V6()) {
            return false;
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigProfileWxContact()) == 1) {
            set.add(kr3.q1.class);
        } else {
            set.add(kr3.q0.class);
        }
        set.add(vf5.j.class);
        set.add(hr3.w1.class);
        set.add(la5.x.class);
        set.add(kr3.r1.class);
        set.add(gc0.p2.class);
        if (getIntent().getBooleanExtra("view_only", false)) {
            return;
        }
        set.add(or3.k.class);
        set.add(j93.n.class);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        if (j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigProfileWxContact()) == 1 ? ((kr3.q1) pf5.z.f353948a.a(this).a(kr3.q1.class)).S6() : ((kr3.q0) pf5.z.f353948a.a(this).a(kr3.q0.class)).S6()) {
            return false;
        }
        return super.supportNavigationSwipeBack();
    }
}
