package it2;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f294516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f294517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.HashSet hashSet, yz5.l lVar) {
        super(0);
        this.f294516d = hashSet;
        this.f294517e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f294516d.iterator();
        while (it.hasNext()) {
            this.f294517e.invoke(it.next());
        }
        return jz5.f0.f302826a;
    }
}
