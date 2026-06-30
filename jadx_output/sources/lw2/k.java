package lw2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.m f321574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lw2.m mVar) {
        super(0);
        this.f321574d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewParent parent;
        android.view.ViewParent parent2;
        android.view.ViewParent parent3 = this.f321574d.f321576a.getParent();
        android.view.ViewParent parent4 = (parent3 == null || (parent = parent3.getParent()) == null || (parent2 = parent.getParent()) == null) ? null : parent2.getParent();
        if (parent4 instanceof com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout) {
            return (com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout) parent4;
        }
        return null;
    }
}
