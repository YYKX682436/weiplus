package d90;

/* loaded from: classes11.dex */
public final class p implements d90.i, com.tencent.wechat.aff.chatbot.t {

    /* renamed from: a, reason: collision with root package name */
    public final d90.j f227440a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f227441b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f227442c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f227443d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.s f227444e;

    public p(d90.j callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f227440a = callback;
        this.f227441b = jz5.h.b(d90.n.f227438d);
        this.f227442c = jz5.h.b(new d90.o(this));
        this.f227443d = jz5.h.b(new d90.m(this));
    }

    public void a(java.lang.String text, boolean z17) {
        kotlin.jvm.internal.o.g(text, "text");
        ((com.tencent.wechat.aff.chatbot.o) ((jz5.n) this.f227443d).getValue()).a(text, z17);
    }

    public void b() {
        com.tencent.wechat.aff.chatbot.p.f216415b.a((java.lang.String) ((jz5.n) this.f227441b).getValue());
    }
}
