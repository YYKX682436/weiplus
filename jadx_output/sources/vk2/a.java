package vk2;

/* loaded from: classes3.dex */
public final class a extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ vk2.h I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vk2.h hVar, com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory multiStreamItemConvertFactory, java.util.ArrayList arrayList) {
        super(multiStreamItemConvertFactory, arrayList, true);
        this.I = hVar;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.getPosition();
        int position = holder.getPosition();
        vk2.h hVar = this.I;
        if (position < hVar.f437766o.size()) {
            rk2.r.b(rk2.r.f396485a, 4, ((sk2.a) hVar.f437766o.get(holder.getPosition())).f408951d.f428522b.f379274e, null, 4, null);
        }
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0, androidx.recyclerview.widget.f2
    /* renamed from: C0 */
    public void onViewDetachedFromWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.getPosition();
    }
}
