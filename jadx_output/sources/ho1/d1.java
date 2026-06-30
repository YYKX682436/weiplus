package ho1;

/* loaded from: classes9.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282653g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282654h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282655i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282656m;

    public d1(java.lang.String str, long j17, long j18, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, ho1.q1 q1Var) {
        this.f282650d = str;
        this.f282651e = j17;
        this.f282652f = j18;
        this.f282653g = arrayList;
        this.f282654h = arrayList2;
        this.f282655i = arrayList3;
        this.f282656m = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.v1.a("filterRestoreMediaAsync " + this.f282650d, new ho1.c1(this.f282651e, this.f282650d, this.f282652f, this.f282653g, this.f282654h, this.f282655i, this.f282656m));
    }
}
