package com.tencent.mm.plugin.finder.presenter.contract.message;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageDbSource;", "Lir2/a0;", "Lso2/i;", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMessageDbSource implements ir2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f123272d;

    /* renamed from: e, reason: collision with root package name */
    public final int f123273e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f123274f;

    /* renamed from: g, reason: collision with root package name */
    public final int f123275g;

    /* renamed from: h, reason: collision with root package name */
    public final ir2.z f123276h;

    /* renamed from: i, reason: collision with root package name */
    public long f123277i;

    /* renamed from: m, reason: collision with root package name */
    public int f123278m;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageDbSource$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }
    }

    static {
        new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource.Companion(null);
    }

    public FinderMessageDbSource(int[] messageTypes, int i17, java.lang.String username, int i18) {
        kotlin.jvm.internal.o.g(messageTypes, "messageTypes");
        kotlin.jvm.internal.o.g(username, "username");
        this.f123272d = messageTypes;
        this.f123273e = i17;
        this.f123274f = username;
        this.f123275g = i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 : messageTypes) {
            sb6.append(i19);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append((java.lang.Object) sb6);
        sb7.append('-');
        sb7.append(this.f123273e);
        sb7.append('-');
        sb7.append(this.f123275g);
        this.f123276h = new ir2.z(sb7.toString());
    }

    @Override // ir2.a0
    public java.lang.Object d(kotlin.coroutines.Continuation continuation) {
        cu2.a0 a0Var = cu2.b0.f222371a;
        java.util.List b17 = a0Var.b(this.f123277i, this.f123278m, this.f123272d, this.f123273e, this.f123274f, this.f123275g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            so2.i j17 = a0Var.j((dm.pd) it.next());
            if (j17 != null) {
                arrayList.add(j17);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMessageDbSource", "load:" + arrayList.size());
        return new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData(arrayList, false);
    }

    @Override // ir2.a0, ay1.m
    /* renamed from: getKey */
    public java.lang.Object getF123276h() {
        return this.f123276h;
    }

    @Override // ir2.a0, ay1.m
    /* renamed from: getKey, reason: from getter */
    public ir2.z getF123276h() {
        return this.f123276h;
    }
}
