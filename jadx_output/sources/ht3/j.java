package ht3;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.l f284952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ht3.l lVar) {
        super(1);
        this.f284952d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return it.getTag(com.tencent.mm.R.id.f482770ni) + i65.a.r(this.f284952d.getActivity(), com.tencent.mm.R.string.f489946gb);
    }
}
