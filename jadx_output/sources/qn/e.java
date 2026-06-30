package qn;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final qn.e f364886a = new qn.e();

    public final void a(qn.c cVar, qn.d dVar, qn.a aVar, java.lang.String str, qn.b bVar) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_top", kz5.c1.k(new jz5.l("top_obj", java.lang.Integer.valueOf(cVar.f364881d)), new jz5.l("top_result", java.lang.Integer.valueOf(dVar.f364885d)), new jz5.l("chat_username", str), new jz5.l("chat_type", java.lang.Integer.valueOf(aVar.f364872d)), new jz5.l("top_action_source", java.lang.Integer.valueOf(bVar.f364876d))), 34574);
    }

    public final void b(java.lang.String talker, qn.d topResult, qn.b topActionSource) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(topResult, "topResult");
        kotlin.jvm.internal.o.g(topActionSource, "topActionSource");
        java.lang.String r17 = c01.z1.r();
        if (com.tencent.mm.storage.z3.R3(talker)) {
            a(qn.c.f364879g, topResult, qn.a.f364869e, talker, topActionSource);
            return;
        }
        if (kotlin.jvm.internal.o.b(r17, talker)) {
            a(qn.c.f364878f, topResult, qn.a.f364869e, talker, topActionSource);
        } else if (com.tencent.mm.storage.z3.R4(talker)) {
            a(qn.c.f364877e, topResult, qn.a.f364870f, talker, topActionSource);
        } else {
            a(qn.c.f364877e, topResult, qn.a.f364869e, talker, topActionSource);
        }
    }
}
