package nv3;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final nv3.c f340654a = new nv3.c();

    public final void a(rv3.h item, int i17, boolean z17, int i18, dv3.c cVar, ev3.d dVar) {
        kotlin.jvm.internal.o.g(item, "item");
        nv3.a aVar = new nv3.a(item, z17, cVar, i17, dVar, i18);
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info = item.f400395d;
        kotlin.jvm.internal.o.g(info, "info");
        c(info, r45.kh.kBgmInteractType_Fav, z17 ? r45.jh.kBgmInteractFlag_None : r45.jh.kBgmInteractFlag_Del, aVar);
    }

    public final void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, int i17, rv3.v musicPlayStatus, ev3.d dVar) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
        c(info, r45.kh.kBgmInteractType_Listen, z17 ? r45.jh.kBgmInteractFlag_None : r45.jh.kBgmInteractFlag_Del, new nv3.b(dVar, i17, info, z17, musicPlayStatus));
    }

    public final void c(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, r45.kh type, r45.jh flag, yz5.p pVar) {
        int i17 = audioCacheInfo.I;
        r45.pg4 pg4Var = audioCacheInfo.A;
        long Z = pm0.v.Z(pg4Var != null ? pg4Var.f383018d : null);
        r45.pg4 pg4Var2 = audioCacheInfo.A;
        long Z2 = pm0.v.Z(pg4Var2 != null ? pg4Var2.f383024m : null);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(flag, "flag");
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        new bq.l1(type, flag, Z, Z2, i17, currentTimeMillis).l().h(new cq.l0(pVar));
    }
}
