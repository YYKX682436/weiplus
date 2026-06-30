package zm0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final zm0.i f474104a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f474105b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashSet f474106c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f474107d;

    public e(zm0.i manager) {
        kotlin.jvm.internal.o.g(manager, "manager");
        this.f474104a = manager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = manager.f474122c.f474108a;
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new java.util.ArrayList());
        }
        this.f474105b = arrayList;
        this.f474106c = new java.util.LinkedHashSet();
        this.f474107d = new java.util.HashMap();
    }
}
