package ru2;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str) {
        super(0);
        this.f399735d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!ru2.j.f399748n) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ru2.j.f399746i;
            java.lang.String name = this.f399735d;
            kotlin.jvm.internal.o.f(name, "$name");
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((ru2.a) it.next()).V4(name);
            }
        }
        return jz5.f0.f302826a;
    }
}
