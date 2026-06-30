package gf;

/* loaded from: classes7.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f271029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.util.LinkedList linkedList) {
        super(1);
        this.f271029d = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f271029d.add(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.a(com.tencent.mm.plugin.appbrand.appstorage.l1.i(it)));
        return jz5.f0.f302826a;
    }
}
