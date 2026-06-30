package z56;

/* loaded from: classes16.dex */
public final class b extends z56.c {

    /* renamed from: e, reason: collision with root package name */
    public final z56.g f470284e;

    public b(p56.i iVar, z56.g gVar) {
        super(iVar);
        this.f470284e = gVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        for (z56.f fVar : ((z56.e) this.f470284e.get()).f470291b) {
            fVar.a(obj);
        }
    }

    @Override // p56.m
    public void onCompleted() {
        z56.g gVar = this.f470284e;
        if (gVar.f470298e) {
            java.lang.Object obj = s56.j.f403216b;
            for (z56.f fVar : gVar.b(obj)) {
                fVar.b(obj, gVar.f470302i);
            }
        }
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        z56.g gVar = this.f470284e;
        if (gVar.f470298e) {
            s56.i iVar = new s56.i(th6);
            java.util.ArrayList arrayList = null;
            for (z56.f fVar : gVar.b(iVar)) {
                try {
                    fVar.b(iVar, gVar.f470302i);
                } catch (java.lang.Throwable th7) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(th7);
                }
            }
            q56.f.a(arrayList);
        }
    }
}
