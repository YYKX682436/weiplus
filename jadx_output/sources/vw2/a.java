package vw2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.o f440826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw2.n f440827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f440828f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.lifecycle.o oVar, vw2.n nVar, java.util.List list) {
        super(0);
        this.f440826d = oVar;
        this.f440827e = nVar;
        this.f440828f = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final androidx.lifecycle.o oVar = this.f440826d;
        oVar.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.finder.view.animation.btncarousel.ToolbarButtonCarouselAnimationHelper$1$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                java.util.Map map = vw2.n.f440866e;
                java.util.Iterator it = ((java.util.LinkedHashMap) vw2.n.f440868g).entrySet().iterator();
                while (it.hasNext()) {
                    ((android.animation.Animator) ((java.util.Map.Entry) it.next()).getValue()).cancel();
                }
                ((java.util.LinkedHashMap) vw2.n.f440868g).clear();
                ((java.util.LinkedHashMap) vw2.n.f440867f).clear();
                com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "removeAllHolders");
                androidx.lifecycle.o.this.c(this);
            }
        });
        ((java.util.ArrayList) this.f440827e.f440872d).addAll(this.f440828f);
        return jz5.f0.f302826a;
    }
}
