package lo0;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo0.h f319949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lo0.h hVar) {
        super(1);
        this.f319949d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        lo0.h hVar = (lo0.h) it.get();
        boolean z17 = true;
        if (!(hVar == null) && !kotlin.jvm.internal.o.b(hVar, this.f319949d)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
