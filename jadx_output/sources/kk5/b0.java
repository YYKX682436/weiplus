package kk5;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.c0 f308614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kk5.c0 c0Var) {
        super(1);
        this.f308614d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6;
        j75.f stateCenter;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (((wi5.c) state.a(wi5.c.class)) != null) {
            java.util.HashSet hashSet = new java.util.HashSet(wi5.p0.f446333a.b(state.f446319o, state.f446318n, false));
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "ClickConfirmMenuAction: " + hashSet);
            int size = hashSet.size();
            kk5.c0 c0Var = this.f308614d;
            if (size > 1) {
                p13.c cVar = c0Var.f308625f;
                if (cVar != null) {
                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
                    c0Var.f308625f = null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(hashSet);
                p13.u uVar = new p13.u();
                ((java.util.ArrayList) uVar.f351155q).addAll(hashSet);
                uVar.f351140b = 8;
                uVar.f351150l = r13.b.f368602d;
                uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) c0Var.f308623d).getValue();
                uVar.f351154p = true;
                uVar.f351151m = new kk5.x(c0Var, new kk5.y(c0Var, arrayList));
                c0Var.f308624e = db5.e1.Q(c0Var.getContext(), c0Var.getString(com.tencent.mm.R.string.f490573yv), c0Var.getString(com.tencent.mm.R.string.f492749hq2), true, true, null);
                c0Var.f308625f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(11, uVar);
            } else if (hashSet.size() == 1) {
                java.lang.String str = (java.lang.String) kz5.n0.W(hashSet);
                if (str != null && (P6 = c0Var.P6()) != null && (stateCenter = P6.getStateCenter()) != null) {
                    stateCenter.B3(new wi5.j(str, true, 0L));
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "on ClickConfirmMenuAction: memberSet is empty");
            }
        }
        return jz5.f0.f302826a;
    }
}
