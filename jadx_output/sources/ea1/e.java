package ea1;

/* loaded from: classes12.dex */
public class e extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ea1.g f250514q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ea1.g gVar, p13.u uVar) {
        super(uVar);
        this.f250514q = gVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchWeAppTask";
    }

    @Override // p13.c
    public int k() {
        return 21;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f351135n;
        vVar.f351159d = p13.r.b(uVar.f351141c, true);
        vVar.f351160e = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor H = this.f250514q.f250518f.H(vVar.f351159d, o13.d.f342218d, uVar.f351146h, null, true, true);
        while (H.moveToNext()) {
            try {
                p13.z zVar = new p13.z();
                zVar.c(H);
                if (!hashSet.contains(java.lang.Long.valueOf(zVar.f351186d)) && !uVar.f351148j.contains(zVar.f351187e)) {
                    zVar.a();
                    vVar.f351160e.add(zVar);
                    hashSet.add(java.lang.Long.valueOf(zVar.f351186d));
                }
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    H.close();
                    throw th7;
                }
            }
        }
        H.close();
        java.util.Comparator comparator = uVar.f351150l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f351160e, comparator);
        }
    }
}
