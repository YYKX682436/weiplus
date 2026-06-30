package e33;

/* loaded from: classes10.dex */
public class d5 extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f247200a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e33.h5 f247201b;

    public d5(e33.h5 h5Var) {
        this.f247201b = h5Var;
    }

    @Override // androidx.recyclerview.widget.a1
    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        if (k3Var != null) {
            super.clearView(recyclerView, k3Var);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f247201b.f247257e, com.tencent.mm.R.anim.f477823ch);
            loadAnimation.setAnimationListener(new e33.c5(this));
            ((e33.f5) k3Var).f247227n.startAnimation(loadAnimation);
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public float getMoveThreshold(androidx.recyclerview.widget.k3 k3Var) {
        return 0.295858f;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        return androidx.recyclerview.widget.a1.makeMovementFlags(51, 0);
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
    public void onChildDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, float f17, float f18, int i17, boolean z17) {
        super.onChildDraw(canvas, recyclerView, k3Var, f17 / 1.3f, f18 / 1.3f, i17, z17);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2) {
        int adapterPosition = k3Var.getAdapterPosition();
        int adapterPosition2 = k3Var2.getAdapterPosition();
        e33.h5 h5Var = this.f247201b;
        h5Var.notifyItemMoved(adapterPosition, adapterPosition2);
        e33.g5 g5Var = h5Var.f247261i;
        if (g5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMove]fromPos:%s, toPos:%s, mPosition:%s", java.lang.Integer.valueOf(adapterPosition), java.lang.Integer.valueOf(adapterPosition2), ((e33.v3) g5Var).f247516a.f138593o);
        }
        h5Var.f247266q = adapterPosition2;
        return false;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSelectedChanged(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (k3Var != null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f247201b.f247257e, com.tencent.mm.R.anim.f477824ci);
            loadAnimation.setAnimationListener(new e33.b5(this, i17, k3Var));
            ((e33.f5) k3Var).f247227n.startAnimation(loadAnimation);
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 k3Var, int i17) {
    }
}
