package vg2;

/* loaded from: classes3.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(vg2.r1 r1Var) {
        super(0);
        this.f436517d = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vg2.r1 r1Var = this.f436517d;
        android.widget.TextView textView = (android.widget.TextView) r1Var.f436564e.findViewById(com.tencent.mm.R.id.f483925ch3);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(textView, "live_gift_color_button");
        ((cy1.a) aVar.ik(textView, 40, 25652)).gk(textView, kz5.c1.k(new jz5.l("gift_id", r1Var.f436567h.field_rewardProductId), new jz5.l("thing_index", vg2.r1.b(r1Var))));
        textView.setOnClickListener(new vg2.g1(r1Var));
        return textView;
    }
}
