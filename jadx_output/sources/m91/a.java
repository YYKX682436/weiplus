package m91;

/* loaded from: classes7.dex */
public final class a implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final m91.a f324941d = new m91.a();

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.LinkedHashMap linkedHashMap = m91.f.f324953c;
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        java.util.Set keySet = linkedHashMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        m91.c cVar = (m91.c) kz5.n0.h0(keySet);
        com.tencent.mm.sdk.platformtools.g gVar = new com.tencent.mm.sdk.platformtools.g();
        gVar.f192711a = cVar.f324943d;
        gVar.f192712b = cVar.f324944e;
        return gVar;
    }
}
