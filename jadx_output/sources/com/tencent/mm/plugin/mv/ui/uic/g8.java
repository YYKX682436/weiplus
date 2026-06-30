package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes8.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f151152a;

    /* renamed from: b, reason: collision with root package name */
    public final long f151153b;

    public g8(android.content.Context context, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f151152a = context;
        this.f151153b = j17;
    }

    public final void a(long j17, int i17, java.lang.String msgType, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(msgType, "msgType");
        md0.e eVar = (md0.e) ((nd0.e) i95.n0.c(nd0.e.class));
        android.content.Context context = this.f151152a;
        r45.pk5 pk5Var = (r45.pk5) eVar.Ai(context, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk5Var.f383140o = (int) (j17 - this.f151153b);
        }
        if (pk5Var != null) {
            pk5Var.f383132d = i17;
        }
        if (pk5Var != null) {
            pk5Var.f383138m = msgType;
        }
        if (pk5Var != null) {
            pk5Var.f383137i = i18;
        }
        if (str != null && pk5Var != null) {
            pk5Var.f383142q = str;
        }
        l35.a.f315443a.a(context);
    }
}
