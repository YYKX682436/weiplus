package wq3;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f448568a;

    public k() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f448568a = arrayList;
        arrayList.clear();
        gm0.j1.i();
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) gm0.j1.u().c().l(270340, "")).split(";")).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                arrayList.add(str);
            }
        }
    }

    public final boolean a() {
        java.util.List list = this.f448568a;
        ((java.util.ArrayList) list).size();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.contains(";")) {
                stringBuffer.append(str);
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().w(270340, stringBuffer.toString());
        return true;
    }
}
