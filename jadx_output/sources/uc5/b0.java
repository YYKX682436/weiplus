package uc5;

/* loaded from: classes9.dex */
public abstract class b0 extends uc5.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ad5.l0[] availableOperations) {
        super(availableOperations);
        kotlin.jvm.internal.o.g(availableOperations, "availableOperations");
    }

    public final void A(android.content.Context context, em.a2 binding, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.c().setImageDrawable(null);
        binding.a().setImageResource(i17);
        com.tencent.mm.ui.widget.imageview.WeImageView a17 = binding.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "showDefaultIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "showDefaultIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (binding.f254060i == null) {
            binding.f254060i = (com.tencent.mm.chatting.widget.RoundClipFrameLayout) binding.f254052a.findViewById(com.tencent.mm.R.id.h68);
        }
        binding.f254060i.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478490b, null));
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.ekk, (android.view.ViewGroup) recyclerView, false);
    }

    @Override // uc5.n
    public java.lang.Object p(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return new em.a2(holder.itemView);
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        em.a2 binding = (em.a2) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        if (binding.f254059h == null) {
            binding.f254059h = (android.widget.CheckBox) binding.f254052a.findViewById(com.tencent.mm.R.id.bsc);
        }
        android.widget.CheckBox checkBox = binding.f254059h;
        kotlin.jvm.internal.o.f(checkBox, "getCheckBox(...)");
        return checkBox;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        em.a2 binding = (em.a2) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        android.view.View view = binding.f254052a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // uc5.n
    public void v(android.content.Context context, in5.s0 holder, uc5.d item, java.lang.Object obj) {
        em.a2 binding = (em.a2) obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(binding, "binding");
        android.widget.TextView textView = binding.f254053b;
        android.view.View view = binding.f254052a;
        if (textView == null) {
            binding.f254053b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nec);
        }
        android.widget.TextView textView2 = binding.f254053b;
        android.content.res.Resources resources = context.getResources();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = g95.e0.d(item.p());
        ((sg3.a) v0Var).getClass();
        textView2.setText(resources.getString(com.tencent.mm.R.string.pbm, c01.a2.e(d17)));
        if (binding.f254056e == null) {
            binding.f254056e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o7z);
        }
        binding.f254056e.setText(k35.m1.f(context, item.p().T1(), true, false));
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        em.a2 binding = (em.a2) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.d().setText("");
        binding.b().setText("");
        android.widget.TextView b17 = binding.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        binding.c().setPadding(0, 0, 0, 0);
        binding.c().setImageDrawable(null);
        binding.c().setBackground(null);
        if (binding.f254060i == null) {
            binding.f254060i = (com.tencent.mm.chatting.widget.RoundClipFrameLayout) binding.f254052a.findViewById(com.tencent.mm.R.id.h68);
        }
        binding.f254060i.setBackground(null);
        com.tencent.mm.ui.widget.imageview.WeImageView a17 = binding.a();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(a17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // uc5.n
    /* renamed from: y */
    public void n(android.content.Context context, em.a2 binding, java.lang.String query) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlin.jvm.internal.o.g(query, "query");
        android.content.res.Resources resources = context.getResources();
        uc5.e eVar = uc5.n.f426527n;
        eVar.a();
        int color = resources.getColor(com.tencent.mm.R.color.f478502m, null);
        android.widget.TextView d17 = binding.d();
        java.lang.CharSequence text = binding.d().getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        d17.setText(eVar.b(text, query, color));
        android.widget.TextView b17 = binding.b();
        java.lang.CharSequence text2 = binding.b().getText();
        kotlin.jvm.internal.o.f(text2, "getText(...)");
        b17.setText(eVar.b(text2, query, color));
    }

    public final void z(android.widget.TextView textView, android.content.Context context, java.lang.CharSequence text) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(text, "text");
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, text));
    }
}
