package pi4;

/* loaded from: classes11.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489556dx4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        nj4.a item = (nj4.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.KeyEvent.Callback callback = holder.itemView;
        if (callback instanceof bi4.s0) {
            kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.api.IStatusUpdate");
            ((bi4.s0) callback).b4(en1.a.a());
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.toString();
    }
}
