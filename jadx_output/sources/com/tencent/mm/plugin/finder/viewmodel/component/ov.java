package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ov extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(java.lang.String str) {
        super(2);
        this.f135486d = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        java.lang.String str;
        bq.z1 cgi = (bq.z1) obj;
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g((com.tencent.mm.protocal.protobuf.FinderUserPageResponse) obj2, "<anonymous parameter 1>");
        bu2.g0 g0Var = bu2.g0.f24511a;
        java.lang.String userName = this.f135486d;
        kotlin.jvm.internal.o.g(userName, "userName");
        synchronized (g0Var) {
            java.util.Map map = bu2.g0.f24512b;
            if (map.containsKey(userName)) {
                bu2.f0 f0Var = (bu2.f0) ((java.util.LinkedHashMap) map).get(userName);
                if (f0Var != null) {
                    f0Var.f24505b = cgi;
                }
            } else {
                if (map.size() >= bu2.g0.f24513c) {
                    java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (it.hasNext()) {
                            long j17 = ((bu2.f0) ((java.util.Map.Entry) next).getValue()).f24504a;
                            do {
                                java.lang.Object next2 = it.next();
                                long j18 = ((bu2.f0) ((java.util.Map.Entry) next2).getValue()).f24504a;
                                if (j17 > j18) {
                                    next = next2;
                                    j17 = j18;
                                }
                            } while (it.hasNext());
                        }
                        obj3 = next;
                    } else {
                        obj3 = null;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj3;
                    if (entry != null && (str = (java.lang.String) entry.getKey()) != null) {
                    }
                }
                java.util.Map map2 = bu2.g0.f24512b;
                bu2.f0 f0Var2 = new bu2.f0(0L, null, null, null, 15, null);
                f0Var2.f24505b = cgi;
                map2.put(userName, f0Var2);
            }
        }
        return jz5.f0.f302826a;
    }
}
