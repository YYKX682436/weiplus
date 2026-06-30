package ir;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ir.h f293880a;

    /* renamed from: b, reason: collision with root package name */
    public final ir.n0 f293881b;

    /* renamed from: c, reason: collision with root package name */
    public ir.q f293882c;

    /* renamed from: d, reason: collision with root package name */
    public ir.q f293883d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.c0 f293884e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.c0 f293885f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f293886g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f293887h;

    public o(ir.h config, ir.n0 dataListener) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(dataListener, "dataListener");
        this.f293880a = config;
        this.f293881b = dataListener;
        this.f293882c = new ir.q();
        this.f293883d = new ir.q();
        new java.util.HashSet();
    }

    public final void a(ir.r rVar) {
        int size = this.f293883d.f293891b.size();
        this.f293883d.f293891b.add(rVar);
        this.f293883d.f293892c.add(new ir.y0(rVar, size));
    }

    public final void b() {
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelData", "postUpdate() delay: %s", 0L);
            if (this.f293886g) {
                this.f293887h = true;
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelData", "updateData: start " + this.f293880a.f293844c + ", " + this.f293880a.f293845d + ", " + this.f293880a.f293848g + ", " + this.f293880a.f293850i + ", " + this.f293880a.f293843b);
            this.f293886g = true;
            pm0.v.Q("EmojiPanelData_updateData", false, new ir.n(this), 0L, 2, null);
        }
    }
}
