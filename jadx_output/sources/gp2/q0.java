package gp2;

/* loaded from: classes10.dex */
public final class q0 implements in5.z {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f274296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f274297e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f274298f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f274299g;

    /* renamed from: h, reason: collision with root package name */
    public int f274300h;

    /* renamed from: i, reason: collision with root package name */
    public int f274301i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f274302m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f274303n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f274304o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.MotionEvent f274305p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f274306q;

    public q0(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17, yz5.l invokeOnTouchMoveCallback, yz5.l invokeAutoPlayCallback) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(invokeOnTouchMoveCallback, "invokeOnTouchMoveCallback");
        kotlin.jvm.internal.o.g(invokeAutoPlayCallback, "invokeAutoPlayCallback");
        this.f274296d = recyclerView;
        this.f274297e = z17;
        this.f274298f = invokeOnTouchMoveCallback;
        this.f274299g = invokeAutoPlayCallback;
        this.f274300h = -1;
        this.f274306q = jz5.h.b(new gp2.n0(this));
    }

    @Override // in5.z
    public boolean f(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var, android.view.MotionEvent event) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("NearbyLiveItemOnTouchEventAdapter", "ACTION pos:" + i17 + " (" + event.getAction() + ", " + event.getX() + ", " + event.getY() + ')');
        this.f274300h = i17;
        int action = event.getAction();
        if (action == 0) {
            com.tencent.mars.xlog.Log.i("NearbyLiveItemOnTouchEventAdapter", "ACTION_DOWN pos:" + i17 + " (" + event.getX() + ", " + event.getY() + ')');
            this.f274302m = false;
            this.f274301i = 0;
        } else if (action == 1 || action == 3) {
            com.tencent.mars.xlog.Log.i("NearbyLiveItemOnTouchEventAdapter", "ACTION_UP pos:" + i17 + " (" + event.getX() + ", " + event.getY() + ')');
        }
        return false;
    }
}
