package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f189354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f189355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f189357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f189358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, java.lang.String str, int i17, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f189355e = z17;
        this.f189356f = str;
        this.f189357g = i17;
        this.f189358h = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.pluginsdk.model.l(this.f189355e, this.f189356f, this.f189357g, this.f189358h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.pluginsdk.model.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f189354d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f189356f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f189355e || com.tencent.mm.pluginsdk.model.b0.f189197a.C(str)) {
                java.util.HashMap hashMap = com.tencent.mm.pluginsdk.model.b0.f189200d;
                if (hashMap.containsKey(str)) {
                    return f0Var;
                }
                hashMap.put(str, java.lang.Boolean.TRUE);
                com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str);
                this.f189354d = 1;
                obj = b0Var.d(this.f189357g, linkedList, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        r45.qk qkVar = (r45.qk) obj;
        com.tencent.mm.pluginsdk.model.b0.f189200d.remove(str);
        java.util.LinkedList<r45.lk> linkedList2 = qkVar != null ? qkVar.f384063d : null;
        if (!(linkedList2 == null || linkedList2.isEmpty())) {
            for (r45.lk lkVar : linkedList2) {
                if (com.tencent.mm.sdk.platformtools.t8.D0(lkVar.f379533d, str)) {
                    com.tencent.mm.pluginsdk.model.b0 b0Var2 = com.tencent.mm.pluginsdk.model.b0.f189197a;
                    java.lang.String str2 = lkVar.f379533d;
                    java.lang.String str3 = lkVar.f379534e;
                    java.lang.String e17 = b0Var2.e(str2);
                    if (e17 == null) {
                        e17 = "";
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    boolean z17 = !kotlin.jvm.internal.o.b(e17, str3);
                    yz5.q qVar = this.f189358h;
                    if (z17) {
                        qVar.invoke(str, lkVar.f379534e, java.lang.Boolean.TRUE);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", "checkFinderLive data change bizUserName=" + lkVar.f379533d);
                        java.lang.String str4 = lkVar.f379534e;
                        com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent = new com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent();
                        am.t0 t0Var = bizFinderLineStatusChangedEvent.f54003g;
                        t0Var.f7952a = str;
                        t0Var.f7953b = str4;
                        bizFinderLineStatusChangedEvent.b(android.os.Looper.getMainLooper());
                    } else {
                        qVar.invoke(str, lkVar.f379534e, java.lang.Boolean.FALSE);
                    }
                    b0Var2.x(lkVar);
                }
            }
        }
        return f0Var;
    }
}
