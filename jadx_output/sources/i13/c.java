package i13;

/* loaded from: classes10.dex */
public abstract class c implements in5.c {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f287274g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f287275d;

    /* renamed from: e, reason: collision with root package name */
    public final long f287276e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f287277f;

    public c(java.lang.String id6, long j17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(id6, "id");
        this.f287275d = id6;
        this.f287276e = j17;
        this.f287277f = new i13.b(this);
        java.util.HashMap hashMap = f287274g;
        i13.a aVar = (i13.a) hashMap.get(id6);
        boolean z17 = aVar != null ? aVar.f287272c : false;
        i13.a aVar2 = (i13.a) hashMap.get(id6);
        if (aVar2 == null || (str = aVar2.f287271b) == null) {
            str = id6 + "-removeSelf";
        }
        hashMap.put(id6, new i13.a(id6, str, z17));
    }

    public int a() {
        return ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).f303213g ? com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.r_) : com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479144r7);
    }

    public android.graphics.drawable.Drawable b() {
        return m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.wechat_icon, 0.0f);
    }

    public java.lang.String c() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.feh);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final boolean d() {
        i13.a aVar = (i13.a) f287274g.get(this.f287275d);
        if (aVar != null) {
            return aVar.f287272c;
        }
        return false;
    }

    public abstract boolean e();

    public abstract boolean f();

    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f287275d + " onAddToList");
    }

    public void i() {
    }

    public void j() {
        if (d()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        java.lang.String str = this.f287275d;
        sb6.append(str);
        sb6.append(" onExpose");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyMsgItem", sb6.toString());
        java.lang.String q17 = q();
        i13.a aVar = (i13.a) f287274g.get(str);
        if (aVar != null) {
            aVar.f287272c = true;
        }
        ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).n(q17);
        long j17 = this.f287276e;
        if (j17 != 0) {
            ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).k(this.f287277f, j17, q17);
        }
    }

    public abstract void k(android.view.View view);

    public void l(boolean z17) {
        if (d()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
            java.lang.String str = this.f287275d;
            sb6.append(str);
            sb6.append(" onHide");
            com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyMsgItem", sb6.toString());
            i13.a aVar = (i13.a) f287274g.get(str);
            if (aVar != null) {
                aVar.f287272c = false;
            }
            ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).n(q());
        }
    }

    public abstract void n(in5.s0 s0Var, android.view.View view, int i17);

    public void o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        java.lang.String str = this.f287275d;
        sb6.append(str);
        sb6.append(" onRemoveFromList");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyMsgItem", sb6.toString());
        i13.a aVar = (i13.a) f287274g.get(str);
        if (aVar != null) {
            aVar.f287272c = false;
        }
        ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).n(q());
    }

    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyMsgItem", "id=" + this.f287275d + " onUpdateInList");
        java.lang.String q17 = q();
        ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).n(q17);
        if (d()) {
            ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).k(this.f287277f, this.f287276e, q17);
        }
    }

    public final java.lang.String q() {
        java.lang.String str;
        i13.a aVar = (i13.a) f287274g.get(this.f287275d);
        return (aVar == null || (str = aVar.f287271b) == null) ? "" : str;
    }

    public /* synthetic */ c(java.lang.String str, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? 0L : j17);
    }
}
