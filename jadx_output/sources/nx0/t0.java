package nx0;

/* loaded from: classes5.dex */
public final class t0 extends nx0.p3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView f341227d;

    public t0(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView beautyView) {
        this.f341227d = beautyView;
    }

    @Override // nx0.p3, android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        if (z17) {
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView beautyView = this.f341227d;
            beautyView.f69590v = true;
            nx0.v vVar = beautyView.f69583o;
            if (vVar != null) {
                vVar.f341243e = i17 / 100.0f;
                recyclerView2 = beautyView.getRecyclerView();
                androidx.recyclerview.widget.f2 adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(beautyView.f69584p);
                }
            }
            recyclerView = beautyView.getRecyclerView();
            androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView.c(beautyView, ((nx0.u) adapter2).y());
            }
            beautyView.f(nx0.k1.f341148d);
        }
    }
}
