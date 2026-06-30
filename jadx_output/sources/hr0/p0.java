package hr0;

/* loaded from: classes11.dex */
public final class p0 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f283318b = jz5.h.b(hr0.m0.f283312d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f283319c = jz5.h.b(hr0.o0.f283316d);

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        jz5.g gVar = this.f283318b;
        android.os.Handler handler = (android.os.Handler) ((jz5.n) gVar).getValue();
        jz5.g gVar2 = this.f283319c;
        handler.removeCallbacks((java.lang.Runnable) ((jz5.n) gVar2).getValue());
        ((android.os.Handler) ((jz5.n) gVar).getValue()).postDelayed((java.lang.Runnable) ((jz5.n) gVar2).getValue(), 300000L);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        ((android.os.Handler) ((jz5.n) this.f283318b).getValue()).removeCallbacks((java.lang.Runnable) ((jz5.n) this.f283319c).getValue());
    }
}
