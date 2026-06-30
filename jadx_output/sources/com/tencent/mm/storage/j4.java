package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class j4 implements com.tencent.mm.storage.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f195051a = new java.util.concurrent.ConcurrentHashMap();

    public j4(com.tencent.mm.storage.i4 i4Var) {
    }

    @Override // com.tencent.mm.storage.b8
    public com.tencent.mm.storage.z3 get(java.lang.String str) {
        for (com.tencent.mm.storage.b8 b8Var : this.f195051a.keySet()) {
            com.tencent.mm.storage.z3 z3Var = b8Var.get(str);
            if (z3Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactStorage", "[get] contact=" + z3Var.d1() + " listener=" + b8Var);
                return z3Var;
            }
        }
        java.util.Iterator it = ((fs.c) fs.g.f(com.tencent.mm.storage.c8.class)).all().iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.c8 c8Var = (com.tencent.mm.storage.c8) ((fs.q) it.next()).get();
            com.tencent.mm.storage.z3 z3Var2 = c8Var.get(str);
            if (z3Var2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactStorage", "[get] contact=" + z3Var2.d1() + " listener=" + c8Var);
                return z3Var2;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.storage.b8
    public int o0(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        for (com.tencent.mm.storage.b8 b8Var : this.f195051a.keySet()) {
            int o07 = b8Var.o0(z3Var, z17);
            if (o07 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactStorage", "[replace] ret=%s listener=%s", java.lang.Integer.valueOf(o07), b8Var);
                return o07;
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.storage.c8.class)).all()) {
            int o08 = ((com.tencent.mm.storage.c8) qVar.get()).o0(z3Var, z17);
            if (o08 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactStorage", "[replace] ret=%s listener=%s", java.lang.Integer.valueOf(o08), qVar.get());
                return o08;
            }
        }
        return -1;
    }

    @Override // com.tencent.mm.storage.b8
    public void w0(final com.tencent.mm.storage.e8 e8Var, final com.tencent.mm.storage.z3 z3Var) {
        java.util.Iterator it = this.f195051a.keySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.storage.b8) it.next()).w0(e8Var, z3Var);
        }
        fs.g.b(com.tencent.mm.storage.c8.class, new fs.o() { // from class: com.tencent.mm.storage.j4$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.tencent.mm.storage.c8) nVar).w0(com.tencent.mm.storage.e8.this, z3Var);
                return false;
            }
        });
    }
}
