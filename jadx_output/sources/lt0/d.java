package lt0;

/* loaded from: classes15.dex */
public class d implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lt0.f f321165a;

    public d(lt0.f fVar) {
        this.f321165a = fVar;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        lt0.f fVar = this.f321165a;
        kk.h hVar = fVar.f321170e;
        if (hVar != null) {
            hVar.a(obj, fVar.s(obj2), fVar.s(obj3));
        }
    }
}
