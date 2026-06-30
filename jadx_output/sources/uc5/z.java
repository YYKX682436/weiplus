package uc5;

/* loaded from: classes9.dex */
public abstract class z extends uc5.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ad5.l0[] availableOperations) {
        super(availableOperations);
        kotlin.jvm.internal.o.g(availableOperations, "availableOperations");
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.ekq, (android.view.ViewGroup) null);
    }

    @Override // uc5.n
    public java.lang.Object p(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return new em.e2(holder.itemView);
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        em.e2 binding = (em.e2) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        if (binding.f254281c == null) {
            binding.f254281c = (android.widget.CheckBox) binding.f254279a.findViewById(com.tencent.mm.R.id.bsc);
        }
        android.widget.CheckBox checkBox = binding.f254281c;
        kotlin.jvm.internal.o.f(checkBox, "getCheckBox(...)");
        return checkBox;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        em.e2 binding = (em.e2) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        android.view.View view = binding.f254279a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        em.e2 binding = (em.e2) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        if (binding.a().getChildCount() > 0) {
            int childCount = binding.a().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = binding.a().getChildAt(i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryEmojiItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryStickerItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryEmojiItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryStickerItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
