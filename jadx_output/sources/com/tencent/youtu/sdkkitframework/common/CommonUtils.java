package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes13.dex */
public class CommonUtils {
    public static final int MAX_TIMEOUT_MS = 30000;
    public static final int MIN_TIMEOUT_MS = 0;
    private static final java.lang.String TAG = "CommonUtils";
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.youtu.sdkkitframework.common.CommonUtils.BenchMarkTime> benchMarkMaps = new java.util.concurrent.ConcurrentHashMap<>();

    /* loaded from: classes13.dex */
    public static class BenchMarkTime {
        long begin;
        long total = 0;
        long tick = 0;
        long cur = 0;
        long avg = 0;
        long min = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        long max = Long.MIN_VALUE;

        private void update(long j17) {
            this.tick++;
            this.min = java.lang.Math.min(j17, this.min);
            this.max = java.lang.Math.max(j17, this.max);
            long j18 = this.total + j17;
            this.total = j18;
            this.avg = j18 / this.tick;
        }

        public void begin() {
            this.begin = java.lang.System.currentTimeMillis();
        }

        public void end() {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.begin;
            this.cur = currentTimeMillis;
            update(currentTimeMillis);
        }

        public java.lang.String getTime() {
            return "avg: " + this.avg + "ms min: " + this.min + "ms max: " + this.max + "ms cur: " + this.cur + "ms";
        }
    }

    public static void benchMarkBegin(java.lang.String str) {
        if (!benchMarkMaps.containsKey(str)) {
            benchMarkMaps.put(str, new com.tencent.youtu.sdkkitframework.common.CommonUtils.BenchMarkTime());
        }
        benchMarkMaps.get(str).begin();
    }

    public static long benchMarkEnd(java.lang.String str) {
        if (!benchMarkMaps.containsKey(str)) {
            return 0L;
        }
        com.tencent.youtu.sdkkitframework.common.CommonUtils.BenchMarkTime benchMarkTime = benchMarkMaps.get(str);
        benchMarkTime.end();
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "benchMarkEnd -- " + str + " : " + benchMarkTime.cur + "ms");
        return benchMarkTime.cur;
    }

    public static java.lang.String getBenchMarkTime(java.lang.String str) {
        if (!benchMarkMaps.containsKey(str)) {
            return "";
        }
        return "[" + str + "]" + benchMarkMaps.get(str).getTime();
    }

    private static byte[] getSignature(java.lang.String str, java.lang.String str2) {
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA1");
        mac.init(new javax.crypto.spec.SecretKeySpec(str2.getBytes(), mac.getAlgorithm()));
        return mac.doFinal(str.getBytes());
    }

    public static java.lang.String getYoutuOpenAppSign(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        java.lang.String str5 = "a=" + str + "&k=" + str2 + "&e=" + (2592000 + currentTimeMillis) + "&t=" + currentTimeMillis + "&r=" + java.lang.Math.abs(new java.util.Random().nextInt()) + "&u=" + str4 + "&f=";
        byte[] signature = getSignature(str5, str3);
        byte[] bArr = new byte[signature.length + str5.getBytes().length];
        java.lang.System.arraycopy(signature, 0, bArr, 0, signature.length);
        java.lang.System.arraycopy(str5.getBytes(), 0, bArr, signature.length, str5.getBytes().length);
        return new java.lang.String(android.util.Base64.encode(bArr, 2));
    }

    public static java.lang.String makeMessageJson(int i17, java.lang.String str, java.lang.String str2) {
        try {
            new org.json.JSONObject(str2);
            return str2;
        } catch (java.lang.Exception unused) {
            return "{ \"errorcode\":" + i17 + ",\"errormsg\": \"" + str + "\",\"extrainfo\":\"" + str2 + "\"}";
        }
    }

    public static void reportException(java.lang.String str, java.lang.Exception exc) {
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo(str + " cause exception: " + exc.getLocalizedMessage());
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(exc) { // from class: com.tencent.youtu.sdkkitframework.common.CommonUtils.1
            final /* synthetic */ java.lang.Exception val$e;

            {
                this.val$e = exc;
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR));
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED, exc.getLocalizedMessage()));
            }
        });
    }
}
