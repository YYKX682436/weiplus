package uj3;

/* loaded from: classes14.dex */
public final class a0 implements com.tencent.mm.plugin.multitalk.model.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final uj3.b0 f428210d;

    /* renamed from: e, reason: collision with root package name */
    public final uj3.b f428211e;

    /* renamed from: f, reason: collision with root package name */
    public final uj3.h1 f428212f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f428213g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f428214h;

    public a0(uj3.b0 contentView, uj3.b statusManager) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f428210d = contentView;
        this.f428211e = statusManager;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().q().e(this);
        uj3.h1 h1Var = new uj3.h1(statusManager);
        this.f428212f = h1Var;
        com.tencent.mm.sdk.platformtools.b4 b4Var = h1Var.f428284b;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = h1Var.f428284b;
        if (b4Var2 != null) {
            b4Var2.quitSafely();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = h1Var.f428284b;
        if (b4Var3 != null) {
            b4Var3.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var4 = new com.tencent.mm.sdk.platformtools.b4(new uj3.g1(h1Var), true);
        h1Var.f428284b = b4Var4;
        b4Var4.c(20L, 20L);
        this.f428213g = zj3.j.h();
        this.f428214h = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public com.tencent.mm.plugin.multitalk.model.a0 b(java.lang.String wxUserName) {
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        uj3.b0 b0Var = this.f428210d;
        if (android.text.TextUtils.isEmpty(b0Var.getF150344m()) || kotlin.jvm.internal.o.b(b0Var.getF150344m(), wxUserName)) {
            return b0Var;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public void c() {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.b0
    public com.tencent.mm.plugin.multitalk.model.a0 d(int i17) {
        return null;
    }

    public final void e() {
        com.tencent.mm.plugin.multitalk.model.t0 Bi;
        java.util.ArrayList arrayList;
        int i17;
        java.lang.String str;
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        boolean z17;
        com.tencent.mm.plugin.multitalk.model.v0 Ri;
        java.util.List p17;
        java.util.List p18;
        uj3.b0 b0Var = this.f428210d;
        java.lang.String d17 = b0Var.d();
        if (!r26.n0.N(d17)) {
            uj3.z zVar = b0Var.f428219g;
            java.lang.Long l17 = zVar != null ? zVar.f428402i : null;
            if (l17 != null) {
                long longValue = l17.longValue();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (android.os.SystemClock.elapsedRealtime() - longValue >= 3000) {
                    com.tencent.mm.plugin.multitalk.model.v0 Ri2 = com.tencent.mm.plugin.multitalk.model.e3.Ri();
                    if ((Ri2 == null || (p18 = Ri2.p()) == null || !p18.contains(d17)) ? false : true) {
                        b0Var.c(true);
                        uj3.z zVar2 = b0Var.f428219g;
                        if (zVar2 != null) {
                            zVar2.f428402i = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
                            zVar2.f428400g = d17;
                        }
                        b0Var.h(d17);
                    } else {
                        uj3.b.a(this.f428211e, uj3.a.f428199m, null, 2, null);
                        b0Var.c(false);
                        uj3.z zVar3 = b0Var.f428219g;
                        if (zVar3 != null) {
                            zVar3.f428402i = null;
                            zVar3.f428400g = null;
                        }
                        z17 = true;
                        Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
                        if ((Ri == null && (p17 = Ri.p()) != null && p17.contains(d17)) || z17) {
                            b0Var.i(false);
                        } else {
                            b0Var.i(true);
                        }
                    }
                } else {
                    b0Var.h(d17);
                }
                z17 = false;
                Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
                if (Ri == null && (p17 = Ri.p()) != null && p17.contains(d17)) {
                }
                b0Var.i(false);
            }
        }
        if (this.f428213g || (Bi = com.tencent.mm.plugin.multitalk.model.e3.Bi()) == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = Bi.f150134b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!(copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) && 1 <= copyOnWriteArrayList.size() - 1) {
            java.util.List<java.util.Map.Entry> subList = copyOnWriteArrayList.subList(1, copyOnWriteArrayList.size());
            kotlin.jvm.internal.o.f(subList, "subList(...)");
            for (java.util.Map.Entry entry : subList) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectAvatarManager", "screen big are not allow to refresh decode");
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (this.f428214h.isEmpty()) {
            this.f428214h.addAll(arrayList2);
        } else {
            if (arrayList2.size() < 3 - this.f428214h.size()) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = this.f428214h.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()));
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    int intValue = ((java.lang.Number) it6.next()).intValue();
                    if (!arrayList.contains(java.lang.Integer.valueOf(intValue))) {
                        arrayList.add(java.lang.Integer.valueOf(intValue));
                    }
                }
            } else {
                arrayList = arrayList2;
            }
            this.f428214h = arrayList;
        }
        java.util.ArrayList arrayList3 = this.f428214h;
        com.tencent.mm.plugin.multitalk.model.v0 Ri3 = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        if (Ri3.P.j()) {
            sj3.j jVar = Ri3.P.f150008h;
            if (jVar == null || (multitalkFrameView = jVar.f408577d) == null || (str = multitalkFrameView.getF150344m()) == null) {
                str = "";
            }
            i17 = zj3.j.c(str);
        } else {
            i17 = -1;
        }
        arrayList3.remove(java.lang.Integer.valueOf(i17));
        if (this.f428214h.size() == 1) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            java.lang.Integer num = (java.lang.Integer) kz5.n0.X(this.f428214h);
            i4Var.getClass();
            i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.h3(i4Var, num, false));
        } else {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            java.util.ArrayList arrayList4 = this.f428214h;
            i4Var2.getClass();
            i4Var2.J(new com.tencent.mm.plugin.multitalk.ilinkservice.g3(i4Var2, arrayList4, false));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectAvatarManager", "ilink subscribeByUserMids ok, mids:" + arrayList2 + " and subscribe one is " + this.f428214h);
    }
}
