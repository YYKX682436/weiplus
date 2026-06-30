package sf2;

/* loaded from: classes10.dex */
public final class x extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f407344m;

    /* renamed from: n, reason: collision with root package name */
    public in2.v0 f407345n;

    /* renamed from: o, reason: collision with root package name */
    public in2.n0 f407346o;

    /* renamed from: p, reason: collision with root package name */
    public gn2.a f407347p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f407348q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f407348q = jz5.h.b(new sf2.b(this));
    }

    @Override // if2.e
    public void T2(boolean z17, int i17) {
        in2.n0 n0Var = this.f407346o;
        if (n0Var != null) {
            n0Var.e0(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z6(r45.ay1 r5, r45.cy1 r6, r45.gy1 r7, r45.dy1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof sf2.a
            if (r0 == 0) goto L13
            r0 = r9
            sf2.a r0 = (sf2.a) r0
            int r1 = r0.f407023g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f407023g = r1
            goto L18
        L13:
            sf2.a r0 = new sf2.a
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f407021e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f407023g
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.f407020d
            sf2.x r5 = (sf2.x) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto La0
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "addSongToNewList: songName="
            r9.<init>(r2)
            java.lang.String r2 = r5.f370351e
            r9.append(r2)
            java.lang.String r2 = ", songMid="
            r9.append(r2)
            java.lang.String r2 = r5.f370350d
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "FinderLiveAnchorMusicSingSongController"
            com.tencent.mars.xlog.Log.i(r2, r9)
            r45.z22 r9 = new r45.z22
            r9.<init>()
            java.lang.String r2 = r5.f370350d
            r9.f391627d = r2
            boolean r2 = r5.f370360q
            r9.f391628e = r2
            r45.by1 r2 = new r45.by1
            r2.<init>()
            r2.f371143d = r5
            r2.f371144e = r6
            if (r7 == 0) goto L70
            r5.f370359p = r7
        L70:
            r9.f391631h = r2
            r45.b32 r5 = new r45.b32
            r5.<init>()
            java.util.LinkedList r6 = r5.f370496d
            r6.add(r9)
            if (r8 == 0) goto L94
            java.lang.String r6 = android.os.Build.BRAND
            r8.f372849i = r6
            tn0.w0 r6 = r4.Q6()
            if (r6 == 0) goto L91
            vn0.e r6 = r6.f420764m
            if (r6 == 0) goto L91
            int r6 = r6.c()
            goto L92
        L91:
            r6 = -1
        L92:
            r8.f372850m = r6
        L94:
            r0.f407020d = r4
            r0.f407023g = r3
            java.lang.Object r9 = r4.u7(r3, r5, r8, r0)
            if (r9 != r1) goto L9f
            return r1
        L9f:
            r5 = r4
        La0:
            sf2.i3 r9 = (sf2.i3) r9
            boolean r6 = r9 instanceof sf2.h3
            if (r6 == 0) goto Ld1
            r6 = r9
            sf2.h3 r6 = (sf2.h3) r6
            r45.rd2 r6 = r6.f407159a
            r7 = 2
            long r7 = r6.getLong(r7)
            java.lang.Class<mm2.m6> r0 = mm2.m6.class
            androidx.lifecycle.c1 r1 = r5.business(r0)
            mm2.m6 r1 = (mm2.m6) r1
            dk2.t r1 = r1.f329249q
            r1.f234086b = r7
            com.tencent.mm.protobuf.f r6 = r6.getCustom(r3)
            r45.z22 r6 = (r45.z22) r6
            if (r6 == 0) goto Ld1
            androidx.lifecycle.c1 r5 = r5.business(r0)
            mm2.m6 r5 = (mm2.m6) r5
            dk2.t r5 = r5.f329249q
            java.util.ArrayList r5 = r5.f234085a
            r5.add(r6)
        Ld1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.x.Z6(r45.ay1, r45.cy1, r45.gy1, r45.dy1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object a7(kotlin.coroutines.Continuation continuation) {
        mm2.m6 m6Var = (mm2.m6) business(mm2.m6.class);
        mm2.j6 j6Var = (mm2.j6) ((kotlinx.coroutines.flow.h3) m6Var.f329251s).getValue();
        boolean z17 = j6Var instanceof mm2.i6;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "cutSongAfterDeleteIfNeeded: not singing");
            return f0Var;
        }
        java.lang.String str = ((mm2.i6) j6Var).f329141a.f391629f;
        java.util.ArrayList arrayList = m6Var.f329249q.f234085a;
        boolean z18 = false;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.o.b(((r45.z22) it.next()).f391629f, str)) {
                    z18 = true;
                    break;
                }
            }
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "cutSongAfterDeleteIfNeeded: song exists, skip it");
            return f0Var;
        }
        r45.z22 P6 = m6Var.P6(null);
        sf2.e1 e1Var = (sf2.e1) controller(sf2.e1.class);
        if (e1Var != null) {
            sf2.e1.m7(e1Var, P6, true, false, true, null, 20, null);
        }
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.x.b7(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c7() {
        if (dk2.ef.f233372a.x()) {
            ll2.e.d(ll2.e.f319133a, "anchorlive.bottom.newmusic.song", false, false, 6, null);
        } else {
            ll2.e.d(ll2.e.f319133a, "startlive.more.newmusic.song", false, false, 6, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(java.lang.Integer r11, java.lang.Integer r12, com.tencent.mm.protobuf.g r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.x.d7(java.lang.Integer, java.lang.Integer, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f7(boolean z17) {
        gk2.e liveRoomData = getStore().getLiveRoomData();
        if (zl2.r4.f473950a.h2(liveRoomData)) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "enableSongListDisplayForNewVersion: already enabled, skip");
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "enableSongListDisplayForNewVersion: calling CGI to enable song list display");
            if (liveRoomData != null) {
                mm2.c1 c1Var = (mm2.c1) liveRoomData.a(mm2.c1.class);
                int i17 = (int) c1Var.f328866q;
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                c1Var.p8(i17 | 32768);
            }
            mm2.e1 e1Var = (mm2.e1) business(mm2.e1.class);
            mm2.c1 c1Var2 = (mm2.c1) business(mm2.c1.class);
            dk2.xf P6 = P6();
            if (P6 != null) {
                dk2.xf.h(P6, e1Var.f328988r.getLong(0), e1Var.f328983m, (int) c1Var2.f328866q, 32768L, 0, new sf2.f(c1Var2, this), 16, null);
            }
        }
        if (z17) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new sf2.j(this, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "handleSongListOnLiveStart: no song list, skip loading");
        }
    }

    public final void g7() {
        kotlinx.coroutines.r2 r2Var = this.f407344m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f407344m = null;
        in2.v0 v0Var = this.f407345n;
        if (v0Var != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(v0Var, false, 1, null);
        }
        in2.n0 n0Var = this.f407346o;
        if (n0Var != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(n0Var, false, 1, null);
        }
    }

    public final boolean h7() {
        return ((mm2.c1) business(mm2.c1.class)).a8();
    }

    public final java.lang.Object i7(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "loadNewSongListSuspend: using new song list CGI, isLiving=" + h7());
        dk2.xf P6 = P6();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (P6 == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "no finder live assistant, cannot load more sing song list data");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        } else {
            ((dk2.r4) P6).P(xy2.c.e(O6()), h7() ? ((mm2.e1) business(mm2.e1.class)).f328983m : 0L, h7() ? ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0) : 0L, h7() ? ((mm2.e1) business(mm2.e1.class)).f328985o : null, ((mm2.m6) business(mm2.m6.class)).f329249q.f234086b, new sf2.k(rVar, this));
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : f0Var;
    }

    public final java.lang.Object k7(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "loadOldSongListSuspend: using old song list CGI");
        dk2.xf P6 = P6();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (P6 == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "no finder live assistant, cannot load more sing song list data");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        } else {
            ((dk2.r4) P6).S(xy2.c.e(O6()), ((mm2.e1) business(mm2.e1.class)).f328983m, new sf2.l(rVar, this));
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l7(java.util.List r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.x.l7(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m7(int i17, r45.ay1 ay1Var, java.lang.String uniquePlayId, long j17) {
        kotlin.jvm.internal.o.g(uniquePlayId, "uniquePlayId");
        boolean h76 = h7();
        java.util.Map l17 = kz5.c1.l(new jz5.l("type", java.lang.String.valueOf(i17)), new jz5.l("style", "1"));
        if (ay1Var != null) {
            java.lang.String song_mid = ay1Var.f370350d;
            kotlin.jvm.internal.o.f(song_mid, "song_mid");
            l17.put("song_id", song_mid);
            java.lang.String song_name = ay1Var.f370351e;
            kotlin.jvm.internal.o.f(song_name, "song_name");
            l17.put("song_name", song_name);
            l17.put("duration", java.lang.String.valueOf(ay1Var.f370354h));
            java.lang.String singer_mid = ay1Var.f370352f;
            kotlin.jvm.internal.o.f(singer_mid, "singer_mid");
            l17.put("singer_mid", singer_mid);
            java.lang.String singer_name = ay1Var.f370353g;
            kotlin.jvm.internal.o.f(singer_name, "singer_name");
            l17.put("singer_name", singer_name);
            if (ay1Var.f370360q) {
                l17.put("part_id", "1");
            }
        }
        if (i17 == 3 || i17 == 4) {
            l17.put("play_duration", java.lang.String.valueOf(j17));
        }
        if (h76) {
            ml2.z4 z4Var = ml2.z4.f328393y2;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, z4Var, new org.json.JSONObject(l17).toString(), null, 4, null);
            return;
        }
        ml2.c1 c1Var = ml2.c1.f327325e;
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.j5((zy2.zb) c18, 74L, new org.json.JSONObject(l17).toString(), null, 4, null);
    }

    public final void n7(boolean z17, ke2.f fVar) {
        if (!h7()) {
            ((mm2.m6) business(mm2.m6.class)).f329245m.postValue(java.lang.Boolean.valueOf(z17));
            q7(z17);
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        java.lang.Object obj = this.f291099e;
        dk2.xf j17 = efVar.j(obj instanceof com.tencent.mm.live.view.BaseLivePluginLayout ? (com.tencent.mm.live.view.BaseLivePluginLayout) obj : null);
        if (j17 != null) {
            dk2.xf.h(j17, ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) business(mm2.e1.class)).f328983m, ((mm2.c1) business(mm2.c1.class)).f328866q, 32768L, 0, fVar, 16, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o7(java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.x.o7(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // if2.e
    public boolean onBackPress() {
        gn2.a aVar = this.f407347p;
        if (!(aVar != null && aVar.l())) {
            return false;
        }
        gn2.a aVar2 = this.f407347p;
        if (aVar2 != null) {
            aVar2.j();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        ((mm2.m6) business(mm2.m6.class)).f329247o.clear();
        dk2.yg c17 = ((mm2.m6) business(mm2.m6.class)).f329241f.c();
        java.lang.Integer num = (java.lang.Integer) ((mm2.m6) business(mm2.m6.class)).f329241f.f234052a.getValue();
        if (c17 == null || num == null) {
            return;
        }
        t7(c17);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        ((mm2.m6) business(mm2.m6.class)).f329244i.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new sf2.m(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        kotlinx.coroutines.r2 r2Var = this.f407344m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f407344m = null;
        g7();
        this.f407347p = null;
        this.f407345n = null;
        this.f407346o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p7(java.lang.String r13, com.tencent.mm.protobuf.g r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.x.p7(java.lang.String, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void q7(boolean z17) {
        if (z17) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            gk2.e liveRoomData = getStore().getLiveRoomData();
            if (liveRoomData != null) {
                mm2.c1 c1Var = (mm2.c1) liveRoomData.a(mm2.c1.class);
                int i17 = (int) c1Var.f328866q;
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                c1Var.p8(i17 | 32768);
            }
        } else {
            zl2.r4 r4Var2 = zl2.r4.f473950a;
            gk2.e liveRoomData2 = getStore().getLiveRoomData();
            if (liveRoomData2 != null) {
                mm2.c1 c1Var2 = (mm2.c1) liveRoomData2.a(mm2.c1.class);
                int i18 = (int) c1Var2.f328866q;
                java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                c1Var2.p8(i18 & (-32769));
            }
        }
        gn2.a aVar = this.f407347p;
        if (aVar != null) {
            aVar.o(z17);
        }
    }

    public final void r7() {
        g7();
        gn2.a aVar = this.f407347p;
        if (aVar != null) {
            aVar.j();
        }
        this.f407345n = new in2.v0(O6(), getStore().getLiveRoomData(), this);
        this.f407346o = new in2.n0(O6(), getStore().getLiveRoomData(), this);
        this.f407347p = new in2.s(O6(), getStore().getLiveRoomData(), this);
        kotlinx.coroutines.r2 r2Var = this.f407344m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f407344m = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new sf2.u(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s7(boolean r10) {
        /*
            r9 = this;
            java.lang.String r0 = "FinderLiveAnchorMusicSingSongController"
            java.lang.String r1 = "initView"
            com.tencent.mars.xlog.Log.i(r0, r1)
            gn2.a r1 = r9.f407347p
            if (r1 == 0) goto L18
            boolean r2 = r1 instanceof jn2.r1
            if (r2 == 0) goto L15
            java.lang.String r1 = "initView: no change"
            com.tencent.mars.xlog.Log.i(r0, r1)
            goto L66
        L15:
            r1.j()
        L18:
            in2.v0 r1 = new in2.v0
            android.content.Context r2 = r9.O6()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = r9.getStore()
            gk2.e r3 = r3.getLiveRoomData()
            r1.<init>(r2, r3, r9)
            r9.f407345n = r1
            in2.n0 r1 = new in2.n0
            android.content.Context r2 = r9.O6()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = r9.getStore()
            gk2.e r3 = r3.getLiveRoomData()
            r1.<init>(r2, r3, r9)
            r9.f407346o = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "initWidget - isLiving: "
            r1.<init>(r2)
            boolean r2 = r9.h7()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            jn2.r1 r0 = new jn2.r1
            android.content.Context r1 = r9.O6()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r2 = r9.getStore()
            gk2.e r2 = r2.getLiveRoomData()
            r0.<init>(r1, r2, r9)
            r9.f407347p = r0
        L66:
            kotlinx.coroutines.r2 r0 = r9.f407344m
            r1 = 0
            if (r0 == 0) goto L6f
            r2 = 1
            kotlinx.coroutines.p2.a(r0, r1, r2, r1)
        L6f:
            r4 = 0
            r5 = 0
            sf2.v r6 = new sf2.v
            r6.<init>(r10, r9, r1)
            r7 = 3
            r8 = 0
            r3 = r9
            kotlinx.coroutines.r2 r10 = com.tencent.mm.plugin.finder.live.util.y.o(r3, r4, r5, r6, r7, r8)
            r9.f407344m = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.x.s7(boolean):void");
    }

    public final void t7(dk2.yg musicItem) {
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        dk2.s sVar = ((mm2.m6) business(mm2.m6.class)).f329241f;
        androidx.lifecycle.j0 j0Var = sVar.f234052a;
        try {
            if (musicItem.f234395c != 3) {
                musicItem.f234395c = 3;
                musicItem.f234398f = true;
                musicItem.f234400h = "";
                j0Var.postValue(-1);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveAnchorMusicData stopSongItem");
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "stopSongItem " + musicItem + " songId size:" + sVar.f234053b.size() + ", curPlayPos:" + j0Var);
        xl2.d.a(xl2.d.f455115a, O6(), musicItem.f234393a, 2, ((mm2.e1) business(mm2.e1.class)).f328983m, ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), ((mm2.c1) business(mm2.c1.class)).f328852o, null, 64, null);
    }

    public final java.lang.Object u7(int i17, r45.b32 b32Var, r45.dy1 dy1Var, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        dk2.xf P6 = P6();
        if (P6 == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "updateSongList: no finder live assistant");
            rVar.resumeWith(kotlin.Result.m521constructorimpl(new sf2.g3(-1, "no finder live assistant")));
        } else {
            long j17 = h7() ? ((mm2.e1) business(mm2.e1.class)).f328983m : 0L;
            long j18 = h7() ? ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0) : 0L;
            dk2.r4 r4Var = (dk2.r4) P6;
            pq5.g l17 = new ek2.r2(xy2.c.e(O6()), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), h7() ? ((mm2.e1) business(mm2.e1.class)).f328985o : null, i17, b32Var, dy1Var, new sf2.w(rVar, i17)).l();
            if (r4Var.M() != null && (r4Var.M() instanceof com.tencent.mm.ui.MMActivity)) {
                android.content.Context M = r4Var.M();
                kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) M);
            }
        }
        java.lang.Object j19 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j19;
    }
}
