package gu1;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f275898a;

    /* renamed from: b, reason: collision with root package name */
    public eu1.f f275899b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f275900c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f275901d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f275902e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f275903f;

    public m(com.tencent.mm.ui.MMActivity mMActivity, android.view.View view) {
    }

    public void a() {
        java.lang.Integer num = (java.lang.Integer) xt1.t0.Di().a("key_share_card_show_type");
        if (num == null) {
            num = 0;
        }
        eu1.f fVar = this.f275899b;
        if (fVar != null && fVar.k() && ((num.intValue() == 1 || num.intValue() == 4) && eu1.f.c())) {
            this.f275903f.setVisibility(0);
            this.f275901d.setVisibility(8);
            this.f275902e.setVisibility(8);
            return;
        }
        this.f275903f.setVisibility(8);
        eu1.f fVar2 = this.f275899b;
        if (fVar2 == null) {
            this.f275901d.setVisibility(8);
            this.f275902e.setVisibility(8);
            return;
        }
        fVar2.k();
        this.f275899b.l();
        if (!this.f275899b.k() || !this.f275899b.l()) {
            this.f275901d.setVisibility(0);
            this.f275902e.setVisibility(8);
        } else if (this.f275899b.k() && this.f275899b.l()) {
            this.f275901d.setVisibility(8);
            this.f275902e.setVisibility(8);
        }
    }
}
