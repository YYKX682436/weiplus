package mm2;

/* loaded from: classes3.dex */
public final class h7 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329114f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329115g;

    /* renamed from: h, reason: collision with root package name */
    public int f329116h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f329117i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329118m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329119n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329120o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329121p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329122q;

    /* renamed from: r, reason: collision with root package name */
    public int f329123r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f329124s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f329125t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329114f = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329115g = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329117i = new java.util.LinkedList();
        this.f329118m = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329119n = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329120o = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329121p = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329122q = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    public final java.lang.String N6() {
        java.lang.String str;
        java.util.LinkedList linkedList = this.f329117i;
        return (linkedList.size() <= 0 || this.f329116h >= linkedList.size() || (str = ((r45.la4) linkedList.get(this.f329116h)).f379274e) == null) ? "" : str;
    }

    public final boolean O6() {
        return this.f329117i.size() > 0;
    }

    public final void P6(r45.na4 liveSdkParam) {
        kotlin.jvm.internal.o.g(liveSdkParam, "liveSdkParam");
        java.util.LinkedList channel_params_desc = liveSdkParam.f381198g;
        kotlin.jvm.internal.o.f(channel_params_desc, "channel_params_desc");
        this.f329117i = channel_params_desc;
        java.util.Iterator it = channel_params_desc.iterator();
        while (it.hasNext()) {
            r45.ka4 ka4Var = ((r45.la4) it.next()).f379273d;
            r45.ka4 ka4Var2 = liveSdkParam.f381197f;
            int i17 = ka4Var2.S;
            this.f329123r = i17;
            ka4Var.S = i17;
            ka4Var.T = ka4Var2.T;
            this.f329124s = ka4Var2.T;
            ka4Var.U = ka4Var2.U;
            this.f329125t = ka4Var2.U;
        }
    }

    public final void Q6(kn0.g liveRoomInfo) {
        kotlin.jvm.internal.o.g(liveRoomInfo, "liveRoomInfo");
        com.tencent.mars.xlog.Log.i("MultiStreamSlice", "updateCurLiveRoomInfo currentPosition: " + this.f329116h + " size: " + this.f329117i.size());
        if (this.f329116h >= this.f329117i.size()) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj = this.f329117i.get(this.f329116h);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.la4 la4Var = (r45.la4) obj;
        java.util.LinkedList<r45.gv> linkedList = la4Var.f379273d.f378540m;
        if (linkedList != null) {
            for (r45.gv gvVar : linkedList) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(gvVar.f375538f);
                java.lang.String str = gvVar.f375537e;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                int i17 = gvVar.f375542m;
                java.lang.String str3 = gvVar.f375543n;
                java.lang.String str4 = gvVar.f375545p;
                if (str4 != null) {
                    str2 = str4;
                }
                hashMap.put(valueOf, new kn0.r(str, i17, str3, str2));
            }
        }
        liveRoomInfo.f309544k = hashMap;
        r45.ka4 channel_params = la4Var.f379273d;
        kotlin.jvm.internal.o.f(channel_params, "channel_params");
        liveRoomInfo.f309548o = channel_params;
        liveRoomInfo.f309547n = la4Var.f379273d.f378551v;
        ((mm2.n6) business(mm2.n6.class)).f329293f = pm0.v.z(liveRoomInfo.f309547n, 2);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f329120o.postValue(0);
    }
}
