package k53;

/* loaded from: classes8.dex */
public class c0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f304346d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI f304347e;

    public c0(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI) {
        this.f304347e = gameVideoPreviewUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f304346d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        k53.b0 b0Var = (k53.b0) k3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "onBindViewHolder scroll position:%d", java.lang.Integer.valueOf(i17));
        p33.l lVar = (p33.l) this.f304346d.get(i17);
        b0Var.f304337d.setTag(lVar);
        if (lVar != null) {
            if (lVar.f351602d) {
                r53.f.l().postToWorker(new k53.v(this, lVar, b0Var));
                return;
            }
            o11.f fVar = new o11.f();
            fVar.f342083g = i53.h4.f288593a;
            fVar.f342078b = true;
            o11.g a17 = fVar.a();
            n11.a.b().i(lVar.f351606h, b0Var.f304339f, a17, new k53.x(this, b0Var));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new k53.b0(this, android.view.LayoutInflater.from(this.f304347e.f140114d).inflate(com.tencent.mm.R.layout.f489160bi3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
        p33.l lVar;
        k53.b0 b0Var = (k53.b0) k3Var;
        super.onViewAttachedToWindow(b0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewAttachedToWindow");
        if (b0Var == null || (lVar = (p33.l) b0Var.f304337d.getTag()) == null) {
            return;
        }
        b0Var.f304341h.setVisibility(0);
        java.lang.String str = lVar.f351607i;
        int i17 = (int) (lVar.f351612q / 1000);
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = b0Var.f304338e;
        gameVideoView.h(false, str, i17);
        lVar.f351617v = gameVideoView.getLocalPath();
        gameVideoView.setVideoPreparedListener(new k53.z(this, b0Var));
        gameVideoView.start();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        k53.b0 b0Var = (k53.b0) k3Var;
        super.onViewDetachedFromWindow(b0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewDetachedFromWindow");
        if (b0Var != null) {
            b0Var.f304338e.stop();
            b0Var.f304339f.post(new k53.a0(this, b0Var));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        k53.b0 b0Var = (k53.b0) k3Var;
        super.onViewRecycled(b0Var);
        if (b0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewRecycled");
            b0Var.f304338e.stop();
        }
    }

    public p33.l x(int i17) {
        if (i17 >= getItemCount() || i17 < 0) {
            return null;
        }
        return (p33.l) this.f304346d.get(i17);
    }
}
