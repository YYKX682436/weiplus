package ff4;

/* loaded from: classes4.dex */
public final class k extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ff4.l f261699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff4.m f261700b;

    public k(ff4.l lVar, ff4.m mVar) {
        this.f261699a = lVar;
        this.f261700b = mVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (gm0.j1.b().m()) {
            ff4.l lVar = this.f261699a;
            java.util.LinkedList linkedList = lVar.f261701a;
            ff4.m mVar = this.f261700b;
            if (linkedList != null) {
                kotlin.jvm.internal.o.d(linkedList);
                if (!linkedList.isEmpty()) {
                    java.util.LinkedList linkedList2 = lVar.f261701a;
                    kotlin.jvm.internal.o.d(linkedList2);
                    r45.b50 b50Var = (r45.b50) linkedList2.getFirst();
                    java.util.LinkedList linkedList3 = ff4.m.f261703h;
                    int i17 = b50Var.f370530d;
                    java.util.LinkedList linkedList4 = lVar.f261701a;
                    kotlin.jvm.internal.o.d(linkedList4);
                    linkedList4.removeFirst();
                    int i18 = b50Var.f370530d;
                    if (i18 == 1) {
                        ef4.w.f252468t.l().post(new ff4.f(mVar, b50Var, this));
                        return;
                    }
                    if (i18 == 2) {
                        ef4.w.f252468t.l().post(new ff4.g(mVar, b50Var, this));
                        return;
                    }
                    if (i18 == 3) {
                        ef4.w.f252468t.l().post(new ff4.h(mVar, b50Var, this));
                        return;
                    }
                    if (i18 == 4) {
                        ef4.w.f252468t.l().post(new ff4.j(mVar, b50Var, this));
                        return;
                    } else if (i18 != 7) {
                        sendEmptyMessage(0);
                        return;
                    } else {
                        ef4.w.f252468t.l().post(new ff4.i(mVar, b50Var, this));
                        return;
                    }
                }
            }
            com.tencent.mm.modelbase.o oVar = mVar.f261704d;
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncResponse");
            r45.kf6 kf6Var = (r45.kf6) fVar;
            com.tencent.mm.protobuf.f fVar2 = oVar.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
            r45.jf6 jf6Var = (r45.jf6) fVar2;
            byte[] c17 = o45.qi.c(jf6Var.f377788e.f371841f.g(), kf6Var.f378666f.f371841f.g());
            if (c17 != null && c17.length > 0) {
                w11.c2.f441991a.d(c17, true);
            }
            jf6Var.f377788e.d(c17);
            if ((jf6Var.f377787d & kf6Var.f378665e) == 0) {
                com.tencent.mm.modelbase.u0 u0Var = mVar.f261707g;
                if (u0Var != null) {
                    u0Var.onSceneEnd(0, 0, "", mVar);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("callback");
                    throw null;
                }
            }
            com.tencent.mm.network.s dispatcher = mVar.dispatcher();
            kotlin.jvm.internal.o.f(dispatcher, "dispatcher(...)");
            com.tencent.mm.modelbase.u0 u0Var2 = mVar.f261707g;
            if (u0Var2 != null) {
                mVar.doScene(dispatcher, u0Var2);
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        }
    }
}
