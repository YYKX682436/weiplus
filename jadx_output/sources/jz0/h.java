package jz0;

/* loaded from: classes5.dex */
public final class h implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jz0.k f302579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f302580b;

    public h(jz0.k kVar, boolean z17) {
        this.f302579a = kVar;
        this.f302580b = z17;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        new com.tencent.mm.sdk.platformtools.n3().post(new jz0.g(this.f302579a, this.f302580b));
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
    }
}
