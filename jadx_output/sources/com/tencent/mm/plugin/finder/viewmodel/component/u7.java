package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class u7 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e8 f136103d;

    public u7(com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var) {
        this.f136103d = e8Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onItemClick: position:" + i17);
        nr2.m mVar = (nr2.m) holder.f293125i;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 16);
        java.lang.String k17 = mVar.k();
        long l17 = mVar.l();
        mVar.g();
        intent.putExtra("key_topic_title", k17);
        intent.putExtra("KEY_TOPIC_ID", l17);
        intent.putExtra("KEY_FROM_PAID_COLLECTION", true);
        com.tencent.mm.protocal.protobuf.FinderContact b17 = mVar.b();
        intent.putExtra("paid_collection_username", b17 != null ? b17.getUsername() : null);
        intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
        intent.putExtra("key_ref_object_id", mVar.j());
        intent.putExtra("paid_collection_info", mVar.f339268d.toByteArray());
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var = this.f136103d;
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, e8Var.getContext(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(e8Var.getContext(), intent);
    }
}
