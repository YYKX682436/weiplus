package uc5;

/* loaded from: classes10.dex */
public abstract class a0 extends uc5.n {

    /* renamed from: p, reason: collision with root package name */
    public static android.graphics.drawable.ColorDrawable f426470p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ad5.l0[] availableOperations) {
        super(availableOperations);
        kotlin.jvm.internal.o.g(availableOperations, "availableOperations");
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.eki, (android.view.ViewGroup) null);
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // uc5.n, in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.l(holder);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            em.y1 p17 = p(holder);
            java.lang.Object obj = holder.f293121e;
            y(p17, obj instanceof zc5.o ? (zc5.o) obj : null);
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        em.y1 binding = (em.y1) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        if (binding.f254942d == null) {
            binding.f254942d = (com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryCheckBox) binding.f254939a.findViewById(com.tencent.mm.R.id.bsc);
        }
        com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryCheckBox msgHistoryGalleryCheckBox = binding.f254942d;
        kotlin.jvm.internal.o.f(msgHistoryGalleryCheckBox, "getCheckBox(...)");
        return msgHistoryGalleryCheckBox;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        em.y1 binding = (em.y1) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        android.view.View view = binding.f254939a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        em.y1 binding = (em.y1) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        android.view.View view = binding.f254939a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryGridItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryGridItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.graphics.drawable.ColorDrawable colorDrawable = f426470p;
        android.view.View view2 = binding.f254939a;
        if (colorDrawable == null) {
            colorDrawable = new android.graphics.drawable.ColorDrawable(view2.getContext().getResources().getColor(com.tencent.mm.R.color.f478490b, null));
            f426470p = colorDrawable;
        }
        binding.a().setImageDrawable(colorDrawable);
        binding.a().setBackground(null);
        if (binding.b().length() > 0) {
            binding.b().setText("");
        }
        android.widget.TextView b17 = binding.b();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryGridItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryGridItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object context = view2.getContext();
        y(binding, context instanceof zc5.o ? (zc5.o) context : null);
    }

    public final void y(em.y1 y1Var, zc5.o oVar) {
        java.lang.Object tag = y1Var.a().getTag(com.tencent.mm.R.id.h9z);
        w65.m mVar = tag instanceof w65.m ? (w65.m) tag : null;
        y1Var.a().setTag(com.tencent.mm.R.id.h9z, null);
        if (mVar == null || oVar == null) {
            return;
        }
        oVar.d3().d(mVar.id());
    }

    @Override // uc5.n
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public em.y1 p(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.uhl);
        em.y1 y1Var = tag instanceof em.y1 ? (em.y1) tag : null;
        if (y1Var != null) {
            return y1Var;
        }
        android.view.View view = holder.itemView;
        em.y1 y1Var2 = new em.y1(view);
        view.setTag(com.tencent.mm.R.id.uhl, y1Var2);
        return y1Var2;
    }
}
