package com.tencent.mm.plugin.magicbrush.core.event;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.magicbrush.core.event.g f147900a = new com.tencent.mm.plugin.magicbrush.core.event.g();

    /* renamed from: b, reason: collision with root package name */
    public static yz5.p f147901b;

    public final void a(yz5.p cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.mars.xlog.Log.i("MagicBrushServerEvent", "start");
        f147901b = cb6;
        if (!bf3.w0.f19672a.a(bf3.v0.f19670d)) {
            uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.magicbrush.core.event.e.f147898d, null);
            return;
        }
        yz5.p pVar = com.tencent.mm.plugin.magicbrush.core.event.a.f147895a;
        com.tencent.mars.xlog.Log.i("MagicBrushMainProcessEvent", "start");
        com.tencent.mm.plugin.magicbrush.core.event.a.f147896b.alive();
        com.tencent.mm.plugin.magicbrush.core.event.a.f147895a = cb6;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MagicBrushServerEvent", "stop");
        if (!bf3.w0.f19672a.a(bf3.v0.f19670d)) {
            uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.magicbrush.core.event.f.f147899d, null);
            return;
        }
        yz5.p pVar = com.tencent.mm.plugin.magicbrush.core.event.a.f147895a;
        com.tencent.mars.xlog.Log.i("MagicBrushMainProcessEvent", "stop");
        com.tencent.mm.plugin.magicbrush.core.event.a.f147896b.dead();
    }
}
