package vu0;

/* loaded from: classes5.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440059d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f440061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f440062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.List list, vu0.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440061f = list;
        this.f440062g = o0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vu0.c0 c0Var = new vu0.c0(this.f440061f, this.f440062g, continuation);
        c0Var.f440060e = obj;
        return c0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vu0.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f440059d;
        vu0.o0 o0Var = this.f440062g;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f440060e;
            java.util.List list = this.f440061f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlinx.coroutines.l.b(y0Var, null, null, new vu0.b0(o0Var, (com.tencent.maas.moviecomposing.segments.ClipSegment) it.next(), null), 3, null));
            }
            this.f440059d = 1;
            obj = kotlinx.coroutines.h.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Iterable iterable = (java.lang.Iterable) obj;
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it6 = iterable.iterator();
            while (it6.hasNext()) {
                if (((yu0.d) it6.next()) != null) {
                    break;
                }
            }
        }
        z17 = false;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("VideoSubtitleService", "automaticSubtitles: not any group");
            o0Var.f440130c.c(o0Var.f440132e.a());
        }
        return jz5.f0.f302826a;
    }
}
