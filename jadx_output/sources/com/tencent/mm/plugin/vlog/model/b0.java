package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.b0 f175547a = new com.tencent.mm.plugin.vlog.model.b0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f175548b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f175549c = "";

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.modelcontrol.VideoTransPara f175550d;

    /* renamed from: e, reason: collision with root package name */
    public static int f175551e;

    /* renamed from: f, reason: collision with root package name */
    public static long f175552f;

    /* renamed from: g, reason: collision with root package name */
    public static long f175553g;

    /* renamed from: h, reason: collision with root package name */
    public static long f175554h;

    /* renamed from: i, reason: collision with root package name */
    public static long f175555i;

    /* renamed from: j, reason: collision with root package name */
    public static long f175556j;

    /* renamed from: k, reason: collision with root package name */
    public static long f175557k;

    /* renamed from: l, reason: collision with root package name */
    public static long f175558l;

    /* renamed from: m, reason: collision with root package name */
    public static long f175559m;

    /* renamed from: n, reason: collision with root package name */
    public static long f175560n;

    /* renamed from: o, reason: collision with root package name */
    public static long f175561o;

    /* renamed from: p, reason: collision with root package name */
    public static long f175562p;

    /* renamed from: q, reason: collision with root package name */
    public static float f175563q;

    /* renamed from: r, reason: collision with root package name */
    public static int f175564r;

    /* renamed from: s, reason: collision with root package name */
    public static int f175565s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.FinderVideoShell$listener$1 f175566t;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.vlog.model.FinderVideoShell$listener$1] */
    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f175566t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShellExecEvent>(a0Var) { // from class: com.tencent.mm.plugin.vlog.model.FinderVideoShell$listener$1
            {
                this.__eventId = -2024436119;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0106 A[Catch: Exception -> 0x019d, TryCatch #0 {Exception -> 0x019d, blocks: (B:15:0x007a, B:17:0x00ce, B:19:0x00d4, B:21:0x00fa, B:26:0x0106, B:28:0x0135, B:30:0x013d, B:31:0x0142), top: B:14:0x007a }] */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.ShellExecEvent r18) {
                /*
                    Method dump skipped, instructions count: 446
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.FinderVideoShell$listener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
    }

    public final boolean a() {
        if (!z65.c.a() || f175550d == null) {
            return false;
        }
        return f175548b.length() > 0;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "reset");
        f175552f = 0L;
        f175553g = 0L;
        f175554h = 0L;
        f175555i = 0L;
        f175556j = 0L;
        f175557k = 0L;
        f175558l = 0L;
    }
}
