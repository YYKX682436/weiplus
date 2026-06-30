package z32;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f469940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f469941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f469942f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f469943g;

    public t(android.widget.TextView textView, k91.v5 v5Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, z32.a0 a0Var) {
        this.f469940d = textView;
        this.f469941e = v5Var;
        this.f469942f = weImageView;
        this.f469943g = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k91.v5 v5Var = this.f469941e;
        this.f469940d.setText(v5Var.field_nickname);
        int color = this.f469943g.getContext().getResources().getColor(com.tencent.mm.R.color.a9e);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f469942f;
        weImageView.setIconColor(color);
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342079c = true;
        n11.a.b().h(v5Var.field_smallHeadURL, weImageView, fVar.a());
    }
}
