package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class i5 implements java.io.Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f212996h = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.io.RandomAccessFile f212997d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.h5 f212998e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f212999f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f213000g;

    public i5(java.lang.String str, boolean z17) {
        int i17;
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, z17 ? "rw" : "r");
        this.f212999f = z17;
        try {
            android.system.StructStat fstat = android.system.Os.fstat(randomAccessFile.getFD());
            com.tencent.mm.vfs.h5 h5Var = new com.tencent.mm.vfs.h5(fstat.st_dev, fstat.st_ino);
            synchronized (f212996h) {
                while (true) {
                    java.util.HashMap hashMap = f212996h;
                    com.tencent.mm.vfs.c5 c5Var = (com.tencent.mm.vfs.c5) hashMap.get(h5Var);
                    if (c5Var != null) {
                        if (!z17 && (i17 = c5Var.f212872c) > 0) {
                            c5Var.f212872c = i17 + 1;
                            break;
                        } else {
                            try {
                                hashMap.wait();
                            } catch (java.lang.InterruptedException e17) {
                                throw new java.io.IOException(e17);
                            }
                        }
                    } else {
                        hashMap.put(h5Var, new com.tencent.mm.vfs.c5(randomAccessFile, z17));
                        break;
                    }
                }
            }
            this.f212997d = randomAccessFile;
            this.f212998e = h5Var;
            this.f213000g = true;
        } catch (android.system.ErrnoException e18) {
            throw new java.io.IOException(e18);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f213000g) {
            java.util.HashMap hashMap = f212996h;
            synchronized (hashMap) {
                com.tencent.mm.vfs.c5 c5Var = (com.tencent.mm.vfs.c5) hashMap.get(this.f212998e);
                if (c5Var == null) {
                    this.f212997d.close();
                } else {
                    if (!this.f212999f) {
                        int i17 = c5Var.f212872c - 1;
                        c5Var.f212872c = i17;
                        if (i17 != 0) {
                            if (c5Var.f212870a == null) {
                                c5Var.f212870a = new java.util.ArrayList(4);
                            }
                            c5Var.f212870a.add(this.f212997d);
                        }
                    }
                    java.nio.channels.FileLock fileLock = c5Var.f212871b;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    java.util.ArrayList arrayList = c5Var.f212870a;
                    if (arrayList != null) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((java.io.RandomAccessFile) it.next()).close();
                        }
                    }
                    this.f212997d.close();
                    java.util.HashMap hashMap2 = f212996h;
                    hashMap2.remove(this.f212998e);
                    hashMap2.notifyAll();
                }
            }
            this.f213000g = false;
        }
    }

    public void finalize() {
        close();
    }
}
