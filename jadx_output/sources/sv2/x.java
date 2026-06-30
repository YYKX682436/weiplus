package sv2;

/* loaded from: classes10.dex */
public final class x implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.y f413374d;

    public x(sv2.y yVar) {
        this.f413374d = yVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object obj;
        if (m1Var instanceof wv2.p) {
            sv2.y yVar = this.f413374d;
            if (yVar.f413380p.contains(m1Var)) {
                com.tencent.mars.xlog.Log.i(yVar.f413376i, "clip cgi errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                java.util.HashSet hashSet = yVar.f413380p;
                hashSet.remove(m1Var);
                com.tencent.mm.plugin.finder.storage.x80 x80Var = yVar.f413375h;
                if (i17 == 0 && i18 == 0) {
                    wv2.p pVar = (wv2.p) m1Var;
                    com.tencent.mm.protobuf.f fVar = pVar.f450043i.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.pp2) fVar).getCustom(1);
                    java.util.Iterator<T> it = yVar.f413377m.getClipListExt().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.storage.FinderItem) obj).getObjectNonceId(), pVar.f450041g.getObjectNonceId())) {
                                break;
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
                    if (finderItem != null) {
                        finderItem.getFeedObject().setId(finderObject != null ? finderObject.getId() : 0L);
                    }
                    java.lang.Long valueOf = java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : 0L);
                    r45.jf2 jf2Var = pVar.f450042h;
                    jf2Var.set(2, valueOf);
                    jf2Var.set(3, finderObject != null ? finderObject.getObjectNonceId() : null);
                    jf2Var.set(4, 0L);
                    cu2.o.f222430a.b(x80Var);
                } else {
                    yVar.f413381q = true;
                }
                if (hashSet.isEmpty() && !yVar.f413381q) {
                    yVar.k();
                } else if (hashSet.isEmpty() && yVar.f413381q) {
                    yVar.f413378n = new sv2.c(x80Var, 2);
                    yVar.f413379o.countDown();
                }
            }
        }
    }
}
