package hd5;

/* loaded from: classes9.dex */
public final class j implements hd5.m {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f280609h;

    /* renamed from: a, reason: collision with root package name */
    public final yb5.q f280610a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f280611b;

    /* renamed from: c, reason: collision with root package name */
    public final yb5.d f280612c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f280613d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.LruCache f280614e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f280615f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f280616g;

    static {
        new hd5.b(null);
        f280609h = jz5.h.b(hd5.a.f280588d);
    }

    public j(yb5.d chattingContext, java.util.List list) {
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(list, "list");
        this.f280610a = chattingContext.v();
        this.f280613d = jz5.h.b(hd5.i.f280608d);
        this.f280614e = new android.util.LruCache(800);
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChattingTextFilter()) == 1;
        this.f280615f = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "init isFilterSpecialTextNew:%s", java.lang.Boolean.valueOf(z17));
        this.f280611b = list;
        this.f280612c = chattingContext;
        this.f280616g = new hd5.h(this);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "removeOverTimeTask() called");
        this.f280612c.q().removeCallbacks(this.f280616g);
    }
}
