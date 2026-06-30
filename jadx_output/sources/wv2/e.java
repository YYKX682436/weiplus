package wv2;

/* loaded from: classes10.dex */
public final class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv2.f f450004d;

    public e(wv2.f fVar) {
        this.f450004d = fVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object obj;
        if (m1Var instanceof wv2.p) {
            wv2.f fVar = this.f450004d;
            if (fVar.f450009o.contains(m1Var)) {
                java.util.HashSet hashSet = fVar.f450009o;
                hashSet.remove(m1Var);
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = fVar.f450005h;
                if (i17 == 0 && i18 == 0) {
                    wv2.p pVar = (wv2.p) m1Var;
                    com.tencent.mm.protobuf.f fVar2 = pVar.f450043i.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.pp2) fVar2).getCustom(1);
                    java.util.Iterator<T> it = finderItem.getClipListExt().iterator();
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
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
                    if (finderItem2 != null) {
                        finderItem2.getFeedObject().setId(finderObject != null ? finderObject.getId() : 0L);
                    }
                    java.lang.Long valueOf = java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : 0L);
                    r45.jf2 jf2Var = pVar.f450042h;
                    jf2Var.set(2, valueOf);
                    jf2Var.set(3, finderObject != null ? finderObject.getObjectNonceId() : null);
                    jf2Var.set(4, 0L);
                    cu2.u.f222441a.n(finderItem);
                } else {
                    fVar.f450010p = true;
                }
                if (hashSet.isEmpty() && !fVar.f450010p) {
                    fVar.k();
                } else if (hashSet.isEmpty() && fVar.f450010p) {
                    fVar.f450007m = new wv2.n(finderItem, 2);
                    fVar.f450008n.countDown();
                }
            }
        }
    }
}
