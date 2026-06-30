package f0;

/* loaded from: classes5.dex */
public final class z0 implements f0.t0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f258282b;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b0 f258281a = new androidx.compose.foundation.lazy.layout.b0();

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f258283c = f0.u0.f258232d;

    public void a(int i17, yz5.l lVar, yz5.p pVar, yz5.l contentType, yz5.r itemContent) {
        kotlin.jvm.internal.o.g(contentType, "contentType");
        kotlin.jvm.internal.o.g(itemContent, "itemContent");
        this.f258281a.a(i17, new f0.j(lVar, pVar == null ? this.f258283c : pVar, contentType, itemContent));
        if (pVar != null) {
            this.f258282b = true;
        }
    }
}
