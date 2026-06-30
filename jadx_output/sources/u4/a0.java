package u4;

/* loaded from: classes13.dex */
public class a0 implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f424438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f424439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f424440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f424441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f424442h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f424443i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u4.c0 f424444m;

    public a0(u4.c0 c0Var, java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2, java.lang.Object obj3, java.util.ArrayList arrayList3) {
        this.f424444m = c0Var;
        this.f424438d = obj;
        this.f424439e = arrayList;
        this.f424440f = obj2;
        this.f424441g = arrayList2;
        this.f424442h = obj3;
        this.f424443i = arrayList3;
    }

    @Override // u4.b1
    public void a(androidx.transition.Transition transition) {
    }

    @Override // u4.b1
    public void b(androidx.transition.Transition transition) {
        u4.c0 c0Var = this.f424444m;
        java.lang.Object obj = this.f424438d;
        if (obj != null) {
            c0Var.o(obj, this.f424439e, null);
        }
        java.lang.Object obj2 = this.f424440f;
        if (obj2 != null) {
            c0Var.o(obj2, this.f424441g, null);
        }
        java.lang.Object obj3 = this.f424442h;
        if (obj3 != null) {
            c0Var.o(obj3, this.f424443i, null);
        }
    }

    @Override // u4.b1
    public void c(androidx.transition.Transition transition) {
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
    }
}
