package me5;

/* loaded from: classes4.dex */
public class f extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f325956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f325957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f325958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325960i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ me5.g f325961m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(me5.g gVar, int i17, r35.m3 m3Var, android.os.Bundle bundle, java.util.LinkedList linkedList, java.util.Map map, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f325961m = gVar;
        this.f325956e = bundle;
        this.f325957f = linkedList;
        this.f325958g = map;
        this.f325959h = weakReference;
        this.f325960i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        long j17 = this.f325956e.getLong("msg_id");
        me5.g gVar = this.f325961m;
        gVar.d(j17, this.f325957f, 1);
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        gVar.getClass();
        ((ih3.e) k1Var).Di("link_revoke", this.f325958g, this.f325956e, this.f325959h, this.f325960i);
    }
}
