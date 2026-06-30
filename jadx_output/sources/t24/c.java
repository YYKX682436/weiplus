package t24;

/* loaded from: classes.dex */
public final class c extends a24.g {
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        c24.f item = (c24.f) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        p(holder, item, i17, i18, z17, list);
        a24.i iVar = item.f38077e;
        if (iVar instanceof s24.c) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(android.R.id.title);
            if (textView != null) {
                textView.setText(iVar.c7());
            }
            q(holder, iVar.getF161878p(), android.R.id.summary, t24.b.f415317d);
        }
    }

    @Override // a24.g
    public java.lang.Integer n(in5.s0 holder, a24.i baseItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(baseItem, "baseItem");
        return java.lang.Integer.valueOf(com.tencent.mm.R.layout.f489295c11);
    }
}
