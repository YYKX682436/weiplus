package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.media.c1 f185759j = new com.tencent.mm.plugin.webview.ui.tools.media.c1(null);

    /* renamed from: k, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.ui.tools.media.e1 f185760k;

    /* renamed from: a, reason: collision with root package name */
    public r45.ba7 f185761a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f185762b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f185763c = "";

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.v3 f185764d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f185765e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f185766f;

    /* renamed from: g, reason: collision with root package name */
    public int f185767g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f185768h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f185769i;

    public e1(android.content.Context context, kotlin.jvm.internal.i iVar) {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("__web_music_slot_mmkv_key__");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        this.f185764d = new com.tencent.mm.sdk.platformtools.v3(M, 15552000L);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f185765e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.media.WebViewMusicAlbumHelper$musicPlayerListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                int i17;
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.webview.ui.tools.media.e1 e1Var = com.tencent.mm.plugin.webview.ui.tools.media.e1.this;
                synchronized (e1Var) {
                    b21.r rVar = event.f54512g.f7037c;
                    if (rVar == null) {
                        rVar = b21.m.b();
                    }
                    if (rVar != null) {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f185769i)) {
                            java.lang.String MusicId = rVar.f17346e;
                            kotlin.jvm.internal.o.f(MusicId, "MusicId");
                            e1Var.f185769i = MusicId;
                            e1Var.f185768h = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MusicAlbumHelper", "doWebViewReport musicId = " + e1Var.f185769i + ", playId=" + e1Var.f185768h + ", playActionSource=" + e1Var.f185767g + "，action=" + event.f54512g.f7036b);
                        int i18 = event.f54512g.f7036b;
                        if (i18 != 2) {
                            if (i18 == 3) {
                                e1Var.b(e1Var.e(e1Var.f185769i), 4);
                            } else if (i18 == 4) {
                                e1Var.b(e1Var.e(e1Var.f185769i), 9);
                            } else if (i18 == 7) {
                                e1Var.b(e1Var.e(e1Var.f185769i), 7);
                            } else if (i18 != 10) {
                                switch (i18) {
                                    case 15:
                                        e1Var.f185767g = 2;
                                        break;
                                    case 16:
                                    case 17:
                                        e1Var.f185767g = 3;
                                        break;
                                    case 18:
                                        break;
                                    default:
                                        if (!com.tencent.mm.sdk.platformtools.t8.D0(e1Var.f185769i, rVar.f17346e)) {
                                            java.lang.String MusicId2 = rVar.f17346e;
                                            kotlin.jvm.internal.o.f(MusicId2, "MusicId");
                                            e1Var.f185769i = MusicId2;
                                            e1Var.f185768h = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                                            com.tencent.mars.xlog.Log.i("MicroMsg.MusicAlbumHelper", "doWebViewReport new music musicId = " + e1Var.f185769i + ", playId=" + e1Var.f185768h);
                                        }
                                        int i19 = event.f54512g.f7036b;
                                        if (i19 == 0 || i19 == 1) {
                                            e1Var.b(e1Var.e(e1Var.f185769i), 3);
                                        } else if (i19 == 8) {
                                            e1Var.b(e1Var.e(e1Var.f185769i), 6);
                                        } else if (i19 == 9) {
                                            e1Var.b(e1Var.e(e1Var.f185769i), 1);
                                        } else if (i19 == 11) {
                                            e1Var.b(e1Var.e(e1Var.f185769i), 2);
                                        } else if (i19 == 12) {
                                            e1Var.b(e1Var.e(e1Var.f185769i), 5);
                                        }
                                        break;
                                }
                            } else {
                                e1Var.b(e1Var.e(e1Var.f185769i), 100);
                            }
                        }
                        e1Var.b(e1Var.e(e1Var.f185769i), 8);
                    }
                }
                am.jk jkVar = event.f54512g;
                int i27 = jkVar.f7036b;
                if (i27 != 0 && i27 != 1) {
                    if (i27 == 2 || i27 == 3 || i27 == 4) {
                        if (com.tencent.mm.plugin.webview.ui.tools.media.e1.this.f185766f.e()) {
                            return false;
                        }
                        com.tencent.mm.plugin.webview.ui.tools.media.e1.this.f185766f.d();
                        return false;
                    }
                    if (i27 == 7) {
                        r45.ca7 e17 = com.tencent.mm.plugin.webview.ui.tools.media.e1.this.e(jkVar.f7038d);
                        if (e17 == null) {
                            return false;
                        }
                        com.tencent.mm.plugin.webview.ui.tools.media.e1 e1Var2 = com.tencent.mm.plugin.webview.ui.tools.media.e1.this;
                        if (e17.f371405e <= -1 || (i17 = e17.f371404d) <= 0) {
                            return false;
                        }
                        e17.f371405e = i17;
                        e1Var2.i(event.f54512g.f7038d, e17);
                        return false;
                    }
                    if (i27 != 8 && i27 != 13 && i27 != 14) {
                        return false;
                    }
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(jkVar.f7038d)) {
                    return false;
                }
                r45.ca7 e18 = com.tencent.mm.plugin.webview.ui.tools.media.e1.this.e(event.f54512g.f7038d);
                if ((e18 != null ? e18.f371405e : -1) <= -1) {
                    return false;
                }
                com.tencent.mm.plugin.webview.ui.tools.media.e1.this.g();
                if (!com.tencent.mm.plugin.webview.ui.tools.media.e1.this.f185766f.e()) {
                    return false;
                }
                com.tencent.mm.plugin.webview.ui.tools.media.e1 e1Var3 = com.tencent.mm.plugin.webview.ui.tools.media.e1.this;
                com.tencent.mm.sdk.platformtools.b4 b4Var = e1Var3.f185766f;
                if (!b4Var.e()) {
                    e1Var3.f185766f.d();
                }
                b4Var.c(3000L, 3000L);
                return false;
            }
        };
        this.f185766f = new com.tencent.mm.sdk.platformtools.b4("MicroMsg.MusicAlbumHelper", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.webview.ui.tools.media.d1(this), true);
        this.f185767g = 1;
        this.f185768h = "";
        this.f185769i = "";
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return "album_" + str2 + '_' + str + '}';
    }

    public final void b(r45.ca7 ca7Var, int i17) {
        if (ca7Var == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String str = ca7Var.f371409i;
        java.lang.Long valueOf = java.lang.Long.valueOf(ca7Var.f371410m);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(ca7Var.f371411n);
        java.lang.String str2 = ca7Var.f371407g;
        java.lang.String str3 = ca7Var.f371406f;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(ca7Var.f371408h);
        java.lang.Long valueOf4 = java.lang.Long.valueOf(ca7Var.f371416s);
        java.lang.String str4 = ca7Var.f371412o;
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(ca7Var.f371417t);
        java.lang.Integer valueOf6 = java.lang.Integer.valueOf(ca7Var.f371418u);
        java.lang.String str5 = this.f185768h;
        java.lang.Integer valueOf7 = java.lang.Integer.valueOf(ca7Var.f371404d);
        java.lang.Integer valueOf8 = java.lang.Integer.valueOf(ca7Var.f371405e);
        java.lang.Long valueOf9 = java.lang.Long.valueOf(currentTimeMillis);
        java.lang.Integer valueOf10 = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf11 = java.lang.Integer.valueOf(this.f185767g);
        java.lang.String str6 = ca7Var.f371413p;
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.y9.a(str6);
        java.lang.Integer valueOf12 = java.lang.Integer.valueOf(ca7Var.f371419v);
        java.lang.String str7 = ca7Var.f371414q;
        java.lang.String t17 = str7 == null || r26.n0.N(str7) ? "" : r26.i0.t(str7, ",", "", false);
        java.lang.String str8 = ca7Var.f371415r;
        g0Var.d(19839, str, valueOf, valueOf2, str2, str3, valueOf3, valueOf4, str4, valueOf5, valueOf6, str5, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, a17, valueOf12, t17, str8 == null || r26.n0.N(str8) ? "" : r26.i0.t(str8, ",", "", false));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String c(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.f185763c = r12     // Catch: java.lang.Throwable -> Lcc
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r11)     // Catch: java.lang.Throwable -> Lcc
            r1 = 0
            if (r0 == 0) goto Lc
            monitor-exit(r10)
            return r1
        Lc:
            r10.g()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = r10.f185762b     // Catch: java.lang.Throwable -> Lcc
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.D0(r11, r0)     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L21
            r45.ba7 r0 = r10.f185761a     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L21
            kotlin.jvm.internal.o.d(r0)     // Catch: java.lang.Throwable -> Lcc
            java.util.LinkedList r0 = r0.f370654e     // Catch: java.lang.Throwable -> Lcc
            goto L2f
        L21:
            r45.ba7 r0 = r10.d(r11, r12)     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L2e
            r10.f185761a = r0     // Catch: java.lang.Throwable -> Lcc
            r10.f185762b = r11     // Catch: java.lang.Throwable -> Lcc
            java.util.LinkedList r0 = r0.f370654e     // Catch: java.lang.Throwable -> Lcc
            goto L2f
        L2e:
            r0 = r1
        L2f:
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.L0(r0)     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto L37
            monitor-exit(r10)
            return r1
        L37:
            r2 = 1
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            r4.<init>()     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            java.lang.String r5 = "albumId"
            r4.put(r5, r11)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            java.lang.String r5 = "audioId"
            r45.ba7 r6 = r10.f185761a     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            if (r6 == 0) goto L4c
            java.lang.String r6 = r6.f370653d     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            goto L4d
        L4c:
            r6 = r1
        L4d:
            if (r6 != 0) goto L53
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
        L53:
            r4.put(r5, r6)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            if (r0 == 0) goto Lb4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
        L5c:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            if (r5 == 0) goto L73
            boolean r6 = r26.n0.N(r5)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            if (r6 == 0) goto L71
            goto L73
        L71:
            r6 = r3
            goto L74
        L73:
            r6 = r2
        L74:
            if (r6 != 0) goto L5c
            kotlin.jvm.internal.o.d(r11)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            java.lang.String r6 = r10.f(r5, r11, r12)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            r45.ca7 r6 = r10.e(r6)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            r7.<init>()     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            java.lang.String r8 = "currentTime"
            if (r6 == 0) goto L8d
            int r9 = r6.f371405e     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            goto L8e
        L8d:
            r9 = r3
        L8e:
            int r9 = r9 / 1000
            r7.put(r8, r9)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            java.lang.String r8 = "duration"
            if (r6 == 0) goto L9a
            int r9 = r6.f371404d     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            goto L9b
        L9a:
            r9 = r3
        L9b:
            int r9 = r9 / 1000
            r7.put(r8, r9)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            java.lang.String r8 = "playbackRate"
            if (r6 == 0) goto La7
            float r6 = r6.f371421x     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            goto La9
        La7:
            r6 = 1065353216(0x3f800000, float:1.0)
        La9:
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            r7.put(r8, r6)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            r4.put(r5, r7)     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            goto L5c
        Lb4:
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Exception -> Lba java.lang.Throwable -> Lcc
            monitor-exit(r10)
            return r11
        Lba:
            r11 = move-exception
            java.lang.String r12 = "MicroMsg.MusicAlbumHelper"
            java.lang.String r0 = "getAudioListState ex:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lcc
            r2[r3] = r11     // Catch: java.lang.Throwable -> Lcc
            com.tencent.mars.xlog.Log.w(r12, r0, r2)     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r10)
            return r1
        Lcc:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.media.e1.c(java.lang.String, java.lang.String):java.lang.String");
    }

    public final r45.ba7 d(java.lang.String str, java.lang.String str2) {
        byte[] j17;
        java.lang.Object obj = null;
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        if (str2 == null || r26.n0.N(str2)) {
            return null;
        }
        com.tencent.mm.sdk.platformtools.v3 v3Var = this.f185764d;
        java.lang.String a17 = a(str, str2);
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) v3Var.d(a17);
        if (o4Var != null && o4Var.f(a17) && (j17 = o4Var.j(a17)) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.ba7.class.newInstance();
                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                    obj = (com.tencent.mm.protobuf.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
            }
        }
        return (r45.ba7) obj;
    }

    public final r45.ca7 e(java.lang.String str) {
        byte[] j17;
        java.lang.Object obj = null;
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        com.tencent.mm.sdk.platformtools.v3 v3Var = this.f185764d;
        kotlin.jvm.internal.o.g(str, "<this>");
        java.lang.String str2 = "audioInfo_" + str + '}';
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) v3Var.d(str2);
        if (o4Var != null && o4Var.f(str2) && (j17 = o4Var.j(str2)) != null) {
            if (true ^ (j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.ca7.class.newInstance();
                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                    obj = (com.tencent.mm.protobuf.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
            }
        }
        return (r45.ca7) obj;
    }

    public final java.lang.String f(java.lang.String str, java.lang.String albumId, java.lang.String str2) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(albumId, "albumId");
        return str2 + '_' + albumId + '_' + str;
    }

    public final synchronized void g() {
        b21.r b17 = b21.m.b();
        if (b17 != null) {
            if (b17.f17346e == null) {
                return;
            }
            b21.o a17 = b21.m.a();
            if (a17 != null) {
                com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) this.f185764d.i();
                r45.ca7 e17 = e(b17.f17346e);
                if (e17 != null && e17.f371405e > -1) {
                    int i17 = a17.f17338b;
                    if (i17 > 0) {
                        e17.f371405e = i17;
                    }
                    e17.f371404d = java.lang.Math.max(0, a17.f17337a);
                    i(b17.f17346e, e17);
                    r45.ca7 e18 = e(b17.f17346e);
                    java.lang.String str = e18 != null ? e18.f371407g : null;
                    r45.ca7 e19 = e(b17.f17346e);
                    java.lang.String str2 = e19 != null ? e19.f371406f : null;
                    r45.ca7 e27 = e(b17.f17346e);
                    java.lang.String str3 = e27 != null ? e27.f371420w : null;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        o4Var.D("currentAlbumIdKey_" + this.f185763c + '}', str);
                        r45.ba7 d17 = d(str, str3);
                        if (d17 != null) {
                            r45.ba7 ba7Var = this.f185761a;
                            if (ba7Var != null) {
                                ba7Var.f370653d = str2;
                            }
                            d17.f370653d = str2;
                            h(str, str3, d17);
                        }
                    }
                }
            }
        }
    }

    public final void h(java.lang.String str, java.lang.String str2, r45.ba7 ba7Var) {
        if (str == null || r26.n0.N(str)) {
            return;
        }
        if (str2 == null || r26.n0.N(str2)) {
            return;
        }
        try {
            ((com.tencent.mm.sdk.platformtools.o4) this.f185764d.i()).H(a(str, str2), ba7Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicAlbumHelper", "saveWebViewAlbumInfoInfo ex " + e17.getMessage());
        }
    }

    public final void i(java.lang.String str, r45.ca7 ca7Var) {
        if (str == null || r26.n0.N(str)) {
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) this.f185764d.i();
            kotlin.jvm.internal.o.g(str, "<this>");
            o4Var.H("audioInfo_" + str + '}', ca7Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicAlbumHelper", "saveWebViewAudioInfo ex " + e17.getMessage());
        }
    }
}
