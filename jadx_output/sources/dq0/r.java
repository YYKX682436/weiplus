package dq0;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f242331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq0.x f242332e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(dq0.a0 a0Var, fq0.x xVar) {
        super(0);
        this.f242331d = a0Var;
        this.f242332e = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hq0.k0 k0Var;
        fq0.x xVar;
        hq0.k0 k0Var2;
        dq0.a0 a0Var = this.f242331d;
        a0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("flushing ");
        fq0.x xVar2 = this.f242332e;
        sb6.append(xVar2);
        java.lang.String str = "MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter";
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", sb6.toString());
        java.util.HashSet hashSet = a0Var.f242295n;
        boolean contains = hashSet.contains(xVar2.f265478b);
        java.util.concurrent.CopyOnWriteArraySet<java.lang.Integer> copyOnWriteArraySet = xVar2.f265481e;
        if (contains) {
            for (java.lang.Integer num : copyOnWriteArraySet) {
                hq0.i0 t17 = a0Var.t();
                if (t17 != null && (k0Var2 = t17.f282998m) != null) {
                    kotlin.jvm.internal.o.d(num);
                    hq0.j0 a17 = k0Var2.a(num.intValue());
                    if (a17 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "trigger flush pre created canvas " + a17.f283012a);
                        a0Var.r(a17);
                    }
                }
            }
        }
        java.lang.String str2 = xVar2.f265478b;
        hashSet.remove(str2);
        java.util.HashSet hashSet2 = a0Var.f242296o;
        if (hashSet2.contains(str2)) {
            for (java.lang.Integer num2 : copyOnWriteArraySet) {
                hq0.i0 t18 = a0Var.t();
                if (t18 != null && (k0Var = t18.f282998m) != null) {
                    kotlin.jvm.internal.o.d(num2);
                    hq0.j0 a18 = k0Var.a(num2.intValue());
                    if (a18 != null) {
                        com.tencent.mars.xlog.Log.i(str, "trigger flush pre layout canvas " + a18.f283012a);
                        java.lang.String str3 = str;
                        java.lang.String str4 = str2;
                        java.util.HashSet hashSet3 = hashSet2;
                        fq0.x xVar3 = xVar2;
                        a0Var.f242288d.d(a18.b(), a18.f283014c, a18.f283015d, a0Var.g(a18.f283016e, a18.f283013b), a18.f283017f);
                        if (a18.f283020i) {
                            a0Var.f242288d.a(a18.b());
                            boolean z17 = a18.f283026o;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("preCreateCanvas", z17);
                            xVar = xVar3;
                            a0Var.w(xVar, jSONObject);
                        } else {
                            xVar = xVar3;
                        }
                        a18.f283020i = false;
                        xVar2 = xVar;
                        str = str3;
                        str2 = str4;
                        hashSet2 = hashSet3;
                    }
                }
            }
        }
        java.lang.String str5 = str;
        java.lang.String str6 = str2;
        hashSet2.remove(str6);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("frameSetId: ");
        sb7.append(str6);
        sb7.append(", flush tasks size: ");
        java.util.HashMap hashMap = a0Var.f242294m;
        java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(str6);
        sb7.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i(str5, sb7.toString());
        java.util.LinkedList linkedList2 = (java.util.LinkedList) hashMap.get(str6);
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
        java.util.LinkedList linkedList3 = (java.util.LinkedList) hashMap.get(str6);
        if (linkedList3 != null) {
            linkedList3.clear();
        }
        return jz5.f0.f302826a;
    }
}
