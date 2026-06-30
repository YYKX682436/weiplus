package rr3;

/* loaded from: classes3.dex */
public final class k extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f399194d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f399195e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f399196f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f399197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f399194d = jz5.h.b(new rr3.f(activity));
        this.f399195e = jz5.h.b(new rr3.j(activity));
        this.f399196f = jz5.h.b(new rr3.g(activity));
        this.f399197g = jz5.h.b(new rr3.i(activity));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_Nick");
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        jz5.g gVar = this.f399197g;
        java.lang.String U6 = ((com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI) ((jz5.n) gVar).getValue()).U6();
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(U6);
        if (a17 != null) {
            ((android.widget.ImageView) ((jz5.n) this.f399194d).getValue()).setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(a17, false, a17.getWidth() * 0.5f));
        }
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f399196f).getValue();
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        if (x51.t1.b(stringExtra) || kotlin.jvm.internal.o.b(stringExtra, ((com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI) ((jz5.n) gVar).getValue()).U6())) {
            ((c01.k7) c01.n8.a()).b(((com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI) ((jz5.n) gVar).getValue()).U6(), 5, new rr3.h(this, stringExtra));
        } else {
            ((android.widget.TextView) ((jz5.n) this.f399195e).getValue()).setText(stringExtra);
        }
    }
}
