package df2;

/* loaded from: classes3.dex */
public final class q1 extends if2.b implements com.tencent.mm.plugin.finder.live.widget.x7 {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.w7 f231126m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f231127n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f231128o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231127n = "";
        this.f231128o = "";
    }

    public void Z6(df2.kx action) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorOptionController", "onFocusMicClick, action=" + action + ", curUserSdkId=" + this.f231127n);
        df2.b3 b3Var = (df2.b3) controller(df2.b3.class);
        if (b3Var == null) {
            return;
        }
        int ordinal = action.ordinal();
        if (ordinal == 0) {
            ml2.h1[] h1VarArr = ml2.h1.f327520d;
            a7(2);
            b3Var.b7(this.f231127n);
        } else {
            if (ordinal != 1) {
                return;
            }
            ml2.h1[] h1VarArr2 = ml2.h1.f327520d;
            a7(3);
            b3Var.c7(this.f231127n);
        }
    }

    public final void a7(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.P2, jSONObject.toString(), null, 4, null);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        com.tencent.mm.plugin.finder.live.widget.w7 w7Var = this.f231126m;
        if (w7Var != null) {
            if (!w7Var.q()) {
                w7Var = null;
            }
            if (w7Var != null) {
                w7Var.a();
            }
        }
        this.f231126m = null;
    }
}
