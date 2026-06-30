package sc2;

/* loaded from: classes2.dex */
public final class u2 {
    public u2(kotlin.jvm.internal.i iVar) {
    }

    public final void a(in5.s0 holder, com.tencent.mm.autogen.events.FeedUpdateEvent event) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(event, "event");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        sc2.a8 a8Var = (sc2.a8) a17;
        am.ia iaVar = event.f54252g;
        int i17 = iaVar.f6919b;
        if (i17 == 8 && iaVar.f6925h == 2) {
            a8Var.T6(holder, sc2.r2.f406188d);
            com.tencent.mars.xlog.Log.i("FeedJumperAccountAroundObserver", "updateLivingStatus gone");
        } else if (i17 == 38) {
            a8Var.T6(holder, new sc2.t2(holder));
            com.tencent.mars.xlog.Log.i("FeedJumperAccountAroundObserver", "onFollowBtnShow");
        }
    }
}
