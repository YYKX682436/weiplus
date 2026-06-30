package gn4;

/* loaded from: classes15.dex */
public class d0 extends fn4.m implements gn4.a {

    /* renamed from: h, reason: collision with root package name */
    public gn4.z f273605h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f273606i;

    @Override // fn4.m
    public fn4.g i() {
        return this.f273605h;
    }

    @Override // fn4.m
    public android.view.View j() {
        return this.f273605h.getControlBar().getWowView();
    }

    @Override // fn4.m
    public void n(android.view.View view) {
        this.f273606i = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.p0y);
    }

    @Override // fn4.m
    public void p() {
        if (this.f273605h == null) {
            fn4.b bVar = this.f264583d;
            if (bVar.p6()) {
                this.f273605h = new gn4.f1(bVar.B(), bVar, this);
            } else {
                this.f273605h = new gn4.z(bVar.B(), bVar, this);
            }
            this.f273606i.removeAllViews();
            this.f273606i.addView(this.f273605h, bVar.p6() ? new android.widget.FrameLayout.LayoutParams(bVar.y4().x, bVar.y4().y) : new android.widget.FrameLayout.LayoutParams(bVar.y4().y, bVar.y4().x));
        }
        this.f273605h.q(this.f264584e, getAdapterPosition());
    }

    @Override // fn4.m
    public void s(boolean z17) {
        r45.xn6 xn6Var = this.f264584e;
        fn4.b bVar = this.f264583d;
        bVar.a2(xn6Var);
        bVar.X1(getAdapterPosition());
        if (this.f273605h.n(z17, false)) {
            t();
            m();
        }
    }

    @Override // fn4.m, fn4.a
    public int u() {
        return getAdapterPosition();
    }
}
