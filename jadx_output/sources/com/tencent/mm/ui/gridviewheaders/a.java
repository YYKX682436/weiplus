package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.ui.gridviewheaders.a f208727c;

    /* renamed from: a, reason: collision with root package name */
    public final long f208728a;

    /* renamed from: b, reason: collision with root package name */
    public final long f208729b;

    public a() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(7, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.f208728a = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        this.f208729b = calendar2.getTimeInMillis();
        java.util.Calendar.getInstance().getTimeInMillis();
    }

    public static com.tencent.mm.ui.gridviewheaders.a e() {
        if (f208727c == null) {
            synchronized (com.tencent.mm.ui.gridviewheaders.a.class) {
                f208727c = new com.tencent.mm.ui.gridviewheaders.a();
            }
        }
        return f208727c;
    }

    public long a(java.util.Date date) {
        if (date.getTime() >= this.f208728a) {
            return com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        if (date.getTime() >= this.f208729b) {
            return 9223372036854775806L;
        }
        return (date.getYear() * 100) + date.getMonth();
    }

    public long b(long j17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j17);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public java.lang.String c(java.util.Date date, android.content.Context context) {
        return date.getTime() >= this.f208728a ? context.getString(com.tencent.mm.R.string.jxs) : date.getTime() >= this.f208729b ? context.getString(com.tencent.mm.R.string.jxr) : context.getString(com.tencent.mm.R.string.bnc, java.lang.Integer.valueOf(date.getYear() + 1900), java.lang.Integer.valueOf(date.getMonth() + 1));
    }

    public java.lang.String d(java.util.Date date, android.content.Context context) {
        if (date.getTime() >= this.f208728a) {
            return context.getString(com.tencent.mm.R.string.jxs);
        }
        if (date.getTime() >= this.f208729b) {
            return context.getString(com.tencent.mm.R.string.jxr);
        }
        return (date.getYear() + 1900) + "/" + (date.getMonth() + 1);
    }
}
