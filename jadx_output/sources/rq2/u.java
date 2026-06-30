package rq2;

/* loaded from: classes15.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.u f398889a = new rq2.u();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f398890b = "";

    public static void c(rq2.u uVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, int i17, java.lang.Object obj) {
        java.lang.String str5;
        long parseLong;
        java.lang.String userName = (i17 & 1) != 0 ? "" : str;
        java.lang.String country = (i17 & 2) != 0 ? "" : str2;
        java.lang.String city = (i17 & 4) != 0 ? "" : str3;
        java.lang.String district = (i17 & 8) != 0 ? "" : str4;
        long j47 = (i17 & 16) != 0 ? 0L : j17;
        long j48 = (i17 & 64) != 0 ? 0L : j19;
        long j49 = (i17 & 128) != 0 ? 0L : j27;
        long j57 = (i17 & 256) != 0 ? 0L : j28;
        long j58 = (i17 & 512) != 0 ? 0L : j29;
        long j59 = (i17 & 1024) != 0 ? 0L : j37;
        long j66 = (i17 & 2048) != 0 ? 0L : j38;
        long j67 = (i17 & 4096) != 0 ? 0L : j39;
        uVar.getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(country, "country");
        kotlin.jvm.internal.o.g(city, "city");
        kotlin.jvm.internal.o.g(district, "district");
        com.tencent.mm.autogen.mmdata.rpt.BroadcastNearbyTabStruct broadcastNearbyTabStruct = new com.tencent.mm.autogen.mmdata.rpt.BroadcastNearbyTabStruct();
        if (android.text.TextUtils.isEmpty(f398890b)) {
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            f398890b = Ri;
        }
        long j68 = j57;
        long j69 = j49;
        broadcastNearbyTabStruct.f55465d = broadcastNearbyTabStruct.b("sessionid", f398890b, true);
        broadcastNearbyTabStruct.f55466e = broadcastNearbyTabStruct.b("contextid", rq2.x.f398915b, true);
        broadcastNearbyTabStruct.f55467f = broadcastNearbyTabStruct.b("clickTabContextid", rq2.x.f398918e, true);
        long j76 = 0;
        broadcastNearbyTabStruct.f55468g = 0L;
        broadcastNearbyTabStruct.f55475n = broadcastNearbyTabStruct.b("nearby_username", userName, true);
        broadcastNearbyTabStruct.f55477p = broadcastNearbyTabStruct.b("country", country, true);
        broadcastNearbyTabStruct.f55476o = broadcastNearbyTabStruct.b("city", city, true);
        try {
            str5 = r26.n0.B(district, " - ", false) ? district.subSequence(r26.n0.L(district, " - ", 0, false, 6, null) + 3, district.length()).toString() : "";
            try {
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.tencent.mars.xlog.Log.e("NearbyPersonReporter", th.toString());
                broadcastNearbyTabStruct.f55469h = j76;
                broadcastNearbyTabStruct.f55470i = broadcastNearbyTabStruct.b("district", str5, true);
                broadcastNearbyTabStruct.f55471j = j47;
                broadcastNearbyTabStruct.f55472k = j18;
                broadcastNearbyTabStruct.f55473l = c01.id.c();
                broadcastNearbyTabStruct.f55474m = j48;
                broadcastNearbyTabStruct.f55478q = j69;
                broadcastNearbyTabStruct.f55479r = j68;
                broadcastNearbyTabStruct.f55480s = j58;
                broadcastNearbyTabStruct.f55481t = j59;
                broadcastNearbyTabStruct.f55482u = j66;
                broadcastNearbyTabStruct.f55483v = j67;
                broadcastNearbyTabStruct.k();
                broadcastNearbyTabStruct.n();
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            str5 = "";
        }
        if (!r26.n0.B(district, "公里", false)) {
            if (r26.n0.B(district, "米", false)) {
                parseLong = java.lang.Long.parseLong(district.subSequence(0, r26.n0.L(district, "米", 0, false, 6, null)).toString());
            }
            broadcastNearbyTabStruct.f55469h = j76;
            broadcastNearbyTabStruct.f55470i = broadcastNearbyTabStruct.b("district", str5, true);
            broadcastNearbyTabStruct.f55471j = j47;
            broadcastNearbyTabStruct.f55472k = j18;
            broadcastNearbyTabStruct.f55473l = c01.id.c();
            broadcastNearbyTabStruct.f55474m = j48;
            broadcastNearbyTabStruct.f55478q = j69;
            broadcastNearbyTabStruct.f55479r = j68;
            broadcastNearbyTabStruct.f55480s = j58;
            broadcastNearbyTabStruct.f55481t = j59;
            broadcastNearbyTabStruct.f55482u = j66;
            broadcastNearbyTabStruct.f55483v = j67;
            broadcastNearbyTabStruct.k();
            broadcastNearbyTabStruct.n();
        }
        parseLong = java.lang.Long.parseLong(district.subSequence(0, r26.n0.L(district, "公里", 0, false, 6, null)).toString()) * 1000;
        j76 = parseLong;
        broadcastNearbyTabStruct.f55469h = j76;
        broadcastNearbyTabStruct.f55470i = broadcastNearbyTabStruct.b("district", str5, true);
        broadcastNearbyTabStruct.f55471j = j47;
        broadcastNearbyTabStruct.f55472k = j18;
        broadcastNearbyTabStruct.f55473l = c01.id.c();
        broadcastNearbyTabStruct.f55474m = j48;
        broadcastNearbyTabStruct.f55478q = j69;
        broadcastNearbyTabStruct.f55479r = j68;
        broadcastNearbyTabStruct.f55480s = j58;
        broadcastNearbyTabStruct.f55481t = j59;
        broadcastNearbyTabStruct.f55482u = j66;
        broadcastNearbyTabStruct.f55483v = j67;
        broadcastNearbyTabStruct.k();
        broadcastNearbyTabStruct.n();
    }

    public final void a(int i17) {
        long j17 = 3;
        switch (i17) {
            case 1:
                j17 = 1;
                break;
            case 2:
                j17 = 2;
                break;
            case 4:
                j17 = 4;
                break;
            case 5:
                j17 = 5;
                break;
            case 6:
                j17 = 6;
                break;
        }
        c(this, null, null, null, null, 0L, 3L, j17, 0L, 0L, 0L, 0L, 0L, 0L, 8095, null);
    }

    public final void b(long j17) {
        c(this, "", null, null, null, 0L, j17, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8158, null);
    }
}
