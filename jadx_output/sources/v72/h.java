package v72;

/* loaded from: classes12.dex */
public class h extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v72.i f433663q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v72.i iVar, p13.u uVar) {
        super(uVar);
        this.f433663q = iVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchTopFavoriteTask";
    }

    @Override // p13.c
    public int k() {
        return 9;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        p13.r b17 = p13.r.b(this.f351135n.f351141c, true);
        vVar.f351159d = b17;
        v72.a aVar = this.f433663q.f433667h;
        int i17 = this.f351135n.f351147i + 1;
        aVar.getClass();
        if (b17.a()) {
            o17 = new d95.d();
        } else {
            o17 = ((com.tencent.mm.plugin.fts.o) aVar.f342198f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' ORDER BY -timestamp, subtype limit " + (i17 + 1) + ";", aVar.r(), aVar.r(), aVar.o(), aVar.r(), aVar.o(), aVar.o(), b17.f()), null);
        }
        vVar.f351160e = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        while (o17.moveToNext()) {
            if (hashSet.add(java.lang.String.valueOf(o17.getLong(3)))) {
                p13.z zVar = new p13.z();
                zVar.c(o17);
                vVar.f351160e.add(zVar);
                if (vVar.f351160e.size() > this.f351135n.f351147i) {
                    break;
                }
                if (java.lang.Thread.interrupted() || this.f351066f) {
                    o17.close();
                    throw new java.lang.InterruptedException();
                }
            }
        }
        o17.close();
    }
}
