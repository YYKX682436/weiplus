package v72;

/* loaded from: classes12.dex */
public class g extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v72.i f433662q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v72.i iVar, p13.u uVar) {
        super(uVar);
        this.f433662q = iVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchFavoriteTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f351135n;
        vVar.f351159d = p13.r.b(uVar.f351141c, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor H = this.f433662q.f433667h.H(vVar.f351159d, o13.d.f342216b, null, null, false, false);
        while (H.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(H);
            p13.y yVar = (p13.y) hashMap.get(java.lang.Long.valueOf(zVar.f351186d));
            if (yVar == null || o13.n.b(o13.d.f342233s, zVar.f351185c, yVar.f351185c) < 0) {
                hashMap.put(java.lang.Long.valueOf(zVar.f351186d), zVar);
            }
            if (java.lang.Thread.interrupted() || this.f351066f) {
                H.close();
                throw new java.lang.InterruptedException();
            }
        }
        H.close();
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        vVar.f351160e = arrayList;
        arrayList.addAll(hashMap.values());
        java.util.Comparator comparator = uVar.f351150l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f351160e, comparator);
        }
    }
}
