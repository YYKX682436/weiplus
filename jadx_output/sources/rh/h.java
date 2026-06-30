package rh;

/* loaded from: classes12.dex */
public class h implements wh.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.m f395405a;

    public h(rh.m mVar) {
        this.f395405a = mVar;
    }

    public void a(int i17, long j17, long j18, long j19, int i18, android.app.PendingIntent pendingIntent, android.app.AlarmManager.OnAlarmListener onAlarmListener) {
        java.util.Collection collection;
        java.lang.String str = "";
        if (this.f395405a.f395294a.f363335d.f363296o) {
            java.lang.String stackTrace = android.util.Log.getStackTraceString(new java.lang.Throwable());
            java.lang.Integer num = wh.m.f445830a;
            kotlin.jvm.internal.o.g(stackTrace, "stackTrace");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List g17 = new r26.t("\n\t").g(stackTrace, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f313996d;
            java.lang.Object[] array = collection.toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            boolean isEmpty = android.text.TextUtils.isEmpty("at android.app.AlarmManager");
            for (java.lang.String str2 : (java.lang.String[]) array) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    if (!isEmpty && r26.i0.A(str2, "at android.app.AlarmManager", false, 2, null)) {
                        isEmpty = true;
                    }
                    if (isEmpty) {
                        int length = str2.length() - 1;
                        int i19 = 0;
                        boolean z17 = false;
                        while (i19 <= length) {
                            boolean z18 = kotlin.jvm.internal.o.i(str2.charAt(!z17 ? i19 : length), 32) <= 0;
                            if (z17) {
                                if (!z18) {
                                    break;
                                } else {
                                    length--;
                                }
                            } else if (z18) {
                                i19++;
                            } else {
                                z17 = true;
                            }
                        }
                        arrayList.add(str2.subSequence(i19, length + 1).toString());
                    }
                }
            }
            int size = arrayList.size();
            if (5 <= size) {
                size = 5;
            }
            str = android.text.TextUtils.join(";", arrayList.subList(0, size));
            kotlin.jvm.internal.o.f(str, "TextUtils.join(\";\", stac…erceAtMost(stacks.size)))");
        }
        oj.j.c("Matrix.battery.AlarmMonitorFeature", "#onAlarmSet, target = " + new rh.i(i17, j17, j18, j19, i18, str), new java.lang.Object[0]);
        if (pendingIntent == null && onAlarmListener == null) {
            return;
        }
        if (pendingIntent != null) {
            pendingIntent.hashCode();
        } else {
            onAlarmListener.hashCode();
        }
        rh.l lVar = this.f395405a.f395451c;
        synchronized (lVar.f395438a) {
            lVar.f395439b++;
            lVar.f395440c++;
        }
    }
}
