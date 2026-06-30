package df2;

/* loaded from: classes3.dex */
public final class a9 extends if2.b implements if2.e {
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData A;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229687m;

    /* renamed from: n, reason: collision with root package name */
    public int f229688n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f229689o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f229690p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f229691q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f229692r;

    /* renamed from: s, reason: collision with root package name */
    public final int f229693s;

    /* renamed from: t, reason: collision with root package name */
    public r45.yb4 f229694t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f229695u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f229696v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f229697w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData f229698x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData f229699y;

    /* renamed from: z, reason: collision with root package name */
    public kotlinx.coroutines.r2 f229700z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229687m = "GiftFundingDataController";
        this.f229689o = new byte[0];
        this.f229690p = jz5.h.b(df2.v8.f231588d);
        this.f229691q = "fund_uv_task_record";
        this.f229692r = "fund_uv_task_record_save_time";
        this.f229693s = 86400;
        this.f229695u = jz5.h.b(df2.u8.f231505d);
        this.f229696v = jz5.h.b(df2.w8.f231671d);
        this.f229697w = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData(null, 1, null);
        diffMutableLiveData.f111659e = new df2.t8(this);
        this.f229698x = diffMutableLiveData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData2 = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData(null, 1, null);
        diffMutableLiveData2.f111659e = new df2.z8(this);
        this.f229699y = diffMutableLiveData2;
        this.A = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    public final boolean Z6(java.lang.String taskId) {
        java.util.LinkedList list;
        com.tencent.mm.protobuf.f fVar;
        byte[] j17;
        kotlin.jvm.internal.o.g(taskId, "taskId");
        java.lang.Object obj = null;
        if (this.f229694t == null) {
            com.tencent.mm.sdk.platformtools.o4 a76 = a7();
            kotlin.jvm.internal.o.f(a76, "<get-mmkv>(...)");
            java.lang.String str = this.f229691q;
            if (a76.f(str) && (j17 = a76.j(str)) != null) {
                if (!(j17.length == 0)) {
                    try {
                        java.lang.Object newInstance = r45.yb4.class.newInstance();
                        ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                        fVar = (com.tencent.mm.protobuf.f) newInstance;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                    }
                    this.f229694t = (r45.yb4) fVar;
                }
            }
            fVar = null;
            this.f229694t = (r45.yb4) fVar;
        }
        r45.yb4 yb4Var = this.f229694t;
        if (yb4Var != null && (list = yb4Var.getList(0)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.cd4) next).getString(1), taskId)) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.cd4) obj;
        }
        return obj != null;
    }

    public final com.tencent.mm.sdk.platformtools.o4 a7() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f229690p).getValue();
    }

    public final boolean b7() {
        kotlinx.coroutines.r2 r2Var = this.f229700z;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i(this.f229687m, "[isFundingSucAnimPlaying] result = " + z17);
        return z17;
    }

    public final void c7(int i17) {
        com.tencent.mars.xlog.Log.i(this.f229687m, "[updateLastSendGiftTime] time = " + i17);
        synchronized (this.f229689o) {
            this.f229688n = i17;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f229697w.clear();
        ((ku5.t0) ku5.t0.f312615d).q(new df2.y8(true, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStartFromWindow() {
        super.onLiveStartFromWindow();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        kotlinx.coroutines.r2 r2Var = this.f229700z;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
