package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class dc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f134121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.cb f134122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f134123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.db f134125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f134126i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f134127m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f134128n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f134129o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f134130p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.List f134131q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f134132r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(com.tencent.mm.plugin.finder.viewmodel.component.cb cbVar, com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, int i17, com.tencent.mm.plugin.finder.viewmodel.component.db dbVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.util.List list, boolean z17, r45.qt2 qt2Var, java.util.LinkedList linkedList, java.util.List list2, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134122e = cbVar;
        this.f134123f = ncVar;
        this.f134124g = i17;
        this.f134125h = dbVar;
        this.f134126i = finderObject;
        this.f134127m = list;
        this.f134128n = z17;
        this.f134129o = qt2Var;
        this.f134130p = linkedList;
        this.f134131q = list2;
        this.f134132r = finderItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.dc(this.f134122e, this.f134123f, this.f134124g, this.f134125h, this.f134126i, this.f134127m, this.f134128n, this.f134129o, this.f134130p, this.f134131q, this.f134132r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.dc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.dc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
