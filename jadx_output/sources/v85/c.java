package v85;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f434099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.p64 f434100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.p64 f434101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, r45.p64 p64Var, r45.p64 p64Var2) {
        super(0);
        this.f434099d = i17;
        this.f434100e = p64Var;
        this.f434101f = p64Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.p64 p64Var;
        int i17 = -1;
        v85.e.f434109g--;
        int i18 = 0;
        int i19 = this.f434099d;
        if (i19 == 2) {
            v85.e eVar = v85.e.f434103a;
            java.lang.String LensId = this.f434100e.f382792d;
            kotlin.jvm.internal.o.f(LensId, "LensId");
            r45.q64 q64Var = v85.e.f434108f;
            java.util.LinkedList lensInfoList = q64Var.f383710d;
            kotlin.jvm.internal.o.f(lensInfoList, "lensInfoList");
            java.util.Iterator it = lensInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.o.b(((r45.p64) it.next()).f382792d, LensId)) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
            if (i17 >= 0) {
                q64Var.f383710d.remove(i17);
                eVar.b();
            }
        } else if (i19 == 0 && (p64Var = this.f434101f) != null) {
            java.util.LinkedList lensInfoList2 = v85.e.f434108f.f383710d;
            kotlin.jvm.internal.o.f(lensInfoList2, "lensInfoList");
            java.util.Iterator it6 = lensInfoList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.o.b(((r45.p64) it6.next()).f382792d, p64Var.f382792d)) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
            if (i17 > 0) {
                java.lang.Object obj = v85.e.f434108f.f383710d.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                r45.p64 p64Var2 = (r45.p64) obj;
                p64Var2.f382792d = p64Var.f382792d;
                p64Var2.f382796h = p64Var.f382796h;
                p64Var2.f382793e = p64Var.f382793e;
                p64Var2.f382794f = p64Var.f382794f;
                p64Var2.f382795g = p64Var.f382795g;
            }
        }
        return jz5.f0.f302826a;
    }
}
