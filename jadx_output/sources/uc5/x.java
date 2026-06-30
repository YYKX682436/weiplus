package uc5;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc5.y f426551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(uc5.y yVar) {
        super(0);
        this.f426551d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = this.f426551d.f426553e.iterator();
        while (it.hasNext()) {
            java.util.Set b17 = ((uc5.p) it.next()).b();
            if (b17.isEmpty()) {
                return null;
            }
            java.util.Iterator it6 = b17.iterator();
            while (it6.hasNext()) {
                linkedHashSet.add(java.lang.Integer.valueOf(((java.lang.Number) it6.next()).intValue() & 65535));
            }
        }
        if (!(!linkedHashSet.isEmpty())) {
            linkedHashSet = null;
        }
        return linkedHashSet;
    }
}
