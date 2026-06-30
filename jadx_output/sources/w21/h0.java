package w21;

/* loaded from: classes14.dex */
public class h0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w21.i0 f442377d;

    public h0(w21.i0 i0Var) {
        this.f442377d = i0Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "SpeexPlayer_play";
    }

    @Override // java.lang.Runnable
    public void run() {
        android.media.AudioTrack audioTrack;
        try {
            android.os.Process.setThreadPriority(-16);
            w21.i0 i0Var = this.f442377d;
            i0Var.f442396q = com.tencent.mm.vfs.w6.E(i0Var.f442381b);
            while (true) {
                if (this.f442377d.f442384e != 1 && this.f442377d.f442384e != 2) {
                    break;
                }
                w21.i0 i0Var2 = this.f442377d;
                i0Var2.f442395p = i0Var2.f442396q.read(i0Var2.f442394o);
                w21.i0 i0Var3 = this.f442377d;
                int i17 = i0Var3.f442395p;
                if (i17 != -1) {
                    byte[] a17 = i0Var3.f442387h.a(i0Var3.f442394o, 0, i17);
                    if (a17 != null && a17.length != 0) {
                        int length = a17.length;
                        int i18 = 0;
                        while (true) {
                            w21.i0 i0Var4 = this.f442377d;
                            if (length < i0Var4.f442397r || i0Var4.f442384e != 1) {
                                break;
                            }
                            w21.i0 i0Var5 = this.f442377d;
                            boolean z17 = i0Var5.f442392m;
                            if (z17) {
                                java.lang.Thread.sleep(20L);
                            } else {
                                android.media.AudioTrack audioTrack2 = i0Var5.f442380a;
                                if (audioTrack2 != null && !z17) {
                                    audioTrack2.write(a17, i18, i0Var5.f442397r);
                                    int i19 = this.f442377d.f442397r;
                                    i18 += i19;
                                    length -= i19;
                                }
                            }
                        }
                        w21.i0 i0Var6 = this.f442377d;
                        if (length < i0Var6.f442397r && length > 0 && (audioTrack = i0Var6.f442380a) != null) {
                            audioTrack.write(a17, i18, length);
                        }
                    }
                    this.f442377d.f442384e = 0;
                } else {
                    i0Var3.f442384e = 0;
                }
                if (this.f442377d.f442384e == 2) {
                    this.f442377d.getClass();
                    synchronized ("") {
                        try {
                            this.f442377d.getClass();
                            "".notify();
                        } catch (java.lang.Exception e17) {
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                        }
                    }
                    this.f442377d.getClass();
                    synchronized ("") {
                        try {
                            this.f442377d.getClass();
                            "".wait();
                        } catch (java.lang.Exception e18) {
                            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                        }
                    }
                } else {
                    this.f442377d.getClass();
                    synchronized ("") {
                        try {
                            this.f442377d.getClass();
                            "".notify();
                        } catch (java.lang.Exception e19) {
                            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                        }
                    }
                }
            }
            if (this.f442377d.f442384e != 3) {
                java.lang.Thread.sleep(1000L);
            }
        } catch (java.lang.Exception e27) {
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
            android.media.MediaPlayer.OnErrorListener onErrorListener = this.f442377d.f442389j;
            if (onErrorListener != null) {
                ((w21.g0) onErrorListener).onError(null, 0, 0);
            }
            this.f442377d.f442384e = 0;
        }
        java.io.InputStream inputStream = this.f442377d.f442396q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e28) {
                boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
            }
            this.f442377d.f442396q = null;
        }
        int c17 = this.f442377d.f442387h.c();
        if (this.f442377d.f442384e != 3) {
            tl.e eVar = this.f442377d.f442382c;
            if (eVar != null) {
                eVar.onCompletion();
            }
            android.media.MediaPlayer.OnCompletionListener onCompletionListener = this.f442377d.f442388i;
            if (onCompletionListener != null) {
                ((w21.f0) onCompletionListener).onCompletion(null);
            }
        } else {
            try {
                this.f442377d.n();
            } catch (java.lang.Exception unused) {
            }
        }
        if (c17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "res: " + c17);
        }
    }
}
