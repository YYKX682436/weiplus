package gn4;

/* loaded from: classes15.dex */
public class d1 extends gn4.d0 {
    @Override // gn4.d0, fn4.m
    public void p() {
        if (this.f273605h == null) {
            fn4.b bVar = this.f264583d;
            this.f273605h = new gn4.f1(bVar.B(), bVar, this);
            this.f273606i.removeAllViews();
            this.f273606i.addView(this.f273605h, new android.widget.FrameLayout.LayoutParams(bVar.y4().x, bVar.y4().y));
        }
        this.f273605h.q(this.f264584e, getAdapterPosition());
    }
}
