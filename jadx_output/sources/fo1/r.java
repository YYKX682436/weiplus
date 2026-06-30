package fo1;

/* loaded from: classes5.dex */
public abstract class r {
    public static final java.lang.String a(long j17) {
        java.lang.String str;
        java.lang.Object sb6;
        android.text.format.Time time = new android.text.format.Time();
        time.set(j17);
        android.text.format.Time time2 = new android.text.format.Time();
        time2.setToNow();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (time.monthDay != time2.monthDay) {
            str = context.getString(com.tencent.mm.R.string.fda) + ' ';
        } else {
            str = "";
        }
        if (k35.m1.i()) {
            sb6 = k35.s.a("kk:mm", time);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append((java.lang.Object) k35.m1.b(context, time.hour));
            sb7.append((java.lang.Object) k35.s.a("hh:mm", time));
            sb6 = sb7.toString();
        }
        return str + sb6;
    }

    public static final java.lang.String b(com.tencent.wechat.aff.affroam.p0 p0Var) {
        java.lang.String h17;
        kotlin.jvm.internal.o.g(p0Var, "<this>");
        long j17 = p0Var.f215950h;
        if (j17 < 102400) {
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.mzs);
            kotlin.jvm.internal.o.d(g17);
            return g17;
        }
        java.lang.String f07 = com.tencent.mm.sdk.platformtools.t8.f0(j17);
        long j18 = p0Var.f215951i;
        if (j18 < 60000) {
            h17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.mwc);
            kotlin.jvm.internal.o.f(h17, "getString(...)");
        } else {
            long j19 = j18 / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            if (j19 < 60) {
                h17 = com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.mwd, java.lang.Long.valueOf(j19));
                kotlin.jvm.internal.o.f(h17, "getString(...)");
            } else {
                h17 = com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.mwb, java.lang.Long.valueOf(java.lang.Math.min(j19 / 60, 99L)));
                kotlin.jvm.internal.o.f(h17, "getString(...)");
            }
        }
        java.lang.String h18 = com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.mzr, h17, f07);
        kotlin.jvm.internal.o.d(h18);
        return h18;
    }

    public static final java.lang.String c(com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo, android.content.Context ctx) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(backupRangeInfo, "<this>");
        kotlin.jvm.internal.o.g(ctx, "ctx");
        int ordinal = backupRangeInfo.f92730d.ordinal();
        if (ordinal == 0) {
            string = ctx.getString(com.tencent.mm.R.string.mvp);
        } else if (ordinal == 1) {
            java.util.List list = backupRangeInfo.f92731e;
            boolean isEmpty = list.isEmpty();
            java.util.List list2 = backupRangeInfo.f92732f;
            string = isEmpty ? ctx.getString(com.tencent.mm.R.string.f492867mz0, java.lang.Integer.valueOf(list2.size())) : list2.isEmpty() ? ctx.getString(com.tencent.mm.R.string.f492868mz1, java.lang.Integer.valueOf(list.size())) : ctx.getString(com.tencent.mm.R.string.f492869mz2, java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(list2.size()));
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            string = ctx.getString(com.tencent.mm.R.string.myt);
        }
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
