package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public final class b0 extends pf5.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150256d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.g0 f150257e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150258f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.g0 f150259g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150260h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.g0 f150261i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150262m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.g0 f150263n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150264o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.g0 f150265p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150266q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.lifecycle.g0 f150267r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f150268s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150269t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150270u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.g0 f150271v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150272w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.j0 f150273x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.g0 f150274y;

    /* renamed from: z, reason: collision with root package name */
    public kotlinx.coroutines.r2 f150275z;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.ui.b0.<init>():void");
    }

    public static final int N6(com.tencent.mm.plugin.multitalk.ui.b0 b0Var, com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember, java.util.List list, java.lang.String str) {
        java.lang.Object obj;
        int i17;
        int i18;
        b0Var.getClass();
        if (kotlin.jvm.internal.o.b(multiTalkGroupMember.f71612d, str)) {
            return 1000;
        }
        boolean z17 = true;
        boolean z18 = multiTalkGroupMember.f71614f == 10;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.modeltalkroom.VideoGroupMember) obj).f71619e, multiTalkGroupMember.f71612d)) {
                break;
            }
        }
        com.tencent.mm.modeltalkroom.VideoGroupMember videoGroupMember = (com.tencent.mm.modeltalkroom.VideoGroupMember) obj;
        if (videoGroupMember == null || ((i17 = videoGroupMember.f71621g) != 3 && i17 != 2 && (i18 = videoGroupMember.f71622h) != 101 && i18 != 102)) {
            z17 = false;
        }
        if (z18) {
            return z17 ? 0 : 10;
        }
        return 100;
    }

    public final void O6(java.lang.Boolean bool) {
        boolean booleanValue;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCameraClick, cur state: ");
        androidx.lifecycle.g0 g0Var = this.f150263n;
        sb6.append(g0Var.getValue());
        sb6.append(", new state: ");
        sb6.append(bool);
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
        if (bool != null) {
            if (!bool.booleanValue()) {
                booleanValue = true;
            }
            booleanValue = false;
        } else {
            java.lang.Boolean bool2 = (java.lang.Boolean) g0Var.getValue();
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            }
            booleanValue = false;
        }
        if (booleanValue == (!com.tencent.mm.plugin.multitalk.model.e3.wi().c())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "current camera state is " + com.tencent.mm.plugin.multitalk.model.e3.wi().c() + ", return");
            return;
        }
        if (booleanValue) {
            rq4.u.f399109a.b(4, com.tencent.mm.plugin.multitalk.model.e3.wi().d());
            com.tencent.mm.plugin.multitalk.model.s0 wi6 = com.tencent.mm.plugin.multitalk.model.e3.wi();
            kotlin.jvm.internal.o.f(wi6, "getCameraManager(...)");
            wi6.i(true);
            com.tencent.mm.plugin.multitalk.model.u0.a(6);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.H();
            com.tencent.mm.plugin.multitalk.model.e3.Zi().getClass();
        } else {
            boolean z17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150166i ? this.f150268s : this.f150269t;
            this.f150270u.postValue(java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
            if (n17 != null) {
                n17.i(z17);
            }
            com.tencent.mm.plugin.multitalk.model.s0 wi7 = com.tencent.mm.plugin.multitalk.model.e3.wi();
            kotlin.jvm.internal.o.f(wi7, "getCameraManager(...)");
            com.tencent.mm.plugin.multitalk.model.s0.h(wi7, false, 1, null);
            com.tencent.mm.plugin.multitalk.model.u0.a(5);
            rq4.u.f399109a.b(3, com.tencent.mm.plugin.multitalk.model.e3.wi().d());
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            i4Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: onCameraStart");
            i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.n3(i4Var));
            com.tencent.mm.plugin.multitalk.model.e3.Zi().getClass();
        }
        this.f150262m.setValue(java.lang.Boolean.valueOf(!booleanValue));
    }

    public final void P6(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMicClick, cur state: ");
        androidx.lifecycle.g0 g0Var = this.f150257e;
        sb6.append(g0Var.getValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
        java.lang.Boolean bool = (java.lang.Boolean) g0Var.getValue();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        this.f150256d.setValue(java.lang.Boolean.valueOf(!booleanValue));
        com.tencent.mm.plugin.multitalk.model.u0.f150142b++;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onMicClick, need notify iLink Engine");
            com.tencent.mm.plugin.multitalk.model.e3.Ri().Q(booleanValue);
        }
        if (booleanValue) {
            com.tencent.mm.plugin.multitalk.model.u0.a(1);
            com.tencent.mm.plugin.multitalk.model.e3.Bi().b(false);
        } else {
            com.tencent.mm.plugin.multitalk.model.u0.a(2);
            com.tencent.mm.plugin.multitalk.model.e3.Bi().b(true);
        }
    }

    public final void Q6(boolean z17) {
        androidx.lifecycle.g0 g0Var = this.f150259g;
        java.lang.Integer num = (java.lang.Integer) g0Var.getValue();
        int intValue = num != null ? num.intValue() : 1;
        int i17 = intValue == 1 ? 2 : 1;
        this.f150258f.postValue(java.lang.Integer.valueOf(i17));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onSpeakerClick, need notify iLink Engine");
            com.tencent.mm.plugin.multitalk.model.e3.Ri().R(intValue != 1);
        }
        kotlinx.coroutines.r2 r2Var = this.f150275z;
        if (r2Var != null && r2Var.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MT.MultiTalkUIViewModel", "onSpeakerClick: now switching, skip click");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onSpeakerClick, cur state: " + g0Var.getValue() + ", new state: " + i17);
        this.f150275z = pf5.e.launch$default(this, null, null, new com.tencent.mm.plugin.multitalk.ui.y(i17, this, null), 3, null);
    }

    public final void R6(boolean z17) {
        com.tencent.mm.plugin.multitalk.model.u0.f150143c++;
        if (z17) {
            com.tencent.mm.plugin.multitalk.model.u0.a(3);
            com.tencent.mm.plugin.multitalk.model.e3.Bi().c(true);
        } else {
            com.tencent.mm.plugin.multitalk.model.u0.a(4);
            com.tencent.mm.plugin.multitalk.model.e3.Bi().c(false);
        }
    }
}
