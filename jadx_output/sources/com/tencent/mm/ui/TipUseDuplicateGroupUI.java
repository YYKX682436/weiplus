package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/TipUseDuplicateGroupUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TipUseDuplicateGroupUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489330el1;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getIntent().getStringExtra("titile"));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackBtn(new com.tencent.mm.ui.oj(this), com.tencent.mm.R.raw.xmark_regular);
        final java.util.List stringArrayListExtra = getIntent().getStringArrayListExtra("list_attr");
        final java.util.List list = kz5.p0.f313996d;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = list;
        }
        java.util.List stringArrayListExtra2 = getIntent().getStringArrayListExtra("chatroommemberlist");
        if (stringArrayListExtra2 != null) {
            list = stringArrayListExtra2;
        }
        final java.lang.String stringExtra = getIntent().getStringExtra("create_group_session_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TipUseDuplicateGroupUI", "groups: " + stringArrayListExtra.size() + " memberList: " + list.size() + " sessionId: " + stringExtra);
        pm0.v.K(null, new com.tencent.mm.ui.pj(stringArrayListExtra, list, stringExtra));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.t8u);
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
        int i17 = 0;
        for (java.lang.Object obj : stringArrayListExtra) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            kotlin.jvm.internal.o.d(str);
            arrayList2.add(new com.tencent.mm.ui.hj(str, i17, stringArrayListExtra.size()));
            i17 = i18;
        }
        arrayList.addAll(arrayList2);
        wxRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.ui.TipUseDuplicateGroupUI$onCreate$adapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.ui.nj njVar = new com.tencent.mm.ui.nj();
                njVar.f209427e = new com.tencent.mm.ui.uj(com.tencent.mm.ui.TipUseDuplicateGroupUI.this, stringExtra, stringArrayListExtra, list);
                return njVar;
            }
        }, arrayList, false));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.t1b);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.tencent.mm.ui.rj(list, arrayList, stringExtra, this));
        }
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.L2(this, new com.tencent.mm.ui.sj(this));
        }
    }
}
