package com.tencent.wechat.aff.emoticon;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f216663a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f216664b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f216665c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f216666d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f216667e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f216668f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f216669g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f216670h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f216671i = new java.util.LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f216672j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f216673k;

    public final java.lang.Object a(bw5.ia designerType, boolean z17, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.wechat.aff.emoticon.q qVar = new com.tencent.wechat.aff.emoticon.q(nVar);
        kotlin.jvm.internal.o.g(designerType, "designerType");
        this.f216673k = qVar;
        com.tencent.wechat.aff.emoticon.v a17 = com.tencent.wechat.aff.emoticon.v.f216675c.a();
        int i17 = this.f216663a;
        a17.getClass();
        a17.f216677a.put(java.lang.Integer.valueOf(i17), this);
        com.tencent.wechat.aff.emoticon.w wVar = com.tencent.wechat.aff.emoticon.w.f216679b;
        wVar.f216680a.ZIDL_B(wVar.nativeHandler, i17, designerType.f28510d, z17);
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a18;
    }

    public final void b() {
        com.tencent.wechat.aff.emoticon.u uVar = com.tencent.wechat.aff.emoticon.v.f216675c;
        com.tencent.wechat.aff.emoticon.v a17 = uVar.a();
        int i17 = this.f216663a;
        a17.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f216677a;
        if (kotlin.jvm.internal.o.b(concurrentHashMap.get(java.lang.Integer.valueOf(i17)), this)) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = a17.f216678b;
        if (((java.lang.Integer) concurrentHashMap2.get(java.lang.Integer.valueOf(i17))) != null) {
            concurrentHashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(r3.intValue() - 1));
        }
        com.tencent.wechat.aff.emoticon.v a18 = uVar.a();
        int i18 = this.f216663a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = a18.f216678b;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap3.get(java.lang.Integer.valueOf(i18));
        if (num != null && num.intValue() == 0) {
            concurrentHashMap3.remove(java.lang.Integer.valueOf(i18));
            com.tencent.wechat.aff.emoticon.w wVar = com.tencent.wechat.aff.emoticon.w.f216679b;
            wVar.f216680a.ZIDL_K(wVar.nativeHandler, i18);
        }
    }

    public final void c(int i17) {
        if (this.f216663a == i17) {
            return;
        }
        this.f216663a = i17;
        com.tencent.wechat.aff.emoticon.v a17 = com.tencent.wechat.aff.emoticon.v.f216675c.a();
        int i18 = this.f216663a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f216678b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(i18));
        concurrentHashMap.put(valueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void d(yz5.l firstFetchCallback) {
        kotlin.jvm.internal.o.g(firstFetchCallback, "firstFetchCallback");
        ((java.util.ArrayList) this.f216672j).add(firstFetchCallback);
        com.tencent.wechat.aff.emoticon.v a17 = com.tencent.wechat.aff.emoticon.v.f216675c.a();
        int i17 = this.f216663a;
        boolean z17 = this.f216664b;
        a17.getClass();
        a17.f216677a.put(java.lang.Integer.valueOf(i17), this);
        com.tencent.wechat.aff.emoticon.w wVar = com.tencent.wechat.aff.emoticon.w.f216679b;
        wVar.f216680a.ZIDL_A(wVar.nativeHandler, i17, z17);
    }

    public final java.lang.Object e(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        synchronized (this) {
            com.tencent.wechat.aff.emoticon.v a17 = com.tencent.wechat.aff.emoticon.v.f216675c.a();
            int i17 = this.f216663a;
            a17.getClass();
            com.tencent.wechat.aff.emoticon.w wVar = com.tencent.wechat.aff.emoticon.w.f216679b;
            if (wVar.f216680a.ZIDL_J(wVar.nativeHandler, i17)) {
                if (this.f216665c.isEmpty() && this.f216666d.isEmpty() && this.f216667e.isEmpty()) {
                    this.f216665c.clear();
                    this.f216665c.addAll(wVar.c(this.f216663a));
                    java.util.Map map = this.f216671i;
                    bw5.ia iaVar = bw5.ia.EmoticonDesignerListDataType_StorePack;
                    int i18 = this.f216663a;
                    map.put(iaVar, java.lang.Boolean.valueOf(wVar.f216680a.ZIDL_F(wVar.nativeHandler, i18, 1)));
                    this.f216666d.clear();
                    this.f216666d.addAll(wVar.a(this.f216663a));
                    java.util.Map map2 = this.f216671i;
                    bw5.ia iaVar2 = bw5.ia.EmoticonDesignerListDataType_SingleEmoji;
                    int i19 = this.f216663a;
                    map2.put(iaVar2, java.lang.Boolean.valueOf(wVar.f216680a.ZIDL_F(wVar.nativeHandler, i19, 2)));
                    this.f216667e.clear();
                    this.f216667e.addAll(wVar.b(this.f216663a));
                    java.util.Map map3 = this.f216671i;
                    bw5.ia iaVar3 = bw5.ia.EmoticonDesignerListDataType_IPSet;
                    int i27 = this.f216663a;
                    map3.put(iaVar3, java.lang.Boolean.valueOf(wVar.f216680a.ZIDL_F(wVar.nativeHandler, i27, 3)));
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(com.tencent.wechat.aff.emoticon.o.f216657d));
            } else {
                d(new com.tencent.wechat.aff.emoticon.r(nVar));
            }
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a18;
    }
}
