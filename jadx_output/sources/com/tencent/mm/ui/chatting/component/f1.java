package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = com.tencent.mm.ui.chatting.component.fg.class)
/* loaded from: classes9.dex */
public final class f1 extends com.tencent.mm.ui.chatting.component.a implements com.tencent.mm.ui.chatting.component.fg {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f199001e = new java.util.HashSet(256);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f199002f = new java.util.ArrayList(256);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f199003g = new java.util.HashSet(256);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f199004h = new java.util.ArrayList(256);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f199005i = new java.util.LinkedHashMap();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        sc5.f fVar = sc5.f.f406567a;
        if (sc5.f.f406569c) {
            if (!this.f199002f.isEmpty()) {
                java.util.List S0 = kz5.n0.S0(this.f199002f);
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(S0, 10));
                java.util.Iterator it = S0.iterator();
                while (it.hasNext()) {
                    arrayList.add((com.tencent.mm.storage.f9) ((jz5.l) it.next()).f302833d);
                }
                fVar.f(arrayList);
            }
            long a17 = hq.d.a();
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f199005i).entrySet()) {
                m0((com.tencent.mm.storage.f9) entry.getKey(), a17 - ((java.lang.Number) entry.getValue()).longValue());
            }
            if (!this.f199004h.isEmpty()) {
                sc5.f fVar2 = sc5.f.f406567a;
                java.util.List S02 = kz5.n0.S0(this.f199004h);
                if (sc5.f.f406569c && !S02.isEmpty()) {
                    ((ku5.t0) ku5.t0.f312615d).h(new sc5.e(S02), "ChatMsgReadReportManager");
                }
            }
            ((java.util.LinkedHashMap) this.f199005i).clear();
            this.f199001e.clear();
            this.f199003g.clear();
            this.f199002f.clear();
            this.f199004h.clear();
        }
    }

    @Override // yn.d
    public void Y(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 w0Var) {
        java.util.LinkedList linkedList;
        com.tencent.mm.storage.f9 f9Var;
        java.util.Map.Entry c17;
        java.util.LinkedList linkedList2;
        com.tencent.mm.storage.f9 f9Var2;
        sc5.f fVar = sc5.f.f406567a;
        if (sc5.f.f406569c) {
            java.util.Map map = this.f199005i;
            if (w0Var != null && (linkedList2 = w0Var.f293156i) != null && !linkedList2.isEmpty()) {
                long a17 = hq.d.a();
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    in5.c cVar = ((in5.x0) it.next()).f293158a;
                    rd5.d dVar = cVar instanceof rd5.d ? (rd5.d) cVar : null;
                    if (dVar != null && (f9Var2 = dVar.f394254d.f445300b) != null) {
                        long msgId = f9Var2.getMsgId();
                        if (msgId > 0 && this.f199001e.add(java.lang.Long.valueOf(msgId))) {
                            this.f199002f.add(new jz5.l(f9Var2, java.lang.Long.valueOf(hq.d.a())));
                        }
                        map.put(f9Var2, java.lang.Long.valueOf(a17));
                    }
                }
            }
            if (w0Var == null || (linkedList = w0Var.f293155h) == null || linkedList.isEmpty()) {
                return;
            }
            long a18 = hq.d.a();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                in5.c cVar2 = ((in5.x0) it6.next()).f293158a;
                rd5.d dVar2 = cVar2 instanceof rd5.d ? (rd5.d) cVar2 : null;
                if (dVar2 != null && (f9Var = dVar2.f394254d.f445300b) != null && (c17 = fo1.f.c(map, new com.tencent.mm.ui.chatting.component.e1(f9Var))) != null) {
                    m0(f9Var, a18 - ((java.lang.Number) c17.getValue()).longValue());
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        sc5.f.f406567a.d();
    }

    public final void m0(com.tencent.mm.storage.f9 f9Var, long j17) {
        long msgId = f9Var.getMsgId();
        if (msgId > 0 && j17 > 100 && this.f199003g.add(java.lang.Long.valueOf(msgId))) {
            this.f199004h.add(new jz5.l(f9Var, java.lang.Long.valueOf(j17)));
        }
    }
}
