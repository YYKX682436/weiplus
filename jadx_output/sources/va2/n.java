package va2;

/* loaded from: classes2.dex */
public final class n extends com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // x92.m
    public void F7(java.lang.String tabName, int i17, int i18) {
        kotlin.jvm.internal.o.g(tabName, "tabName");
        r45.r03 r03Var = (r45.r03) this.f452711w;
        long j17 = r03Var != null ? r03Var.getLong(1) : 0L;
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("topicid", pm0.v.u(j17));
            jSONObject.put("topictag", stringExtra);
            jSONObject.put("tabtype", i17);
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "topictab", i18, jSONObject, false, null, 48, null);
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    public void G7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        pf5.e.launch$default(this, null, null, new va2.m(this, getIntent().getIntExtra("key_topic_type", 1), stringExtra, getIntent().getLongExtra("key_feed_id", 0L), null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment I7(r45.bo6 tagInfo) {
        kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
        com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment finderTopicTabFragment = new com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment();
        finderTopicTabFragment.f129265p = tagInfo.getInteger(1) - 1;
        finderTopicTabFragment.f129266q = tagInfo.getString(0);
        finderTopicTabFragment.f101753u = tagInfo.getLong(2);
        java.lang.String string = tagInfo.getString(0);
        if (string == null) {
            string = "";
        }
        finderTopicTabFragment.f101754v = string;
        return finderTopicTabFragment;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment J7(com.tencent.mm.plugin.finder.activity.uic.i1 mediaTabInfo, java.util.LinkedList tags) {
        kotlin.jvm.internal.o.g(mediaTabInfo, "mediaTabInfo");
        kotlin.jvm.internal.o.g(tags, "tags");
        com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabParentFragment finderTopicTabParentFragment = new com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabParentFragment();
        finderTopicTabParentFragment.f101808w = mediaTabInfo;
        finderTopicTabParentFragment.f101809x = tags;
        finderTopicTabParentFragment.f101810y = this.C;
        return finderTopicTabParentFragment;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public w92.a K7(r45.bo6 tagInfo, boolean z17) {
        kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
        java.lang.String string = tagInfo.getString(0);
        if (string == null) {
            string = "";
        }
        return new w92.a(-1, string, z17, tagInfo.getInteger(1), 1);
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public int N7() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    /* renamed from: O7 */
    public r45.r03 B7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        u92.b a17 = u92.a.a(u92.b.f425822e, 0L, null, stringExtra, 3, null);
        if (a17 == null) {
            return null;
        }
        if (!a17.d()) {
            a17 = null;
        }
        if (a17 == null) {
            return null;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) a17.f36361b;
        r45.ma1 ma1Var = fVar != null ? (r45.ma1) fVar.f70618d : null;
        if (ma1Var != null) {
            return (r45.r03) ma1Var.getCustom(1);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public boolean Q7(r45.r03 topicInfo) {
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        r45.q03 q03Var = (r45.q03) topicInfo.getCustom(20);
        if (q03Var == null) {
            return false;
        }
        z5();
        java.util.LinkedList list = q03Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getList(...)");
        P7(list, false);
        return true;
    }

    @Override // x92.m
    /* renamed from: R7, reason: merged with bridge method [inline-methods] */
    public void E7(r45.r03 r03Var) {
        java.lang.String string;
        android.content.Intent intent = getIntent();
        r45.r03 r03Var2 = (r45.r03) this.f452711w;
        intent.putExtra("KEY_TOPIC_ID", r03Var2 != null ? r03Var2.getLong(1) : 0L);
        super.E7(r03Var);
        long longExtra = getIntent().getLongExtra("key_ref_object_id", 0L);
        long longExtra2 = getIntent().getLongExtra("KEY_TOPIC_ID", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        r45.r03 r03Var3 = (r45.r03) this.f452711w;
        if (r03Var3 != null) {
            longExtra2 = r03Var3.getLong(1);
        }
        r45.r03 r03Var4 = (r45.r03) this.f452711w;
        if (r03Var4 != null && (string = r03Var4.getString(0)) != null) {
            stringExtra = string;
        }
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = (com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
        utVar.P6("feedid", pm0.v.u(longExtra));
        utVar.P6("topicid", pm0.v.u(longExtra2));
        utVar.P6("topicname", stringExtra);
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    public boolean y7() {
        return this.f452710v != null;
    }

    @Override // x92.q
    public void z5() {
        android.view.View findViewById;
        if (a2() && (findViewById = getActivity().findViewById(com.tencent.mm.R.id.nvf)) != null) {
            findViewById.setBackgroundResource(com.tencent.mm.R.color.aaw);
        }
        setNormalStyle();
    }
}
