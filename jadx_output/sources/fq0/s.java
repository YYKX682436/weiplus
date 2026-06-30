package fq0;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f265465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f265466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fq0.x xVar, boolean z17) {
        super(0);
        this.f265465d = xVar;
        this.f265466e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = this.f265465d.f265488l;
        android.view.ViewParent parent = magicSclViewContainer != null ? magicSclViewContainer.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(this.f265466e);
        }
        return jz5.f0.f302826a;
    }
}
