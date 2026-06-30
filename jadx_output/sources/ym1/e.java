package ym1;

/* loaded from: classes14.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        boolean z17 = b().c().getRingerMode() == 2;
        boolean z18 = b().c().getRingerMode() == 2 || b().c().getRingerMode() == 1;
        if (fp.e0.i()) {
            try {
                z18 = (android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "vibrate_in_silent") == 0 && android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "vibrate_in_normal") == 0) ? false : true;
            } catch (android.provider.Settings.SettingNotFoundException | java.lang.Exception unused) {
            }
        }
        if (!z17 || !z18) {
            if (z17 && !z18) {
                return "ring";
            }
            if (!z17 && z18) {
                return "vibrate";
            }
            if (!z17 && !z18) {
                return "silent";
            }
        }
        return "normal";
    }

    public final xm1.h b() {
        xm1.h hVar = d().f463136e;
        if (hVar != null) {
            return hVar;
        }
        xm1.j jVar = new xm1.j();
        i95.m c17 = i95.n0.c(ym1.f.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((ym1.f) c17).f463136e = jVar;
        i95.m c18 = i95.n0.c(ym1.f.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((ym1.f) c18).f463138g[0] = "music";
        return jVar;
    }

    public final int c() {
        int i17;
        android.media.AudioManager audioManager = b().c();
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        if (an1.c.f8835c == -1) {
            try {
                i17 = java.lang.Class.forName("android.media.AudioManager").getField("STREAM_BLUETOOTH_SCO").getInt(audioManager);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BluetoothUtil", "ClassNotFoundException  android.media.AudioManager,exception:" + e17.getMessage());
                i17 = 6;
            }
            an1.c.f8835c = i17;
        }
        return an1.c.f8835c;
    }

    public final ym1.f d() {
        i95.m c17 = i95.n0.c(ym1.f.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return (ym1.f) c17;
    }

    public final boolean e(java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        return kotlin.jvm.internal.o.b(type, d().f463138g[0]) || kotlin.jvm.internal.o.b(d().f463138g[0], "");
    }

    public final java.lang.String f() {
        xm1.h b17 = b();
        return "mode:" + b17.f() + " isSpeakerphoneOn:" + b17.n() + " isBluetoothOn:" + b17.j();
    }

    public final int g(boolean z17) {
        xm1.h b17 = b();
        boolean z18 = b17.k() || b17.f455171c;
        int i17 = z17 ? 3 : 0;
        if (z18) {
            return 0;
        }
        return i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r0.equals("multitalke") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r13.equals("multitalke") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r13.equals("voip") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r13.equals("voipcs") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r13.equals("ipcall") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r0.equals("voip") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (r0.equals("voipcs") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        if (r0.equals("ipcall") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(xm1.h r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "audioManager"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "init audio manager from "
            java.lang.String r0 = r0.concat(r13)
            java.lang.String r1 = "MicroMsg.SubCoreAudio"
            com.tencent.mars.xlog.Log.i(r1, r0)
            ym1.f r0 = r11.d()
            java.lang.String[] r0 = r0.f463138g
            java.lang.Object r0 = kz5.z.L(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ""
            boolean r2 = kotlin.jvm.internal.o.b(r0, r2)
            r3 = 0
            if (r2 == 0) goto L3b
            ym1.f r0 = r11.d()
            java.lang.String[] r0 = r0.f463138g
            r0[r3] = r13
            ym1.f r13 = r11.d()
            r13.f463136e = r12
            goto Ldb
        L3b:
            int r2 = r0.hashCode()
            r4 = 2
            java.lang.String r5 = "multitalke"
            java.lang.String r6 = "voip"
            java.lang.String r7 = "voipcs"
            java.lang.String r8 = "ipcall"
            r9 = 1
            switch(r2) {
                case -1182426107: goto L64;
                case -810977776: goto L5d;
                case 3625376: goto L56;
                case 1268443040: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L6d
        L4f:
            boolean r2 = r0.equals(r5)
            if (r2 == 0) goto L6d
            goto L6b
        L56:
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L6b
            goto L6d
        L5d:
            boolean r2 = r0.equals(r7)
            if (r2 != 0) goto L6b
            goto L6d
        L64:
            boolean r2 = r0.equals(r8)
            if (r2 != 0) goto L6b
            goto L6d
        L6b:
            r2 = r4
            goto L6e
        L6d:
            r2 = r9
        L6e:
            int r10 = r13.hashCode()
            switch(r10) {
                case -1182426107: goto L8b;
                case -810977776: goto L84;
                case 3625376: goto L7d;
                case 1268443040: goto L76;
                default: goto L75;
            }
        L75:
            goto L91
        L76:
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L91
            goto L92
        L7d:
            boolean r5 = r13.equals(r6)
            if (r5 != 0) goto L92
            goto L91
        L84:
            boolean r5 = r13.equals(r7)
            if (r5 != 0) goto L92
            goto L91
        L8b:
            boolean r5 = r13.equals(r8)
            if (r5 != 0) goto L92
        L91:
            r4 = r9
        L92:
            if (r2 <= r4) goto L9e
            ym1.f r2 = r11.d()
            java.lang.String[] r2 = r2.f463138g
            r2[r9] = r13
            r9 = r3
            goto La6
        L9e:
            ym1.f r2 = r11.d()
            java.lang.String[] r2 = r2.f463138g
            r2[r3] = r13
        La6:
            if (r9 == 0) goto Lc2
            java.lang.String r0 = "success set the audio manager is: "
            java.lang.String r13 = r0.concat(r13)
            com.tencent.mars.xlog.Log.i(r1, r13)
            java.lang.Class<ym1.f> r13 = ym1.f.class
            i95.m r13 = i95.n0.c(r13)
            java.lang.String r0 = "getService(...)"
            kotlin.jvm.internal.o.f(r13, r0)
            ym1.f r13 = (ym1.f) r13
            r13.f463136e = r12
            goto Ldb
        Lc2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "current  "
            r12.<init>(r2)
            r12.append(r0)
            java.lang.String r0 = " is running a priority higher than request: "
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.i(r1, r12)
        Ldb:
            om1.a.a()     // Catch: java.lang.Throwable -> Ldf
            goto Le7
        Ldf:
            r12 = move-exception
            java.lang.String r13 = "Fail to call tickLastForbiddenTimes()."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r12, r13, r0)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ym1.e.h(xm1.h, java.lang.String):void");
    }

    public final boolean i() {
        return b().j();
    }

    public final boolean j() {
        return b().l();
    }

    public final boolean k() {
        return b().n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r6 != 9) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r6) {
        /*
            r5 = this;
            an1.a r0 = an1.a.f8830a
            r1 = 5
            r2 = 4
            if (r6 == r1) goto L3a
            r1 = 6
            r3 = 3
            if (r6 == r1) goto L17
            r1 = 8
            if (r6 == r1) goto L13
            r1 = 9
            if (r6 == r1) goto L17
            goto L3d
        L13:
            r0.a(r3)
            goto L3d
        L17:
            ym1.e r1 = ym1.f.f463134h
            xm1.h r4 = r1.b()
            boolean r4 = r4.l()
            if (r4 == 0) goto L27
            r0.a(r3)
            goto L3d
        L27:
            xm1.h r1 = r1.b()
            boolean r1 = r1.j()
            if (r1 == 0) goto L35
            r0.a(r2)
            goto L3d
        L35:
            r1 = 2
            r0.a(r1)
            goto L3d
        L3a:
            r0.a(r2)
        L3d:
            xm1.h r0 = r5.b()
            r0.o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ym1.e.l(int):void");
    }

    public final void m() {
        try {
            b().c().setStreamMute(3, true);
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseAudioManager", "pauseMusic exception: " + e17.getMessage());
        }
    }

    public final void n() {
        try {
            b().c().setStreamMute(3, false);
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseAudioManager", "resumeMusic exception: " + e17.getMessage());
        }
    }

    public final void o(java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        if (kotlin.jvm.internal.o.b(type, (java.lang.String) kz5.z.L(d().f463138g))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAudio", "current do unInit audio manager and clear the queue");
            d().f463138g[0] = "";
            d().f463136e = null;
        }
    }
}
