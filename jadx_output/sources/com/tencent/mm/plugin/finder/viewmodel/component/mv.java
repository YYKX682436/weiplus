package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mv extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f135211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f135212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pv f135213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135214g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135215h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f135216i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f135217m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135212e = fVar;
        this.f135213f = pvVar;
        this.f135214g = str;
        this.f135215h = str2;
        this.f135216i = gVar;
        this.f135217m = finderItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.mv(this.f135212e, this.f135213f, this.f135214g, this.f135215h, this.f135216i, this.f135217m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.mv) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.b23 b23Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135211d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.modelbase.f fVar = this.f135212e;
            r45.c23 c23Var = ((r45.s13) fVar.f70618d).f385398z;
            java.lang.Object obj3 = null;
            if (c23Var == null || (linkedList2 = c23Var.f371240d) == null) {
                b23Var = null;
            } else {
                java.util.Iterator it = linkedList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((r45.b23) obj2).f370449d == 2) {
                        break;
                    }
                }
                b23Var = (r45.b23) obj2;
            }
            if (b23Var != null) {
                java.lang.String str = this.f135214g;
                com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar = this.f135213f;
                pvVar.getClass();
                com.tencent.mars.xlog.Log.i("Finder.FinderProfilePreloadUIC", "requestUserPage:" + str + ", source:" + this.f135215h);
                bq.z1 z1Var = pvVar.f135632h;
                if (z1Var != null) {
                    z1Var.j();
                }
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                cq.k kVar = (cq.k) c17;
                r45.qt2 P6 = pvVar.P6(str);
                r45.y13 y13Var = new r45.y13();
                y13Var.set(1, 1);
                y13Var.set(0, this.f135216i);
                android.content.ComponentCallbacks2 context = pvVar.getContext();
                pvVar.f135632h = cq.j1.n(kVar, str, 0L, null, 0, P6, 0, 0L, false, null, 0L, null, null, null, false, true, null, true, null, y13Var, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, null, new com.tencent.mm.plugin.finder.viewmodel.component.ov(str), null, 5423086, null);
            }
            r45.c23 c23Var2 = ((r45.s13) fVar.f70618d).f385398z;
            if (c23Var2 != null && (linkedList = c23Var2.f371240d) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (((r45.b23) next).f370449d == 1) {
                        obj3 = next;
                        break;
                    }
                }
                obj3 = (r45.b23) obj3;
            }
            if (obj3 != null) {
                com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar2 = this.f135213f;
                java.lang.String str2 = this.f135214g;
                java.lang.String str3 = this.f135215h;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f135217m;
                com.tencent.mm.protobuf.g gVar = this.f135216i;
                this.f135211d = 1;
                if (com.tencent.mm.plugin.finder.viewmodel.component.pv.O6(pvVar2, str2, str3, finderItem, gVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
