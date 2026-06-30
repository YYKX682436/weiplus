package s23;

/* loaded from: classes4.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f402338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f402339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s23.x f402340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.i2 f402341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f402342h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, s23.x xVar, r45.i2 i2Var, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f402339e = j17;
        this.f402340f = xVar;
        this.f402341g = i2Var;
        this.f402342h = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s23.w(this.f402339e, this.f402340f, this.f402341g, this.f402342h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s23.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f402338d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f402338d = 1;
            if (kotlinx.coroutines.k1.b(this.f402339e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        s23.x xVar = this.f402340f;
        androidx.appcompat.app.AppCompatActivity activity = xVar.f402343d.getActivity();
        if ((activity.isFinishing() || activity.isDestroyed()) ? false : true) {
            r45.h2 h2Var = this.f402341g.f376672d;
            ((ez0.f) xVar.a()).getClass();
            com.tencent.mm.storage.u3 u3Var = ez0.f.f257791b;
            if (h2Var == null) {
                java.lang.String v17 = gm0.j1.u().c().v(u3Var, "");
                r45.h2 h2Var2 = new r45.h2();
                kotlin.jvm.internal.o.d(v17);
                jy0.b.a(h2Var2, v17);
                h2Var = h2Var2;
            }
            java.util.LinkedList models = h2Var.f375770d;
            kotlin.jvm.internal.o.f(models, "models");
            java.util.ListIterator listIterator = models.listIterator(models.size());
            while (true) {
                boolean hasPrevious = listIterator.hasPrevious();
                j17 = this.f402342h;
                if (!hasPrevious) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (((r45.g2) obj2).f374831d == j17) {
                    break;
                }
            }
            r45.g2 g2Var = (r45.g2) obj2;
            java.util.LinkedList linkedList = h2Var.f375770d;
            if (g2Var == null) {
                g2Var = new r45.g2();
                g2Var.f374831d = j17;
                linkedList.add(g2Var);
            }
            long c17 = c01.id.c();
            java.util.LinkedList linkedList2 = g2Var.f374832e;
            if (linkedList2 != null) {
                linkedList2.add(java.lang.Long.valueOf(c17));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                n51.f.f335114a.d(jSONObject, "models", linkedList, false);
            } catch (java.lang.Exception unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            gm0.j1.u().c().x(u3Var, jSONObject2);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasActivityTemplateTipServiceImpl", "markShowActivityTemplateTip: type=" + j17 + ", nowTime=" + c17);
            ((ez0.f) xVar.a()).a(uy0.n.f431902e);
        }
        return jz5.f0.f302826a;
    }
}
