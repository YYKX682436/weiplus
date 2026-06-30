package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusSquareActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TextStatusSquareActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f173699d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f173700e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d0a;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.textstatus.ui.jg(this));
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.String string = extras != null ? extras.getString("TEXT_STATUS") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            extras2.getString("TOPIC_ID");
        }
        android.os.Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            extras3.getString("STATUS_ID");
        }
        int i17 = 0;
        while (true) {
            arrayList = this.f173699d;
            if (i17 >= 11) {
                break;
            }
            arrayList.add(new lj4.h(java.lang.String.valueOf(i17), "test", "", "", ""));
            i17++;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.lqa);
        this.f173700e = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f173700e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity$buildItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return type == -1 ? new ni4.e() : new ni4.h();
                }
            }, arrayList, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f173700e;
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView3 != null ? wxRecyclerView3.getAdapter() : null;
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        in5.n0.S((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter, new lj4.g("#" + string, "共324人 同城23人"), false, 2, null);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f173700e;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.N(new com.tencent.mm.plugin.textstatus.ui.kg(this));
        }
    }
}
