package kc2;

/* loaded from: classes15.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final kc2.g1 f306499a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f306500b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f306501c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f306502d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f306503e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f306504f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f306505g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f306506h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.storage.u3 f306507i;

    /* renamed from: j, reason: collision with root package name */
    public int f306508j;

    /* renamed from: k, reason: collision with root package name */
    public int f306509k;

    /* renamed from: l, reason: collision with root package name */
    public int f306510l;

    public v1(kc2.g1 manager, com.tencent.mm.sdk.platformtools.n3 handler, java.lang.String findTabPreferenceKey, int i17, kotlin.jvm.internal.i iVar) {
        findTabPreferenceKey = (i17 & 4) != 0 ? "album_dyna_photo_ui_title" : findTabPreferenceKey;
        kotlin.jvm.internal.o.g(manager, "manager");
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(findTabPreferenceKey, "findTabPreferenceKey");
        this.f306499a = manager;
        this.f306500b = handler;
        this.f306501c = findTabPreferenceKey;
        this.f306502d = jz5.h.b(kc2.q1.f306480d);
        this.f306503e = "FinderKaraInfoManager.Sns";
        this.f306504f = jz5.h.b(kc2.o1.f306466d);
        this.f306505g = jz5.h.b(kc2.p1.f306469d);
        this.f306506h = jz5.h.b(kc2.u1.f306495d);
        this.f306507i = com.tencent.mm.storage.u3.USERINFO_FINDER_KARA_SNS_LAST_EXIT_STRING_SYNC;
        handler.post(new kc2.n1(this));
    }

    public final kc2.a2 a() {
        return (kc2.a2) ((jz5.n) this.f306504f).getValue();
    }

    public final kc2.a2 b() {
        return (kc2.a2) ((jz5.n) this.f306505g).getValue();
    }

    public final kc2.a2 c() {
        return (kc2.a2) ((jz5.n) this.f306506h).getValue();
    }

    public java.lang.String d() {
        java.lang.Object l17 = gm0.j1.u().c().l(68377, null);
        if (l17 instanceof java.lang.String) {
            return (java.lang.String) l17;
        }
        return null;
    }

    public boolean e() {
        return (c01.z1.n() & 32768) == 0;
    }
}
