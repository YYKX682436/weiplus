package nx0;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView f341244d;

    public v0(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView beautyView) {
        this.f341244d = beautyView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyView$initEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView beautyView = this.f341244d;
        recyclerView = beautyView.getRecyclerView();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyAdapter");
        nx0.u uVar = (nx0.u) adapter;
        if (uVar.y()) {
            int i17 = 0;
            for (java.lang.Object obj : uVar.f341232d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                nx0.x xVar = (nx0.x) obj;
                if (xVar instanceof nx0.v) {
                    nx0.v vVar = (nx0.v) xVar;
                    float f17 = vVar.f341243e;
                    float f18 = vVar.f341242d;
                    if (!(f17 == f18)) {
                        vVar.f341243e = f18;
                        uVar.notifyItemChanged(i17);
                    }
                }
                i17 = i18;
            }
            nx0.v vVar2 = beautyView.f69583o;
            if (vVar2 != null) {
                seekBar = beautyView.getSeekBar();
                seekBar.setProgress(a06.d.b(vVar2.f341243e * 100));
            }
            beautyView.f(new nx0.u0(beautyView));
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyView$initEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
