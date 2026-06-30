package z51;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f470192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.p f470193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z51.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470193e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        z51.l lVar = new z51.l(this.f470193e, continuation);
        lVar.f470192d = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f470192d;
        z51.p pVar = this.f470193e;
        a61.c cVar = pVar.f470204k;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("sourceConfig");
            throw null;
        }
        java.lang.String str = cVar.f1721c;
        kotlin.jvm.internal.o.d(str);
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("first start play finish path is empty");
        }
        boolean h17 = kotlinx.coroutines.z0.h(y0Var);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!h17) {
            pVar.g("parse job is cancel");
            return f0Var;
        }
        pVar.f470207n = true;
        if (!pVar.f470208o) {
            z51.c cVar2 = (z51.c) pVar.a(z51.c.class);
            boolean z17 = ((z51.c) pVar.a(z51.c.class)).f470176h;
            pVar.f("parsed no finish case >> parseIsSuccess: " + z17);
            if (z17) {
                y51.d dVar = pVar.f470203j;
                if (dVar != null) {
                    a61.c cVar3 = pVar.f470204k;
                    if (cVar3 == null) {
                        kotlin.jvm.internal.o.o("sourceConfig");
                        throw null;
                    }
                    java.lang.Long l17 = cVar3.f1722d;
                    kotlin.jvm.internal.o.f(l17, "getMediaId(...)");
                    long longValue = l17.longValue();
                    aq.u0 u0Var = cVar2.f470177i;
                    kotlin.jvm.internal.o.d(u0Var);
                    dVar.b(longValue, u0Var);
                }
                pVar.f470209p = true;
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = pVar.f470200g;
                if (thumbPlayerViewContainer == null) {
                    kotlin.jvm.internal.o.o("tpPlayerView");
                    throw null;
                }
                a61.c cVar4 = pVar.f470204k;
                if (cVar4 == null) {
                    kotlin.jvm.internal.o.o("sourceConfig");
                    throw null;
                }
                thumbPlayerViewContainer.setVideoPath(cVar4.f1721c);
            } else {
                f65.q.b(f65.q.f259959a, "play_local_live_photo", -1, 0L, null, 12, null);
                y51.d dVar2 = pVar.f470203j;
                if (dVar2 != null) {
                    a61.c cVar5 = pVar.f470204k;
                    if (cVar5 == null) {
                        kotlin.jvm.internal.o.o("sourceConfig");
                        throw null;
                    }
                    java.lang.Long l18 = cVar5.f1722d;
                    kotlin.jvm.internal.o.f(l18, "getMediaId(...)");
                    long longValue2 = l18.longValue();
                    aq.u0 u0Var2 = cVar2.f470177i;
                    kotlin.jvm.internal.o.d(u0Var2);
                    dVar2.a(longValue2, u0Var2.f12975a.f12961b);
                }
                z51.h hVar = (z51.h) pVar.a(z51.h.class);
                hVar.f("showErrorTipAlert " + hVar.f470187f);
                if (hVar.f470187f) {
                    android.content.Context b17 = hVar.b();
                    java.lang.String tips = hVar.f470188g;
                    kotlin.jvm.internal.o.g(tips, "tips");
                    db5.e1.E(b17, tips, "", i65.a.r(b17, com.tencent.mm.R.string.f490454vi), false, b61.a.f18140d);
                }
            }
        }
        return f0Var;
    }
}
