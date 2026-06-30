package e53;

/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.Set entrySet = e53.b.f249613b.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            for (java.util.Map.Entry entry : ((java.util.Map) value).entrySet()) {
                if (((e53.c) entry.getValue()).f249624j != 0) {
                    if (((e53.c) entry.getValue()).f249623i) {
                        e53.c cVar = (e53.c) entry.getValue();
                        long j17 = cVar.f249622h;
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        cVar.f249622h = j17 + (android.os.SystemClock.elapsedRealtime() - ((e53.c) entry.getValue()).f249624j);
                    } else {
                        e53.c cVar2 = (e53.c) entry.getValue();
                        long j18 = cVar2.f249622h;
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        cVar2.f249622h = j18 + ((android.os.SystemClock.elapsedRealtime() - ((e53.c) entry.getValue()).f249624j) / 1000);
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.Set entrySet = e53.b.f249613b.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            for (java.util.Map.Entry entry : ((java.util.Map) value).entrySet()) {
                if (((e53.c) entry.getValue()).f249624j != 0) {
                    e53.c cVar = (e53.c) entry.getValue();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    cVar.f249624j = android.os.SystemClock.elapsedRealtime();
                }
            }
        }
    }
}
