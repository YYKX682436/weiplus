package com.tencent.mm.plugin.finder.member.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberBanUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public final class FinderMemberBanUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b2o;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(eo2.b.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.aaw));
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        int intExtra = getIntent().getIntExtra("key_finder_member_status", 0);
        int intExtra2 = getIntent().getIntExtra("key_finder_member_visitor_status", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("key_self_flag", false);
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberBanUI", "create %s, status %d", stringExtra, java.lang.Integer.valueOf(intExtra));
        if (stringExtra == null || intExtra != 2) {
            finish();
            return;
        }
        if (intExtra2 == 0) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o_w)).setText(getString(com.tencent.mm.R.string.elm));
            android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.b2z);
            button.setText(getString(com.tencent.mm.R.string.f490454vi));
            button.setOnClickListener(new lo2.c(this));
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.a3a)).setVisibility(8);
        } else if (intExtra2 != 2) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o_w)).setText(getString(com.tencent.mm.R.string.elm));
            android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.b2z);
            button2.setText(getString(com.tencent.mm.R.string.f490454vi));
            button2.setOnClickListener(new lo2.b(this));
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.a3a)).setVisibility(8);
        } else {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.eln, getContext().getString(com.tencent.mm.R.string.elo), getContext().getString(com.tencent.mm.R.string.elp));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String format = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/readtemplate?lang=%s&t=weixin_agreement&s=video", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.m2.f(getContext())}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            arrayList.add(format);
            java.lang.String format2 = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/readtemplate?lang=%s&t=weixin_agreement&s=video_guide", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.m2.f(getContext())}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            arrayList.add(format2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(getContext().getString(com.tencent.mm.R.string.elo));
            arrayList2.add(getContext().getString(com.tencent.mm.R.string.elp));
            com.tencent.mm.plugin.finder.assist.d8 d8Var = com.tencent.mm.plugin.finder.assist.d8.f102092a;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.o_w);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.plugin.finder.assist.d8.f(d8Var, context, (android.widget.TextView) findViewById, "Finder.FinderMemberBanUI", string, arrayList, arrayList2, null, 64, null);
            android.widget.Button button3 = (android.widget.Button) findViewById(com.tencent.mm.R.id.b2z);
            button3.setText(getString(com.tencent.mm.R.string.f490454vi));
            button3.setOnClickListener(new lo2.a(this));
            if (booleanExtra) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("AuthorProfileMemberShipZone");
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("AuthorProfileMemberShipZone");
                if (I0 != null && L0 != null) {
                    com.tencent.mm.plugin.finder.report.x2.f125429a.e("3", L0, I0, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                }
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("AuthorProfileMemberShipZone");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("FinderMyTab", new int[]{32});
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileEntrance", new int[]{32});
        }
        setBackBtn(new lo2.d(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
    }
}
