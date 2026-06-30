package com.tencent.wechat.aff.emoticon;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f216644a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f216645b;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f216648e;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f216646c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f216647d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f216649f = true;

    public final java.lang.Object a(boolean z17, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        this.f216648e = new com.tencent.wechat.aff.emoticon.h(nVar);
        com.tencent.wechat.aff.emoticon.l a17 = com.tencent.wechat.aff.emoticon.l.f216651c.a();
        int i17 = this.f216644a;
        boolean z18 = this.f216645b;
        boolean z19 = this.f216649f;
        a17.getClass();
        a17.f216653a.put(java.lang.Integer.valueOf(i17), this);
        com.tencent.wechat.aff.emoticon.n nVar2 = com.tencent.wechat.aff.emoticon.n.f216655b;
        nVar2.f216656a.ZIDL_A(nVar2.nativeHandler, i17, z17, z18, z19);
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a18;
    }

    public final boolean b() {
        com.tencent.wechat.aff.emoticon.l a17 = com.tencent.wechat.aff.emoticon.l.f216651c.a();
        int i17 = this.f216644a;
        a17.getClass();
        com.tencent.wechat.aff.emoticon.n nVar = com.tencent.wechat.aff.emoticon.n.f216655b;
        return nVar.f216656a.ZIDL_C(nVar.nativeHandler, i17);
    }

    public final void c() {
        com.tencent.wechat.aff.emoticon.k kVar = com.tencent.wechat.aff.emoticon.l.f216651c;
        com.tencent.wechat.aff.emoticon.l a17 = kVar.a();
        int i17 = this.f216644a;
        a17.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f216653a;
        if (kotlin.jvm.internal.o.b(concurrentHashMap.get(java.lang.Integer.valueOf(i17)), this)) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = a17.f216654b;
        if (((java.lang.Integer) concurrentHashMap2.get(java.lang.Integer.valueOf(i17))) != null) {
            concurrentHashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(r3.intValue() - 1));
        }
        com.tencent.wechat.aff.emoticon.l a18 = kVar.a();
        int i18 = this.f216644a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = a18.f216654b;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap3.get(java.lang.Integer.valueOf(i18));
        if (num != null && num.intValue() == 0) {
            concurrentHashMap3.remove(java.lang.Integer.valueOf(i18));
            com.tencent.wechat.aff.emoticon.n nVar = com.tencent.wechat.aff.emoticon.n.f216655b;
            nVar.f216656a.ZIDL_D(nVar.nativeHandler, i18);
        }
    }

    public final void d(int i17) {
        if (this.f216644a == i17) {
            return;
        }
        this.f216644a = i17;
        com.tencent.wechat.aff.emoticon.l a17 = com.tencent.wechat.aff.emoticon.l.f216651c.a();
        int i18 = this.f216644a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f216654b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(i18));
        concurrentHashMap.put(valueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }
}
