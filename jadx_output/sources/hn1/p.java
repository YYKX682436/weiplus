package hn1;

/* loaded from: classes11.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn1.s f282471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f282473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282474g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(hn1.s sVar, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        super(0);
        this.f282471d = sVar;
        this.f282472e = str;
        this.f282473f = bitmap;
        this.f282474g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) this.f282471d.f282486h).getValue()).iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            hn1.z zVar = (hn1.z) ((d75.c) it.next()).get();
            if (zVar == null) {
                it.remove();
            } else {
                zVar.a(this.f282472e, this.f282473f, this.f282474g);
            }
        }
        return jz5.f0.f302826a;
    }
}
