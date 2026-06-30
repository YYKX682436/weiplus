package ki4;

/* loaded from: classes11.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ki4.l0 f308144a = new ki4.l0();

    public final mj4.h a(java.lang.String str) {
        mj4.w Ai;
        if ((str == null || r26.n0.N(str)) || (Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(str)) == null) {
            return null;
        }
        pj4.b0 t07 = Ai.t0();
        if (t07 == null) {
            t07 = new pj4.b0();
        }
        ni4.x xVar = ni4.x.f337776d;
        mj4.j jVar = new mj4.j(new mj4.k(new mj4.a()));
        jVar.h(str);
        java.lang.String field_textStatusId = Ai.field_textStatusId;
        kotlin.jvm.internal.o.f(field_textStatusId, "field_textStatusId");
        jVar.g(field_textStatusId);
        mj4.h a17 = ((mj4.j) xVar.f(new mj4.j((mj4.k) jVar.a()), t07)).a();
        if (xe0.j0.a(a17, false, 1, null).f355215f == null || xe0.j0.a(a17, false, 1, null).f355215f.isEmpty()) {
            return null;
        }
        return a17;
    }
}
