package q00;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f359250f = jz5.h.b(q00.c.f359247d);

    /* renamed from: a, reason: collision with root package name */
    public bw5.c7 f359251a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f359252b;

    /* renamed from: c, reason: collision with root package name */
    public ep0.e f359253c;

    /* renamed from: d, reason: collision with root package name */
    public final vo0.d f359254d = (vo0.d) ((jz5.n) f359250f).getValue();

    /* renamed from: e, reason: collision with root package name */
    public float f359255e;

    public final void a() {
        android.widget.ImageView imageView;
        bw5.c7 c7Var = this.f359251a;
        java.lang.String b17 = c7Var != null ? c7Var.b() : null;
        if (b17 == null || b17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcsImgLoader", "url is empty");
            return;
        }
        bw5.c7 c7Var2 = this.f359251a;
        kotlin.jvm.internal.o.d(c7Var2);
        wo0.c a17 = this.f359254d.a(new q00.h(c7Var2));
        ep0.e eVar = this.f359253c;
        if (eVar != null) {
            a17.getClass();
            a17.f447873d = eVar;
        }
        if (this.f359255e > 0.0f && (imageView = this.f359252b) != null) {
            if (imageView != null) {
                imageView.setOutlineProvider(new q00.d(this));
            }
            android.widget.ImageView imageView2 = this.f359252b;
            if (imageView2 != null) {
                imageView2.setClipToOutline(true);
            }
        }
        android.widget.ImageView imageView3 = this.f359252b;
        if (imageView3 == null) {
            a17.a();
        } else {
            kotlin.jvm.internal.o.d(imageView3);
            a17.c(imageView3);
        }
    }

    public final q00.f b(yz5.l onSuc) {
        kotlin.jvm.internal.o.g(onSuc, "onSuc");
        this.f359253c = new q00.e(onSuc);
        return this;
    }
}
