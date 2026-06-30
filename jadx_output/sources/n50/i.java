package n50;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f335103a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f335104b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f335105c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f335106d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f335107e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f335108f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f335109g;

    public i(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f335103a = intent;
        this.f335104b = jz5.h.b(new n50.g(this));
        this.f335105c = jz5.h.b(new n50.c(this));
        this.f335106d = jz5.h.b(new n50.d(this));
        this.f335107e = jz5.h.b(new n50.e(this));
        jz5.h.b(new n50.b(this));
        this.f335108f = jz5.h.b(new n50.f(this));
        this.f335109g = jz5.h.b(new n50.h(this));
        jz5.h.b(new n50.a(this));
    }

    public final void a(co.a model) {
        kotlin.jvm.internal.o.g(model, "model");
        long b17 = b();
        int i17 = model.f43702d;
        model.set(i17 + 0, java.lang.Long.valueOf(b17));
        model.set(i17 + 2, java.lang.Long.valueOf(((java.lang.Number) ((jz5.n) this.f335106d).getValue()).longValue()));
        java.lang.String str = (java.lang.String) ((jz5.n) this.f335107e).getValue();
        kotlin.jvm.internal.o.f(str, "<get-forwardMsgTalker>(...)");
        model.set(i17 + 1, str);
        com.tencent.mm.storage.f9 c17 = c();
        model.set(i17 + 3, java.lang.Integer.valueOf(c17 != null ? c17.getType() : 0));
        java.lang.String str2 = (java.lang.String) ((jz5.n) this.f335108f).getValue();
        kotlin.jvm.internal.o.f(str2, "<get-forwardSnsId>(...)");
        model.set(i17 + 4, str2);
    }

    public final long b() {
        return ((java.lang.Number) ((jz5.n) this.f335105c).getValue()).longValue();
    }

    public final com.tencent.mm.storage.f9 c() {
        com.tencent.mm.storage.f9 e17 = e();
        if (e17 != null) {
            if (e17.getMsgId() > 0) {
                return e17;
            }
        }
        return null;
    }

    public final java.lang.String d() {
        return (java.lang.String) ((jz5.n) this.f335104b).getValue();
    }

    public final com.tencent.mm.storage.f9 e() {
        return (com.tencent.mm.storage.f9) ((jz5.n) this.f335109g).getValue();
    }
}
