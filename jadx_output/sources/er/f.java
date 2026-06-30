package er;

/* loaded from: classes12.dex */
public abstract class f extends fp0.d implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.api.IEmojiInfo f255930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f255931g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f255932h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f255933i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f255934m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f255935n;

    /* renamed from: o, reason: collision with root package name */
    public er.k f255936o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f255937p;

    public f(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f255930f = emojiInfo;
        this.f255936o = er.k.f255940d;
        this.f255937p = java.util.Collections.synchronizedList(new java.util.LinkedList());
    }

    @Override // fp0.d
    public void a() {
        this.f255933i = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "call , " + this.f255930f.getMd5());
        run();
    }

    @Override // fp0.d
    public java.lang.String d() {
        return e();
    }

    public abstract java.lang.String e();

    public void f(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult, ");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f255930f;
        sb6.append(iEmojiInfo.getMd5());
        sb6.append(' ');
        sb6.append(this.f255933i);
        com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", sb6.toString());
        this.f255934m = z17;
        this.f255935n = true;
        if (this.f255933i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "callback, " + iEmojiInfo.getMd5());
            b(fp0.u.f265290f);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "removeTask, " + iEmojiInfo.getMd5());
            ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).Ai(e());
        }
        pm0.v.K(null, new er.e(this, z17));
    }

    public final void g(dr.s request) {
        kotlin.jvm.internal.o.g(request, "request");
        java.util.List list = this.f255937p;
        list.remove(request);
        int size = list.size();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f255930f;
        if (size != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "cancel " + e() + ", " + this.f255932h + ", " + iEmojiInfo.getMd5() + ' ' + list.size());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "cancel " + e() + ", " + this.f255932h + ", " + iEmojiInfo.getMd5());
        if (this.f255932h) {
            return;
        }
        ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).Ai(e());
        f(false);
    }

    public void run() {
        this.f255932h = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "run , " + this.f255930f.getMd5());
    }
}
