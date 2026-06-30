package ey;

@j95.b
/* loaded from: classes15.dex */
public final class q extends i95.w implements ey.u, com.tencent.wechat.aff.function_call.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f257283d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.function_call.c f257284e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f257285f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f257286g = new java.util.HashMap();

    public final java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        return str + "::" + str2;
    }

    public void Bi(ey.k listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.String a17 = listener.a();
        java.lang.String b17 = listener.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "registerFunctionCallEndListener " + a17 + ' ' + b17 + ' ' + listener);
        java.util.HashMap hashMap = this.f257286g;
        java.lang.String Ai = Ai(a17, b17);
        java.lang.Object obj = hashMap.get(Ai);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(Ai, obj);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        if (arrayList.contains(listener)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FunctionCallService", "registerFunctionCallEndListener duplicate");
        } else {
            arrayList.add(listener);
        }
    }

    public void Di(ey.t listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.String a17 = listener.a();
        java.lang.String b17 = listener.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "registerFunctionCallStartListener " + a17 + ' ' + b17 + ' ' + listener);
        java.util.HashMap hashMap = this.f257285f;
        java.lang.String Ai = Ai(a17, b17);
        java.lang.Object obj = hashMap.get(Ai);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(Ai, obj);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        if (arrayList.contains(listener)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FunctionCallService", "registerFunctionCallStartListener duplicate");
        } else {
            arrayList.add(listener);
        }
    }

    public void Ni(ey.k listener) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.String a17 = listener.a();
        java.lang.String b17 = listener.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "unregisterFunctionCallEndListener " + a17 + ' ' + b17 + ' ' + listener);
        java.util.HashMap hashMap = this.f257286g;
        if (!hashMap.containsKey(Ai(a17, b17)) || (arrayList = (java.util.ArrayList) hashMap.get(Ai(a17, b17))) == null) {
            return;
        }
        arrayList.remove(listener);
    }

    public void Ri(ey.t listener) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.String a17 = listener.a();
        java.lang.String b17 = listener.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "unregisterFunctionCallStartListener " + a17 + ' ' + b17 + ' ' + listener);
        java.util.HashMap hashMap = this.f257285f;
        if (!hashMap.containsKey(Ai(a17, b17)) || (arrayList = (java.util.ArrayList) hashMap.get(Ai(a17, b17))) == null) {
            return;
        }
        arrayList.remove(listener);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "onAccountInitialized inited " + this.f257283d);
        wi();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        ey.o.f257281a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "unInitModules");
        for (ey.o oVar : ey.l.f257278b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "unregister module: " + oVar.a());
            com.tencent.wechat.aff.function_call.i iVar = com.tencent.wechat.aff.function_call.i.f216896b;
            java.util.Set keySet = oVar.b().keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(keySet, 10));
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(oVar.a() + "::" + ((java.lang.String) it.next()));
            }
            iVar.c(new java.util.ArrayList(arrayList), oVar.a(), ey.n.f257280a);
        }
        this.f257283d = false;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "onCreate");
        wi();
    }

    public final void wi() {
        if (this.f257283d) {
            return;
        }
        com.tencent.wechat.aff.function_call.i.f216896b.a(new com.tencent.wechat.aff.function_call.b(this), ey.p.f257282a);
        ey.o.f257281a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "initModules");
        for (ey.o oVar : ey.l.f257278b) {
            for (java.util.Map.Entry entry : oVar.b().entrySet()) {
                java.lang.String str = oVar.a() + "::" + ((java.lang.String) entry.getKey());
                com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "register function: " + str);
                com.tencent.wechat.aff.function_call.i.f216896b.b(str, oVar.a(), kz5.c0.d(com.tencent.wechat.aff.function_call.n.SCHEME_DEFAULT, com.tencent.wechat.aff.function_call.n.SCHEME_TEST), new com.tencent.wechat.aff.function_call.k(new ey.v((yz5.p) entry.getValue())), ey.m.f257279a);
            }
        }
        this.f257283d = true;
    }
}
