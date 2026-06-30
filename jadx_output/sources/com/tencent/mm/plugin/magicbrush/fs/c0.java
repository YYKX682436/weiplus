package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f147956f;

    public c0(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f147954d = str;
        this.f147955e = str2;
        this.f147956f = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(je3.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        je3.i.x2((je3.i) c17, "MagicTempFileClearTimeout", 1, null, 1.0f, 4, null);
        com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout! " + this.f147954d + " deletePath " + this.f147955e);
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.magicbrush.fs.b0(this.f147955e, this.f147954d, this.f147956f));
    }
}
