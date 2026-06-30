package ri;

/* loaded from: classes12.dex */
public class f implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        ri.a.c("alarm", str, str2, str3, str4, str5, obj, objArr);
        str4.getClass();
        char c17 = 65535;
        switch (str4.hashCode()) {
            case -749083434:
                if (str4.equals("setExactAndAllowWhileIdle")) {
                    c17 = 0;
                    break;
                }
                break;
            case -683202289:
                if (str4.equals("setInexactRepeating")) {
                    c17 = 1;
                    break;
                }
                break;
            case 113762:
                if (str4.equals("set")) {
                    c17 = 2;
                    break;
                }
                break;
            case 693646066:
                if (str4.equals("setWindow")) {
                    c17 = 3;
                    break;
                }
                break;
            case 884077093:
                if (str4.equals("setRepeating")) {
                    c17 = 4;
                    break;
                }
                break;
            case 1391659965:
                if (str4.equals("setExact")) {
                    c17 = 5;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                android.app.PendingIntent pendingIntent = null;
                long j17 = 0;
                for (java.lang.Object obj2 : objArr) {
                    if (j17 == 0 && (obj2 instanceof java.lang.Long)) {
                        j17 = ((java.lang.Long) obj2).longValue();
                    }
                    if (pendingIntent == null && (obj2 instanceof android.app.PendingIntent)) {
                        pendingIntent = (android.app.PendingIntent) obj2;
                    }
                }
                if (pendingIntent == null || j17 < java.lang.System.currentTimeMillis()) {
                    return;
                }
                ((com.tencent.mm.feature.performance.q) ((ob0.i3) i95.n0.c(ob0.i3.class))).Ni("type_alarm", j17, bm5.f1.a(), "", pendingIntent.toString());
                return;
            default:
                return;
        }
    }
}
