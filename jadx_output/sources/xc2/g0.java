package xc2;

/* loaded from: classes2.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f453138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.k0 f453139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f453140f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, xc2.k0 k0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453138d = finderItem;
        this.f453139e = k0Var;
        this.f453140f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc2.g0(this.f453138d, this.f453139e, this.f453140f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xc2.g0 g0Var = (xc2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xc2.k0 k0Var;
        java.lang.Object obj2;
        java.util.HashSet hashSet;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f453138d;
        r45.lu0 attachmentList = finderItem.getFeedObject().getAttachmentList();
        if (attachmentList != null) {
            boolean z17 = false;
            java.util.LinkedList list = attachmentList.getList(0);
            if (list != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    k0Var = this.f453139e;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    r45.ku0 ku0Var = (r45.ku0) next;
                    kotlin.jvm.internal.o.d(ku0Var);
                    xc2.u uVar = xc2.k0.f453173y;
                    k0Var.getClass();
                    if (!(ku0Var.getInteger(0) == 1)) {
                        arrayList.add(next);
                    }
                }
                java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = null;
                    if (!it6.hasNext()) {
                        break;
                    }
                    r45.rc1 rc1Var = (r45.rc1) ((r45.ku0) it6.next()).getCustom(3);
                    if (rc1Var != null) {
                        finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) rc1Var.getCustom(0);
                    }
                    arrayList2.add(finderJumpInfo);
                }
                int i17 = this.f453140f;
                long expectId = finderItem.getExpectId();
                java.lang.String dupFlag = finderItem.getDupFlag();
                xc2.u uVar2 = xc2.k0.f453173y;
                androidx.lifecycle.j0 W6 = k0Var.W6(expectId, i17, dupFlag);
                java.util.Collection collection = (java.util.Set) W6.getValue();
                if (collection == null) {
                    collection = new java.util.HashSet();
                }
                java.util.HashSet<xc2.t> hashSet2 = new java.util.HashSet(collection);
                for (xc2.t tVar : hashSet2) {
                    kz5.h0.B(tVar.f453302d, new xc2.e0(tVar));
                }
                for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 : arrayList2) {
                    if (finderJumpInfo2 != null) {
                        java.util.LinkedList<r45.wf6> style = finderJumpInfo2.getStyle();
                        kotlin.jvm.internal.o.f(style, "getStyle(...)");
                        for (r45.wf6 wf6Var : style) {
                            java.util.Iterator it7 = hashSet2.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it7.next();
                                if (((xc2.t) obj2).f453301c == wf6Var.getInteger(1) ? true : z17) {
                                    break;
                                }
                            }
                            xc2.t tVar2 = (xc2.t) obj2;
                            if (tVar2 == null) {
                                hashSet = hashSet2;
                                tVar2 = new xc2.t(i17, finderItem.getExpectId(), wf6Var.getInteger(1), new java.util.LinkedList(), false, null, 48, null);
                            } else {
                                hashSet = hashSet2;
                            }
                            kz5.h0.B(tVar2.f453302d, new xc2.f0(finderJumpInfo2));
                            tVar2.f453302d.add(finderJumpInfo2);
                            tVar2.f453305g.remove(new java.lang.Integer(finderJumpInfo2.hashCode()));
                            hashSet.remove(tVar2);
                            hashSet.add(tVar2);
                            hashSet2 = hashSet;
                            z17 = false;
                        }
                    }
                    hashSet2 = hashSet2;
                    z17 = false;
                }
                W6.postValue(hashSet2);
            }
        }
        return jz5.f0.f302826a;
    }
}
