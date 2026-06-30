package ju0;

/* loaded from: classes5.dex */
public abstract class f extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final ju0.e f301683a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f301684b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f301685c;

    /* renamed from: d, reason: collision with root package name */
    public int f301686d;

    /* renamed from: e, reason: collision with root package name */
    public int f301687e;

    public f(ju0.e callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f301683a = callback;
        this.f301685c = new android.graphics.Rect();
        this.f301686d = -1;
        this.f301687e = -1;
    }

    @Override // androidx.recyclerview.widget.a1
    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        int i17;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes2;
        java.lang.String d76;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View itemView = viewHolder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        itemView.getGlobalVisibleRect(rect);
        com.tencent.mars.xlog.Log.i("ItemTouchDragCallback", "[clearView] itemRect:" + rect + " lastItemRect:" + this.f301685c);
        ju0.e eVar = this.f301683a;
        int adapterPosition = viewHolder.getAdapterPosition();
        android.graphics.Rect lastItemRect = this.f301685c;
        nu0.g2 g2Var = (nu0.g2) eVar;
        g2Var.getClass();
        kotlin.jvm.internal.o.g(lastItemRect, "lastItemRect");
        android.view.View l76 = g2Var.f339943a.l7();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(l76, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initImageRecyclerView$callback$1", "onEndDrag", "(ILandroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l76.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(l76, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initImageRecyclerView$callback$1", "onEndDrag", "(ILandroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g2Var.f339943a.i7().setVisibility(0);
        nu0.b4 b4Var = g2Var.f339943a;
        b4Var.getClass();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        b4Var.l7().getGlobalVisibleRect(rect2);
        if (lastItemRect.intersect(rect2)) {
            nu0.b4 b4Var2 = g2Var.f339943a;
            ju0.b bVar = b4Var2.K;
            int i18 = bVar.f301680g;
            if (adapterPosition == i18) {
                java.util.List list = bVar.f250921d;
                kotlin.jvm.internal.o.f(list, "getItems(...)");
                i18 = adapterPosition == (((ku0.a) kz5.n0.i0(list)).f312060a.f475661a.getIdentifierType() == qg.a.Unknown ? bVar.getItemCount() + (-2) : bVar.getItemCount() - 1) ? adapterPosition - 1 : adapterPosition + 1;
            }
            nu0.q0 U6 = b4Var2.U6();
            nu0.j3 j3Var = new nu0.j3(b4Var2, adapterPosition);
            U6.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[removeScene] index:");
            sb6.append(adapterPosition);
            sb6.append(" nextIndex:");
            sb6.append(i18);
            sb6.append(' ');
            com.tencent.maas.imagestudio.MJImageScene Z6 = U6.Z6();
            sb6.append(Z6 != null ? Z6.getSceneID() : null);
            com.tencent.mars.xlog.Log.i("ImageControlUIC", sb6.toString());
            java.lang.String d77 = U6.d7(adapterPosition);
            if (d77 != null && (d76 = U6.d7(i18)) != null) {
                com.tencent.maas.imagestudio.MJImageSession mJImageSession = U6.f340075r;
                if (mJImageSession != null) {
                    mJImageSession.l(d77, d76);
                }
                U6.X6(false, new nu0.e0(j3Var, U6, adapterPosition));
            }
            nu0.i q76 = g2Var.f339943a.q7();
            q76.V6("edit_delete_photo", "view_clk", q76.U6());
        }
        this.f301684b = false;
        int i19 = this.f301686d;
        if (i19 == -1 || (i17 = this.f301687e) == -1) {
            return;
        }
        nu0.b4 b4Var3 = ((nu0.g2) this.f301683a).f339943a;
        b4Var3.getClass();
        int i27 = i19 < i17 ? i17 + 1 : i17;
        nu0.q0 U62 = b4Var3.U6();
        nu0.q2 q2Var = new nu0.q2(i19, b4Var3, i17);
        U62.getClass();
        com.tencent.mars.xlog.Log.i("ImageControlUIC", "[moveScene] from:" + i19 + " to:" + i27);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[moveScene] ");
        com.tencent.maas.imagestudio.MJImageSession mJImageSession2 = U62.f340075r;
        if (mJImageSession2 == null || (imageScenes2 = mJImageSession2.getImageScenes()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(imageScenes2.length);
            for (com.tencent.maas.imagestudio.MJImageScene mJImageScene : imageScenes2) {
                arrayList.add(mJImageScene.getSceneID() + ' ');
            }
        }
        sb7.append(arrayList);
        com.tencent.mars.xlog.Log.i("ImageControlUIC", sb7.toString());
        java.lang.String d78 = U62.d7(i19);
        if (d78 != null) {
            java.lang.String d79 = U62.d7(i27);
            com.tencent.mars.xlog.Log.i("ImageControlUIC", "[moveScene] fromSceneID:" + d78 + " toSceneID:" + d79);
            com.tencent.maas.imagestudio.MJImageSession mJImageSession3 = U62.f340075r;
            if (mJImageSession3 != null) {
                mJImageSession3.i(d78, d79);
            }
            U62.X6(false, new nu0.a0(U62, i19, i27, q2Var));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[moveScene] ");
            com.tencent.maas.imagestudio.MJImageSession mJImageSession4 = U62.f340075r;
            if (mJImageSession4 == null || (imageScenes = mJImageSession4.getImageScenes()) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(imageScenes.length);
                for (com.tencent.maas.imagestudio.MJImageScene mJImageScene2 : imageScenes) {
                    arrayList2.add(mJImageScene2.getSceneID() + ' ');
                }
            }
            sb8.append(arrayList2);
            com.tencent.mars.xlog.Log.i("ImageControlUIC", sb8.toString());
        }
        this.f301686d = -1;
        this.f301687e = -1;
    }

    @Override // androidx.recyclerview.widget.a1
    public float getMoveThreshold(androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        return (super.getMoveThreshold(viewHolder) / 1.3f) / 1.3f;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onChildDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, float f17, float f18, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        super.onChildDraw(c17, recyclerView, viewHolder, f17 / 1.3f, f18 / 1.3f, i17, z17);
        if (this.f301684b && z17) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.View itemView = viewHolder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            itemView.getGlobalVisibleRect(rect);
            this.f301685c = rect;
            nu0.g2 g2Var = (nu0.g2) this.f301683a;
            g2Var.getClass();
            nu0.b4 b4Var = g2Var.f339943a;
            b4Var.getClass();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            b4Var.l7().getGlobalVisibleRect(rect2);
            boolean intersect = rect.intersect(rect2);
            b4Var.l7().setBackgroundColor(b3.l.getColor(b4Var.l7().getContext(), intersect ? com.tencent.mm.R.color.Red_100 : com.tencent.mm.R.color.f479429ad5));
            int i18 = intersect ? com.tencent.mm.R.raw.trash_off_filled : com.tencent.mm.R.raw.trash_on_filled;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = b4Var.G;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("deleteIcon");
                throw null;
            }
            weImageView.setImageResource(i18);
            int i19 = intersect ? com.tencent.mm.R.string.btx : com.tencent.mm.R.string.btw;
            android.widget.TextView textView = b4Var.H;
            if (textView != null) {
                textView.setText(b4Var.getString(i19));
            } else {
                kotlin.jvm.internal.o.o("deleteTip");
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSelectedChanged(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (k3Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ItemTouchDragCallback", "[onSelectedChanged] actionState:" + i17);
        if (i17 == 2) {
            this.f301684b = true;
            k3Var.getAdapterPosition();
            nu0.b4 b4Var = ((nu0.g2) this.f301683a).f339943a;
            android.view.View l76 = b4Var.l7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(l76, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initImageRecyclerView$callback$1", "onStartDrag", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(l76, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initImageRecyclerView$callback$1", "onStartDrag", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b4Var.i7().setVisibility(4);
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }
}
