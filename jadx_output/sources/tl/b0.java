package tl;

/* loaded from: classes14.dex */
public final class b0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public volatile tl.c0 f420027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl.d0 f420028e;

    public b0(tl.d0 d0Var) {
        this.f420028e = d0Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "RecordModeAsyncRead_record";
    }

    @Override // java.lang.Runnable
    public void run() {
        tl.d0 d0Var;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "RecordThread started. frameSize:%d", java.lang.Integer.valueOf(this.f420028e.f420030e));
        if (-123456789 != this.f420028e.f420046b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "set priority to " + this.f420028e.f420046b);
            android.os.Process.setThreadPriority(this.f420028e.f420046b);
        }
        synchronized (this.f420028e.f420042q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "RecordRunnable#run lock[%s] mStatusLock[%s]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this.f420028e.f420042q);
            tl.d0 d0Var2 = this.f420028e;
            if (1 != d0Var2.f420031f) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordModeAsyncRead", "status is not inited, now status: " + this.f420028e.f420031f);
                return;
            }
            d0Var2.f420031f = 2;
            byte[] bArr = new byte[d0Var2.f420030e];
            while (true) {
                tl.d0 d0Var3 = this.f420028e;
                if (2 != d0Var3.f420031f) {
                    break;
                }
                synchronized (d0Var3.f420041p) {
                    this.f420028e.getClass();
                }
                tl.d0 d0Var4 = this.f420028e;
                if (d0Var4.f420036k == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "mAudioRecord is null, so stop record.");
                    synchronized (this.f420028e.f420042q) {
                        this.f420028e.f420031f = 3;
                    }
                    break;
                }
                if (d0Var4.f420029d) {
                    bArr = new byte[d0Var4.f420030e];
                }
                d0Var4.f420047c++;
                new fp.j();
                tl.d0 d0Var5 = this.f420028e;
                int read = d0Var5.f420036k.read(bArr, 0, d0Var5.f420030e);
                tl.d0 d0Var6 = this.f420028e;
                if (2 != d0Var6.f420031f) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "record mode has not been running and break");
                    break;
                }
                tl.e0 e0Var = d0Var6.f420045a;
                if (e0Var != null) {
                    ((tl.u) e0Var).a(read, bArr);
                }
                if (this.f420028e.f420030e != read) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "read len " + read);
                }
                if (read < this.f420028e.f420030e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "read too fast? sleep 10 ms");
                    try {
                        java.lang.Thread.sleep(10L);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
                tl.d0 d0Var7 = this.f420028e;
                tl.c cVar = d0Var7.f420039n;
                if (cVar != null && read > 0) {
                    if (read > bArr.length) {
                        read = bArr.length;
                    }
                    if (d0Var7.f420038m != null) {
                        if (d0Var7.f420033h) {
                            java.util.Arrays.fill(bArr, 0, read, (byte) 0);
                        }
                        to.b bVar = this.f420028e.f420038m;
                        int i18 = -1;
                        if (read > 0) {
                            int i19 = bVar.f420883d;
                            int i27 = bVar.f420884e;
                            if (i19 == i27) {
                                i17 = bVar.f420880a;
                            } else {
                                int i28 = bVar.f420880a;
                                if ((i27 + 1) % i28 == i19) {
                                    i17 = 0;
                                } else {
                                    if (i19 < i27) {
                                        bVar.f420881b = i27 - i19;
                                    } else if (i19 > i27) {
                                        bVar.f420881b = (i27 + i28) - i19;
                                    }
                                    i17 = i28 - bVar.f420881b;
                                }
                            }
                            if (read <= i17) {
                                int i29 = bVar.f420880a;
                                if ((i27 + read) % i29 != i19) {
                                    if (i19 < i27) {
                                        int i37 = i29 - i27;
                                        if (read <= i37) {
                                            java.lang.System.arraycopy(bArr, 0, bVar.f420882c, i27, read);
                                            bVar.f420884e = (bVar.f420884e + read) % bVar.f420880a;
                                        } else {
                                            java.lang.System.arraycopy(bArr, 0, bVar.f420882c, i27, i37);
                                            int i38 = bVar.f420880a - bVar.f420884e;
                                            java.lang.System.arraycopy(bArr, i38, bVar.f420882c, 0, read - i38);
                                            int i39 = bVar.f420880a;
                                            int i47 = read - (i39 - bVar.f420884e);
                                            bVar.f420884e = i47;
                                            bVar.f420884e = i47 % i39;
                                        }
                                    } else {
                                        java.lang.System.arraycopy(bArr, 0, bVar.f420882c, i27, read);
                                        bVar.f420884e = (bVar.f420884e + read) % bVar.f420880a;
                                    }
                                    i18 = 0;
                                }
                            }
                        } else {
                            bVar.getClass();
                        }
                        if (i18 != 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.RecordModeAsyncRead", "WriteToBuffer Failed, ret:%d AudioBuffer length: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f420028e.f420038m.a()));
                        }
                    } else if (cVar == null) {
                        continue;
                    } else {
                        if (d0Var7.f420033h) {
                            java.util.Arrays.fill(bArr, 0, read, (byte) 0);
                        }
                        tl.d0 d0Var8 = this.f420028e;
                        if (2 != d0Var8.f420031f) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "record mode has not been running and break, do not callback ");
                            break;
                        }
                        d0Var8.f420039n.b(bArr, read);
                    }
                }
            }
            if (this.f420027d != null) {
                tl.z zVar = (tl.z) this.f420027d;
                zVar.f420193a.f420037l.f420027d = null;
                com.tencent.mm.sdk.platformtools.n3 n3Var = zVar.f420193a.f420035j;
                if (n3Var != null) {
                    n3Var.removeCallbacksAndMessages(null);
                    zVar.f420193a.f420035j.quitSafely();
                    zVar.f420193a.f420035j = null;
                }
                android.os.HandlerThread handlerThread = zVar.f420193a.f420034i;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    zVar.f420193a.f420034i = null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "finish stopRecord");
                tl.d0 d0Var9 = zVar.f420193a;
                if (d0Var9.f420038m != null) {
                    java.util.concurrent.Future future = d0Var9.f420043r;
                    if (future != null) {
                        future.cancel(false);
                        zVar.f420193a.f420043r = null;
                    }
                    tl.d0 d0Var10 = zVar.f420193a;
                    to.b bVar2 = d0Var10.f420038m;
                    bVar2.f420880a = 0;
                    bVar2.f420881b = 0;
                    bVar2.f420883d = 0;
                    bVar2.f420884e = 0;
                    bVar2.f420882c = null;
                    synchronized (d0Var10.f420040o) {
                        d0Var = zVar.f420193a;
                        d0Var.f420038m = null;
                        d0Var.f420039n = null;
                    }
                    d0Var.f420038m = null;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "RecordThread exited.");
        }
    }
}
