package ji;

/* loaded from: classes12.dex */
public final class d extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ji.e f299873b;

    public d(ji.e eVar) {
        this.f299873b = eVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        ji.e eVar = this.f299873b;
        eVar.f299875b.postDelayed(eVar.f299874a, eVar.f299876c);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        ji.e eVar = this.f299873b;
        eVar.f299875b.removeCallbacks(eVar.f299874a);
    }
}
