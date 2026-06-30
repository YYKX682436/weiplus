package f65;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.m f259896a = new f65.m();

    /* renamed from: b, reason: collision with root package name */
    public static long f259897b;

    /* renamed from: c, reason: collision with root package name */
    public static long f259898c;

    /* renamed from: d, reason: collision with root package name */
    public static long f259899d;

    /* renamed from: e, reason: collision with root package name */
    public static long f259900e;

    /* renamed from: f, reason: collision with root package name */
    public static long f259901f;

    /* renamed from: g, reason: collision with root package name */
    public static long f259902g;

    /* renamed from: h, reason: collision with root package name */
    public static long f259903h;

    /* renamed from: i, reason: collision with root package name */
    public static long f259904i;

    /* renamed from: j, reason: collision with root package name */
    public static long f259905j;

    /* renamed from: k, reason: collision with root package name */
    public static long f259906k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f259907l;

    public final void a(int i17) {
        if (f259907l) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "report is done, no to do again");
            return;
        }
        f259907l = true;
        long j17 = f259900e;
        long j18 = j17 != 0 ? f259899d / j17 : 0L;
        long j19 = f259903h;
        long j27 = j19 != 0 ? f259902g / j19 : 0L;
        long j28 = f259906k;
        long j29 = j28 != 0 ? f259905j / j28 : 0L;
        long j37 = j17 + j28;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "report >> clsTime: " + f259899d + ", clsNum: " + f259900e + ", ocrTime: " + f259902g + ", ocrNum: " + f259903h + ", clusterTime: " + f259905j + ", clusterNum: " + f259906k + ", action: " + i17 + ", clsAverTime: " + j18 + ", ocrAverTime: " + j27 + ", clusterAverTime:" + j29);
        if (f259897b != 0 && j37 != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f259897b;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "total struct >> startTime: " + f259897b + ", totalNum: " + j37 + ", time: " + currentTimeMillis);
            com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct intelligentMsgConsumingTimeLogStruct = new com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct();
            intelligentMsgConsumingTimeLogStruct.f58532f = 0L;
            intelligentMsgConsumingTimeLogStruct.f58531e = currentTimeMillis / j37;
            intelligentMsgConsumingTimeLogStruct.f58530d = j37;
            intelligentMsgConsumingTimeLogStruct.k();
        }
        com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct intelligentMsgConsumingTimeLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct();
        intelligentMsgConsumingTimeLogStruct2.f58532f = 1L;
        intelligentMsgConsumingTimeLogStruct2.f58531e = j18;
        intelligentMsgConsumingTimeLogStruct2.f58530d = f259900e;
        intelligentMsgConsumingTimeLogStruct2.k();
        f65.p pVar = f65.p.f259934a;
        long j38 = j29;
        pVar.c(f259900e, j18, 1, i17);
        com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct intelligentMsgConsumingTimeLogStruct3 = new com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct();
        intelligentMsgConsumingTimeLogStruct3.f58532f = 2L;
        intelligentMsgConsumingTimeLogStruct3.f58531e = j27;
        intelligentMsgConsumingTimeLogStruct3.f58530d = f259903h;
        intelligentMsgConsumingTimeLogStruct3.k();
        pVar.c(f259903h, j27, 2, i17);
        com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct intelligentMsgConsumingTimeLogStruct4 = new com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct();
        intelligentMsgConsumingTimeLogStruct4.f58532f = 3L;
        intelligentMsgConsumingTimeLogStruct4.f58531e = j38;
        intelligentMsgConsumingTimeLogStruct4.f58530d = f259906k;
        intelligentMsgConsumingTimeLogStruct4.k();
        pVar.c(f259906k, j38, 3, i17);
    }

    public final void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "stopPerOCR >> startTimeStamp: " + f259901f + ", stopTimeStamp: " + currentTimeMillis + ", before totalNum: " + f259903h + ", before totalTime: " + f259902g);
        long j17 = f259901f;
        if (currentTimeMillis < j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageQueryConsumeTimeReporter", "stopPerOCR >> time error");
        } else {
            f259903h++;
            f259902g += currentTimeMillis - j17;
        }
    }
}
