package xy4;

/* loaded from: classes15.dex */
public class a extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f458161d;

    public a(l75.k0 k0Var) {
        super(k0Var, yy4.a.f468480t2, "LabAppInfo", null);
        this.f458161d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean replace(yy4.a aVar) {
        yy4.a aVar2 = new yy4.a();
        aVar2.field_LabsAppId = aVar.field_LabsAppId;
        get(aVar2, new java.lang.String[0]);
        if (aVar.field_expId != aVar2.field_expId || aVar.field_sequence >= aVar2.field_sequence) {
            return super.replace(aVar);
        }
        com.tencent.mars.xlog.Log.i("LabAppInfoStorage", "sequence old origin.seq " + aVar2.field_sequence + " old.seq " + aVar.field_sequence);
        return false;
    }

    public java.util.List y0() {
        android.database.Cursor all = getAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (all.moveToNext()) {
            yy4.a aVar = new yy4.a();
            aVar.convertFrom(all);
            arrayList.add(aVar);
        }
        all.close();
        return arrayList;
    }

    public void z0(java.util.List list) {
        l75.k0 k0Var = this.f458161d;
        long b17 = k0Var != null ? k0Var.b() : -1L;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            yy4.a aVar = (yy4.a) it.next();
            if (!replace(aVar)) {
                insert(aVar);
            }
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(b17));
        }
    }
}
