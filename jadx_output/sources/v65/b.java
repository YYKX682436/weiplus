package v65;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f433543f = java.util.regex.Pattern.compile("([0-9]+):([0-9]+)-([0-9]+):([0-9]+)");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f433544a;

    /* renamed from: b, reason: collision with root package name */
    public final long f433545b;

    /* renamed from: c, reason: collision with root package name */
    public final long f433546c;

    /* renamed from: d, reason: collision with root package name */
    public final long f433547d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f433548e;

    public b(java.lang.String tag, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f433544a = tag;
        this.f433545b = j17;
        this.f433546c = j18;
        this.f433547d = j19;
        this.f433548e = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i(tag, "init check controller now:" + j17 + " lastCheckTime:" + j18 + " defaultInterval:" + j19);
    }

    public final void a(java.lang.String configStr) {
        kotlin.jvm.internal.o.g(configStr, "configStr");
        java.util.List f07 = r26.n0.f0(configStr, new java.lang.String[]{"@"}, false, 0, 6, null);
        java.util.regex.Matcher matcher = f433543f.matcher((java.lang.CharSequence) f07.get(0));
        boolean find = matcher.find();
        java.lang.String str = this.f433544a;
        if (!find) {
            com.tencent.mars.xlog.Log.i(str, "not match regex ".concat(configStr));
            return;
        }
        java.lang.String group = matcher.group(1);
        int parseInt = group != null ? java.lang.Integer.parseInt(group) : 0;
        java.lang.String group2 = matcher.group(2);
        int parseInt2 = group2 != null ? java.lang.Integer.parseInt(group2) : 0;
        java.lang.String group3 = matcher.group(3);
        int parseInt3 = group3 != null ? java.lang.Integer.parseInt(group3) : 0;
        java.lang.String group4 = matcher.group(4);
        int parseInt4 = group4 != null ? java.lang.Integer.parseInt(group4) : 0;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, parseInt);
        calendar.set(12, parseInt2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(11, parseInt3);
        calendar2.set(12, parseInt4);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        long timeInMillis2 = calendar2.getTimeInMillis() < timeInMillis ? calendar2.getTimeInMillis() + 86400000 : calendar2.getTimeInMillis();
        long parseLong = java.lang.Long.parseLong((java.lang.String) f07.get(1)) * 1000;
        com.tencent.mars.xlog.Log.i(str, "addCheckCondition startTime:" + timeInMillis + " endTime:" + timeInMillis2 + " interval:" + parseLong);
        v65.a aVar = new v65.a(timeInMillis, timeInMillis2, parseLong);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f433548e;
        if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
    }

    public final boolean b() {
        java.util.List<v65.a> list = this.f433548e;
        boolean z17 = !list.isEmpty();
        java.lang.String str = this.f433544a;
        long j17 = this.f433545b;
        long j18 = this.f433546c;
        if (z17) {
            for (v65.a aVar : list) {
                if (aVar.f433540a <= j17) {
                    long j19 = aVar.f433541b;
                    if (j19 >= j17) {
                        long j27 = aVar.f433542c;
                        if (j18 + j27 < j17) {
                            com.tencent.mars.xlog.Log.i(str, "condition true startTime:" + aVar.f433540a + " endTime:" + j19 + " interval:" + j27);
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        boolean z18 = j18 + this.f433547d < j17;
        if (z18) {
            com.tencent.mars.xlog.Log.i(str, "condition true default condition");
        }
        return z18;
    }
}
