package pr;

/* loaded from: classes15.dex */
public final class q0 implements pr.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f357767a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f357768b;

    /* renamed from: c, reason: collision with root package name */
    public int f357769c;

    /* renamed from: d, reason: collision with root package name */
    public int f357770d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f357771e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f357772f = new java.util.LinkedList();

    public q0(int i17) {
        this.f357767a = i17;
        this.f357768b = "MicroMsg.EmojiSyncLoaderIPC";
        if (i17 == 1) {
            this.f357768b = "MicroMsg.EmojiSyncLoaderIPC_capture";
        } else {
            this.f357768b = "MicroMsg.EmojiSyncLoaderIPC_custom";
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("custom_type", i17);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, pr.c1.class, new pr.l0(this));
    }

    @Override // pr.b1
    public int a() {
        return this.f357769c;
    }

    @Override // pr.b1
    public void b(boolean z17) {
    }

    @Override // pr.b1
    public boolean c() {
        return !this.f357771e;
    }

    @Override // pr.b1
    public void d(pr.e0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.X(new pr.o0(this, callback));
    }

    @Override // pr.b1
    public void destroy() {
    }

    @Override // pr.b1
    public void e() {
        com.tencent.mars.xlog.Log.i(this.f357768b, "loadMore: ");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("custom_type", this.f357767a);
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, pr.d1.class);
    }

    @Override // pr.b1
    public void f(pr.e0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.X(new pr.n0(this, callback));
    }

    @Override // pr.b1
    public int g() {
        return this.f357770d;
    }

    public final void h(com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData emojiSyncLoaderIPC$EmojiSyncData) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateData: ");
        sb6.append(emojiSyncLoaderIPC$EmojiSyncData != null ? java.lang.Integer.valueOf(emojiSyncLoaderIPC$EmojiSyncData.f64927f) : null);
        com.tencent.mars.xlog.Log.i(this.f357768b, sb6.toString());
        if (emojiSyncLoaderIPC$EmojiSyncData == null) {
            return;
        }
        this.f357769c = emojiSyncLoaderIPC$EmojiSyncData.f64927f;
        this.f357770d = emojiSyncLoaderIPC$EmojiSyncData.f64928g;
        this.f357771e = emojiSyncLoaderIPC$EmojiSyncData.f64929h;
        pm0.v.X(new pr.p0(this));
    }

    @Override // pr.b1
    public void init() {
    }
}
