package com.tencent.mm.plugin.finder.member.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberPreviewUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lrd2/b;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderMemberPreviewUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements rd2.b {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f121397v = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f121398t = "";

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f121399u = jz5.h.b(new lo2.t(this));

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 206;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{eo2.b.class, com.tencent.mm.plugin.finder.member.preview.b.class, com.tencent.mm.plugin.finder.member.preview.c0.class, com.tencent.mm.plugin.finder.member.preview.f0.class, go2.a1.class, com.tencent.mm.plugin.finder.member.preview.o0.class, com.tencent.mm.plugin.finder.playlist.w1.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isHideStatusBar() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.a9e));
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f121398t = stringExtra;
        setMMTitle("");
        removeAllOptionMenu();
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new lo2.s(this));
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.f121399u).getValue()).alive();
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderMemberPreviewUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 12, 27010);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("finder_username", this.f121398t);
        lVarArr[1] = new jz5.l("comment_scene", 206);
        lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        eo2.b bVar = (eo2.b) zVar.a(context).e(eo2.b.class);
        lVarArr[3] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar != null ? bVar.f255558d : 0));
        lVarArr[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        ((cy1.a) rVar).gk(this, kz5.c1.k(lVarArr));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.f121399u).getValue()).dead();
    }
}
