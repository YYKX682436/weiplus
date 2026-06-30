package cw1;

/* loaded from: classes5.dex */
public final /* synthetic */ class u2$$a implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj = new java.lang.Object();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array2 = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
        cw1.c cVar = (cw1.c) view.getTag();
        android.content.Intent intent = new android.content.Intent();
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        final java.lang.String str = cVar.f222832a;
        final long j17 = cVar.f222834c;
        cj6.getClass();
        com.tencent.mm.storage.f9 f9Var = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            final java.lang.String X8 = cj6.X8(str);
            if (cj6.Da(X8)) {
                f9Var = ot0.c3.l().g("getNewestMsgByCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$g5
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return ot0.z2.f348822a.w0(com.tencent.mm.storage.g9.this.f193989r, X8, str, j17);
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$h5
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                        g9Var.getClass();
                        com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                        android.database.Cursor f17 = g9Var.f193989r.f("select * from " + X8 + " where" + g9Var.Z8(str) + "and createTime > " + j17 + "  order by createTime ASC limit 1", null, 2);
                        if (f17.moveToFirst()) {
                            f9Var2.convertFrom(f17);
                        }
                        f17.close();
                        return f9Var2;
                    }
                });
            } else if (cj6.Pb(X8)) {
                f9Var = ot0.z2.f348822a.w0(cj6.f193989r, X8, str, j17);
            } else {
                com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                android.database.Cursor f17 = cj6.f193989r.f("select * from " + X8 + " where" + cj6.Z8(str) + "and createTime > " + j17 + "  order by createTime ASC limit 1", null, 2);
                if (f17.moveToFirst()) {
                    f9Var2.convertFrom(f17);
                }
                f17.close();
                f9Var = f9Var2;
            }
        }
        if (f9Var != null && f9Var.getMsgId() > 0) {
            intent.putExtra("msg_local_id", f9Var.getMsgId());
        }
        intent.putExtra("KHalfScreenUIC", ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).wi(3));
        ((sy.z) ((ty.j0) i95.n0.c(ty.j0.class))).Ai(cVar.f222832a, intent);
        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
