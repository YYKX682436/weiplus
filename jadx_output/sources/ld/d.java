package ld;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final ld.c f318046b = new ld.c(null);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f318047c = jz5.h.b(ld.b.f318045d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f318048a = new java.util.ArrayList();

    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a(ld.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addLiteApp:");
        java.lang.String str = data.f318044a;
        sb6.append(str);
        kd.c.c("WxaLiteApp.LiteAppCrashReporter", sb6.toString(), new java.lang.Object[0]);
        if (str.length() > 0) {
            ((java.util.ArrayList) this.f318048a).add(data);
        }
    }

    public final java.lang.String b() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#LiteAppScene=");
        java.util.List list = this.f318048a;
        ld.a aVar = (ld.a) kz5.n0.k0(list);
        if (aVar == null || (str = aVar.f318044a) == null) {
            str = "";
        }
        sb7.append(str);
        sb7.append('\n');
        sb6.append(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("#LiteAppExtraInfo=");
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb9.append("(" + i17 + ':' + ((ld.a) next).f318044a + ')');
            i17 = i18;
        }
        java.lang.String sb10 = sb9.toString();
        kotlin.jvm.internal.o.f(sb10, "toString(...)");
        sb8.append(sb10);
        sb6.append(sb8.toString());
        java.lang.String sb11 = sb6.toString();
        kotlin.jvm.internal.o.f(sb11, "toString(...)");
        return sb11;
    }

    public final void c(java.lang.String appId) {
        int i17;
        kotlin.jvm.internal.o.g(appId, "appId");
        kd.c.c("WxaLiteApp.LiteAppCrashReporter", "removeLiteApp:".concat(appId), new java.lang.Object[0]);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f318048a;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((ld.a) listIterator.previous()).f318044a, appId)) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        if (i17 != -1) {
            arrayList.remove(i17);
        }
    }
}
