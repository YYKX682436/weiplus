package mm2;

/* loaded from: classes10.dex */
public final class j5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329181f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(new nm2.d("", false));
        this.f329181f = a17;
        this.f329182g = a17;
    }

    public final boolean N6(nm2.a aVar, nm2.a aVar2) {
        if (aVar instanceof nm2.c) {
            if (aVar2 instanceof nm2.b) {
                return kotlin.jvm.internal.o.b(((nm2.b) aVar2).a(), ((nm2.c) aVar).a());
            }
            if (aVar2 instanceof nm2.d) {
                return kotlin.jvm.internal.o.b(((nm2.d) aVar2).a(), ((nm2.c) aVar).a());
            }
            if (aVar2 instanceof nm2.c) {
                return kotlin.jvm.internal.o.b(((nm2.c) aVar2).a(), ((nm2.c) aVar).a());
            }
            return false;
        }
        if (!(aVar instanceof nm2.b)) {
            if (!(aVar instanceof nm2.d) || (aVar2 instanceof nm2.b)) {
                return false;
            }
            return (aVar2 instanceof nm2.d) || (aVar2 instanceof nm2.c);
        }
        if (aVar2 instanceof nm2.b) {
            return kotlin.jvm.internal.o.b(((nm2.b) aVar2).a(), ((nm2.b) aVar).a());
        }
        if (aVar2 instanceof nm2.d) {
            return kotlin.jvm.internal.o.b(((nm2.d) aVar2).a(), ((nm2.b) aVar).a());
        }
        boolean z17 = aVar2 instanceof nm2.c;
        return false;
    }

    public final void O6(nm2.a aVar) {
        ((kotlinx.coroutines.flow.h3) this.f329181f).k(aVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setState: ");
        sb6.append(aVar != null ? aVar.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("LiveRequestSongAuditionSlice", sb6.toString());
    }

    public final boolean P6(java.lang.String songMid, boolean z17) {
        kotlin.jvm.internal.o.g(songMid, "songMid");
        nm2.c cVar = new nm2.c(songMid, 0, z17);
        kotlinx.coroutines.flow.f3 f3Var = this.f329182g;
        if (N6((nm2.a) ((kotlinx.coroutines.flow.h3) f3Var).getValue(), cVar)) {
            O6(cVar);
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDownloading failed: cannot transfer from ");
        nm2.a aVar = (nm2.a) ((kotlinx.coroutines.flow.h3) f3Var).getValue();
        sb6.append(aVar != null ? aVar.getClass().getSimpleName() : null);
        sb6.append(" to LoadingAuditionState");
        com.tencent.mars.xlog.Log.w("LiveRequestSongAuditionSlice", sb6.toString());
        return false;
    }

    public final boolean Q6(java.lang.String songMid, boolean z17) {
        kotlin.jvm.internal.o.g(songMid, "songMid");
        nm2.b bVar = new nm2.b(songMid, z17);
        kotlinx.coroutines.flow.f3 f3Var = this.f329182g;
        if (N6((nm2.a) ((kotlinx.coroutines.flow.h3) f3Var).getValue(), bVar)) {
            O6(bVar);
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startListening failed: cannot transfer from ");
        nm2.a aVar = (nm2.a) ((kotlinx.coroutines.flow.h3) f3Var).getValue();
        sb6.append(aVar != null ? aVar.getClass().getSimpleName() : null);
        sb6.append(" to ListeningAuditionState");
        com.tencent.mars.xlog.Log.w("LiveRequestSongAuditionSlice", sb6.toString());
        return false;
    }

    public final boolean R6(java.lang.String songMid, boolean z17) {
        kotlin.jvm.internal.o.g(songMid, "songMid");
        nm2.d dVar = new nm2.d(songMid, z17);
        kotlinx.coroutines.flow.f3 f3Var = this.f329182g;
        if (N6((nm2.a) ((kotlinx.coroutines.flow.h3) f3Var).getValue(), dVar)) {
            O6(dVar);
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAudition failed: cannot transfer from ");
        nm2.a aVar = (nm2.a) ((kotlinx.coroutines.flow.h3) f3Var).getValue();
        sb6.append(aVar != null ? aVar.getClass().getSimpleName() : null);
        sb6.append(" to NoneAuditionState");
        com.tencent.mars.xlog.Log.w("LiveRequestSongAuditionSlice", sb6.toString());
        return false;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        java.lang.String str;
        super.onCleared();
        kotlinx.coroutines.flow.f3 f3Var = this.f329182g;
        nm2.a aVar = (nm2.a) ((kotlinx.coroutines.flow.h3) f3Var).getValue();
        if (aVar == null || (str = aVar.b()) == null) {
            str = "";
        }
        nm2.a aVar2 = (nm2.a) ((kotlinx.coroutines.flow.h3) f3Var).getValue();
        R6(str, aVar2 != null ? aVar2.d() : false);
    }
}
