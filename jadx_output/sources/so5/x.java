package so5;

/* loaded from: classes14.dex */
public final class x implements bp5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so5.y f410919a;

    public x(so5.y yVar) {
        this.f410919a = yVar;
    }

    public void a(java.nio.ByteBuffer bytes, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(bytes, "bytes");
        bytes.clear();
        to5.c cVar = this.f410919a.f410924h;
        cVar.getClass();
        bytes.clear();
        java.lang.Integer.valueOf(cVar.f421003c.C(bytes, bytes.capacity(), i17, i18, i19, i27)).intValue();
    }
}
