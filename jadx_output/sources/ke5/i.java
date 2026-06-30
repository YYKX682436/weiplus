package ke5;

/* loaded from: classes9.dex */
public final class i extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public final yb5.d f307088i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f307089j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f307090k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f307091l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f307092m;

    /* renamed from: n, reason: collision with root package name */
    public he5.f f307093n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f307094o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f307095p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yb5.d chattingContext, hd5.v loader) {
        super(chattingContext, loader);
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f307088i = chattingContext;
        this.f307089j = chattingContext.x();
        this.f307095p = ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) chattingContext.f460708c.a(sb5.u1.class))).f199296g;
    }

    @Override // ke5.a, ke5.f0
    public void a(hd5.n action, boolean z17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(action, "action");
        if (this.f307095p && bundle == null && action == hd5.n.ACTION_ENTER) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingBizContactDataPresenter", "[onLoad] sourceArgs is null!");
        } else {
            this.f307092m = true;
            super.a(action, z17, bundle);
        }
    }

    @Override // ke5.a, ke5.f0
    public void b(hd5.n nVar, boolean z17) {
        this.f307092m = true;
        a(nVar, z17, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r1.booleanValue() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025a  */
    @Override // ke5.a, hd5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView r26, hd5.q r27) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.i.c(com.tencent.mm.ui.chatting.view.MMChattingListView, hd5.q):void");
    }

    @Override // ke5.f0
    public boolean d() {
        return true;
    }

    @Override // ke5.a
    public he5.t e(hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        kotlin.jvm.internal.o.g(action, "action");
        if (this.f307093n == null) {
            java.lang.String talkUsername = this.f307089j;
            kotlin.jvm.internal.o.f(talkUsername, "talkUsername");
            this.f307093n = new he5.f(talkUsername, new ke5.g(this), this.f307088i, new ke5.h(this));
        }
        yb5.d dVar = this.f307088i;
        he5.f fVar = this.f307093n;
        kotlin.jvm.internal.o.d(fVar);
        return new ke5.o(dVar, fVar, action, bundle, qVar, this.f307095p);
    }

    public final boolean h(int i17, int i18) {
        java.lang.String x17 = this.f307041b.x();
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
        int F2 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).F2(x17, 0L, m07);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBizContactDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
        if (i18 - F2 <= i17) {
            return true;
        }
        he5.f fVar = this.f307093n;
        return fVar != null && fVar.f280930h;
    }

    @Override // ke5.f0
    public boolean isLoading() {
        return this.f307092m;
    }

    @Override // ke5.a, ke5.f0
    public void onCancel() {
        super.onCancel();
        this.f307092m = false;
        if (this.f307094o) {
            return;
        }
        this.f307094o = true;
        he5.f fVar = this.f307093n;
        if (fVar != null && !fVar.f280929g) {
            fVar.f280929g = true;
            je5.b bVar = fVar.f280927e;
            yb5.d chattingContext = fVar.f280925c;
            bVar.getClass();
            kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
            synchronized (bVar) {
                if (bVar.f299322b) {
                    bVar.f299322b = false;
                    yq1.t0 t0Var = bVar.f299321a;
                    if (t0Var != null) {
                        ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) chattingContext.f460708c.a(sb5.f.class))).getClass();
                        java.util.List list = yq1.u0.f464473r;
                        if (list != null) {
                            ((java.util.ArrayList) list).remove(t0Var);
                        }
                    }
                    bVar.f299321a = null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend listener unregistered successfully");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend listener not registered, skip unregister");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataSource", "ChattingBizContactDataSource destroyed and listener unregistered");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBizContactDataPresenter", "ChattingBizContactDataPresenter destroyed");
    }
}
