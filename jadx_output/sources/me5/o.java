package me5;

/* loaded from: classes5.dex */
public class o extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ih3.l f325982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f325983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f325984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325985h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325986i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ me5.p f325987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(me5.p pVar, int i17, r35.m3 m3Var, ih3.l lVar, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f325987m = pVar;
        this.f325982e = lVar;
        this.f325983f = map;
        this.f325984g = bundle;
        this.f325985h = weakReference;
        this.f325986i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        ih3.l lVar;
        me5.p pVar = this.f325987m;
        java.lang.ref.WeakReference weakReference = pVar.f291595d;
        if (weakReference != null && weakReference.get() != null) {
            com.tencent.mm.ui.chatting.component.yh yhVar = (com.tencent.mm.ui.chatting.component.yh) ((ih3.m) weakReference.get());
            yhVar.getClass();
            if (view != null && (lVar = this.f325982e) != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(lVar.f291593a);
                yhVar.n0(view, linkedList, lVar.f291594b);
            }
        }
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        pVar.getClass();
        ((ih3.e) k1Var).Di("link_revoke_qrcode", this.f325983f, this.f325984g, this.f325985h, this.f325986i);
    }
}
