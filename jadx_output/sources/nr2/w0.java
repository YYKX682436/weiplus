package nr2;

/* loaded from: classes2.dex */
public final class w0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f339326d;

    public w0(nr2.i1 i1Var) {
        this.f339326d = i1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.do2 do2Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPresenter", "onItemClick: position:" + i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 16);
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        boolean z17 = j5Var instanceof com.tencent.mm.plugin.finder.playlist.z1;
        byte[] bArr = null;
        nr2.i1 i1Var = this.f339326d;
        if (z17) {
            com.tencent.mm.plugin.finder.playlist.z1 z1Var = (com.tencent.mm.plugin.finder.playlist.z1) j5Var;
            if (z1Var.getFeedObject().getMediaType() != 15) {
                intent.putExtra("key_ref_object_id", z1Var.getFeedObject().getId());
                nr2.m mVar = i1Var.f339215f;
                intent.putExtra("key_topic_title", mVar != null ? mVar.k() : null);
                nr2.m mVar2 = i1Var.f339215f;
                intent.putExtra("KEY_TOPIC_ID", mVar2 != null ? java.lang.Long.valueOf(mVar2.l()) : null);
                intent.putExtra("KEY_FROM_PAID_COLLECTION", true);
                nr2.m mVar3 = i1Var.f339215f;
                intent.putExtra("paid_collection_username", mVar3 != null ? mVar3.o() : null);
                nr2.m mVar4 = i1Var.f339215f;
                if (mVar4 != null && (do2Var = mVar4.f339268d) != null) {
                    bArr = do2Var.toByteArray();
                }
                intent.putExtra("paid_collection_info", bArr);
                nr2.m mVar5 = i1Var.f339215f;
                boolean z18 = mVar5 != null && mVar5.p();
                android.app.Activity activity = i1Var.f339210a;
                if (z18) {
                    intent.putExtra("KEY_COLLECTION_PREVIEW_WORDING", activity.getString(com.tencent.mm.R.string.lq_));
                } else {
                    intent.putExtra("KEY_COLLECTION_PREVIEW_WORDING", activity.getString(com.tencent.mm.R.string.f491342mh0));
                }
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, i1Var.f339210a, intent, 0L, null, 0, 0, false, 0, null, 508, null);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(activity, intent);
                return;
            }
        }
        nr2.m mVar6 = i1Var.f339215f;
        java.lang.String o17 = mVar6 != null ? mVar6.o() : null;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (kotlin.jvm.internal.o.b(o17, xy2.c.e(context))) {
            return;
        }
        android.app.Activity context2 = i1Var.f339210a;
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nr2.u0 u0Var = (nr2.u0) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).e(nr2.u0.class);
        if (u0Var != null) {
            u0Var.O6(view, null);
        }
    }
}
