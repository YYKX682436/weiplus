package i81;

/* loaded from: classes7.dex */
public final class a implements al1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i81.b f289515d;

    public a(i81.b bVar) {
        this.f289515d = bVar;
    }

    @Override // al1.g
    public void d(android.view.View.OnClickListener onClickListener) {
        this.f289515d.f289523f.setHomeButtonOnClickListener(onClickListener);
    }

    @Override // al1.g
    public void e(android.view.View.OnClickListener onClickListener) {
        this.f289515d.f289523f.setOptionButtonOnClickListener(onClickListener);
    }

    @Override // al1.i0
    public boolean h(boolean z17, al1.h0 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return z17;
    }

    @Override // al1.g
    public void k(int i17) {
        this.f289515d.f289523f.setStyleColor(i17);
    }

    @Override // al1.g
    public void n(int i17) {
        this.f289515d.f289523f.setVisibility(i17);
    }
}
