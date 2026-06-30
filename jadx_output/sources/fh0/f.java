package fh0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final fh0.f f262526d = new fh0.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        fh0.k kVar = fh0.k.f262530a;
        kotlin.jvm.internal.o.d(context);
        fh0.a aVar = new fh0.a(context);
        aVar.setOnDoubleTap(fh0.e.f262525d);
        fh0.k.f262531b = aVar;
        try {
            aVar.f262508d.addView(aVar, aVar.f262509e);
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f302826a;
    }
}
