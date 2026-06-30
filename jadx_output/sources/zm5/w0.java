package zm5;

/* loaded from: classes10.dex */
public final class w0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f474279d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474280e;

    /* renamed from: f, reason: collision with root package name */
    public int f474281f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f474282g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f474283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f474279d = jz5.h.b(new zm5.s0(this));
        this.f474280e = "";
        this.f474282g = new java.util.ArrayList();
        this.f474283h = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_CROP_IMAGE_PATH");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f474280e = stringExtra;
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new java.util.ArrayList();
        }
        this.f474283h = parcelableArrayListExtra;
        this.f474281f = parcelableArrayListExtra.size();
        bm5.v0 v0Var = bm5.v0.f22754a;
        java.util.ArrayList arrayList = this.f474283h;
        java.util.ArrayList arrayList2 = this.f474282g;
        v0Var.a(arrayList, arrayList2);
        arrayList2.add(0, new aq.d("TOP", new java.util.ArrayList()));
        ((com.tencent.mm.mm_compose.MMComposeView) ((jz5.n) this.f474279d).getValue()).setContent(u0.j.c(1756060911, true, new zm5.v0(this)));
    }
}
