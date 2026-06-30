package com.tencent.mm.plugin.messenger.foundation;

@j95.b
/* loaded from: classes9.dex */
public class a extends i95.w implements vg3.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f148621d = new java.util.concurrent.ConcurrentHashMap();

    public boolean Ai(com.tencent.mm.modelbase.p0 p0Var, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        vg3.a Bi = Bi(f9Var.getType());
        if (Bi != null) {
            return Bi.c(p0Var, f9Var, map);
        }
        return true;
    }

    public final vg3.a Bi(int i17) {
        vg3.a aVar = (vg3.a) this.f148621d.get(java.lang.Integer.valueOf(i17));
        if (aVar != null) {
            return aVar;
        }
        for (fs.q qVar : ((fs.c) fs.g.f(vg3.a5.class)).all()) {
            if (qVar.hasKey(java.lang.Integer.valueOf(i17))) {
                return (vg3.a) qVar.get();
            }
        }
        return null;
    }

    public void wi(com.tencent.mm.modelbase.p0 p0Var, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        vg3.a Bi = Bi(f9Var.getType());
        if (Bi != null) {
            Bi.b(p0Var, f9Var, map);
        }
    }
}
