package com.tencent.xweb;

/* loaded from: classes13.dex */
public class m0 extends com.tencent.xweb.i0 {
    @Override // com.tencent.xweb.i0
    public void a(com.tencent.xweb.e0 e0Var, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(e0Var.f220258a);
        java.util.List unmodifiableList2 = java.util.Collections.unmodifiableList(e0Var.f220259b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i17 = 0; i17 < unmodifiableList.size(); i17++) {
            if (((com.tencent.xweb.d0) unmodifiableList.get(i17)).f220237a.equals("http")) {
                arrayList.add(new y4.c("http", ((com.tencent.xweb.d0) unmodifiableList.get(i17)).f220238b));
            }
            if (((com.tencent.xweb.d0) unmodifiableList.get(i17)).f220237a.equals("https")) {
                arrayList.add(new y4.c("https", ((com.tencent.xweb.d0) unmodifiableList.get(i17)).f220238b));
            }
            if (((com.tencent.xweb.d0) unmodifiableList.get(i17)).f220237a.equals("*")) {
                arrayList.add(new y4.c("*", ((com.tencent.xweb.d0) unmodifiableList.get(i17)).f220238b));
            }
        }
        for (int i18 = 0; i18 < unmodifiableList2.size(); i18++) {
            arrayList2.add((java.lang.String) unmodifiableList2.get(i18));
        }
        if (!y4.n.a("PROXY_OVERRIDE")) {
            throw new java.lang.UnsupportedOperationException("Proxy override not supported");
        }
        z4.v vVar = (z4.v) y4.d.f459274a;
        z4.d dVar = z4.e0.f470062d;
        z4.d dVar2 = z4.e0.f470064f;
        java.util.List unmodifiableList3 = java.util.Collections.unmodifiableList(arrayList);
        java.lang.String[][] strArr = (java.lang.String[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, unmodifiableList3.size(), 2);
        for (int i19 = 0; i19 < unmodifiableList3.size(); i19++) {
            strArr[i19][0] = ((y4.c) unmodifiableList3.get(i19)).f459272a;
            strArr[i19][1] = ((y4.c) unmodifiableList3.get(i19)).f459273b;
        }
        java.lang.String[] strArr2 = (java.lang.String[]) java.util.Collections.unmodifiableList(arrayList2).toArray(new java.lang.String[0]);
        if (dVar.b()) {
            if (vVar.f470077a == null) {
                vVar.f470077a = z4.g0.f470067a.getProxyController();
            }
            vVar.f470077a.setProxyOverride(strArr, strArr2, runnable, executor);
        } else {
            if (!dVar.b() || !dVar2.b()) {
                throw z4.e0.a();
            }
            if (vVar.f470077a == null) {
                vVar.f470077a = z4.g0.f470067a.getProxyController();
            }
            vVar.f470077a.setProxyOverride(strArr, strArr2, runnable, executor, false);
        }
    }
}
