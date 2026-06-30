package p12;

/* loaded from: classes10.dex */
public final class a implements com.tencent.mm.plugin.gif.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p12.b f351013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.k f351014b;

    public a(p12.b bVar, com.tencent.mm.plugin.gif.k kVar) {
        this.f351013a = bVar;
        this.f351014b = kVar;
    }

    @Override // com.tencent.mm.plugin.gif.x
    public void invalidate() {
        kotlinx.coroutines.flow.j2 j2Var = this.f351013a.f351025d;
        com.tencent.mm.plugin.gif.k kVar = this.f351014b;
        ((kotlinx.coroutines.flow.h3) j2Var).k(new android.util.Size(kVar.getIntrinsicWidth(), kVar.getIntrinsicHeight()));
    }

    @Override // com.tencent.mm.plugin.gif.x
    public void onAnimationEnd() {
    }
}
