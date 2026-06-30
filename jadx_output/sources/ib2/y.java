package ib2;

/* loaded from: classes2.dex */
public final class y implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f290179d;

    public y(ib2.i0 i0Var) {
        this.f290179d = i0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.playlist.z1 z1Var = (com.tencent.mm.plugin.finder.playlist.z1) holder.f293125i;
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionPresenter", "onItemClick: position:" + i17 + ", item:" + z1Var.getItemId());
        android.content.Intent intent = new android.content.Intent();
        ib2.i0 i0Var = this.f290179d;
        r45.vx0 vx0Var = i0Var.f290124f;
        int integer = vx0Var != null ? vx0Var.getInteger(21) : 0;
        if (integer <= 0) {
            integer = 16;
        }
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var instanceof com.tencent.mm.plugin.finder.playlist.z1) {
            com.tencent.mm.plugin.finder.playlist.z1 z1Var2 = (com.tencent.mm.plugin.finder.playlist.z1) j5Var;
            if (z1Var2.getFeedObject().getMediaType() != 15) {
                intent.putExtra("key_ref_object_id", z1Var2.getFeedObject().getId());
                intent.putExtra("key_ref_object_dup_flag", z1Var2.w());
                intent.putExtra("key_topic_type", integer);
                r45.vx0 vx0Var2 = i0Var.f290124f;
                if (vx0Var2 == null || (str = vx0Var2.getString(1)) == null) {
                    str = "";
                }
                intent.putExtra("key_topic_title", str);
                r45.vx0 vx0Var3 = i0Var.f290124f;
                intent.putExtra("KEY_TOPIC_ID", vx0Var3 != null ? vx0Var3.getLong(0) : 0L);
                intent.putExtra("KEY_CLICK_FEED_ID", z1Var.getItemId());
                intent.putExtra("KEY_CLICK_FEED_POSITION", i17);
                r45.vx0 vx0Var4 = i0Var.f290124f;
                intent.putExtra("KEY_COLLECTION_INFO", vx0Var4 != null ? vx0Var4.toByteArray() : null);
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, i0Var.f290119a, intent, 0L, null, 0, 0, false, 0, null, 508, null);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(i0Var.f290119a, intent);
            }
        }
    }
}
