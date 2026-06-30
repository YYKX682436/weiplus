package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class n implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f189383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.wx_extension.v f189384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f189385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f189386d;

    public n(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ipcinvoker.wx_extension.v vVar, kotlin.coroutines.Continuation continuation, int i17) {
        this.f189383a = c0Var;
        this.f189384b = vVar;
        this.f189385c = continuation;
        this.f189386d = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", "getBizFinderLives callback " + i17 + ", " + i18);
        kotlin.jvm.internal.c0 c0Var = this.f189383a;
        if (c0Var.f310112d) {
            return;
        }
        boolean z17 = true;
        c0Var.f310112d = true;
        com.tencent.mm.ipcinvoker.wx_extension.v vVar = this.f189384b;
        if (vVar != null) {
            vVar.a(i18, i18, str, rr6);
        }
        kotlin.coroutines.Continuation continuation = this.f189385c;
        try {
            if (i17 != 0 || i18 != 0) {
                com.tencent.mm.pluginsdk.model.b0.f189197a.v(2L);
                continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
                return;
            }
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            b0Var.v(1L);
            com.tencent.mm.protobuf.f fVar = rr6.f70711b.f70700a;
            if (!(fVar instanceof r45.qk)) {
                continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
                return;
            }
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizFinderLiveResp");
            r45.qk qkVar = (r45.qk) fVar;
            java.util.LinkedList linkedList = qkVar.f384063d;
            if (qk.ka.a()) {
                com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
                if (R == null || R.o("BizTimeLineFinderLiveStatus", 1) != 0) {
                    z17 = false;
                }
                if (z17) {
                    linkedList.clear();
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBizFinderLives card scene = ");
            sb6.append(this.f189386d);
            sb6.append(" size=");
            sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
            sb6.append(" interval=");
            sb6.append(qkVar.f384066g);
            sb6.append(" funcFlag=");
            sb6.append(qkVar.f384068i);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", sb6.toString());
            com.tencent.mm.protobuf.g gVar = qkVar.f384064e;
            if (gVar != null && gVar.f192156a.length > 0) {
                b0Var.h().H("FinderLiveBuffer", qkVar.f384064e.g());
            }
            continuation.resumeWith(kotlin.Result.m521constructorimpl(qkVar));
        } catch (java.lang.Exception e17) {
            com.tencent.mm.pluginsdk.model.b0.f189197a.v(3L);
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFinderLiveLogic", "callback ex " + e17.getMessage());
        }
    }
}
