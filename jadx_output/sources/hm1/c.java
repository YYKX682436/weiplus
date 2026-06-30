package hm1;

/* loaded from: classes7.dex */
public final class c extends gg.a {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f282194d = {"video", "liveplayer", "livepusher"};

    @Override // gg.a
    public boolean a(java.lang.String str, sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        if (!kz5.z.G(f282194d, str)) {
            return true;
        }
        hm1.m mVar = hm1.m.f282203a;
        return !hm1.m.f282215m || invokeContext.k();
    }
}
