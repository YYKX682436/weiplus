package com.tencent.mm.plugin.test;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/test/ExMainSettings;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "yh4/a", "yh4/b", "yh4/c", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ExMainSettings extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f173207d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f173208e = new java.util.ArrayList();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c7s;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new yh4.g(this));
        java.util.ArrayList arrayList = this.f173208e;
        arrayList.add(new yh4.a("朋友圈", com.tencent.mm.R.raw.friendactivity_refresh, new yh4.d(this)));
        arrayList.add(new yh4.a("Live", com.tencent.mm.R.raw.panel_icon_live, new yh4.e()));
        android.graphics.drawable.Drawable i17 = i65.a.i(getContext(), com.tencent.mm.R.raw.icons_outlined_finder_icon);
        i17.setColorFilter(new android.graphics.PorterDuffColorFilter(getContext().getResources().getColor(com.tencent.mm.R.color.Orange_100), android.graphics.PorterDuff.Mode.SRC_ATOP));
        arrayList.add(new yh4.a("Finder", i17, new yh4.f(this)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f173207d = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f486525lj4);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f173207d;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        yh4.b bVar = new yh4.b(arrayList);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f173207d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(bVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f173207d;
        if (recyclerView3 != null) {
            recyclerView3.setItemViewCacheSize(0);
        }
        pm0.v.V(0L, new yh4.h(bVar));
    }
}
