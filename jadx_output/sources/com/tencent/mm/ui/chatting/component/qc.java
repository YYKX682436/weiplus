package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.w0.class)
/* loaded from: classes13.dex */
public class qc extends com.tencent.mm.ui.chatting.component.a implements sb5.w0 {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199763e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f199764f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f199765g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f199766h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f199767i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.ld f199768m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f199769n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f199770o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.cd f199771p = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f199772q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f199773r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199774s = false;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ObjectAnimator f199775t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ObjectAnimator f199776u = null;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199777v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.dd f199778w;

    public qc() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f199777v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyGroupTodoEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.GroupTodoComponent$1
            {
                this.__eventId = 1864745998;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent) {
                int n07;
                com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent2 = notifyGroupTodoEvent;
                com.tencent.mm.ui.chatting.component.qc qcVar = com.tencent.mm.ui.chatting.component.qc.this;
                qcVar.f198580d.b0();
                if (notifyGroupTodoEvent2 != null) {
                    am.ql qlVar = notifyGroupTodoEvent2.f54545g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "NotifyGroupTodoEvent %s %s %s", qlVar.f7716b, qlVar.f7717c, java.lang.Integer.valueOf(qlVar.f7715a));
                    if (com.tencent.mm.sdk.platformtools.t8.D0(qcVar.f198580d.x(), qlVar.f7716b)) {
                        if (qlVar.f7715a != 3) {
                            java.util.ArrayList arrayList = qcVar.f199772q;
                            if (arrayList.size() > 0) {
                                java.util.Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    com.tencent.mm.ui.chatting.component.md mdVar = (com.tencent.mm.ui.chatting.component.md) it.next();
                                    if (mdVar.f199502b == 1) {
                                        qcVar.o0(mdVar.f199501a);
                                        qcVar.f199768m.notifyItemRangeChanged(0, mdVar.f199503c);
                                    }
                                }
                                arrayList.clear();
                            }
                        }
                        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(qlVar.f7716b, qlVar.f7717c);
                        int i17 = qlVar.f7715a;
                        if (i17 == 0) {
                            qcVar.m0(z07, false);
                        } else if (i17 == 1) {
                            java.lang.String str = qlVar.f7717c;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (n07 = qcVar.n0((rn.c) qcVar.f199770o.remove(str))) != -1) {
                                qcVar.f199768m.notifyItemRemoved(n07);
                            }
                        } else if (i17 == 2) {
                            qcVar.m0(z07, false);
                        } else if (i17 == 3) {
                            qcVar.m0(z07, true);
                        }
                        qcVar.p0();
                    }
                }
                return false;
            }
        };
        this.f199778w = new com.tencent.mm.ui.chatting.component.bd(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (com.tencent.mm.storage.z3.N4(this.f198580d.x())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "onPause");
            this.f199777v.dead();
            android.view.View view = this.f199763e;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(this.f198580d.x());
            if (p17 != null && p17.J0() == 1) {
                p17.D1(0);
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).Y(p17, p17.h1(), false, true);
            }
        }
        this.f199774s = false;
    }

    public final void m0(rn.c cVar, boolean z17) {
        if (kn.j0.e(cVar)) {
            if (((java.util.ArrayList) this.f199769n).contains(cVar)) {
                if (z17) {
                    if (((java.util.ArrayList) this.f199769n).indexOf(cVar) != -1) {
                        this.f199772q.add(new com.tencent.mm.ui.chatting.component.md(cVar, 1, 0, ((java.util.ArrayList) this.f199769n).indexOf(cVar) + 1));
                        return;
                    }
                    return;
                } else {
                    int o07 = o0(cVar);
                    if (o07 != -1) {
                        this.f199768m.notifyItemRangeChanged(0, o07 + 1);
                        return;
                    }
                    return;
                }
            }
            if (cVar != null) {
                ((java.util.ArrayList) this.f199769n).add(0, cVar);
                this.f199770o.put(cVar.field_todoid, cVar);
                this.f199768m.notifyItemInserted(0);
            }
            if (((java.util.ArrayList) this.f199769n).size() > 20) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.ui.chatting.component.vc vcVar = new com.tencent.mm.ui.chatting.component.vc(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(vcVar, 300L, false);
            }
        }
    }

    public final int n0(rn.c cVar) {
        if (cVar == null) {
            return -1;
        }
        java.util.List list = this.f199769n;
        if (!((java.util.ArrayList) list).contains(cVar)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.GroupTodoComponent", "removeTodoItemList todo no exist???");
            return -1;
        }
        int indexOf = ((java.util.ArrayList) list).indexOf(cVar);
        ((java.util.ArrayList) list).remove(cVar);
        this.f199770o.remove(cVar.field_todoid);
        return indexOf;
    }

    public final int o0(rn.c cVar) {
        if (cVar == null) {
            return -1;
        }
        java.util.List list = this.f199769n;
        if (!((java.util.ArrayList) list).contains(cVar)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.GroupTodoComponent", "updateItem todo no exist???");
            return -1;
        }
        int indexOf = ((java.util.ArrayList) list).indexOf(cVar);
        ((java.util.ArrayList) list).remove(indexOf);
        ((java.util.ArrayList) list).add(0, cVar);
        this.f199770o.put(cVar.field_todoid, cVar);
        return indexOf;
    }

    public final void p0() {
        if (this.f199763e != null) {
            if (((java.util.ArrayList) this.f199769n).size() == 0) {
                android.view.View view = this.f199763e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.chatting.component.cd cdVar = this.f199771p;
                if (cdVar != null) {
                    com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.v1) cdVar).f190689a;
                    chatFooter.f190071u = false;
                    chatFooter.M1();
                    return;
                }
                return;
            }
            if (this.f199773r) {
                android.view.View view2 = this.f199763e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.chatting.component.cd cdVar2 = this.f199771p;
                if (cdVar2 != null) {
                    com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = ((com.tencent.mm.pluginsdk.ui.chat.v1) cdVar2).f190689a;
                    chatFooter2.f190071u = true;
                    chatFooter2.M1();
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        java.util.ArrayList arrayList = this.f199772q;
        if (arrayList.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "saveOperationList:%s", java.lang.Integer.valueOf(arrayList.size()));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.chatting.component.md mdVar = (com.tencent.mm.ui.chatting.component.md) it.next();
                if (mdVar.f199502b == 1) {
                    o0(mdVar.f199501a);
                    this.f199768m.notifyItemRangeChanged(0, mdVar.f199503c);
                }
            }
            arrayList.clear();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "onChattingEnterAnimStart: user %s hashCode:%s", this.f198580d.x(), java.lang.Integer.valueOf(hashCode()));
        if (this.f199763e == null) {
            long c17 = c01.id.c();
            android.view.View c18 = this.f198580d.c(com.tencent.mm.R.id.bl_);
            this.f199763e = c18;
            this.f199764f = (androidx.recyclerview.widget.RecyclerView) c18.findViewById(com.tencent.mm.R.id.oel);
            this.f199765g = (android.widget.ImageView) this.f199763e.findViewById(com.tencent.mm.R.id.oeg);
            this.f199766h = (android.widget.ImageView) this.f199763e.findViewById(com.tencent.mm.R.id.oek);
            this.f199764f.i(new com.tencent.mm.ui.chatting.component.rc(this));
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(this.f198580d.g());
            this.f199767i = wxLinearLayoutManager;
            wxLinearLayoutManager.Q(0);
            this.f199764f.setLayoutManager(this.f199767i);
            com.tencent.mm.ui.chatting.component.ld ldVar = new com.tencent.mm.ui.chatting.component.ld(this.f198580d.g(), this.f199769n, this.f199778w);
            this.f199768m = ldVar;
            this.f199764f.setAdapter(ldVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "constructor interTime:%s", java.lang.Long.valueOf(c01.id.c() - c17));
        }
        this.f199774s = true;
        long c19 = c01.id.c();
        ((java.util.ArrayList) this.f199769n).clear();
        this.f199770o.clear();
        if (this.f199774s) {
            java.util.Collections.sort(this.f199769n, new com.tencent.mm.ui.chatting.component.uc(this));
            this.f199768m.notifyDataSetChanged();
            p0();
        }
        android.view.View view = this.f199763e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.tencent.mm.storage.z3.N4(this.f198580d.x())) {
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.qc$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final com.tencent.mm.ui.chatting.component.qc qcVar = com.tencent.mm.ui.chatting.component.qc.this;
                    final java.lang.String x17 = qcVar.f198580d.x();
                    rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
                    Bi.getClass();
                    final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
                        long c27 = c01.id.c();
                        android.database.Cursor E = Bi.f397602d.E("GroupTodo", rn.c.T.f316954c, "roomname=? and createtime>=? AND state IN (0,1)", new java.lang.String[]{x17, (c27 - rn.e.f397599e.longValue()) + ""}, null, null, "updatetime DESC limit 20");
                        if (E != null) {
                            while (E.moveToNext()) {
                                try {
                                    rn.c cVar = new rn.c();
                                    cVar.convertFrom(E);
                                    arrayList2.add(cVar);
                                } finally {
                                    E.close();
                                }
                            }
                        }
                    }
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.qc$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str;
                            com.tencent.mm.ui.chatting.component.qc qcVar2 = com.tencent.mm.ui.chatting.component.qc.this;
                            if (qcVar2.f199774s && (str = x17) != null && str.equals(qcVar2.f198580d.x())) {
                                qcVar2.f199777v.alive();
                                java.util.List list = qcVar2.f199769n;
                                java.util.List<rn.c> list2 = arrayList2;
                                if (list2 != null) {
                                    for (rn.c cVar2 : list2) {
                                        ((java.util.ArrayList) list).add(cVar2);
                                        qcVar2.f199770o.put(cVar2.field_todoid, cVar2);
                                    }
                                }
                                if (qcVar2.f199774s) {
                                    java.util.Collections.sort(list, new com.tencent.mm.ui.chatting.component.uc(qcVar2));
                                    qcVar2.f199768m.notifyDataSetChanged();
                                    qcVar2.p0();
                                }
                            }
                        }
                    });
                }
            });
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "onResume chatroomUsername:%s interTime:%s size:%s", this.f198580d.x(), java.lang.Long.valueOf(c01.id.c() - c19), java.lang.Integer.valueOf(((java.util.ArrayList) this.f199769n).size()));
    }
}
