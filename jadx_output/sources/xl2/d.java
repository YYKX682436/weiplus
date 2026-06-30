package xl2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final xl2.d f455115a = new xl2.d();

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(xl2.d dVar, android.content.Context context, java.lang.String str, int i17, long j17, long j18, java.lang.String userName, yz5.l lVar, int i18, java.lang.Object obj) {
        yz5.l lVar2 = (i18 & 64) != 0 ? null : lVar;
        dVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        pq5.g l17 = new ek2.d3(str, i17, java.lang.System.currentTimeMillis(), j17, j18, userName, null, 64, null).l();
        l17.K(new xl2.c(lVar2));
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            l17.f((im5.b) context);
        }
    }
}
