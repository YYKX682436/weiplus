package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class os {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f170121a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f170122b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f170123c;

    static {
        new java.util.HashMap();
        f170121a = new java.util.HashMap();
        f170122b = new java.util.HashMap();
        f170123c = new java.util.HashMap();
    }

    public static java.lang.String a(android.content.Context context, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j17);
        boolean z17 = false;
        boolean z18 = calendar.get(1) == calendar2.get(1);
        boolean z19 = z18 && calendar.get(2) == calendar2.get(2);
        boolean z27 = z18 && z19 && calendar.get(5) == calendar2.get(5);
        boolean z28 = z18 && z19 && calendar.get(5) - 1 == calendar2.get(5);
        if (!z28) {
            if ((z18 && calendar.get(2) - 1 == calendar2.get(2)) || calendar.get(1) - calendar2.get(1) == 1) {
                calendar.add(5, -1);
                if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
                    z17 = true;
                }
                z28 = z17;
            }
        }
        if (z27) {
            java.lang.String str = (java.lang.String) c(context, j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str;
        }
        if (z28) {
            java.lang.String str2 = context.getString(com.tencent.mm.R.string.fdi) + " " + ((java.lang.String) c(context, j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str2;
        }
        java.lang.String str3 = (java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcl), j17);
        if (str3.indexOf("-") > 0) {
            int i17 = calendar2.get(2) + 1;
            str3 = calendar2.get(5) + " " + e(context, i17);
            if (!z18) {
                str3 = str3 + " " + calendar2.get(1);
            }
        }
        java.lang.String str4 = str3 + " " + ((java.lang.String) c(context, j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return str4;
    }

    public static synchronized java.lang.String b(android.content.Context context, long j17) {
        synchronized (com.tencent.mm.plugin.sns.ui.os.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
            if (j17 < 3600000) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return "";
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            java.util.HashMap hashMap = f170122b;
            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                if (timeInMillis - ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() < 60000) {
                    java.util.HashMap hashMap2 = f170123c;
                    if (hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
                        java.lang.String str = (java.lang.String) hashMap2.get(java.lang.Long.valueOf(j17));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                        return str;
                    }
                } else {
                    hashMap.remove(java.lang.Long.valueOf(j17));
                }
            }
            long j18 = timeInMillis - j17;
            if (j18 / 3600000 == 0) {
                int i17 = (int) (j18 / 60000);
                if (i17 < 1) {
                    i17 = 1;
                }
                java.lang.String quantityString = context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489674k, i17, java.lang.Integer.valueOf(i17));
                f170123c.put(java.lang.Long.valueOf(j17), quantityString);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return quantityString;
            }
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis2 = j17 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis2 > 0 && timeInMillis2 <= 86400000) {
                int i18 = (int) (j18 / 3600000);
                if (i18 < 1) {
                    i18 = 1;
                }
                java.lang.String quantityString2 = context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489673j, i18, java.lang.Integer.valueOf(i18));
                f170123c.put(java.lang.Long.valueOf(j17), quantityString2);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return quantityString2;
            }
            long timeInMillis3 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
            if (timeInMillis3 > 0 && timeInMillis3 <= 86400000) {
                java.lang.String string = context.getString(com.tencent.mm.R.string.fdi);
                f170123c.put(java.lang.Long.valueOf(j17), string);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return string;
            }
            int timeInMillis4 = (int) (((gregorianCalendar2.getTimeInMillis() + 86400000) - j17) / 86400000);
            if (timeInMillis4 < 1) {
                timeInMillis4 = 1;
            }
            java.lang.String quantityString3 = context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489675l, timeInMillis4, java.lang.Integer.valueOf(timeInMillis4));
            f170123c.put(java.lang.Long.valueOf(j17), quantityString3);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return quantityString3;
        }
    }

    public static java.lang.CharSequence c(android.content.Context context, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromatSnsTime24", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.lang.CharSequence format = android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcv), j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromatSnsTime24", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return format;
    }

    public static java.lang.String d(android.content.Context context, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j17);
        boolean z17 = false;
        boolean z18 = calendar.get(1) == calendar2.get(1);
        boolean z19 = z18 && calendar.get(2) == calendar2.get(2);
        boolean z27 = z18 && z19 && calendar.get(5) == calendar2.get(5);
        boolean z28 = z18 && z19 && calendar.get(5) - 1 == calendar2.get(5);
        if (!z28) {
            if ((z18 && calendar.get(2) - 1 == calendar2.get(2)) || calendar.get(1) - calendar2.get(1) == 1) {
                calendar.add(5, -1);
                if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
                    z17 = true;
                }
                z28 = z17;
            }
        }
        if (z27) {
            java.lang.String str = (java.lang.String) c(context, j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str;
        }
        if (z28) {
            java.lang.String str2 = context.getString(com.tencent.mm.R.string.fdi) + " " + ((java.lang.String) c(context, j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str2;
        }
        java.lang.String str3 = z18 ? (java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.f492135fc2), j17) : (java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcl), j17);
        if (str3.indexOf("-") > 0) {
            int i17 = calendar2.get(2) + 1;
            str3 = calendar2.get(5) + " " + e(context, i17);
            if (!z18) {
                str3 = str3 + " " + calendar2.get(1);
            }
        }
        java.lang.String str4 = str3 + " " + ((java.lang.String) c(context, j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return str4;
    }

    public static java.lang.String e(android.content.Context context, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.lang.String[] stringArray = context.getResources().getStringArray(com.tencent.mm.R.array.f478030af);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("");
        for (java.lang.String str : stringArray) {
            arrayList.add(str);
        }
        if (i17 >= arrayList.size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return "";
        }
        java.lang.String str2 = (java.lang.String) arrayList.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return str2;
    }

    public static int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getYear", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        int i17 = new java.util.GregorianCalendar().get(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getYear", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return i17;
    }

    public static void g(android.content.Context context, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.lang.String[] stringArray = context.getResources().getStringArray(com.tencent.mm.R.array.f478030af);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("");
        for (java.lang.String str2 : stringArray) {
            arrayList.add(str2);
        }
        ((java.util.HashMap) f170121a).put(str, arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
    }

    public static boolean h(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        int i17 = gregorianCalendar.get(7) - 1;
        if (i17 == 0) {
            i17 = 7;
        }
        long timeInMillis = gregorianCalendar2.getTimeInMillis() - (i17 * 86400000);
        long timeInMillis2 = gregorianCalendar2.getTimeInMillis() + ((7 - i17) * 86400000);
        if (j17 < timeInMillis || j17 >= timeInMillis2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return true;
    }

    public static boolean i(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        long timeInMillis = j17 - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        if (timeInMillis <= 0 || timeInMillis > 86400000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return true;
    }
}
