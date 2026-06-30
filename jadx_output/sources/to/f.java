package to;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static int f420891a;

    /* renamed from: b, reason: collision with root package name */
    public static int f420892b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f420893c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static int f420894d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f420895e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f420896f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static int f420897g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f420898h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f420899i = new java.util.HashMap();

    public static void a() {
        com.tencent.mm.autogen.events.MediaLeakEvent mediaLeakEvent = new com.tencent.mm.autogen.events.MediaLeakEvent();
        int i17 = f420891a - f420892b;
        am.pj pjVar = mediaLeakEvent.f54492g;
        if (i17 > 1) {
            pjVar.f7622a = true;
            pjVar.f7623b = f420893c.size();
        }
        if (f420897g - f420898h > 1) {
            pjVar.f7624c = true;
            pjVar.f7625d = f420899i.size();
        }
        if (f420894d - f420895e > 1) {
            pjVar.f7626e = true;
            pjVar.f7627f = f420896f.size();
        }
        if (pjVar.f7624c || pjVar.f7622a || pjVar.f7626e) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioManager", "check media leak audio[%b %d] mediaplayer[%b %d] audioRecordLeak [%b %d]", java.lang.Boolean.valueOf(pjVar.f7622a), java.lang.Integer.valueOf(pjVar.f7623b), java.lang.Boolean.valueOf(pjVar.f7624c), java.lang.Integer.valueOf(pjVar.f7625d), java.lang.Boolean.valueOf(pjVar.f7626e), java.lang.Integer.valueOf(pjVar.f7627f));
            mediaLeakEvent.e();
        }
    }

    public static java.lang.String b() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AudioTrack: \r\nleak: ");
        java.util.HashMap hashMap = f420893c;
        stringBuffer.append(hashMap.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f420891a);
        stringBuffer.append("release: ");
        stringBuffer.append(f420892b);
        stringBuffer.append("\r\n--------leak map-----------\r\n");
        if (!hashMap.isEmpty()) {
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                stringBuffer.append((java.lang.String) it.next());
                stringBuffer.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            }
        }
        stringBuffer.append("MediaPlayer: \r\nleak: ");
        java.util.HashMap hashMap2 = f420899i;
        stringBuffer.append(hashMap2.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f420897g);
        stringBuffer.append("release: ");
        stringBuffer.append(f420898h);
        stringBuffer.append("\r\n--------leak map-----------\r\n");
        if (!hashMap2.isEmpty()) {
            java.util.Iterator it6 = hashMap2.values().iterator();
            while (it6.hasNext()) {
                stringBuffer.append((java.lang.String) it6.next());
                stringBuffer.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            }
        }
        stringBuffer.append("AudioRecord: \r\nleak: ");
        java.util.HashMap hashMap3 = f420896f;
        stringBuffer.append(hashMap3.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f420894d);
        stringBuffer.append("release: ");
        stringBuffer.append(f420894d);
        stringBuffer.append("\r\n--------leak map-----------\r\n");
        if (!hashMap3.isEmpty()) {
            java.util.Iterator it7 = hashMap3.values().iterator();
            while (it7.hasNext()) {
                stringBuffer.append((java.lang.String) it7.next());
                stringBuffer.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioManager", "leak? %s", stringBuffer2);
        return stringBuffer2;
    }
}
