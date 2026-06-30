package k50;

/* loaded from: classes.dex */
public final class e0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f304204d;

    public e0(yz5.l lVar) {
        this.f304204d = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = k50.g0.f304216c;
        yz5.l lVar = this.f304204d;
        java.lang.Integer num = (java.lang.Integer) map.get(lVar.invoke(obj));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        java.lang.Integer num2 = (java.lang.Integer) map.get(lVar.invoke(obj2));
        return mz5.a.b(valueOf, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
