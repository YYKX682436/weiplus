package mf3;

/* loaded from: classes14.dex */
public final class b extends android.widget.EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf3.c f326102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f326103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, mf3.c cVar, com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView, android.content.Context context) {
        super(context);
        this.f326101a = i17;
        this.f326102b = cVar;
        this.f326103c = recyclerView;
    }

    public final void a(float f17) {
        mf3.c cVar = this.f326102b;
        cVar.getClass();
        int i17 = this.f326101a == 0 ? 1 : -1;
        ((mf3.v) cVar).getClass();
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f326103c;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        float width = recyclerView.getWidth() * f17 * 0.3f * i17;
        int childCount = recyclerView.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 J2 = recyclerView.J(recyclerView.getChildAt(i18));
            kotlin.jvm.internal.o.e(J2, "null cannot be cast to non-null type com.tencent.mm.plugin.media.adapter.MediaBaseViewHolder");
            mf3.r rVar = (mf3.r) J2;
            android.view.View view = rVar.A;
            if (view.isShown()) {
                u3.u uVar = rVar.D;
                if (uVar != null) {
                    uVar.b();
                }
                view.setTranslationX(view.getTranslationX() + width);
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public boolean draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        setSize(0, 0);
        return super.draw(canvas);
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i17) {
        super.onAbsorb(i17);
        mf3.c cVar = this.f326102b;
        cVar.getClass();
        int i18 = this.f326101a == 0 ? 1 : -1;
        cVar.getClass();
        float f17 = i17 * 0.3f * i18;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f326103c;
        int childCount = recyclerView.getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 J2 = recyclerView.J(recyclerView.getChildAt(i19));
            kotlin.jvm.internal.o.e(J2, "null cannot be cast to non-null type T of com.tencent.mm.plugin.media.adapter.BaseEdgeEffectFactory");
            u3.u uVar = ((mf3.r) ((mf3.a) J2)).D;
            if (uVar != null) {
                uVar.f424225a = f17;
                uVar.e();
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f17, float f18) {
        super.onPull(f17, f18);
        a(f17);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        u3.u uVar;
        super.onRelease();
        finish();
        if (isFinished()) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f326103c;
            int childCount = recyclerView.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                com.tencent.mm.xcompat.recyclerview.widget.y1 J2 = recyclerView.J(recyclerView.getChildAt(i17));
                mf3.a aVar = J2 instanceof mf3.a ? (mf3.a) J2 : null;
                if (aVar != null && (uVar = ((mf3.r) aVar).D) != null) {
                    uVar.e();
                }
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f17) {
        super.onPull(f17);
        a(f17);
    }
}
