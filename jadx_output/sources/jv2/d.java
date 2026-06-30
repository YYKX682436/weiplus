package jv2;

/* loaded from: classes10.dex */
public class d implements in5.c, com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public jv2.a f302207d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f302208e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f302209f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f302210g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f302211h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f302212i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f302213m;

    /* renamed from: n, reason: collision with root package name */
    public int f302214n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f302215o;

    public d(jv2.a commentObj) {
        kotlin.jvm.internal.o.g(commentObj, "commentObj");
        this.f302207d = commentObj;
        com.tencent.mm.sdk.platformtools.t8.K0(commentObj.D0());
        this.f302210g = true;
        this.f302211h = true;
        this.f302214n = this.f302207d.v0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f302207d.t0();
    }

    @Override // in5.c
    public int h() {
        return this.f302207d.A0() == 0 ? 1 : 2;
    }
}
