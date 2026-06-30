package defpackage;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final defpackage.h f277764d = new defpackage.h();

    public h() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        yz5.l successCallback = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(successCallback, "successCallback");
        successCallback.invoke(java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
