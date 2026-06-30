package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes14.dex */
public abstract class ri extends com.tencent.mm.plugin.finder.live.plugin.l {
    public int A;
    public long B;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f114141p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f114142q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f114143r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f114144s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f114145t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f114146u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f114147v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashMap f114148w;

    /* renamed from: x, reason: collision with root package name */
    public ik2.e f114149x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f114150y;

    /* renamed from: z, reason: collision with root package name */
    public long f114151z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(android.view.ViewGroup entranceRoot, qo0.c statusMonitor) {
        super(entranceRoot, statusMonitor, null);
        kotlin.jvm.internal.o.g(entranceRoot, "entranceRoot");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114141p = entranceRoot;
        this.f114142q = statusMonitor;
        this.f114143r = "MicroMsg.FinderLiveGameDynamicFrameSetPlugin";
        this.f114144s = new java.util.ArrayList();
        this.f114145t = new java.util.ArrayList();
        this.f114146u = new java.util.ArrayList();
        this.f114147v = new java.util.HashMap();
        this.f114148w = new java.util.HashMap();
        v1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void I0() {
        hq0.e0 e0Var;
        com.tencent.mars.xlog.Log.i(this.f114143r, "pause");
        ik2.e eVar = this.f114149x;
        if (eVar == null || (e0Var = eVar.f291887c) == null) {
            return;
        }
        e0Var.f();
    }

    @Override // qo0.a
    public void J0() {
        hq0.e0 e0Var;
        ik2.e eVar = this.f114149x;
        if (eVar == null || (e0Var = eVar.f291887c) == null) {
            return;
        }
        e0Var.j();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (status.ordinal() != 123) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f114151z <= 3000 || this.f114146u.size() != 0) {
            return;
        }
        this.f114151z = currentTimeMillis;
        pm0.v.V(1000L, new com.tencent.mm.plugin.finder.live.plugin.qi(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mars.xlog.Log.i(this.f114143r, "unMount");
        super.O0();
        this.f114144s.clear();
        this.f114145t.clear();
        this.f114147v.clear();
        java.util.ArrayList<com.tencent.mm.plugin.finder.live.plugin.pi> arrayList = this.f114146u;
        for (com.tencent.mm.plugin.finder.live.plugin.pi piVar : arrayList) {
        }
        arrayList.clear();
        this.f114148w.clear();
        ik2.e eVar = this.f114149x;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        java.util.HashMap hashMap;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap2;
        ik2.d dVar;
        r45.uq1 uq1Var = ((mm2.c1) P0(mm2.c1.class)).Q2;
        java.lang.String str = this.f114143r;
        if (uq1Var == null) {
            K0(8);
            com.tencent.mars.xlog.Log.e(str, "liveGameData is null");
            return;
        }
        if (!uq1Var.getBoolean(3)) {
            com.tencent.mars.xlog.Log.e(str, "liveGameData updated is false");
            return;
        }
        int integer = uq1Var.getInteger(2);
        if (uq1Var.getInteger(2) == 0) {
            com.tencent.mars.xlog.Log.e(str, "game_frameset_visibility is 0");
            K0(8);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "liveGameData game_frameset_visibility:%d, origin game_frameset_visibility:%d", java.lang.Integer.valueOf(uq1Var.getInteger(2)), java.lang.Integer.valueOf(integer));
        java.util.ArrayList arrayList2 = this.f114144s;
        if (arrayList2.isEmpty() || arrayList2.size() == 0) {
            com.tencent.mars.xlog.Log.e(str, "filteredFrameSetList is empty， parentId:%s", u1());
            K0(8);
            if (this.A < 5) {
                v1();
                return;
            }
            return;
        }
        this.A = 0;
        ik2.e eVar = this.f114149x;
        if (eVar == null) {
            K0(8);
            com.tencent.mars.xlog.Log.e(str, "surfaceMgr is null");
            return;
        }
        if ((eVar != null ? eVar.f291887c : null) == null) {
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f328852o;
            ik2.e eVar2 = this.f114149x;
            if (eVar2 != null) {
                android.content.Context context = this.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                eVar2.a(context, str2, ((mm2.e1) P0(mm2.e1.class)).f328983m);
            }
        }
        ik2.e eVar3 = this.f114149x;
        if ((eVar3 != null ? eVar3.f291887c : null) == null) {
            K0(8);
            com.tencent.mars.xlog.Log.e(str, "getFrameSetRoot is null");
            return;
        }
        int integer2 = uq1Var.getInteger(2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ik2.d dVar2 = (ik2.d) it.next();
            if ((dVar2.f291864f & integer2) == 0) {
                arrayList3.add(dVar2);
                com.tencent.mars.xlog.Log.i(str, "frameset id:%s is invisible, remove it", dVar2.f291859a);
            } else {
                java.lang.String str3 = dVar2.f291859a;
                kotlin.jvm.internal.o.d(str3);
                arrayList4.add(str3);
            }
        }
        arrayList2.removeAll(arrayList3);
        java.util.Iterator it6 = arrayList3.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            hashMap = this.f114147v;
            arrayList = this.f114146u;
            hashMap2 = this.f114148w;
            if (!hasNext) {
                break;
            }
            ik2.d dVar3 = (ik2.d) it6.next();
            com.tencent.mm.plugin.finder.live.plugin.pi piVar = (com.tencent.mm.plugin.finder.live.plugin.pi) kotlin.jvm.internal.m0.c(hashMap2).remove(dVar3.f291859a);
            if (piVar != null) {
                piVar.O0();
            }
            kotlin.jvm.internal.m0.a(arrayList).remove(piVar);
            kotlin.jvm.internal.m0.c(hashMap).remove(dVar3.f291859a);
            com.tencent.mars.xlog.Log.i(str, "remove frame plugin id:%s from invisible removeList", dVar3.f291859a);
        }
        arrayList3.clear();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = this.f114145t;
        java.util.Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            ik2.d dVar4 = (ik2.d) it7.next();
            if (kz5.n0.O(arrayList4, dVar4.f291859a)) {
                java.lang.String str4 = dVar4.f291859a;
                kotlin.jvm.internal.o.d(str4);
                arrayList5.add(str4);
            } else {
                arrayList3.add(dVar4);
            }
        }
        java.util.Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            ik2.d dVar5 = (ik2.d) it8.next();
            com.tencent.mm.plugin.finder.live.plugin.pi piVar2 = (com.tencent.mm.plugin.finder.live.plugin.pi) kotlin.jvm.internal.m0.c(hashMap2).remove(dVar5.f291859a);
            if (piVar2 != null) {
                piVar2.O0();
            }
            kotlin.jvm.internal.m0.a(arrayList).remove(piVar2);
            kotlin.jvm.internal.m0.c(hashMap).remove(dVar5.f291859a);
            arrayList6.remove(dVar5);
            arrayList2.remove(dVar5);
            com.tencent.mars.xlog.Log.i(str, "remove frame plugin id:%s from not contains currentFrameSetParamList", dVar5.f291859a);
        }
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() > 0) {
            java.util.Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                ik2.d frameSetParam = (ik2.d) it9.next();
                kotlin.jvm.internal.o.g(frameSetParam, "frameSetParam");
                android.view.ViewGroup viewGroup = this.f114141p;
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = new com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer(context2, null, 0, 6, null);
                java.lang.String str5 = frameSetParam.f291859a;
                kotlin.jvm.internal.o.d(str5);
                magicSclViewContainer.e(str5);
                int generateViewId = android.view.View.generateViewId();
                magicSclViewContainer.setId(generateViewId);
                java.lang.String str6 = frameSetParam.f291859a;
                kotlin.jvm.internal.o.d(str6);
                hashMap.put(str6, java.lang.Integer.valueOf(generateViewId));
                java.util.Iterator it10 = it9;
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(frameSetParam.f291869k, frameSetParam.f291870l);
                magicSclViewContainer.setLayoutParams(layoutParams);
                viewGroup.addView(magicSclViewContainer);
                x1(layoutParams, frameSetParam);
                magicSclViewContainer.setLayoutParams(layoutParams);
                ik2.e eVar4 = this.f114149x;
                hq0.e0 e0Var = eVar4 != null ? eVar4.f291887c : null;
                kotlin.jvm.internal.o.d(e0Var);
                magicSclViewContainer.a(e0Var);
                magicSclViewContainer.bringToFront();
                com.tencent.mm.plugin.finder.live.plugin.pi piVar3 = new com.tencent.mm.plugin.finder.live.plugin.pi(magicSclViewContainer, this.f114142q);
                piVar3.f113891r = frameSetParam;
                java.lang.String str7 = frameSetParam.f291859a;
                kotlin.jvm.internal.o.d(str7);
                hashMap2.put(str7, piVar3);
                arrayList.add(piVar3);
                it9 = it10;
            }
        }
        if (!arrayList5.isEmpty()) {
            java.util.Iterator it11 = arrayList5.iterator();
            while (it11.hasNext()) {
                java.lang.String str8 = (java.lang.String) it11.next();
                com.tencent.mm.plugin.finder.live.plugin.pi piVar4 = (com.tencent.mm.plugin.finder.live.plugin.pi) hashMap2.get(str8);
                if (piVar4 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = piVar4.f113889p.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams2;
                    java.util.Iterator it12 = arrayList6.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            dVar = null;
                            break;
                        } else {
                            dVar = (ik2.d) it12.next();
                            if (str8.equals(dVar.f291859a)) {
                                break;
                            }
                        }
                    }
                    if (dVar != null) {
                        x1(layoutParams3, dVar);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i(str, "framePluginList size :%d", java.lang.Integer.valueOf(arrayList2.size()));
        java.util.Iterator it13 = arrayList.iterator();
        while (it13.hasNext()) {
            com.tencent.mm.plugin.finder.live.plugin.pi piVar5 = (com.tencent.mm.plugin.finder.live.plugin.pi) it13.next();
            com.tencent.mars.xlog.Log.i(str, "plugin hasCode:%d", java.lang.Integer.valueOf(piVar5.hashCode()));
            piVar5.t1();
        }
        if (arrayList6.size() > 0) {
            K0(0);
            w1(uq1Var);
        } else {
            com.tencent.mars.xlog.Log.e(str, "check currentFrameSetParamList empty");
            K0(8);
        }
    }

    public abstract java.lang.String u1();

    public final void v1() {
        this.A++;
        ik2.b bVar = ik2.b.f291852a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetDataLoader", "loadFrameSetLayoutData");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = ik2.b.f291854c;
        synchronized (arrayList) {
            if (!(!arrayList.isEmpty()) || currentTimeMillis - ik2.b.f291853b > com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) {
                java.lang.String a17 = bVar.a();
                if (android.text.TextUtils.isEmpty(a17)) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderLiveFrameSetDataLoader", "loadFrameSetLayoutData exptGameFrameSetData is empty!");
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                } else {
                    synchronized (arrayList) {
                        java.util.ArrayList a18 = ik2.c.f291858a.a(a17);
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetDataLoader", "parseRetList size :%d", java.lang.Integer.valueOf(a18.size()));
                        arrayList.clear();
                        arrayList.addAll(a18);
                        if (!arrayList.isEmpty()) {
                            ik2.b.f291853b = currentTimeMillis;
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("Finder.FinderLiveFrameSetDataLoader", "fetch from frameSetData cache");
            }
        }
        if (arrayList.isEmpty() || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e(this.f114143r, "loadFrameSetData frameSetParamList is empty");
            K0(8);
            return;
        }
        java.lang.String parentId = u1();
        kotlin.jvm.internal.o.g(parentId, "parentId");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!android.text.TextUtils.isEmpty(parentId)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ik2.d dVar = (ik2.d) it.next();
                if (parentId.equals(dVar.f291860b)) {
                    arrayList2.add(dVar);
                }
            }
        }
        if (arrayList2.isEmpty() || arrayList2.size() == 0) {
            com.tencent.mars.xlog.Log.e(this.f114143r, "loadFrameSetData filteredFrameSetList is empty， parentId:%s", u1());
            K0(8);
        } else {
            this.f114144s.clear();
            this.f114144s.addAll(arrayList2);
        }
    }

    public final void w1(r45.uq1 gameData) {
        hq0.e0 e0Var;
        hq0.e0 e0Var2;
        kotlin.jvm.internal.o.g(gameData, "gameData");
        com.tencent.mm.protobuf.g byteString = gameData.getByteString(1);
        java.lang.String h17 = byteString != null ? byteString.h(com.tencent.mapsdk.internal.rv.f51270c) : null;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean b17 = kotlin.jvm.internal.o.b(this.f114150y, h17);
        java.lang.String str = this.f114143r;
        if (!b17 && h17 != null) {
            this.f114150y = h17;
            com.tencent.mars.xlog.Log.i(str, "notifyGameData");
            ik2.e eVar = this.f114149x;
            if (eVar != null && (e0Var2 = eVar.f291887c) != null) {
                e0Var2.a(h17, null);
            }
            this.B = currentTimeMillis;
            return;
        }
        if (h17 == null || currentTimeMillis - this.B <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "notifyGameData");
        ik2.e eVar2 = this.f114149x;
        if (eVar2 != null && (e0Var = eVar2.f291887c) != null) {
            e0Var.a(h17, null);
        }
        this.B = currentTimeMillis;
    }

    public final void x1(android.widget.RelativeLayout.LayoutParams layoutParam, ik2.d frameSetParam) {
        kotlin.jvm.internal.o.g(layoutParam, "layoutParam");
        kotlin.jvm.internal.o.g(frameSetParam, "frameSetParam");
        layoutParam.width = frameSetParam.f291869k;
        layoutParam.height = frameSetParam.f291870l;
        layoutParam.leftMargin = frameSetParam.f291866h;
        layoutParam.rightMargin = frameSetParam.f291867i;
        layoutParam.topMargin = frameSetParam.f291865g;
        layoutParam.bottomMargin = frameSetParam.f291868j;
        int[] rules = layoutParam.getRules();
        if (rules != null) {
            if (!(rules.length == 0)) {
                int length = rules.length;
                for (int i17 = 0; i17 < length; i17++) {
                    layoutParam.removeRule(i17);
                }
            }
        }
        if (frameSetParam.f291871m) {
            layoutParam.addRule(10);
        }
        if (frameSetParam.f291872n) {
            layoutParam.addRule(9);
        }
        if (frameSetParam.f291873o) {
            layoutParam.addRule(11);
        }
        if (frameSetParam.f291874p) {
            layoutParam.addRule(12);
        }
        if (frameSetParam.f291875q) {
            layoutParam.addRule(20);
        }
        if (frameSetParam.f291876r) {
            layoutParam.addRule(21);
        }
        if (frameSetParam.f291877s) {
            layoutParam.addRule(13);
        }
        if (frameSetParam.f291879u) {
            layoutParam.addRule(15);
        }
        if (frameSetParam.f291878t) {
            layoutParam.addRule(14);
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(frameSetParam.f291880v);
        java.util.HashMap hashMap = this.f114147v;
        if (!isEmpty && hashMap.containsKey(frameSetParam.f291880v)) {
            java.lang.Object obj = hashMap.get(frameSetParam.f291880v);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(6, ((java.lang.Integer) obj).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.f291881w) && hashMap.containsKey(frameSetParam.f291881w)) {
            java.lang.Object obj2 = hashMap.get(frameSetParam.f291881w);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(8, ((java.lang.Integer) obj2).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.f291882x) && hashMap.containsKey(frameSetParam.f291882x)) {
            java.lang.Object obj3 = hashMap.get(frameSetParam.f291882x);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(5, ((java.lang.Integer) obj3).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.f291883y) && hashMap.containsKey(frameSetParam.f291883y)) {
            java.lang.Object obj4 = hashMap.get(frameSetParam.f291883y);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(7, ((java.lang.Integer) obj4).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.f291884z) && hashMap.containsKey(frameSetParam.f291884z)) {
            java.lang.Object obj5 = hashMap.get(frameSetParam.f291884z);
            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(3, ((java.lang.Integer) obj5).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.A) && hashMap.containsKey(frameSetParam.A)) {
            java.lang.Object obj6 = hashMap.get(frameSetParam.A);
            kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(2, ((java.lang.Integer) obj6).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.B) && hashMap.containsKey(frameSetParam.B)) {
            java.lang.Object obj7 = hashMap.get(frameSetParam.B);
            kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(0, ((java.lang.Integer) obj7).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.C) && hashMap.containsKey(frameSetParam.C)) {
            java.lang.Object obj8 = hashMap.get(frameSetParam.C);
            kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(1, ((java.lang.Integer) obj8).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.D) && hashMap.containsKey(frameSetParam.D)) {
            java.lang.Object obj9 = hashMap.get(frameSetParam.D);
            kotlin.jvm.internal.o.e(obj9, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(16, ((java.lang.Integer) obj9).intValue());
        }
        if (android.text.TextUtils.isEmpty(frameSetParam.E) || !hashMap.containsKey(frameSetParam.E)) {
            return;
        }
        java.lang.Object obj10 = hashMap.get(frameSetParam.E);
        kotlin.jvm.internal.o.e(obj10, "null cannot be cast to non-null type kotlin.Int");
        layoutParam.addRule(17, ((java.lang.Integer) obj10).intValue());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
    }
}
