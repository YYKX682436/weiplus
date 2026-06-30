package oc5;

/* loaded from: classes3.dex */
public abstract class f implements oc5.e {

    /* renamed from: a, reason: collision with root package name */
    public final oc5.m f344408a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f344409b;

    public f(oc5.m controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f344408a = controller;
        this.f344409b = true;
    }

    @Override // oc5.e
    public long a() {
        return 1000L;
    }

    public boolean b() {
        int type = getType();
        oc5.m mVar = this.f344408a;
        boolean z17 = mVar.e(type) != null;
        java.util.Iterator it = mVar.f344465a.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            oc5.e eVar = (oc5.e) mVar.f344466b.get(java.lang.Integer.valueOf(intValue));
            if (eVar != null && priority() < eVar.priority()) {
                z17 = z17 && mVar.e(intValue) != null;
            }
        }
        getType();
        return z17;
    }
}
