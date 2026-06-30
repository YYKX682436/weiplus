package fo5;

/* loaded from: classes14.dex */
public final class q2 implements jp5.o {

    /* renamed from: d, reason: collision with root package name */
    public static final fo5.q2 f265071d = new fo5.q2();

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f265072e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f265073f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f265074g;

    /* renamed from: h, reason: collision with root package name */
    public static pi0.n1 f265075h;

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.voipmp.LifeCycledFrameLayout f265076i;

    /* renamed from: m, reason: collision with root package name */
    public static android.content.Intent f265077m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.voipmp.v2.VoIPMPLauncher$smallViewObserver$1 f265078n;

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f265079o;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f265080p;

    /* JADX WARN: Type inference failed for: r0v9, types: [com.tencent.mm.voipmp.v2.VoIPMPLauncher$smallViewObserver$1] */
    static {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        f265072e = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        f265073f = jz5.h.b(fo5.v1.f265132d);
        f265074g = jz5.h.b(fo5.t1.f265119d);
        f265078n = new androidx.lifecycle.v() { // from class: com.tencent.mm.voipmp.v2.VoIPMPLauncher$smallViewObserver$1

            /* renamed from: d, reason: collision with root package name */
            public final jz5.g f213780d = jz5.h.b(fo5.o2.f265053d);

            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                android.os.PowerManager.WakeLock wakeLock;
                androidx.lifecycle.o oVar;
                kotlin.jvm.internal.o.g(source, "source");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "on Ilink voip small view state changed " + event);
                androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_PAUSE;
                jz5.g gVar = this.f213780d;
                if (mVar != event) {
                    if (androidx.lifecycle.m.ON_RESUME != event || (wakeLock = (android.os.PowerManager.WakeLock) ((jz5.n) gVar).getValue()) == null) {
                        return;
                    }
                    yj0.a.c(wakeLock, "com/tencent/mm/voipmp/v2/VoIPMPLauncher$smallViewObserver$1", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    wakeLock.acquire();
                    yj0.a.f(wakeLock, "com/tencent/mm/voipmp/v2/VoIPMPLauncher$smallViewObserver$1", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    return;
                }
                android.os.PowerManager.WakeLock wakeLock2 = (android.os.PowerManager.WakeLock) ((jz5.n) gVar).getValue();
                if (wakeLock2 != null) {
                    yj0.a.c(wakeLock2, "com/tencent/mm/voipmp/v2/VoIPMPLauncher$smallViewObserver$1", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    yj0.a.f(wakeLock2, "com/tencent/mm/voipmp/v2/VoIPMPLauncher$smallViewObserver$1", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
                pi0.n1 n1Var = fo5.q2.f265075h;
                if (n1Var == null || (oVar = n1Var.f354678e) == null) {
                    return;
                }
                oVar.c(this);
            }
        };
        f265079o = jz5.h.b(fo5.p2.f265066d);
        f265080p = jz5.h.b(fo5.u1.f265122d);
    }

    public static final java.lang.Object b(fo5.q2 q2Var, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        q2Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(z17 ? "callee" : "caller");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoIPMP.Launcher", "createFlutterInstance, currentUsername:" + sb6.toString(), new java.lang.Object[0]);
        java.lang.Object a17 = q2Var.c().a(q2Var, new fo5.z0(), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    @Override // jp5.o
    public void A2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "closeReceiverBanner");
        fo5.r0 f17 = f();
        if (f17 != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.t(f17, null), 3, null);
        }
    }

    @Override // jp5.o
    public void Ad(android.app.Activity activity, yz5.l callback) {
        android.app.Activity activity2;
        kotlin.jvm.internal.o.g(callback, "callback");
        fo5.r0 f17 = f();
        f17.getClass();
        java.lang.ref.WeakReference weakReference = f17.f265094m;
        if (weakReference != null && (activity2 = (android.app.Activity) weakReference.get()) != null) {
            activity = activity2;
        }
        if (activity != null) {
            ((androidx.fragment.app.FragmentActivity) activity).getActivityResultRegistry().e("MicroMsg.VoIPMP.CoreV2", new eo5.b(), new fo5.w(callback)).a("", null);
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("launchFileSelectPage fail, activity is null")))));
        }
    }

    @Override // jp5.o
    public boolean B1() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            return f17.k();
        }
        return true;
    }

    @Override // jp5.o
    public boolean Bh() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            return f17.f265095n.f320216c.f301233b;
        }
        return false;
    }

    @Override // jp5.o
    public void Ee() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            f17.s();
        }
    }

    @Override // jp5.o
    public void Gi(java.lang.String username, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        fo5.r0 f17 = f();
        if (f17 != null) {
            f17.f265093l.getClass();
            if (nq4.f.f339014a.b() && !nq4.f.f339019f) {
                java.lang.String b17 = nq4.e.f339008a.b();
                if (java.lang.Boolean.valueOf(!(b17 == null || b17.length() == 0) && (kotlin.jvm.internal.o.b(b17, "zh_CN") || kotlin.jvm.internal.o.b(b17, "zh_TW") || kotlin.jvm.internal.o.b(b17, "zh_HK") || kotlin.jvm.internal.o.b(b17, "en"))).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "use bluetooth quick connect, block ring");
                    return;
                }
            }
            f17.f265102u = true;
            gp5.e eVar = f17.f265089h;
            boolean a17 = f17.f265088g.a(z17, false);
            eVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRingtoneController", "startRingWithFloatCard() called with: username = " + username + ", videoCall = " + z17 + ", outCall = false");
            if (eVar.f274464e) {
                return;
            }
            eVar.a(username, z17, false, qo5.b.f365666d, a17);
        }
    }

    @Override // jp5.o
    public boolean H0() {
        fo5.r0 f17 = f();
        if (f17 == null) {
            return false;
        }
        ro5.b bVar = f17.f265097p;
        if (bVar != null) {
            return bVar.H0();
        }
        kotlin.jvm.internal.o.o("renderController");
        throw null;
    }

    @Override // jp5.o
    public void Hd() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            f17.u();
        }
    }

    @Override // jp5.o
    public void Hh(int i17) {
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.f2(i17, null), 3, null);
    }

    @Override // jp5.o
    public void I6(int i17) {
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.x1(i17, null), 3, null);
    }

    @Override // jp5.o
    public void Jh(java.lang.String createUser, java.util.ArrayList inviteUser, java.lang.String groupID) {
        kotlin.jvm.internal.o.g(createUser, "createUser");
        kotlin.jvm.internal.o.g(inviteUser, "inviteUser");
        kotlin.jvm.internal.o.g(groupID, "groupID");
        i();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "launhc voip " + createUser + " and " + inviteUser + " and " + groupID);
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.i1(createUser, null), 3, null);
        com.tencent.mm.plugin.voipmp.platform.v0 v0Var = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
        v0Var.j(h(), fo5.j1.f265006a);
        v0Var.g(createUser, inviteUser, false, groupID, (long) co5.i.f43839a.a(), true, fo5.k1.f265012a);
    }

    @Override // jp5.o
    public void K8() {
        if (f() != null) {
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.v(fo5.b0.f264956a);
        }
    }

    @Override // jp5.o
    public void L5(android.content.Context context, int i17, er4.r roomType, long j17, long j18, java.lang.String username, java.util.ArrayList arrayList, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(roomType, "roomType");
        kotlin.jvm.internal.o.g(username, "username");
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.p1(username, z17, context, roomType, i17, j18, j17, arrayList, null), 3, null);
    }

    @Override // jp5.o
    public void M0() {
        qo5.b.f365663a.c(true);
    }

    @Override // jp5.o
    public void N5(boolean z17) {
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.h2(z17, null), 3, null);
    }

    @Override // jp5.o
    public android.app.Activity P9() {
        return f().o();
    }

    @Override // jp5.o
    public java.lang.Object Pi(kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    @Override // jp5.o
    public void Qb() {
        fo5.r0 f17 = f();
        if (f17 == null || f17.I == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "checkUnLaunchInComingCard, hasAttachEngine:" + f17.f265100s + ", handlerSubCallParam:" + f17.f265082J);
        if (f17.f265100s && !f17.f265082J) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMP.CoreV2", "skip handle execution due to engine attached");
            f17.e(f17.f265083b, f17.f265084c == er4.q.MP_ROOM_ROLE_CALLER);
            f17.I = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "delay launch incoming card due to resume");
            yz5.a aVar = f17.I;
            if (aVar != null) {
            }
            f17.I = null;
            f17.f265082J = false;
        }
    }

    @Override // jp5.o
    public void S5(byte[] imageData, int i17, int i18) {
        kotlin.jvm.internal.o.g(imageData, "imageData");
        fo5.r0 f17 = f();
        f17.getClass();
        ro5.b bVar = f17.f265097p;
        if (bVar != null) {
            bVar.v(imageData, i17, i18);
        } else {
            kotlin.jvm.internal.o.o("renderController");
            throw null;
        }
    }

    @Override // jp5.o
    public boolean Sd() {
        er4.l lVar = f().f265087f;
        return (lVar != null && lVar != er4.l.MAIN_UI_CALL_END) && f().k();
    }

    @Override // jp5.o
    public void Te(boolean z17) {
        qo5.b.f365664b = z17;
    }

    @Override // jp5.o
    public void W2(int i17) {
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.z1(i17, null), 3, null);
    }

    @Override // jp5.o
    public void W6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "switchAudioPlayerMute " + z17);
        fo5.r0 f17 = f();
        if (f17 != null && j65.e.b() && j65.e.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "switchAudioPlayerMute " + z17);
            go5.x xVar = f17.f265088g;
            xVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.VoIPMPAudioController", "switchAudioPlayerMute " + z17);
            xVar.f274155g = z17;
            ((go5.c0) xVar.d()).f274126c = z17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jp5.o
    public void Z4(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        final fo5.r0 f17 = f();
        if (f17 != null) {
            f17.f265094m = new java.lang.ref.WeakReference(binding.getActivity());
            final android.app.Activity o17 = f17.o();
            if (o17 != 0) {
                o17.getIntent();
                androidx.lifecycle.y yVar = o17 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) o17 : null;
                if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
                    mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.voipmp.v2.VoIPMPCoreV2$onActivityInit$1

                        /* renamed from: d, reason: collision with root package name */
                        public boolean f213777d;

                        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
                        public final void onCreate() {
                            this.f213777d = true;
                        }

                        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                        public final void onDestroy() {
                            this.f213777d = false;
                            fo5.r0.this.K = false;
                        }

                        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
                        public final void onPause() {
                            iq4.b.f293798a.z();
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
                        
                            if ((r1 != null && r1 == er4.l.MAIN_UI_INVITING) != false) goto L33;
                         */
                        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onResume() {
                            /*
                                r12 = this;
                                java.lang.String r0 = "MicroMsg.VoIPMP.CoreV2"
                                java.lang.String r1 = "onResume"
                                com.tencent.mars.xlog.Log.i(r0, r1)
                                fo5.r0 r1 = fo5.r0.this
                                er4.l r2 = r1.f265087f
                                r3 = 1
                                r4 = 0
                                if (r2 == 0) goto L15
                                er4.l r5 = er4.l.MAIN_UI_CALL_END
                                if (r2 == r5) goto L15
                                r2 = r3
                                goto L16
                            L15:
                                r2 = r4
                            L16:
                                if (r2 != 0) goto L23
                                java.lang.String r1 = "already end"
                                com.tencent.mars.xlog.Log.e(r0, r1)
                                android.app.Activity r0 = r2
                                r0.finish()
                                return
                            L23:
                                r1.K = r3
                                java.lang.Class<jp5.o> r0 = jp5.o.class
                                i95.m r1 = i95.n0.c(r0)
                                jp5.o r1 = (jp5.o) r1
                                r1.M0()
                                fo5.r0 r1 = fo5.r0.this
                                er4.r r2 = r1.f265083b
                                er4.r r5 = er4.r.MP_ROOM_TYPE_VIDEO
                                r6 = 0
                                if (r2 != r5) goto L47
                                ro5.b r1 = r1.f265097p
                                if (r1 == 0) goto L41
                                r1.a()
                                goto L47
                            L41:
                                java.lang.String r0 = "renderController"
                                kotlin.jvm.internal.o.o(r0)
                                throw r6
                            L47:
                                i95.m r1 = i95.n0.c(r0)
                                jp5.o r1 = (jp5.o) r1
                                boolean r1 = r1.a5()
                                if (r1 == 0) goto L65
                                android.app.Activity r1 = r2
                                i95.m r2 = i95.n0.c(r0)
                                java.lang.String r7 = "getService(...)"
                                kotlin.jvm.internal.o.f(r2, r7)
                                jp5.o r2 = (jp5.o) r2
                                r7 = 2
                                jp5.o.R3(r2, r1, r4, r7, r6)
                                goto L74
                            L65:
                                boolean r1 = r12.f213777d
                                if (r1 == 0) goto L74
                                android.app.Activity r1 = r2
                                i95.m r2 = i95.n0.c(r0)
                                jp5.o r2 = (jp5.o) r2
                                r2.ph(r1, r4)
                            L74:
                                fo5.r0 r1 = fo5.r0.this
                                boolean r1 = r1.r()
                                if (r1 != 0) goto L8b
                                fo5.r0 r1 = fo5.r0.this
                                er4.l r1 = r1.f265087f
                                if (r1 == 0) goto L88
                                er4.l r2 = er4.l.MAIN_UI_INVITING
                                if (r1 != r2) goto L88
                                r1 = r3
                                goto L89
                            L88:
                                r1 = r4
                            L89:
                                if (r1 == 0) goto Lbf
                            L8b:
                                fo5.r0 r1 = fo5.r0.this
                                r1.f265102u = r3
                                fo5.r0 r1 = fo5.r0.this
                                gp5.e r7 = r1.f265089h
                                long r8 = qo5.b.f365666d
                                go5.x r2 = r1.f265088g
                                er4.r r6 = r1.f265083b
                                if (r6 != r5) goto L9d
                                r5 = r3
                                goto L9e
                            L9d:
                                r5 = r4
                            L9e:
                                er4.q r1 = r1.f265084c
                                er4.q r6 = er4.q.MP_ROOM_ROLE_CALLER
                                if (r1 != r6) goto La5
                                goto La6
                            La5:
                                r3 = r4
                            La6:
                                boolean r10 = r2.a(r5, r3)
                                r7.getClass()
                                kotlinx.coroutines.y0 r1 = kotlinx.coroutines.z0.b()
                                r2 = 0
                                r3 = 0
                                gp5.d r4 = new gp5.d
                                r11 = 0
                                r6 = r4
                                r6.<init>(r7, r8, r10, r11)
                                r5 = 3
                                r6 = 0
                                kotlinx.coroutines.l.d(r1, r2, r3, r4, r5, r6)
                            Lbf:
                                i95.m r0 = i95.n0.c(r0)
                                jp5.o r0 = (jp5.o) r0
                                r0.je()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.voipmp.v2.VoIPMPCoreV2$onActivityInit$1.onResume():void");
                        }
                    });
                }
            }
        }
        f265077m = binding.getActivity().getIntent();
    }

    @Override // jp5.o
    public boolean a5() {
        return f265076i != null;
    }

    public final fo5.x0 c() {
        return (fo5.x0) ((jz5.n) f265074g).getValue();
    }

    @Override // jp5.o
    public void cb() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "rejectByShortCut");
            if (f17.p()) {
                f17.B = true;
                if (f17.f265107z) {
                    if (f17.f265104w >= 4) {
                        long j17 = f17.f265105x;
                        long j18 = f17.f265106y;
                        long j19 = f17.f265083b.f256166d;
                        boolean a17 = f17.a();
                        boolean z17 = f17.B;
                        boolean z18 = f17.f265107z;
                        com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                        voIPShortcutAnswerReportStruct.f61673d = j17;
                        voIPShortcutAnswerReportStruct.f61674e = j18;
                        voIPShortcutAnswerReportStruct.f61675f = (int) j19;
                        voIPShortcutAnswerReportStruct.f61676g = a17 ? 1 : 0;
                        voIPShortcutAnswerReportStruct.f61677h = z17 ? 1 : 0;
                        voIPShortcutAnswerReportStruct.f61678i = z18 ? 6 : 1;
                        voIPShortcutAnswerReportStruct.o();
                        voIPShortcutAnswerReportStruct.k();
                    } else {
                        long j27 = f17.f265105x;
                        long j28 = f17.f265106y;
                        long j29 = f17.f265083b.f256166d;
                        boolean a18 = f17.a();
                        boolean z19 = f17.B;
                        com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                        voIPShortcutAnswerReportStruct2.f61673d = j27;
                        voIPShortcutAnswerReportStruct2.f61674e = j28;
                        voIPShortcutAnswerReportStruct2.f61675f = (int) j29;
                        voIPShortcutAnswerReportStruct2.f61676g = a18 ? 1 : 0;
                        voIPShortcutAnswerReportStruct2.f61677h = z19 ? 1 : 0;
                        voIPShortcutAnswerReportStruct2.f61678i = 5;
                        voIPShortcutAnswerReportStruct2.o();
                        voIPShortcutAnswerReportStruct2.k();
                    }
                } else if (f17.f265104w >= 4) {
                    long j37 = f17.f265105x;
                    long j38 = f17.f265106y;
                    long j39 = f17.f265083b.f256166d;
                    boolean a19 = f17.a();
                    boolean z27 = f17.B;
                    boolean z28 = f17.f265107z;
                    com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                    voIPShortcutAnswerReportStruct3.f61673d = j37;
                    voIPShortcutAnswerReportStruct3.f61674e = j38;
                    voIPShortcutAnswerReportStruct3.f61675f = (int) j39;
                    voIPShortcutAnswerReportStruct3.f61676g = a19 ? 1 : 0;
                    voIPShortcutAnswerReportStruct3.f61677h = z27 ? 1 : 0;
                    voIPShortcutAnswerReportStruct3.f61678i = z28 ? 6 : 1;
                    voIPShortcutAnswerReportStruct3.o();
                    voIPShortcutAnswerReportStruct3.k();
                } else {
                    long j47 = f17.f265105x;
                    long j48 = f17.f265106y;
                    long j49 = f17.f265083b.f256166d;
                    boolean a27 = f17.a();
                    boolean z29 = f17.B;
                    com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                    voIPShortcutAnswerReportStruct4.f61673d = j47;
                    voIPShortcutAnswerReportStruct4.f61674e = j48;
                    voIPShortcutAnswerReportStruct4.f61675f = (int) j49;
                    voIPShortcutAnswerReportStruct4.f61676g = a27 ? 1 : 0;
                    voIPShortcutAnswerReportStruct4.f61677h = z29 ? 1 : 0;
                    voIPShortcutAnswerReportStruct4.f61678i = 2;
                    voIPShortcutAnswerReportStruct4.o();
                    voIPShortcutAnswerReportStruct4.k();
                }
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.n0(f17, null), 3, null);
        }
    }

    @Override // jp5.o
    public void e9(java.lang.String msgSubType, java.lang.String newxmlMsg, long j17, java.lang.String username, er4.b notifyFrom) {
        kotlin.jvm.internal.o.g(msgSubType, "msgSubType");
        kotlin.jvm.internal.o.g(newxmlMsg, "newxmlMsg");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(notifyFrom, "notifyFrom");
        i();
        com.tencent.mm.plugin.voipmp.platform.v0 v0Var = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
        v0Var.j(h(), fo5.c2.f264964a);
        v0Var.z(newxmlMsg, msgSubType, j17, username, notifyFrom, fo5.d2.f264969a);
    }

    public final fo5.r0 f() {
        return (fo5.r0) f265073f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    @Override // jp5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fa(java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.q2.fa(java.lang.String, boolean):boolean");
    }

    @Override // jp5.o
    public boolean g3() {
        return a5() || f().K || f().f265095n.f320216c.f301233b;
    }

    @Override // jp5.o
    public void gf() {
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.n2(null), 3, null);
    }

    public final er4.x h() {
        er4.i iVar = er4.i.MP_UNKOWN;
        com.tencent.mm.storage.z3 g17 = c01.z1.g();
        boolean z17 = false;
        int i17 = g17 != null ? g17.I : 0;
        if (i17 == 1) {
            iVar = er4.i.MP_MALE;
        } else if (i17 == 2) {
            iVar = er4.i.MP_FEMALE;
        }
        er4.x xVar = new er4.x();
        xVar.f256198f = c01.z1.c();
        boolean[] zArr = xVar.f256202m;
        zArr[3] = true;
        xVar.f256199g = iVar;
        zArr[4] = true;
        xVar.f256196d = c01.z1.r();
        zArr[1] = true;
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String r17 = c01.z1.r();
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        xVar.f256197e = com.tencent.mm.modelavatar.g.c(r17, true, false);
        zArr[2] = true;
        if (com.tencent.mm.storage.z3.m4(c01.z1.g().d1()) && c01.z1.g().I1 != 0) {
            z17 = true;
        }
        xVar.f256200h = z17;
        zArr[5] = true;
        return xVar;
    }

    public final void i() {
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        fo5.r0 service = f();
        kotlin.jvm.internal.o.g(service, "service");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipmpCoreServiceCenter", "bindcoreservice");
        if (fo5.f3.f264986c == null) {
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.i();
        }
        fo5.f3.f264986c = service;
        com.tencent.mars.xlog.Log.i("voipmp.systemauth", "VoIPMPSystemAuthNativeServiceAndroid launchOnAccountInitialized ...");
        com.tencent.mm.plugin.voipmp.platform.i1.f177272a = co5.x.f43897a;
        com.tencent.mm.plugin.voipmp.platform.a1.f177222a = co5.y.f43898a;
        jz5.g gVar = co5.v.f43887j;
        ((co5.v) ((jz5.n) co5.v.f43887j).getValue()).getClass();
        kotlin.jvm.internal.o.f(com.tencent.mm.plugin.vqm.a.f177293b, "getInstance(...)");
        com.tencent.mm.plugin.voipmp.platform.v0 v0Var = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
        v0Var.k();
        if (((java.lang.Boolean) ((jz5.n) f265079o).getValue()).booleanValue()) {
            com.tencent.mm.plugin.voipmp.platform.f1.f177253a = fo5.b1.f264957a;
            com.tencent.mm.plugin.voipmp.platform.d1.f177238a = fo5.c1.f264963a;
            com.tencent.mm.plugin.voipmp.platform.e1.f177247a = fo5.d1.f264968a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jo5.i.f300950f = context.getApplicationContext();
            p05.a3 a3Var = p05.a3.f350439a;
            a3Var.a();
            java.lang.String str = p05.a3.f350443e;
            boolean a17 = vq4.b0.f439270a.a();
            boolean d17 = vq4.b0.d();
            com.tencent.mm.plugin.voipmp.platform.f fVar = !a17 ? com.tencent.mm.plugin.voipmp.platform.f.VoIPMPDeviceLevelVeryLowEnd : d17 ? com.tencent.mm.plugin.voipmp.platform.f.VoIPMPDeviceLevelHighEnd : com.tencent.mm.plugin.voipmp.platform.f.VoIPMPDeviceLevelLowEnd;
            java.lang.String f17 = a3Var.f(d17 ? rh0.z.f395611e : rh0.z.f395611e);
            if (f17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.Launcher", "VoIP settings unavailable, there will be no beauty");
            }
            if (f17 == null) {
                f17 = "";
            }
            v0Var.H(str, f17, fVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "blackscreen: initVoIPMPService: " + this + ", " + f());
    }

    @Override // jp5.o
    public boolean ib() {
        return ((java.lang.Boolean) ((jz5.n) f265080p).getValue()).booleanValue();
    }

    @Override // jp5.o
    public boolean ie() {
        er4.l lVar;
        fo5.r0 f17 = f();
        return (f17 == null || (lVar = f17.f265087f) == null || lVar == er4.l.MAIN_UI_CALL_END) ? false : true;
    }

    @Override // jp5.o
    public void j() {
        com.tencent.mars.xlog.Log.i("vqm", "release account ...");
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.F();
        jz5.g gVar = co5.v.f43887j;
        co5.v vVar = (co5.v) ((jz5.n) co5.v.f43887j).getValue();
        vVar.getClass();
        com.tencent.mars.xlog.Log.i("vqm", "VQMManager end ...");
        if (!com.tencent.mm.plugin.vqm.b.f177316b.a()) {
            com.tencent.mars.xlog.Log.i("vqm", "it is not enable!");
            return;
        }
        com.tencent.mm.plugin.vqm.a aVar = com.tencent.mm.plugin.vqm.a.f177293b;
        kotlin.jvm.internal.o.f(aVar, "getInstance(...)");
        aVar.c();
        vVar.f43890c = 0L;
        vVar.f43891d = 0L;
        vVar.f43892e = 0L;
        vVar.f43893f = 0L;
        vVar.f43894g = 0L;
        vVar.f43895h = 0L;
        vVar.f43896i = 0L;
    }

    @Override // jp5.o
    public boolean jb(java.lang.String groupname) {
        kotlin.jvm.internal.o.g(groupname, "groupname");
        if (ie()) {
            return false;
        }
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.n(groupname, fo5.f1.f264982a);
        return true;
    }

    @Override // jp5.o
    public void je() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "dismissSmallWindow: ");
        com.tencent.mm.voipmp.LifeCycledFrameLayout lifeCycledFrameLayout = f265076i;
        if (lifeCycledFrameLayout != null) {
            iq4.b.f293798a.f0(lifeCycledFrameLayout);
        }
        f265076i = null;
        pi0.n1 n1Var = f265075h;
        if (n1Var != null) {
            n1Var.a();
        }
        f265075h = null;
    }

    @Override // jp5.o
    public boolean lh() {
        er4.l lVar = f().f265087f;
        return (lVar != null && lVar == er4.l.MAIN_UI_TALKING) && f().k();
    }

    @Override // jp5.o
    public void m4(com.tencent.pigeon.voipmp.VoIPMPSelectFileResult result, boolean z17, android.app.Activity activity) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "launchPreViewPage: filePath=" + result.getFilePath() + ", fileExt=" + result.getFileExt());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String filePath = result.getFilePath();
        if (filePath == null) {
            filePath = "";
        }
        linkedHashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, filePath);
        java.lang.String fileExt = result.getFileExt();
        if (fileExt == null) {
            fileExt = "";
        }
        linkedHashMap.put("fileExt", fileExt);
        java.lang.String fileName = result.getFileName();
        linkedHashMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, fileName != null ? fileName : "");
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.n1(linkedHashMap, z17, activity, null), 3, null);
    }

    @Override // jp5.o
    public void mc(java.lang.String username, er4.r roomType) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(roomType, "roomType");
        qo5.b bVar = qo5.b.f365663a;
        boolean z17 = true;
        boolean z18 = roomType == er4.r.MP_ROOM_TYPE_VIDEO;
        if (roomType != er4.r.MP_ROOM_TYPE_TRANS_MUTLTI && roomType != er4.r.MP_ROOM_TYPE_MULTI_TALK) {
            z17 = false;
        }
        bVar.d(username, z18, z17, false);
    }

    @Override // jp5.o
    public void mg() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            boolean z17 = f17.f265095n.f320216c.f301233b;
            boolean a57 = ((jp5.o) i95.n0.c(jp5.o.class)).a5();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on resume page, hasInComingCard:");
            sb6.append(f17.I != null);
            sb6.append(", isCardModeShow:");
            sb6.append(z17);
            sb6.append(", isFloatUIVisible:");
            sb6.append(a57);
            sb6.append(", resumingPage:");
            sb6.append(f17.f265099r);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", sb6.toString());
            if (z17 || a57 || f17.f265099r) {
                return;
            }
            i95.m c17 = i95.n0.c(jp5.o.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
            f17.f265099r = true;
        }
    }

    @Override // jp5.o
    public void n2(int i17) {
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.b2(i17, null), 3, null);
    }

    @Override // jp5.o
    public void ph(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.m1(z17, context, null), 3, null);
    }

    @Override // jp5.o
    public void reportIDKey(long j17, long j18, long j19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "reportIDKey() called with: id = " + j17 + ", key = " + j18 + ", value = " + j19);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, false);
    }

    @Override // jp5.o
    public void ti() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "acceptByShortCut");
            if (f17.p()) {
                f17.B = true;
                long j17 = f17.f265105x;
                long j18 = f17.f265106y;
                long j19 = f17.f265083b.f256166d;
                boolean a17 = f17.a();
                boolean z17 = f17.B;
                com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                voIPShortcutAnswerReportStruct.f61673d = j17;
                voIPShortcutAnswerReportStruct.f61674e = j18;
                voIPShortcutAnswerReportStruct.f61675f = (int) j19;
                voIPShortcutAnswerReportStruct.f61676g = a17 ? 1 : 0;
                voIPShortcutAnswerReportStruct.f61677h = z17 ? 1 : 0;
                voIPShortcutAnswerReportStruct.f61678i = 0;
                voIPShortcutAnswerReportStruct.o();
                voIPShortcutAnswerReportStruct.k();
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.i(f17, null), 3, null);
        }
    }

    @Override // jp5.o
    public void u4(java.lang.String createUser, java.util.ArrayList inviteUser, boolean z17) {
        kotlin.jvm.internal.o.g(createUser, "createUser");
        kotlin.jvm.internal.o.g(inviteUser, "inviteUser");
        i();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "launch voip " + createUser + " and " + z17);
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.q1(createUser, null), 3, null);
        com.tencent.mm.plugin.voipmp.platform.v0 v0Var = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
        v0Var.j(h(), fo5.r1.f265108a);
        v0Var.g(createUser, inviteUser, z17, "", (long) co5.i.f43839a.a(), false, fo5.s1.f265114a);
    }

    @Override // jp5.o
    public void ug(android.content.res.Configuration configuration) {
        io5.e eVar = f().f265098q;
        eVar.e();
        eVar.b();
    }

    @Override // jp5.o
    public void v1() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            f17.f265094m = null;
        }
        f265077m = null;
    }

    @Override // jp5.o
    public void ve(android.content.Context context, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoIPMP.Launcher", "generateTalkingIntent", new java.lang.Object[0]);
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68118e = -1;
        io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque;
        kotlin.jvm.internal.o.g(backgroundMode, "<set-?>");
        flutterPageStyle.f68119f = backgroundMode;
        flutterPageStyle.f68125o = false;
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.a1(callback, context, flutterPageStyle, null), 3, null);
    }

    @Override // jp5.o
    public void we(er4.r roomType) {
        kotlin.jvm.internal.o.g(roomType, "roomType");
        kotlinx.coroutines.l.d(f265072e, null, null, new fo5.h1(roomType, null), 3, null);
    }

    @Override // jp5.o
    public java.lang.Object x4(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "callEnd release flutter");
        je();
        y9();
        java.lang.Object b17 = c().b(this, fo5.y0.f265153d, continuation);
        return b17 == pz5.a.f359186d ? b17 : jz5.f0.f302826a;
    }

    @Override // jp5.o
    public void y9() {
        java.lang.Object m521constructorimpl;
        qo5.b bVar = qo5.b.f365663a;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoIPMPVoIPNotificationHelper", "unbindService: isBindVoIPForegroundService " + qo5.b.f365664b, new java.lang.Object[0]);
        if (fp.h.c(26)) {
            qo5.b.f365665c = null;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.voip.widget.VoipNewForegroundService.class));
                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPVoIPNotificationHelper", "unbindService: unbind error ", m524exceptionOrNullimpl);
                m521constructorimpl = java.lang.Boolean.TRUE;
            }
            qo5.b.f365664b = ((java.lang.Boolean) m521constructorimpl).booleanValue();
        }
    }

    @Override // jp5.o
    public void zi(java.lang.String toUser, boolean z17, int i17, long j17, long j18, long j19, int i18) {
        java.lang.String string;
        boolean z18;
        long j27;
        long j28;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "insertMsg() called with: toUser = " + toUser + ", caller = " + z17 + ", roomType = " + i17 + ", timeInSec = " + j17 + ", inviteId = " + j18 + ", roomId = " + j19 + ", msgType = " + i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ho5.c.f282902a;
        int i19 = (int) j17;
        long j29 = (long) i18;
        ho5.a aVar = (ho5.a) ho5.c.f282903b.get((int) j29);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPBubbleHelper", "insertMsg: can not get msgInfo for type " + j29);
            return;
        }
        if (i17 > 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPBubbleHelper", "insertMsg: unknown room type");
            return;
        }
        boolean z19 = i17 == 1;
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.e1(c01.w9.o(toUser));
        f9Var.setType(50);
        f9Var.d1(z19 ? "voip_content_video" : "voip_content_voice");
        f9Var.u1(toUser);
        f9Var.j1(z17 ? 1 : 0);
        f9Var.r1(aVar.f282898d ? 3 : 6);
        if (aVar.f282899e && i19 > 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i27 = aVar.f282896b;
            java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i19 / 60), java.lang.Integer.valueOf(i19 % 60)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            string = context.getString(i27, format);
        } else {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(aVar.f282897c);
        }
        f9Var.u3(string);
        com.tencent.mm.plugin.voip.model.j0 j0Var = com.tencent.mm.plugin.voip.model.j0.f176682a;
        com.tencent.mm.plugin.voip.model.k0 k0Var = new com.tencent.mm.plugin.voip.model.k0(j19, 0L, j18, toUser, z19, z17);
        synchronized (j0Var) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = com.tencent.mm.plugin.voip.model.j0.f176685d;
            reentrantLock.lock();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "insertILinkVoIPMsg() called with: voipInfo = " + k0Var + ", msgInfo = " + f9Var);
            dm.sb f17 = j0Var.f(k0Var);
            if (f17 == null) {
                z18 = true;
                com.tencent.mm.plugin.voip.model.j0.p(k0Var, true);
                f17 = j0Var.f(k0Var);
            } else {
                z18 = true;
            }
            if (f17 == null || f17.L0() != 4) {
                z18 = false;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "insertILinkVoIPMsg: already has bubble msg");
                reentrantLock.unlock();
                j28 = f17.G0();
            } else {
                if (f17 != null) {
                    j27 = j0Var.l(f17, f9Var);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoIPBubbleHelper", "insertILinkVoIPMsg: get bubble info error");
                    j27 = 0;
                }
                reentrantLock.unlock();
                j28 = j27;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPBubbleHelper", "innerInsertMsg: insert msg result " + j28);
    }
}
