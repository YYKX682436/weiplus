package q04;

@j95.b
/* loaded from: classes4.dex */
public final class r extends i95.w implements xs.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f359398d = "MicroMsg.SecData.SecDataService";

    public void Ai(int i17, java.lang.String str, java.lang.Class cls, o04.q qVar) {
        jz5.f0 f0Var;
        requireAccountInitialized();
        if (str != null) {
            pm0.v.O("SecDBTag", new q04.i(i17, str, this, cls, qVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O("SecDBTag", new q04.j(qVar));
        }
    }

    public void Bi(int i17, java.lang.String str, java.lang.Class cls, o04.q qVar) {
        jz5.f0 f0Var;
        requireAccountInitialized();
        com.tencent.mars.xlog.Log.i(this.f359398d, "getWithoutClear subType:" + i17 + " id:" + str);
        if (str != null) {
            pm0.v.O("SecDBTag", new q04.k(i17, str, this, cls, qVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O("SecDBTag", new q04.l(qVar));
        }
    }

    public com.tencent.mm.protobuf.f Di(int i17, java.lang.String str, java.lang.Class cls) {
        androidx.lifecycle.c1 a17;
        requireAccountInitialized();
        if (str == null) {
            return null;
        }
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(r04.a.class);
        }
        r04.b X6 = ((r04.d) ((r04.a) a17).P6(r04.d.class)).X6(i17 + '_' + str);
        if (X6 != null) {
            r0 = cls != null ? (com.tencent.mm.protobuf.f) cls.newInstance() : null;
            if (r0 != null) {
                try {
                    r0.parseFrom(X6.field_data);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return r0;
    }

    public void Ni(int i17, java.lang.String str, o04.q qVar) {
        jz5.f0 f0Var;
        requireAccountInitialized();
        if (str != null) {
            pm0.v.O("SecDBTag", new q04.n(i17, str, qVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O("SecDBTag", new q04.o(qVar));
        }
    }

    public boolean Ri(int i17, java.lang.String str) {
        androidx.lifecycle.c1 a17;
        requireAccountInitialized();
        if (str == null) {
            return false;
        }
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(r04.a.class);
        }
        r04.d dVar = (r04.d) ((r04.a) a17).P6(r04.d.class);
        java.lang.String id6 = i17 + '_' + str;
        kotlin.jvm.internal.o.g(id6, "id");
        r04.b X6 = dVar.X6(id6);
        return (X6 != null ? com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(dVar, X6, false, false, 6, null) : 0) > 0;
    }

    public void Ui(int i17, java.lang.String str, com.tencent.mm.protobuf.f fVar) {
        if (str != null) {
            java.lang.String str2 = i17 + '_' + str;
            java.util.HashMap hashMap = r04.c.f368355a;
            java.util.HashMap hashMap2 = r04.c.f368355a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
            hashMap2.put(str2, fVar);
        }
    }

    public void Vi(int i17, java.lang.String str, com.tencent.mm.protobuf.f fVar, o04.q qVar) {
        jz5.f0 f0Var;
        requireAccountInitialized();
        if (str != null) {
            pm0.v.O("SecDBTag", new q04.p(i17, str, this, str, fVar, 259200000L, qVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O("SecDBTag", new q04.q(qVar, fVar));
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SEC_DATA_DB_VERSION_INT;
            java.lang.Object m17 = c17.m(u3Var, 0);
            java.lang.String str = gm0.j1.u().h() + "secdata/";
            java.lang.String str2 = str + "SecData.db";
            if (!kotlin.jvm.internal.o.b(m17, 2)) {
                com.tencent.mars.xlog.Log.i(this.f359398d, "diff version, delete old db;");
                com.tencent.mm.vfs.w6.f(str);
            }
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(r04.a.class);
            }
            if (((r04.a) a17).O6(str2)) {
                gm0.j1.u().c().x(u3Var, 2);
            }
            pm0.v.O("SecDBTag", new q04.m(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f359398d, e17, "create sec data db", new java.lang.Object[0]);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.HashMap hashMap = r04.c.f368355a;
        r04.c.f368355a.clear();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
    }

    public com.tencent.mm.protobuf.f wi(int i17, java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String str2 = i17 + '_' + str;
        java.util.HashMap hashMap = r04.c.f368355a;
        return (com.tencent.mm.protobuf.f) r04.c.f368355a.get(str2);
    }
}
