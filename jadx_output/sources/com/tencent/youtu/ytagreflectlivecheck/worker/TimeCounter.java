package com.tencent.youtu.ytagreflectlivecheck.worker;

/* loaded from: classes.dex */
public class TimeCounter {
    private static java.lang.String TAG = "TimeCounter";
    private static java.util.HashMap<java.lang.String, com.tencent.youtu.ytagreflectlivecheck.worker.TimeCounter> allMap;
    private java.lang.String name;
    private float sum = 0.0f;
    private int count = 0;
    private float average = 0.0f;
    private float min = 0.0f;
    private float max = 0.0f;
    private float last = 0.0f;
    private long beginTime = 0;

    public TimeCounter(java.lang.String str) {
        this.name = str;
    }

    public static void clearIns() {
        allMap.clear();
        allMap = null;
    }

    private static long getCurrentTime() {
        return java.lang.System.currentTimeMillis() * 1000;
    }

    public static com.tencent.youtu.ytagreflectlivecheck.worker.TimeCounter ins(java.lang.String str) {
        if (allMap == null) {
            allMap = new java.util.HashMap<>();
        }
        if (allMap.get(str) == null) {
            allMap.put(str, new com.tencent.youtu.ytagreflectlivecheck.worker.TimeCounter(str));
        }
        return allMap.get(str);
    }

    public static java.lang.String printAll() {
        java.util.Iterator<java.lang.String> it = allMap.keySet().iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + "\n" + allMap.get(it.next()).print();
        }
        return str;
    }

    public void begin() {
        this.beginTime = getCurrentTime();
    }

    public void end() {
        end(true);
    }

    public java.lang.String print() {
        return this.name + " count:" + this.count + " avg:" + this.average + "ms max:" + this.max + "ms min:" + this.min + "ms last:" + this.last + "ms";
    }

    public void reset() {
        this.sum = 0.0f;
        this.average = 0.0f;
        this.min = 0.0f;
        this.max = 0.0f;
        this.last = 0.0f;
        this.beginTime = 0L;
    }

    public void end(boolean z17) {
        float currentTime = ((float) (getCurrentTime() - this.beginTime)) / 1000.0f;
        float f17 = this.sum + currentTime;
        this.sum = f17;
        int i17 = this.count + 1;
        this.count = i17;
        this.average = f17 / i17;
        if (i17 == 1) {
            this.min = currentTime;
            this.max = currentTime;
        } else {
            if (currentTime < this.min) {
                this.min = currentTime;
            }
            if (currentTime > this.max) {
                this.max = currentTime;
            }
        }
        this.last = currentTime;
        if (z17) {
            print();
        }
    }
}
