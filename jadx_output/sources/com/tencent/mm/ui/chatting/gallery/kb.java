package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes11.dex */
public final class kb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f201155d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f201156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f201158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f201159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201160i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.f1 f201161m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.e1 f201162n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(java.lang.String str, long j17, long j18, java.lang.String str2, com.tencent.mm.ui.chatting.gallery.f1 f1Var, com.tencent.mm.ui.chatting.gallery.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201157f = str;
        this.f201158g = j17;
        this.f201159h = j18;
        this.f201160i = str2;
        this.f201161m = f1Var;
        this.f201162n = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.gallery.kb kbVar = new com.tencent.mm.ui.chatting.gallery.kb(this.f201157f, this.f201158g, this.f201159h, this.f201160i, this.f201161m, this.f201162n, continuation);
        kbVar.f201156e = obj;
        return kbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.kb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f201155d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f201156e;
            mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
            long j17 = this.f201158g;
            long j18 = this.f201159h;
            com.tencent.mm.plugin.backup.roambackup.p1 p1Var = (com.tencent.mm.plugin.backup.roambackup.p1) yVar;
            p1Var.getClass();
            java.lang.String talker = this.f201157f;
            kotlin.jvm.internal.o.g(talker, "talker");
            java.lang.String mediaId = this.f201160i;
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            kotlinx.coroutines.flow.m2 m2Var = new kotlinx.coroutines.flow.m2(new com.tencent.mm.plugin.backup.roambackup.g1(p1Var, talker, j17, j18, mediaId, null));
            com.tencent.mm.ui.chatting.gallery.jb jbVar = new com.tencent.mm.ui.chatting.gallery.jb(y0Var, this.f201161m, this.f201162n);
            this.f201155d = 1;
            if (m2Var.a(jbVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
