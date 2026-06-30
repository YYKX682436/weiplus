package ix3;

/* loaded from: classes7.dex */
public final class l2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final ix3.k f295482d;

    /* renamed from: e, reason: collision with root package name */
    public final ix3.j f295483e;

    /* renamed from: f, reason: collision with root package name */
    public final ix3.l f295484f;

    /* renamed from: g, reason: collision with root package name */
    public final ix3.m f295485g;

    /* renamed from: h, reason: collision with root package name */
    public final ix3.n f295486h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f295487i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295482d = new ix3.k();
        this.f295483e = new ix3.j();
        this.f295484f = new ix3.l();
        this.f295485g = new ix3.m();
        this.f295486h = new ix3.n();
        this.f295487i = jz5.h.b(new ix3.k2(this));
    }

    public final em.b3 T6() {
        return (em.b3) ((jz5.n) this.f295487i).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emj;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("浮窗调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.c2(this));
        }
        em.b3 T6 = T6();
        if (T6.f254135f == null) {
            T6.f254135f = (android.widget.Button) T6.f254130a.findViewById(com.tencent.mm.R.id.f482702rt2);
        }
        T6.f254135f.setOnClickListener(new ix3.d2(this));
        em.b3 T62 = T6();
        if (T62.f254136g == null) {
            T62.f254136g = (android.widget.Button) T62.f254130a.findViewById(com.tencent.mm.R.id.rmc);
        }
        T62.f254136g.setOnClickListener(new ix3.e2(this));
        em.b3 T63 = T6();
        if (T63.f254131b == null) {
            T63.f254131b = (android.widget.Button) T63.f254130a.findViewById(com.tencent.mm.R.id.rma);
        }
        T63.f254131b.setOnClickListener(new ix3.f2(this));
        em.b3 T64 = T6();
        if (T64.f254133d == null) {
            T64.f254133d = (android.widget.Button) T64.f254130a.findViewById(com.tencent.mm.R.id.rt9);
        }
        T64.f254133d.setOnClickListener(new ix3.g2(this));
        em.b3 T65 = T6();
        if (T65.f254132c == null) {
            T65.f254132c = (android.widget.Button) T65.f254130a.findViewById(com.tencent.mm.R.id.f482700rt1);
        }
        T65.f254132c.setOnClickListener(new ix3.h2(this));
        em.b3 T66 = T6();
        if (T66.f254137h == null) {
            T66.f254137h = (android.widget.Button) T66.f254130a.findViewById(com.tencent.mm.R.id.ssy);
        }
        T66.f254137h.setOnClickListener(new ix3.i2(this));
        em.b3 T67 = T6();
        if (T67.f254134e == null) {
            T67.f254134e = (android.widget.Button) T67.f254130a.findViewById(com.tencent.mm.R.id.f483747st0);
        }
        T67.f254134e.setOnClickListener(new ix3.j2(this));
        ix3.k kVar = this.f295482d;
        kVar.b(7, "wx26377be1b78047fa#0#1");
        kVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        kVar.Z("跑步记录仪");
        kVar.b0(1);
        ix3.j jVar = this.f295483e;
        jVar.b(33, "wx26377be1b78047fa#0#2");
        jVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        jVar.Z("跑步记录仪");
        jVar.b0(4096);
        ix3.l lVar = this.f295484f;
        lVar.b(17, "wx26377be1b78047fa#0#3");
        lVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        lVar.Z("小程序Voip");
        lVar.b0(32);
        ix3.m mVar = this.f295485g;
        mVar.b(16, "wx26377be1b78047fa#0#4");
        mVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        mVar.Z("王者荣耀");
        mVar.b0(16);
        ix3.n nVar = this.f295486h;
        nVar.b(6, "wx26377be1b78047fa#0#5");
        nVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        nVar.Z("音乐测试最大字符数量");
        nVar.b0(2);
    }
}
