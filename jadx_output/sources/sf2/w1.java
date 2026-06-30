package sf2;

/* loaded from: classes10.dex */
public final class w1 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f407335m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f407336n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f407337o;

    /* renamed from: p, reason: collision with root package name */
    public long f407338p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f407339q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f407335m = jz5.h.b(new sf2.v1(this));
        this.f407336n = jz5.h.b(new sf2.q1(this));
        this.f407337o = jz5.h.b(new sf2.p1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(sf2.w1 r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.w1.Z6(sf2.w1, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final mm2.e1 a7() {
        return (mm2.e1) ((jz5.n) this.f407336n).getValue();
    }

    public final mm2.m6 b7() {
        return (mm2.m6) ((jz5.n) this.f407335m).getValue();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        kotlinx.coroutines.r2 r2Var = this.f407339q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f407338p = 0L;
        b7().U6(mm2.g6.f329093a);
        b7().S6();
    }
}
