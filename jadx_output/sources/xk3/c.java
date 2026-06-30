package xk3;

/* loaded from: classes8.dex */
public final class c extends xk3.i {
    public c(vk3.a aVar) {
        super(com.tencent.mm.R.layout.bxn, aVar);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        uk3.a item = (uk3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        java.lang.String string = item.f428524d.v0().getString(5);
        if (string != null) {
            n11.a.b().g(string, (android.widget.ImageView) holder.p(com.tencent.mm.R.id.jvb));
        }
    }
}
