package tq3;

/* loaded from: classes12.dex */
public class c extends tq3.a {
    public static boolean c() {
        try {
            long a17 = hq3.a.a();
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.requireAccountInitialized();
            return nVar.f265529n.e(16777219L, 0L) < a17;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.CalC2CChatPriorityTask";
    }

    public final void b(kq3.h hVar, java.lang.String str, long j17, float f17, float f18, float f19) {
        char c17;
        char c18;
        long a17 = hq3.a.a();
        long j18 = a17 - 2505600000L;
        java.lang.String str2 = str + "temp";
        if (hVar.g(str2)) {
            hVar.b(str2);
        }
        java.lang.String str3 = str + "count";
        java.lang.String str4 = str + "totalcount";
        java.lang.String str5 = str + "frequency";
        java.lang.String str6 = str + "recent";
        hVar.d(java.lang.String.format("CREATE TABLE %s AS SELECT chat, cast(MMDecaySum(%d, date, %s, %d, %d) AS DOUBLE) AS %s, cast(MMFrequency(%s) AS DOUBLE) AS %s, cast(MMRecent(%d, %s, %s, 30) AS DOUBLE) AS %s FROM %s WHERE date >= ? GROUP BY chat;", str2, java.lang.Long.valueOf(a17), str3, 7, 2, str4, str3, str5, java.lang.Long.valueOf(j17), com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_DATE, str3, str6, "C2CChatUsage"), new java.lang.String[]{java.lang.String.valueOf(j18)});
        if (hVar.f(str2) == 0) {
            return;
        }
        java.lang.String format = java.lang.String.format("SELECT avg(%s), avg(%s), avg(%s) FROM %s", str4, str5, str6, str2);
        double[] dArr = new double[3];
        android.database.Cursor h17 = hVar.h(format, null);
        if (h17.moveToNext()) {
            dArr[0] = h17.getDouble(0);
            dArr[1] = h17.getDouble(1);
            dArr[2] = h17.getDouble(2);
        }
        h17.close();
        double[] dArr2 = new double[3];
        android.database.Cursor h18 = hVar.h(java.lang.String.format("SELECT MMStdev(%s, %f), MMStdev(%s, %f), MMStdev(%s, %f) FROM %s", str4, java.lang.Double.valueOf(dArr[0]), str5, java.lang.Double.valueOf(dArr[1]), str6, java.lang.Double.valueOf(dArr[2]), str2), null);
        if (h18.moveToNext()) {
            dArr2[0] = h18.getDouble(0);
            c17 = 1;
            dArr2[1] = h18.getDouble(1);
            c18 = 2;
            dArr2[2] = h18.getDouble(2);
        } else {
            c17 = 1;
            c18 = 2;
        }
        h18.close();
        char c19 = c18;
        char c27 = c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.CalC2CChatPriorityTask", "calculateStdev %s %.2f %.2f %.2f %.2f %.2f %.2f", str, java.lang.Double.valueOf(dArr[0]), java.lang.Double.valueOf(dArr[c17]), java.lang.Double.valueOf(dArr[c18]), java.lang.Double.valueOf(dArr2[0]), java.lang.Double.valueOf(dArr2[c17]), java.lang.Double.valueOf(dArr2[c18]));
        java.lang.String str7 = str + "temp2";
        if (hVar.g(str7)) {
            hVar.b(str7);
        }
        java.lang.String str8 = str + "totalcountdev";
        java.lang.String str9 = str + "frequencydev";
        java.lang.String str10 = str + "recentdev";
        hVar.c(java.lang.String.format("CREATE TABLE %s AS SELECT chat, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s FROM %s", str7, str4, java.lang.Double.valueOf(dArr[0]), java.lang.Double.valueOf(dArr2[0]), str8, str5, java.lang.Double.valueOf(dArr[c27]), java.lang.Double.valueOf(dArr2[c27]), str9, str6, java.lang.Double.valueOf(dArr[c19]), java.lang.Double.valueOf(dArr2[c19]), str10, str2));
        if (hVar.f(str7) == 0) {
            return;
        }
        hVar.c(java.lang.String.format("UPDATE %s SET %s = (SELECT MMDWeightAverage(%s, %f, %s, %f, %s, %f) FROM %s B WHERE %s.chat = B.chat);", "C2CChatUsageResult", str + "rmf", str8, java.lang.Float.valueOf(f17), str9, java.lang.Float.valueOf(f18), str10, java.lang.Float.valueOf(f19), str7, "C2CChatUsageResult"));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.CalC2CChatPriorityTask", "no need to cal usage result");
            return;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        kq3.h hVar = nVar.f265529n;
        if (hVar.f("C2CChatUsage") == 0) {
            return;
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(1252L, 1L, 1L, false);
        long a17 = hq3.a.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        hVar.d(java.lang.String.format("INSERT OR REPLACE INTO %s(chat) SELECT distinct(chat) AS chat FROM %s WHERE date >= ?;", "C2CChatUsageResult", "C2CChatUsage"), new java.lang.String[]{java.lang.String.valueOf(a17 - 2505600000L)});
        b(hVar, "open", currentTimeMillis, 0.4f, 0.4f, 0.2f);
        b(hVar, "sendmsg", currentTimeMillis, 0.7f, 0.2f, 0.1f);
        b(hVar, "consumemsg", currentTimeMillis, 0.3f, 0.3f, 0.4f);
        long a18 = hq3.a.a();
        long j17 = a18 - 2505600000L;
        if (hVar.g("staytimetemp")) {
            hVar.b("staytimetemp");
        }
        hVar.d(java.lang.String.format("CREATE TABLE %s AS SELECT chat, cast(MMDecaySum(%d, date, %s, %d, %d) AS DOUBLE) AS %s, cast(MMSumDivision(%s, %s, 0) AS DOUBLE) AS %s FROM %s WHERE date >= ? GROUP BY chat;", "staytimetemp", java.lang.Long.valueOf(a18), "staytime", 7, 2, "staytimetotal", "opencount", "staytime", "staytimeperopen", "C2CChatUsage"), new java.lang.String[]{java.lang.String.valueOf(j17)});
        double[] dArr = new double[2];
        android.database.Cursor h17 = hVar.h(java.lang.String.format("SELECT avg(%s), avg(%s) FROM %s", "staytimetotal", "staytimeperopen", "staytimetemp"), null);
        if (h17.moveToNext()) {
            dArr[0] = h17.getDouble(0);
            dArr[1] = h17.getDouble(1);
        }
        h17.close();
        double[] dArr2 = new double[2];
        android.database.Cursor h18 = hVar.h(java.lang.String.format("SELECT MMStdev(%s, %f), MMStdev(%s, %f) FROM %s", "staytimetotal", java.lang.Double.valueOf(dArr[0]), "staytimeperopen", java.lang.Double.valueOf(dArr[1]), "staytimetemp"), null);
        if (h18.moveToNext()) {
            dArr2[0] = h18.getDouble(0);
            dArr2[1] = h18.getDouble(1);
        }
        h18.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.CalC2CChatPriorityTask", "calculateStayTime %.2f %.2f %.2f %.2f", java.lang.Double.valueOf(dArr[0]), java.lang.Double.valueOf(dArr[1]), java.lang.Double.valueOf(dArr2[0]), java.lang.Double.valueOf(dArr2[1]));
        if (hVar.g("staytimetemp2")) {
            hVar.b("staytimetemp2");
        }
        hVar.c(java.lang.String.format("CREATE TABLE %s AS SELECT chat, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s FROM %s", "staytimetemp2", "staytimetotal", java.lang.Double.valueOf(dArr[0]), java.lang.Double.valueOf(dArr2[0]), "staytimetotaldev", "staytimeperopen", java.lang.Double.valueOf(dArr[1]), java.lang.Double.valueOf(dArr2[1]), "staytimeperopendev", "staytimetemp"));
        hVar.c(java.lang.String.format("UPDATE %s SET staytimedev = (SELECT MMDWeightAverage(%s, %f, %s, %f) FROM %s E WHERE %s.chat = E.chat);", "C2CChatUsageResult", "staytimetotaldev", java.lang.Double.valueOf(0.5d), "staytimeperopendev", java.lang.Double.valueOf(0.5d), "staytimetemp2", "C2CChatUsageResult"));
        double pow = (((2.2847d - (java.lang.Math.pow(0.9d, 2.0d) * 4.729d)) + (java.lang.Math.pow(0.9d, 3.0d) * 3.937d)) / 0.9d) * 0.09999999999999998d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.CalC2CChatPriorityTask", "d: %.2f r: %.4f", java.lang.Double.valueOf(0.9d), java.lang.Double.valueOf(pow));
        java.lang.Double valueOf = java.lang.Double.valueOf(pow);
        java.lang.Double valueOf2 = java.lang.Double.valueOf(0.1d);
        java.lang.Double valueOf3 = java.lang.Double.valueOf(0.3d);
        hVar.c(java.lang.String.format("UPDATE %s SET totallsp = MMLSP(%f, %d, %s, %f, %s, %f, %s, %f, %s, %f)", "C2CChatUsageResult", valueOf, 4, "openrmf", valueOf2, "sendmsgrmf", valueOf3, "staytimedev", valueOf3, "consumemsgrmf", valueOf3));
        if (hVar.g("lsptemp")) {
            hVar.b("lsptemp");
        }
        hVar.c(java.lang.String.format("CREATE TABLE %s AS SELECT chat, cast(RANK() OVER (ORDER BY totallsp DESC) AS INTEGER) as rank FROM %s", "lsptemp", "C2CChatUsageResult"));
        hVar.c(java.lang.String.format("UPDATE %s SET rank=(SELECT E.rank FROM %s E WHERE %s.chat=E.chat);", "C2CChatUsageResult", "lsptemp", "C2CChatUsageResult"));
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.requireAccountInitialized();
        nVar2.f265529n.i(16777219L, a17);
        fVar.idkeyStat(1252L, 0L, 1L, false);
    }
}
