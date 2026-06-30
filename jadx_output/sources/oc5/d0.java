package oc5;

/* loaded from: classes12.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f344397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(oc5.g0 g0Var) {
        super(0);
        this.f344397d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oc5.g0 g0Var = this.f344397d;
        java.util.HashMap hashMap = g0Var.f344420d;
        java.util.Set keySet = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        java.util.Iterator it = keySet.iterator();
        while (it.hasNext()) {
            oc5.t tVar = (oc5.t) hashMap.get((java.lang.String) it.next());
            com.tencent.mm.autogen.events.CancelRecogImageFileEvent cancelRecogImageFileEvent = new com.tencent.mm.autogen.events.CancelRecogImageFileEvent();
            am.q1 q1Var = cancelRecogImageFileEvent.f54026g;
            q1Var.getClass();
            q1Var.f7686a = tVar != null ? tVar.f344473a : 0L;
            cancelRecogImageFileEvent.e();
        }
        hashMap.clear();
        g0Var.f344421e.clear();
        g0Var.f344422f.clear();
        return jz5.f0.f302826a;
    }
}
