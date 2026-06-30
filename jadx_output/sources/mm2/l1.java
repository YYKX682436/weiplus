package mm2;

/* loaded from: classes3.dex */
public final class l1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f329217d;

    public l1(mm2.s1 s1Var) {
        this.f329217d = s1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.p12 p12Var;
        java.lang.Object obj2;
        r45.q12 q12Var = (r45.q12) obj;
        mm2.s1 s1Var = this.f329217d;
        java.util.LinkedList linkedList = (java.util.LinkedList) ((kotlinx.coroutines.flow.h3) s1Var.f329388h).getValue();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (q12Var != null && ((r45.p12) obj2).getInteger(0) == q12Var.getInteger(0)) {
                    break;
                }
            }
            p12Var = (r45.p12) obj2;
        } else {
            p12Var = null;
        }
        ((kotlinx.coroutines.flow.h3) s1Var.f329389i).k(p12Var != null && p12Var.getBoolean(4) ? s1Var.f329390m : p12Var != null ? p12Var.getList(1) : null);
        if (kz5.b0.c(new java.lang.Integer(3)).contains(new java.lang.Integer(q12Var != null ? q12Var.getInteger(0) : 0))) {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) s1Var.business(mm2.g1.class)).f329072m).k(null);
        } else {
            r45.sm1 sm1Var = s1Var.C;
            if ((sm1Var != null ? (r45.fd2) sm1Var.getCustom(1) : null) == null) {
                ((kotlinx.coroutines.flow.h3) ((mm2.g1) s1Var.business(mm2.g1.class)).f329072m).k(p12Var != null && p12Var.getBoolean(5) ? s1Var.f329391n : p12Var != null ? (r45.fd2) p12Var.getCustom(2) : null);
            }
            ((mm2.o2) s1Var.business(mm2.o2.class)).clear();
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) s1Var.business(mm2.g1.class)).f329071i).k(null);
            ((mm2.c1) s1Var.business(mm2.c1.class)).f328783b5 = null;
        }
        if (q12Var != null) {
            ((mm2.e1) s1Var.business(mm2.e1.class)).n7(q12Var);
            int integer = q12Var.getInteger(0);
            if (integer == 1) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_POST_VIDEO_SUB_MODE_INT_SYNC, java.lang.Integer.valueOf(q12Var.getInteger(1)));
                ((mm2.c1) s1Var.business(mm2.c1.class)).Y4 = false;
            } else if (integer == 2) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_POST_VOICE_SUB_MODE_INT_SYNC, java.lang.Integer.valueOf(q12Var.getInteger(1)));
                ((mm2.c1) s1Var.business(mm2.c1.class)).Y4 = false;
            }
        }
        if (!((mm2.c1) s1Var.business(mm2.c1.class)).a8()) {
            ((mm2.c1) s1Var.business(mm2.c1.class)).f328778a5 = (q12Var != null ? q12Var.getInteger(0) : 0) == 3;
        }
        return jz5.f0.f302826a;
    }
}
