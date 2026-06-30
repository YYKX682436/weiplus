package sf2;

/* loaded from: classes10.dex */
public final class d3 extends if2.b implements if2.e, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public fn2.s1 f407103m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f407104n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f407105o;

    /* renamed from: p, reason: collision with root package name */
    public hn2.d f407106p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f407107q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f407108r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f407109s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f407108r = jz5.h.b(new sf2.y1(this));
        this.f407109s = new java.util.LinkedHashMap();
    }

    public static final void Z6(sf2.d3 d3Var, int i17, r45.mx1 mx1Var, java.lang.String str) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        r45.gw1 gw1Var;
        d3Var.getClass();
        r45.fw1 fw1Var = mx1Var.f380890p;
        if (fw1Var != null && (list2 = fw1Var.getList(0)) != null && (gw1Var = (r45.gw1) kz5.n0.Z(list2)) != null) {
            ((om2.l) d3Var.business(om2.l.class)).T6(gw1Var);
        }
        ((om2.g) d3Var.business(om2.g.class)).X6("modCgi_" + i17 + '_' + str, mx1Var.f380885h);
        om2.g gVar = (om2.g) d3Var.business(om2.g.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modCgi_");
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        java.util.LinkedList song_info_list = mx1Var.f380882e;
        kotlin.jvm.internal.o.f(song_info_list, "song_info_list");
        gVar.V6(sb7, song_info_list, mx1Var.f380883f);
        ((om2.g) d3Var.business(om2.g.class)).W6("modCgi_" + i17 + '_' + str, mx1Var.f380886i);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mod handleResp, modType: ");
        sb8.append(i17);
        sb8.append(" all_wait_song_size: ");
        sb8.append(mx1Var.f380889o);
        sb8.append(" self_wait_song_size: ");
        sb8.append(mx1Var.f380887m);
        sb8.append(" guide: ");
        r45.fw1 fw1Var2 = mx1Var.f380890p;
        sb8.append((fw1Var2 == null || (list = fw1Var2.getList(0)) == null) ? null : (r45.gw1) kz5.n0.Z(list));
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", sb8.toString());
        ((om2.g) d3Var.business(om2.g.class)).Y6("modCgi_" + i17, mx1Var.f380887m, mx1Var.f380889o);
    }

    public static /* synthetic */ java.lang.Object i7(sf2.d3 d3Var, com.tencent.mm.protobuf.g gVar, boolean z17, java.lang.String str, java.lang.Integer num, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar2 = (i17 & 1) != 0 ? null : gVar;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return d3Var.h7(gVar2, z17, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : num, continuation);
    }

    public static /* synthetic */ java.lang.Object l7(sf2.d3 d3Var, int i17, int i18, boolean z17, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 1;
        }
        if ((i19 & 4) != 0) {
            z17 = false;
        }
        return d3Var.k7(i17, i18, z17, continuation);
    }

    public static /* synthetic */ java.lang.Object p7(sf2.d3 d3Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, r45.dy1 dy1Var, sf2.x1 x1Var, kotlin.coroutines.Continuation continuation, int i18, java.lang.Object obj) {
        return d3Var.n7(i17, str, (i18 & 4) != 0 ? "" : str2, (i18 & 8) != 0 ? null : str3, (i18 & 16) != 0 ? false : z17, (i18 & 32) != 0 ? null : dy1Var, (i18 & 64) != 0 ? null : x1Var, continuation);
    }

    @Override // mf2.c
    public void U0() {
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", "enterTRTCState: checking audition state");
        f7().m();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(int r20, r45.nx1 r21, boolean r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.a7(int, r45.nx1, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int b7() {
        if (zl2.r4.f473950a.w1()) {
            return 1;
        }
        mm2.n0 n0Var = (mm2.n0) business(mm2.n0.class);
        return n0Var != null && n0Var.f329273r ? 16 : 2;
    }

    public final void c7() {
        java.lang.String str;
        fn2.s1 s1Var = this.f407103m;
        if (s1Var != null) {
            com.tencent.mm.plugin.finder.live.widget.x0.i(s1Var, false, 1, null);
        }
        this.f407103m = null;
        nm2.a aVar = (nm2.a) ((kotlinx.coroutines.flow.h3) g7()).getValue();
        if (aVar == null || (str = aVar.b()) == null) {
            str = "";
        }
        nm2.a aVar2 = (nm2.a) ((kotlinx.coroutines.flow.h3) g7()).getValue();
        boolean d17 = aVar2 != null ? aVar2.d() : false;
        if (str.length() > 0) {
            x7(str, d17, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(hn2.d r18, r45.mx1 r19, yz5.a r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.d7(hn2.d, r45.mx1, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String e7(java.lang.String str) {
        if (str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.util.UUID.randomUUID());
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            return sb6.toString();
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f407109s;
        java.lang.Object obj = linkedHashMap.get(str);
        if (obj == null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(java.util.UUID.randomUUID());
            sb7.append('_');
            sb7.append(java.lang.System.currentTimeMillis());
            obj = sb7.toString();
            linkedHashMap.put(str, obj);
        }
        return (java.lang.String) obj;
    }

    public final sf2.f3 f7() {
        return (sf2.f3) ((jz5.n) this.f407108r).getValue();
    }

    public final kotlinx.coroutines.flow.f3 g7() {
        return ((mm2.j5) business(mm2.j5.class)).f329182g;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h7(com.tencent.mm.protobuf.g r16, boolean r17, java.lang.String r18, java.lang.Integer r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.h7(com.tencent.mm.protobuf.g, boolean, java.lang.String, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k7(int r18, int r19, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.k7(int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7(java.lang.Integer r11, java.lang.Integer r12, com.tencent.mm.protobuf.g r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.m7(java.lang.Integer, java.lang.Integer, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n7(int r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31, r45.dy1 r32, sf2.x1 r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.n7(int, java.lang.String, java.lang.String, java.lang.String, boolean, r45.dy1, sf2.x1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o7(int r16, r45.yx1 r17, boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof sf2.t2
            if (r2 == 0) goto L18
            r2 = r1
            sf2.t2 r2 = (sf2.t2) r2
            int r3 = r2.f407293f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f407293f = r3
            r14 = r15
            goto L1e
        L18:
            sf2.t2 r2 = new sf2.t2
            r14 = r15
            r2.<init>(r15, r1)
        L1e:
            r11 = r2
            java.lang.Object r1 = r11.f407291d
            pz5.a r2 = pz5.a.f359186d
            int r3 = r11.f407293f
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            kotlin.ResultKt.throwOnFailure(r1)
            goto L63
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r5 = r0.f391458d
            java.lang.String r1 = "song_mid"
            kotlin.jvm.internal.o.f(r5, r1)
            java.lang.String r6 = r0.f391459e
            r45.by1 r0 = r0.f391466o
            if (r0 == 0) goto L4e
            r45.ay1 r0 = r0.f371143d
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.f370351e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r7 = r0
            r9 = 0
            r10 = 0
            r12 = 96
            r13 = 0
            r11.f407293f = r4
            r3 = r15
            r4 = r16
            r8 = r18
            java.lang.Object r1 = p7(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r2) goto L63
            return r2
        L63:
            jz5.l r1 = (jz5.l) r1
            java.lang.Object r0 = r1.f302833d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.o7(int, r45.yx1, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", "onLiveEnd");
        c7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", "onViewUnmount");
        c7();
    }

    public final boolean q7(int i17) {
        if (zl2.r4.f473950a.x1()) {
            return true;
        }
        tn0.w0 Q6 = Q6();
        if (Q6 != null && Q6.X()) {
            if (((mm2.c1) business(mm2.c1.class)).f328896v) {
                return true;
            }
            db5.t7.makeText(O6(), O6().getResources().getString(com.tencent.mm.R.string.mka), 0).show();
            return false;
        }
        db5.t7.makeText(O6(), O6().getResources().getString(com.tencent.mm.R.string.dwr), 0).show();
        qo0.b bVar = qo0.b.V3;
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 != -1) {
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", i17);
        }
        X6(bVar, bundle);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r7(hn2.d r11, r45.dy1 r12, boolean r13, r45.gy1 r14, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof sf2.w2
            if (r0 == 0) goto L13
            r0 = r15
            sf2.w2 r0 = (sf2.w2) r0
            int r1 = r0.f407343g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f407343g = r1
            goto L18
        L13:
            sf2.w2 r0 = new sf2.w2
            r0.<init>(r10, r15)
        L18:
            r7 = r0
            java.lang.Object r15 = r7.f407341e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f407343g
            r8 = 0
            r9 = 1
            if (r1 == 0) goto L35
            if (r1 != r9) goto L2d
            java.lang.Object r11 = r7.f407340d
            hn2.d r11 = (hn2.d) r11
            kotlin.ResultKt.throwOnFailure(r15)
            goto L4f
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r2 = r11.f282505a
            if (r2 == 0) goto L59
            r11.f282514j = r9
            java.lang.String r3 = r11.f282506b
            r7.f407340d = r11
            r7.f407343g = r9
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r15 = r1.s7(r2, r3, r4, r5, r6, r7)
            if (r15 != r0) goto L4f
            return r0
        L4f:
            r45.mx1 r15 = (r45.mx1) r15
            if (r15 == 0) goto L56
            r11.f282513i = r9
            return r15
        L56:
            r12 = 0
            r11.f282514j = r12
        L59:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.r7(hn2.d, r45.dy1, boolean, r45.gy1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s7(java.lang.String r15, java.lang.String r16, r45.dy1 r17, boolean r18, r45.gy1 r19, kotlin.coroutines.Continuation r20) {
        /*
            r14 = this;
            r0 = r20
            boolean r1 = r0 instanceof sf2.v2
            if (r1 == 0) goto L16
            r1 = r0
            sf2.v2 r1 = (sf2.v2) r1
            int r2 = r1.f407325f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f407325f = r2
            r13 = r14
            goto L1c
        L16:
            sf2.v2 r1 = new sf2.v2
            r13 = r14
            r1.<init>(r14, r0)
        L1c:
            r10 = r1
            java.lang.Object r0 = r10.f407323d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r10.f407325f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r0)
            goto L56
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = 1
            r5 = 0
            r7 = 0
            sf2.x1 r9 = new sf2.x1
            r2 = r18
            r4 = r19
            r9.<init>(r2, r4)
            r11 = 20
            r12 = 0
            r10.f407325f = r3
            r2 = r14
            r3 = r0
            r4 = r15
            r6 = r16
            r8 = r17
            java.lang.Object r0 = p7(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r1) goto L56
            return r1
        L56:
            jz5.l r0 = (jz5.l) r0
            java.lang.Object r0 = r0.f302833d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.s7(java.lang.String, java.lang.String, r45.dy1, boolean, r45.gy1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t7(java.lang.String r19, com.tencent.mm.protobuf.g r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.t7(java.lang.String, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u7(java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.d3.u7(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void v7(fn2.u1 sourceScene, int i17) {
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        w7(i17, sourceScene, fn2.v1.f264422e, null);
    }

    @Override // mf2.c
    public void w0() {
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", "exitTRTCState: checking audition state");
        f7().m();
    }

    public final void w7(int i17, fn2.u1 u1Var, fn2.v1 v1Var, java.lang.String str) {
        boolean z17;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i18;
        boolean z18;
        android.app.Dialog dialog;
        android.view.Window b17;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior;
        fn2.s1 s1Var = this.f407103m;
        if (s1Var != null && s1Var.u()) {
            if (str == null) {
                com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", "Unified song panel is already showing, switching to tab: " + v1Var.f264425d);
                s1Var.w(v1Var.f264425d);
                return;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", "Unified song panel is showing, but need to locate song: " + str + ", reopening panel");
            com.tencent.mm.plugin.finder.live.widget.x0.i(s1Var, false, 1, null);
            this.f407103m = null;
        }
        fn2.s1 s1Var2 = new fn2.s1(O6(), this, new fn2.t1(i17, u1Var, v1Var, str));
        this.f407103m = s1Var2;
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        s1Var2.C = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        boolean z19 = s1Var2.E;
        jz5.g gVar = s1Var2.f120272z;
        jz5.g gVar2 = s1Var2.f120266t;
        android.content.Context context = s1Var2.f120254e;
        if (!z19) {
            s1Var2.E = true;
            jz5.g gVar3 = s1Var2.f120264r;
            java.lang.Object value = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View findViewById = s1Var2.s().findViewById(com.tencent.mm.R.id.f487352vg1);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            s1Var2.f120258i = (com.google.android.material.tabs.TabLayout) findViewById;
            jz5.g gVar4 = s1Var2.f120262p;
            android.view.View view = (android.view.View) ((jz5.n) gVar4).getValue();
            if (view != null) {
                view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.m0(s1Var2));
            }
            jz5.g gVar5 = s1Var2.f120263q;
            android.view.View view2 = (android.view.View) ((jz5.n) gVar5).getValue();
            if (view2 != null) {
                view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.n0(s1Var2));
            }
            android.view.View view3 = (android.view.View) ((jz5.n) gVar4).getValue();
            jz5.g gVar6 = s1Var2.f120268v;
            jz5.g gVar7 = s1Var2.f120269w;
            if (view3 != null) {
                java.lang.Object value2 = ((jz5.n) gVar7).getValue();
                kotlin.jvm.internal.o.f(value2, "getValue(...)");
                ((android.widget.FrameLayout) value2).addView(view3);
                java.lang.Object value3 = ((jz5.n) gVar6).getValue();
                kotlin.jvm.internal.o.f(value3, "getValue(...)");
                android.view.View view4 = (android.view.View) value3;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = (android.view.View) ((jz5.n) gVar5).getValue();
            if (view5 != null) {
                java.lang.Object value4 = ((jz5.n) s1Var2.f120270x).getValue();
                kotlin.jvm.internal.o.f(value4, "getValue(...)");
                ((android.widget.FrameLayout) value4).addView(view5);
                java.lang.Object value5 = ((jz5.n) s1Var2.f120271y).getValue();
                kotlin.jvm.internal.o.f(value5, "getValue(...)");
                ((android.widget.TextView) value5).setVisibility(8);
            }
            java.lang.Object value6 = ((jz5.n) gVar6).getValue();
            kotlin.jvm.internal.o.f(value6, "getValue(...)");
            ((android.view.View) value6).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.o0(s1Var2));
            zl2.r4 r4Var = zl2.r4.f473950a;
            java.lang.Object value7 = ((jz5.n) gVar7).getValue();
            kotlin.jvm.internal.o.f(value7, "getValue(...)");
            zl2.r4.c3(r4Var, (android.widget.FrameLayout) value7, 0, 0, 6, null);
            java.lang.Object value8 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value8, "getValue(...)");
            ((android.widget.RelativeLayout) value8).setVisibility(0);
            android.view.View view6 = (android.view.View) ((jz5.n) gVar).getValue();
            if (view6 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view7 = (android.view.View) ((jz5.n) gVar).getValue();
            if (view7 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.google.android.material.tabs.TabLayout tabLayout = s1Var2.f120258i;
            if (tabLayout == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            tabLayout.n();
            java.lang.String[] strArr = s1Var2.H;
            for (java.lang.String str2 : strArr) {
                com.google.android.material.tabs.TabLayout tabLayout2 = s1Var2.f120258i;
                if (tabLayout2 == null) {
                    kotlin.jvm.internal.o.o("tabLayout");
                    throw null;
                }
                oa.i l17 = tabLayout2.l();
                l17.e(str2);
                com.google.android.material.tabs.TabLayout tabLayout3 = s1Var2.f120258i;
                if (tabLayout3 == null) {
                    kotlin.jvm.internal.o.o("tabLayout");
                    throw null;
                }
                tabLayout3.b(l17);
            }
            s1Var2.f120259m = new androidx.viewpager.widget.ViewPager(context);
            jz5.g gVar8 = s1Var2.f120267u;
            java.lang.Object value9 = ((jz5.n) gVar8).getValue();
            kotlin.jvm.internal.o.f(value9, "getValue(...)");
            ((android.widget.FrameLayout) value9).addView(s1Var2.t(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            s1Var2.f120261o = new com.tencent.mm.plugin.finder.live.widget.f0(s1Var2);
            s1Var2.t().setAdapter(s1Var2.f120261o);
            s1Var2.t().setOffscreenPageLimit(strArr.length);
            com.google.android.material.tabs.TabLayout tabLayout4 = s1Var2.f120258i;
            if (tabLayout4 == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            tabLayout4.setupWithViewPager(s1Var2.t());
            int length = strArr.length;
            int i19 = 0;
            int i27 = 0;
            while (i19 < length) {
                java.lang.String str3 = strArr[i19];
                int i28 = i27 + 1;
                com.google.android.material.tabs.TabLayout tabLayout5 = s1Var2.f120258i;
                if (tabLayout5 == null) {
                    kotlin.jvm.internal.o.o("tabLayout");
                    throw null;
                }
                oa.i k17 = tabLayout5.k(i27);
                if (k17 != null) {
                    k17.e(str3);
                }
                i19++;
                i27 = i28;
            }
            s1Var2.f120260n = new com.tencent.mm.plugin.finder.live.widget.w0(s1Var2);
            androidx.viewpager.widget.ViewPager t17 = s1Var2.t();
            androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = s1Var2.f120260n;
            if (onPageChangeListener == null) {
                kotlin.jvm.internal.o.o("pageChangeListener");
                throw null;
            }
            t17.addOnPageChangeListener(onPageChangeListener);
            s1Var2.t().post(new fn2.r1(s1Var2));
            java.lang.Object value10 = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value10, "getValue(...)");
            java.lang.Object value11 = ((jz5.n) gVar8).getValue();
            kotlin.jvm.internal.o.f(value11, "getValue(...)");
            ((android.widget.FrameLayout) value11).addView((android.view.View) value10);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_scene", s1Var2.G.f264404b.f264417d);
        zl2.r4 r4Var2 = zl2.r4.f473950a;
        if (r4Var2.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328365n2, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.S2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        com.tencent.mm.plugin.finder.live.widget.x0 r17 = s1Var2.r(null);
        if (r17 != null && r17.u()) {
            s1Var2.B = s1Var2.r(r17);
            r4Var2.Q2(s1Var2.s());
            com.tencent.mm.ui.widget.dialog.y1 y1Var = r17.A;
            if (y1Var != null) {
                y1Var.h(s1Var2);
                return;
            }
            return;
        }
        boolean z27 = s1Var2.D;
        float f17 = s1Var2.f120257h;
        if (z27) {
            z17 = false;
        } else {
            s1Var2.D = true;
            r4Var2.Q2(s1Var2.s());
            boolean z28 = s1Var2.f120255f;
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = new com.tencent.mm.ui.widget.dialog.y1(context, 0, false, z28);
            s1Var2.A = y1Var2;
            y1Var2.k(s1Var2.s());
            y1Var2.p(true);
            y1Var2.f212033o = true;
            if (r4Var2.Y1(context)) {
                y1Var2.m(java.lang.Boolean.TRUE);
                y1Var2.G = true;
            }
            y1Var2.i(true);
            y1Var2.F = true;
            z17 = false;
            y1Var2.f212044z = false;
            y1Var2.n(new com.tencent.mm.plugin.finder.live.widget.k0(s1Var2));
            y1Var2.f212037s = new com.tencent.mm.plugin.finder.live.widget.l0(s1Var2);
            android.view.Window b18 = y1Var2.b();
            if (b18 != null) {
                b18.setSoftInputMode(48);
            }
            android.view.View view8 = y1Var2.f212027f;
            if (view8 != null && (layoutParams = view8.getLayoutParams()) != null) {
                if (!(f17 == -1.0f)) {
                    layoutParams.height = (int) ((com.tencent.mm.ui.bl.b(context).y - com.tencent.mm.ui.bl.c(context)) * f17);
                }
            }
            if (context.getResources().getConfiguration().orientation == 2) {
                int b19 = com.tencent.mm.plugin.finder.view.x7.b(context);
                android.view.ViewGroup.LayoutParams layoutParams2 = y1Var2.f212027f.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = b19;
                    layoutParams2.height = b19 - com.tencent.mm.ui.bl.h(context);
                }
                y1Var2.A = b19;
                if (z28) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = y1Var2.f212027f.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = com.tencent.mm.ui.bl.h(context);
                    }
                }
            }
        }
        java.lang.Object value12 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value12, "getValue(...)");
        if (((android.widget.RelativeLayout) value12).getVisibility() == 0 ? true : z17) {
            java.lang.Object value13 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value13, "getValue(...)");
            i18 = ((android.widget.RelativeLayout) value13).getLayoutParams().height;
        } else {
            i18 = ((android.view.View) ((jz5.n) gVar).getValue()).getLayoutParams().height;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var3 = s1Var2.A;
        if (y1Var3 != null && (bottomSheetBehavior = y1Var3.f212036r) != null) {
            if (!(f17 == -1.0f ? true : z17)) {
                bottomSheetBehavior.C(((int) (com.tencent.mm.ui.bl.b(context).y * f17)) + i18);
            }
            bottomSheetBehavior.D(3);
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var4 = s1Var2.A;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior2 = y1Var4 != null ? y1Var4.f212036r : null;
        if (bottomSheetBehavior2 == null) {
            z18 = true;
        } else {
            z18 = true;
            bottomSheetBehavior2.f44444q = true;
        }
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior3 = y1Var4 != null ? y1Var4.f212036r : null;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.D(3);
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var5 = s1Var2.A;
        if ((y1Var5 == null || y1Var5.f()) ? z17 : z18) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var6 = s1Var2.A;
            if (y1Var6 != null && (b17 = y1Var6.b()) != null) {
                b17.setWindowAnimations(com.tencent.mm.R.style.f494147ff);
            }
            com.tencent.mm.ui.widget.dialog.y1 y1Var7 = s1Var2.A;
            if (y1Var7 != null) {
                y1Var7.s();
            }
            com.tencent.mm.ui.widget.dialog.y1 y1Var8 = s1Var2.A;
            if (y1Var8 == null || (dialog = y1Var8.f212025d) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.view.x7.a(dialog, context);
        }
    }

    public final void x7(java.lang.String songMid, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(songMid, "songMid");
        f7().k(songMid, z17, z18);
    }
}
