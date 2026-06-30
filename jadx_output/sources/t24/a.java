package t24;

/* loaded from: classes.dex */
public final class a extends a24.g {
    @Override // a24.g, in5.r
    public int e() {
        return com.tencent.mm.R.layout.eie;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        c24.f item = (c24.f) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        p(holder, item, i17, i18, z17, list);
        android.view.View view = holder.itemView;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        a24.i iVar = item.f38077e;
        if (iVar instanceof s24.b) {
            ((s24.b) iVar).x7(holder, com.tencent.mm.R.id.f484225t85, i17);
        }
    }
}
