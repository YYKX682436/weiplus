package tc5;

/* loaded from: classes10.dex */
public final class w extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417578d;

    public w(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        this.f417578d = msgHistoryGalleryUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int u07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI$timelineRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417578d;
        msgHistoryGalleryUI.F = i17;
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.h7(msgHistoryGalleryUI);
        boolean z17 = i17 != 0;
        xm3.t0 b17 = xm3.u0.b(msgHistoryGalleryUI.m7());
        if (b17 != null) {
            int itemCount = b17.getItemCount();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int childCount = msgHistoryGalleryUI.m7().getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = msgHistoryGalleryUI.m7().getChildAt(i18);
                if (childAt != null && (u07 = msgHistoryGalleryUI.m7().u0(childAt)) != -1 && u07 < itemCount) {
                    int itemViewType = b17.getItemViewType(u07);
                    if (!linkedHashSet.contains(java.lang.Integer.valueOf(itemViewType))) {
                        linkedHashSet.add(java.lang.Integer.valueOf(itemViewType));
                        in5.r w07 = b17.w0(itemViewType);
                        uc5.n nVar = w07 instanceof uc5.n ? (uc5.n) w07 : null;
                        if (nVar != null) {
                            nVar.f426534m = z17;
                        }
                    }
                }
            }
        }
        int[] iArr = msgHistoryGalleryUI.M;
        if (i17 == 0) {
            int length = iArr.length;
            for (int i19 = 0; i19 < length; i19++) {
                iArr[i19] = 0;
            }
            msgHistoryGalleryUI.N = 0;
            msgHistoryGalleryUI.E = 0;
            if (msgHistoryGalleryUI.P) {
                msgHistoryGalleryUI.P = false;
                msgHistoryGalleryUI.x7(false);
                ed5.t tVar = msgHistoryGalleryUI.I;
                if (tVar != null) {
                    tVar.f251386f = true;
                }
                recyclerView.D0();
                msgHistoryGalleryUI.z7();
            }
        } else if (i17 == 1) {
            int length2 = iArr.length;
            for (int i27 = 0; i27 < length2; i27++) {
                iArr[i27] = 0;
            }
            msgHistoryGalleryUI.N = 0;
            msgHistoryGalleryUI.E = 0;
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI$timelineRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int height;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI$timelineRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417578d;
        int[] iArr = msgHistoryGalleryUI.M;
        int i19 = msgHistoryGalleryUI.N;
        iArr[i19] = i18;
        msgHistoryGalleryUI.N = (i19 + 1) % 3;
        msgHistoryGalleryUI.getClass();
        if (recyclerView.getScrollState() == 2 && (height = recyclerView.getHeight()) > 0) {
            int i27 = 0;
            for (int i28 : msgHistoryGalleryUI.M) {
                i27 += java.lang.Math.abs(i28);
            }
            boolean z17 = i27 / 3 >= ((int) (((float) height) * 0.25f));
            if (z17 && !msgHistoryGalleryUI.P) {
                msgHistoryGalleryUI.P = true;
                msgHistoryGalleryUI.x7(true);
                ed5.t tVar = msgHistoryGalleryUI.I;
                if (tVar != null) {
                    tVar.f251386f = false;
                }
                recyclerView.D0();
            } else if (!z17 && msgHistoryGalleryUI.P) {
                msgHistoryGalleryUI.P = false;
                msgHistoryGalleryUI.x7(false);
                ed5.t tVar2 = msgHistoryGalleryUI.I;
                if (tVar2 != null) {
                    tVar2.f251386f = true;
                }
                recyclerView.D0();
                msgHistoryGalleryUI.z7();
            }
        }
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.h7(msgHistoryGalleryUI);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI$timelineRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
