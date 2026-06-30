package xc5;

/* loaded from: classes12.dex */
public final class c3 implements xf0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.e3 f453407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg3.c f453409f;

    public c3(java.lang.String str, xc5.e3 e3Var, mf3.k kVar, gg3.c cVar) {
        this.f453407d = e3Var;
        this.f453408e = kVar;
        this.f453409f = cVar;
    }

    @Override // xf0.e
    public void L0(xf0.g event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f454167b != xf0.h.f454170e) {
            return;
        }
        float f17 = event.f454168c;
        this.f453407d.W6(this.f453408e, gg3.d.f271732d, this.f453409f, new gg3.e(null, 0, f17, 3, null));
    }
}
