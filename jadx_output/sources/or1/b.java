package or1;

/* loaded from: classes12.dex */
public class b extends fb5.b {
    @Override // fb5.b
    public void a(android.view.View view, fb5.a aVar) {
        if (view == null || aVar == null || !(aVar instanceof or1.a)) {
            return;
        }
        or1.a aVar2 = (or1.a) aVar;
        aVar2.f347453g = view.findViewById(com.tencent.mm.R.id.f483390aj3);
        aVar2.f320684a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a9n);
        aVar2.f347448b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbg);
        aVar2.f347449c = view.findViewById(com.tencent.mm.R.id.f487538ox2);
        aVar2.f347451e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ga_);
        aVar2.f347450d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hed);
        aVar2.f347452f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487767ps0);
    }

    @Override // fb5.b
    public void b(android.content.Context context, fb5.a aVar, fb5.c cVar, java.lang.Object... objArr) {
        if (context == null || aVar == null || cVar == null || cVar.f260882b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
            return;
        }
        if (!(cVar instanceof or1.c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
            return;
        }
        or1.a aVar2 = (or1.a) aVar;
        or1.c cVar2 = (or1.c) cVar;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(aVar2.f320684a, cVar2.f347464l);
        android.view.View view = aVar2.f347449c;
        int i17 = cVar2.f347465m ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = aVar2.f347453g;
        int i18 = cVar2.f347466n ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        lr1.m.b(aVar2.f347448b, cVar2.f347461i);
        boolean b17 = lr1.m.b(aVar2.f347452f, cVar2.f347463k);
        boolean b18 = lr1.m.b(aVar2.f347451e, cVar2.f347462j);
        if (lr1.m.b(aVar2.f347450d, cVar2.f347460h)) {
            if (b17 || b18) {
                aVar2.f347450d.setMaxLines(1);
            } else {
                aVar2.f347450d.setMaxLines(2);
            }
        }
    }

    @Override // fb5.b
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        return view == null ? android.view.View.inflate(context, com.tencent.mm.R.layout.ciy, null) : view;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    @Override // fb5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.content.Context r17, android.view.View r18, fb5.c r19, java.lang.Object... r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or1.b.d(android.content.Context, android.view.View, fb5.c, java.lang.Object[]):boolean");
    }
}
