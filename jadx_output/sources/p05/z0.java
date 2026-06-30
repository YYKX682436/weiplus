package p05;

/* loaded from: classes3.dex */
public final class z0 implements com.tencent.mm.xeffect.IWeJsonMessageCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f350739a = new java.util.LinkedHashSet();

    @Override // com.tencent.mm.xeffect.IWeJsonMessageCallback
    public int a(int i17, java.lang.String message, tq5.g type) {
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(type, "type");
        java.util.Iterator it = this.f350739a.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.xeffect.IWeJsonMessageCallback) it.next()).a(i17, message, type);
        }
        return 0;
    }
}
