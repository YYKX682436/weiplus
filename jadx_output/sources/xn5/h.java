package xn5;

/* loaded from: classes13.dex */
public final class h implements xn5.y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xn5.i f455676b;

    public h(xn5.i iVar) {
        this.f455676b = iVar;
    }

    @Override // xn5.y
    public java.util.Map a(java.lang.String activityName) {
        java.util.HashMap hashMap;
        kotlin.jvm.internal.o.g(activityName, "activityName");
        boolean c17 = c(activityName);
        kz5.q0 q0Var = kz5.q0.f314001d;
        return (c17 && (hashMap = (java.util.HashMap) this.f455676b.f455681c.get(activityName)) != null) ? hashMap : q0Var;
    }

    @Override // xn5.y
    public boolean b(java.lang.String actName, int i17) {
        kotlin.jvm.internal.o.g(actName, "actName");
        java.util.Set set = (java.util.Set) this.f455676b.f455680b.get(actName);
        if (set != null) {
            return set.contains(java.lang.Integer.valueOf(i17));
        }
        return false;
    }

    @Override // xn5.y
    public boolean c(java.lang.String actName) {
        kotlin.jvm.internal.o.g(actName, "actName");
        return this.f455676b.f455680b.containsKey(actName);
    }
}
