package com.tencent.mm.ui.mvvm;

@db5.a(32768)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/mvvm/MvvmContactListUI;", "Lcom/tencent/mm/plugin/mvvmlist/BaseMvvmListActivity;", "Lri5/j;", "<init>", "()V", "ui-selectcontact_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class MvvmContactListUI extends com.tencent.mm.plugin.mvvmlist.BaseMvvmListActivity<ri5.j> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f209252h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f209253d = jz5.h.b(new ni5.h(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f209254e = jz5.h.b(new ni5.a(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f209255f = jz5.h.b(new ni5.g(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f209256g = jz5.h.b(new ni5.f(this));

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (((java.lang.Boolean) ((jz5.n) this.f209255f).getValue()).booleanValue()) {
            overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return ((java.lang.Number) ((jz5.n) this.f209256g).getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c5o;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean isContentAtTop() {
        jz5.g gVar = this.f209253d;
        kotlin.jvm.internal.o.d(((em.l2) ((jz5.n) gVar).getValue()).h().getVisibility() == 0 ? ((em.l2) ((jz5.n) gVar).getValue()).h() : ((em.l2) ((jz5.n) gVar).getValue()).k());
        return !r0.canScrollVertically(-1);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        wi5.n0 n0Var;
        hideVKB();
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(new wi5.a());
        }
        if (((java.lang.Boolean) ((jz5.n) this.f209254e).getValue()).booleanValue()) {
            j75.f stateCenter2 = getStateCenter();
            boolean z17 = false;
            if (stateCenter2 != null && (n0Var = (wi5.n0) stateCenter2.getState()) != null && !n0Var.e()) {
                z17 = true;
            }
            if (!z17) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new ni5.b(this));
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.L2(this, new ni5.e(this));
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.content.Intent intent = getIntent();
        iy1.c cVar = iy1.c.MainUI;
        cy1.a aVar = (cy1.a) rVar;
        aVar.Zj(this, intent.getIntExtra("key_select_contact_report_page_id", 1107));
        aVar.Rj(this, iy1.a.NewGroupChat);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f54924g.f6419a = 0L;
        updateSearchIndexAtOnceEvent.e();
        if (getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) == 16) {
            ((qg5.j2) ((ct.y2) i95.n0.c(ct.y2.class))).getClass();
            fk5.y.f263683d.getClass();
            fk5.y.f263684e = false;
        }
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(cj5.j1.class);
        set.add(cj5.l4.class);
        set.add(cj5.z2.class);
        set.add(zi5.b.class);
    }
}
