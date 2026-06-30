package rl2;

/* loaded from: classes3.dex */
public final class i extends be2.g {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f397198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l75.k0 db6) {
        super(db6, ce2.j.f40783p, "FinderLiveLastRewardInfo", dm.p4.f239132g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = ce2.j.f40783p;
        this.f397198e = db6;
    }

    public void y0(java.lang.String liveId, java.util.LinkedList infoList) {
        kotlin.jvm.internal.o.g(liveId, "liveId");
        kotlin.jvm.internal.o.g(infoList, "infoList");
        ce2.j jVar = new ce2.j();
        jVar.field_liveId = liveId;
        r45.s62 s62Var = new r45.s62();
        s62Var.set(0, infoList);
        jVar.field_lastRewardInfo = s62Var.toByteArray();
        replace(jVar);
    }
}
