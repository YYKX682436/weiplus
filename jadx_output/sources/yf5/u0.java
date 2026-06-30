package yf5;

/* loaded from: classes11.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f461954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.w0 f461955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f461956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l75.a1 f461957g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.Object obj, yf5.w0 w0Var, int i17, l75.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461954d = obj;
        this.f461955e = w0Var;
        this.f461956f = i17;
        this.f461957g = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf5.u0(this.f461954d, this.f461955e, this.f461956f, this.f461957g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf5.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yf5.a aVar;
        java.util.HashMap hashMap;
        com.tencent.mm.storage.l4 l4Var;
        yf5.m mVar;
        yf5.x xVar;
        pz5.a aVar2 = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.Object obj2 = this.f461954d;
        int i17 = this.f461956f;
        yf5.w0 w0Var = this.f461955e;
        if (obj2 == null || !(obj2 instanceof java.lang.String)) {
            java.lang.String str = w0Var.f461978g;
            new java.lang.Integer(i17);
            return f0Var;
        }
        l75.a1 a1Var = this.f461957g;
        if (a1Var instanceof com.tencent.mm.storage.l8) {
            com.tencent.mars.xlog.Log.i(w0Var.f461978g, "unreadcheck onConversationStorageNotifyChange event type %d, username %s", new java.lang.Integer(i17), obj2);
            w0Var.d().k(i17, (java.lang.String) obj2);
        } else if (a1Var instanceof com.tencent.mm.storage.e8) {
            com.tencent.mars.xlog.Log.i(w0Var.f461978g, "unreadcheck onContactStorageNotifyChange event type %d, username %s, isIniting %b", new java.lang.Integer(i17), obj2, java.lang.Boolean.valueOf(w0Var.f461994z));
            if (w0Var.f461994z) {
                return f0Var;
            }
            yf5.w d17 = w0Var.d();
            java.lang.String str2 = (java.lang.String) obj2;
            d17.getClass();
            if ((i17 == 3 || i17 == 4) && (aVar = d17.f461964h) != null && (hashMap = aVar.f461846c) != null && (l4Var = (com.tencent.mm.storage.l4) hashMap.get(str2)) != null) {
                yf5.x xVar2 = (yf5.x) d17.f461972s.get(str2);
                if (xVar2 == null) {
                    com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = d17.f461962f;
                    if (mvvmList != null) {
                        java.util.Iterator it = new java.util.ArrayList(mvvmList.f152065o).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                xVar = 0;
                                break;
                            }
                            xVar = it.next();
                            if (kotlin.jvm.internal.o.b(((yf5.x) xVar).f461995d.h1(), str2)) {
                                break;
                            }
                        }
                        xVar2 = xVar;
                    } else {
                        xVar2 = null;
                    }
                }
                if (xVar2 == null) {
                    xVar2 = d17.d(l4Var, null);
                } else {
                    d17.e(l4Var, xVar2, null);
                }
                yf5.x xVar3 = xVar2;
                if (xVar3 != null && (mVar = d17.f461963g) != null) {
                    v65.i.b(mVar.f461910d, null, new yf5.l(mVar, xVar3, false, mVar.f461912f.f461864b, null), 1, null);
                }
            }
        }
        return f0Var;
    }
}
