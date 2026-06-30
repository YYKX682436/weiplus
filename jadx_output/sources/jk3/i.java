package jk3;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f300087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f300088f;

    public i(jk3.v vVar, boolean z17, android.graphics.Bitmap bitmap) {
        this.f300086d = vVar;
        this.f300087e = z17;
        this.f300088f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk3.v vVar = this.f300086d;
        jk3.f fVar = vVar.f300125r;
        if (fVar != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new pk3.j((pk3.l) fVar, !java.lang.Boolean.valueOf(vVar.f300121n).booleanValue() || java.lang.Boolean.valueOf(vVar.f300121n) == null, java.lang.Boolean.valueOf(vVar.f300121n).booleanValue(), new jk3.h(this.f300087e, vVar, this.f300088f)));
        }
    }
}
