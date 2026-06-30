package oc5;

/* loaded from: classes12.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f344494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent f344495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(oc5.g0 g0Var, com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        super(0);
        this.f344494d = g0Var;
        this.f344495e = recogQBarOfImageFileResultEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oc5.g0 g0Var = this.f344494d;
        g0Var.getClass();
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = this.f344495e;
        java.lang.String str = recogQBarOfImageFileResultEvent.f54661g.f6368a;
        if (str == null) {
            str = "";
        }
        java.util.HashMap hashMap = g0Var.f344421e;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(str);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pm0.v.X(new oc5.c0((oc5.n) it.next(), recogQBarOfImageFileResultEvent));
            }
        }
        oc5.t tVar = (oc5.t) g0Var.f344420d.remove(str);
        if (tVar != null) {
            g0Var.e(tVar);
        } else {
            tVar = null;
        }
        hashMap.remove(str);
        if (g0Var.a(tVar)) {
            java.util.HashMap hashMap2 = g0Var.f344422f;
            oc5.u uVar = (oc5.u) hashMap2.get(str);
            if (uVar == null) {
                oc5.u uVar2 = new oc5.u();
                uVar2.f344483a = recogQBarOfImageFileResultEvent;
                uVar2.f344484b = null;
                uVar2.f344485c = true;
                hashMap2.put(str, uVar2);
            } else {
                uVar.f344483a = recogQBarOfImageFileResultEvent;
                uVar.f344484b = null;
                uVar.f344485c = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
