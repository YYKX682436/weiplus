package yo2;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final yo2.e f464137a = new yo2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final lb2.j f464138b;

    /* renamed from: c, reason: collision with root package name */
    public static final lb2.j f464139c;

    /* renamed from: d, reason: collision with root package name */
    public static final lb2.k f464140d;

    /* renamed from: e, reason: collision with root package name */
    public static final lb2.k f464141e;

    /* renamed from: f, reason: collision with root package name */
    public static final lb2.j f464142f;

    static {
        ob2.a aVar = new ob2.a(0, "生成直达直播间红点", null, null, 12, null);
        aVar.a("FIND_NEARBY_INDEPENDENT_LIVE_ROOM", kz5.c0.i(0, 1, 2, 3, 4, 5), kz5.c0.i("开预加载+开预推荐", "开预加载+关预推荐", "关预加载+关预推荐", "关预加载+开预推荐", "开模型预加载+关预推荐", "开模型预加载+开预推荐"));
        aVar.f317743n = yo2.a.f464133d;
        f464138b = aVar;
        ob2.a aVar2 = new ob2.a(0, "生成直达直播广场红点", null, null, 12, null);
        aVar2.a("FIND_NEARBY_INDEPENDENT_LIVE_SQUARE", kz5.c0.i(0, 1, 2, 3, 4, 5), kz5.c0.i("开预加载+开预推荐", "开预加载+关预推荐", "关预加载+关预推荐", "关预加载+开预推荐", "开模型预加载+关预推荐", "开模型预加载+开预推荐"));
        aVar2.f317743n = yo2.b.f464134d;
        f464139c = aVar2;
        f464140d = new lb2.k("生成 - 附近直播 - 直达直播间红点", yo2.c.f464135d);
        f464141e = new lb2.k("生成 - 附近直播 - 直达直播广场红点", yo2.d.f464136d);
        ob2.a aVar3 = new ob2.a(0, "直播广场是否开启声音", null, null, 12, null);
        aVar3.a("FIND_NEARBY_LIVE_SQUARE_ENABLE_VOICE", kz5.c0.i(0, 1), kz5.c0.i("默认", "开启"));
        f464142f = aVar3;
    }

    public final void a(yz5.a block) {
        kotlin.jvm.internal.o.g(block, "block");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            block.invoke();
        }
    }

    public final lb2.k b() {
        return f464140d;
    }

    public final lb2.k c() {
        return f464141e;
    }
}
