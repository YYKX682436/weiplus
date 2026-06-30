package wt1;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f449255e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f449256f;

    /* renamed from: g, reason: collision with root package name */
    public xt1.a0 f449257g;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f449254d = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f449258h = new java.util.ArrayList();

    public c() {
        xt1.s0 hj6 = xt1.t0.hj();
        hj6.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = hj6.f456567d.f("select * from PendingCardId where retryCount < 10", null, 2);
        while (f17.moveToNext()) {
            xt1.r0 r0Var = new xt1.r0();
            r0Var.convertFrom(f17);
            arrayList.add(r0Var);
        }
        f17.close();
        arrayList.size();
        this.f449255e = arrayList;
        this.f449256f = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "<init>, init pending list size = %d", java.lang.Integer.valueOf(arrayList.size()));
        gm0.j1.n().f273288b.a(1074, this);
    }

    public void a(int i17) {
        gm0.j1.n().f273288b.g(new xt1.e0(1, i17));
    }

    public void b() {
        java.util.List list = this.f449255e;
        if (((java.util.ArrayList) list).size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "getNow, no pending cardinfo ,no need to get");
            return;
        }
        if (this.f449257g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "getNow, already doing scene, not trigger now");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (((java.util.ArrayList) list).size() <= 10) {
            linkedList.addAll(list);
        } else {
            linkedList.addAll(((java.util.ArrayList) list).subList(0, 10));
        }
        this.f449257g = new xt1.a0(linkedList);
        gm0.j1.n().f273288b.g(this.f449257g);
    }

    public void c(r45.xu xuVar) {
        if (xuVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BatchGetCardMgr", "push fail, CardUserItem is null");
            return;
        }
        com.tencent.mm.plugin.card.model.CardInfo z07 = xt1.t0.cj().z0("" + xuVar.f390420d);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = xuVar.f390420d;
        objArr[1] = java.lang.Long.valueOf(z07 == null ? 0L : z07.field_updateSeq);
        objArr[2] = java.lang.Long.valueOf(xuVar.f390421e);
        com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, cardUserId = %s, localSeq = %d, svrSeq = %d", objArr);
        if (z07 != null && z07.field_updateSeq == xuVar.f390421e) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BatchGetCardMgr", "push CardUserItem fail, card.field_updateSeq == item.UpdateSequence");
            return;
        }
        xt1.r0 r0Var = new xt1.r0();
        r0Var.field_cardUserId = xuVar.f390420d;
        synchronized (this.f449254d) {
            if (((java.util.ArrayList) this.f449255e).contains(r0Var)) {
                return;
            }
            if (((java.util.ArrayList) this.f449256f).contains(r0Var)) {
                return;
            }
            ((java.util.ArrayList) this.f449255e).add(r0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, insertRet = %b", java.lang.Boolean.valueOf(xt1.t0.hj().insert(r0Var)));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        tt1.l lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f449257g = null;
        java.util.LinkedList<xt1.r0> linkedList = ((xt1.a0) m1Var).f456442g;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BatchGetCardMgr", "onSceneEnd fail, stop batch get, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            synchronized (this.f449254d) {
                if (linkedList != null) {
                    if (linkedList.size() > 0) {
                        ((java.util.ArrayList) this.f449255e).removeAll(linkedList);
                        ((java.util.ArrayList) this.f449256f).addAll(linkedList);
                    }
                }
            }
            xt1.s0 hj6 = xt1.t0.hj();
            hj6.getClass();
            if (linkedList == null || linkedList.size() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PendingCardIdInfoStorage", "increaseRetryCount fail, list is empty");
                return;
            }
            for (xt1.r0 r0Var : linkedList) {
                if (r0Var != null) {
                    r0Var.field_retryCount++;
                    hj6.update(r0Var, new java.lang.String[0]);
                }
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, batch get succ, remove succ id list, size = %d", objArr);
        if (linkedList != null) {
            synchronized (this.f449254d) {
                ((java.util.ArrayList) this.f449255e).removeAll(linkedList);
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        xt1.s0 hj7 = xt1.t0.hj();
        hj7.getClass();
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PendingCardIdInfoStorage", "deleteList fail, list is empty");
        } else {
            for (xt1.r0 r0Var2 : linkedList) {
                if (r0Var2 != null) {
                    hj7.delete(r0Var2, new java.lang.String[0]);
                }
            }
        }
        gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
        com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "onSceneEnd do transaction use time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        b();
        if (this.f449258h == null) {
            return;
        }
        for (int i19 = 0; i19 < ((java.util.ArrayList) this.f449258h).size(); i19++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449258h).get(i19);
            if (weakReference != null && (lVar = (tt1.l) weakReference.get()) != null) {
                lVar.W0();
            }
        }
    }
}
