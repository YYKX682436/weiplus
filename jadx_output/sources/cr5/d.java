package cr5;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f222010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f222011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zq5.e f222012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cr5.f f222013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Canvas f222014h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f222015i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f222016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f222017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f222018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f222019p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, java.util.List list2, zq5.e eVar, cr5.f fVar, android.graphics.Canvas canvas, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, boolean z17, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.f0 f0Var4) {
        super(1);
        this.f222010d = list;
        this.f222011e = list2;
        this.f222012f = eVar;
        this.f222013g = fVar;
        this.f222014h = canvas;
        this.f222015i = f0Var;
        this.f222016m = f0Var2;
        this.f222017n = z17;
        this.f222018o = f0Var3;
        this.f222019p = f0Var4;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zq5.e eVar;
        cr5.f fVar;
        android.graphics.Canvas canvas;
        android.graphics.Canvas withZooming = (android.graphics.Canvas) obj;
        kotlin.jvm.internal.o.g(withZooming, "$this$withZooming");
        java.util.Iterator it = this.f222010d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            eVar = this.f222012f;
            fVar = this.f222013g;
            canvas = this.f222014h;
            if (!hasNext) {
                break;
            }
            yq5.r rVar = (yq5.r) it.next();
            if (rVar.f464619b.b(eVar) && cr5.f.a(fVar, canvas, rVar, false)) {
                this.f222015i.f310116d++;
            }
        }
        for (yq5.r rVar2 : this.f222011e) {
            if (rVar2.f464619b.b(eVar)) {
                this.f222016m.f310116d++;
                if (cr5.f.a(fVar, canvas, rVar2, this.f222017n)) {
                    this.f222018o.f310116d++;
                }
            } else {
                this.f222019p.f310116d++;
            }
        }
        return jz5.f0.f302826a;
    }
}
