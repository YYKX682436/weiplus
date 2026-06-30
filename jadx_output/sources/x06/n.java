package x06;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final x06.n f451277a = new x06.n();

    public final boolean a(o06.d callableMemberDescriptor) {
        kotlin.jvm.internal.o.g(callableMemberDescriptor, "callableMemberDescriptor");
        java.util.Map map = x06.k.f451266a;
        if (!x06.k.f451269d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (!kz5.n0.O(x06.k.f451268c, v16.f.c(callableMemberDescriptor)) || !callableMemberDescriptor.W().isEmpty()) {
            if (!l06.o.A(callableMemberDescriptor)) {
                return false;
            }
            java.util.Collection i17 = callableMemberDescriptor.i();
            kotlin.jvm.internal.o.f(i17, "getOverriddenDescriptors(...)");
            java.util.Collection<o06.d> collection = i17;
            if (collection.isEmpty()) {
                return false;
            }
            for (o06.d dVar : collection) {
                x06.n nVar = f451277a;
                kotlin.jvm.internal.o.d(dVar);
                if (nVar.a(dVar)) {
                }
            }
            return false;
        }
        return true;
    }
}
