package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class f implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f123361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView f123362e;

    public f(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView) {
        this.f123361d = wxRecyclerAdapter;
        this.f123362e = finderCollectionFilterView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = i17 - this.f123361d.a0();
        so2.d0 d0Var = (so2.d0) holder.f293125i;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", d0Var.f410308d.getInteger(21));
        r45.vx0 vx0Var = d0Var.f410308d;
        java.lang.String string = vx0Var.getString(1);
        if (string == null) {
            string = "";
        }
        long j17 = vx0Var.getLong(0);
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionFilterView", "click item pos:" + a07 + " topicId " + pm0.v.u(j17));
        intent.putExtra("key_topic_title", string);
        intent.putExtra("KEY_TOPIC_ID", j17);
        intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView = this.f123362e;
        android.content.Context context = finderCollectionFilterView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context2 = finderCollectionFilterView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.il(context2, intent);
    }
}
