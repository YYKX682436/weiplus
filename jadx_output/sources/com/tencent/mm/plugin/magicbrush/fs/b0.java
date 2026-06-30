package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f147952f;

    public b0(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f147950d = str;
        this.f147951e = str2;
        this.f147952f = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.magicbrush.fs.d0 d0Var = com.tencent.mm.plugin.magicbrush.fs.e0.f147962a;
        java.lang.String str = this.f147950d;
        if (d0Var.a(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout but locked " + this.f147951e);
        } else {
            if (!com.tencent.mm.vfs.w6.g(str, true)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout delete failed");
                return;
            }
            this.f147952f.compareAndSet(-1L, 0L);
            com.tencent.mm.plugin.magicbrush.fs.x.f148001a.d(this.f147951e, "temp", 0L, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout delete success");
        }
    }
}
