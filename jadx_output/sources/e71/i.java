package e71;

/* loaded from: classes4.dex */
public class i extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f249879e = {l75.n0.getCreateSQLs(e71.h.D, "SafeDeviceInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f249880d;

    public i(l75.k0 k0Var) {
        super(k0Var, e71.h.D, "SafeDeviceInfo", null);
        this.f249880d = k0Var;
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        return super.insert((e71.h) f0Var);
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        return super.replace((e71.h) f0Var);
    }

    public java.util.List y0() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (getCount() > 0) {
            android.database.Cursor all = super.getAll();
            while (all.moveToNext()) {
                e71.h hVar = new e71.h();
                hVar.convertFrom(all);
                linkedList.add(hVar);
            }
            all.close();
        }
        return linkedList;
    }
}
