package org.webrtc;

/* loaded from: classes11.dex */
public class StatsReport {

    /* renamed from: id, reason: collision with root package name */
    public final java.lang.String f347921id;
    public final double timestamp;
    public final java.lang.String type;
    public final org.webrtc.StatsReport.Value[] values;

    /* loaded from: classes11.dex */
    public static class Value {
        public final java.lang.String name;
        public final java.lang.String value;

        public Value(java.lang.String str, java.lang.String str2) {
            this.name = str;
            this.value = str2;
        }

        public java.lang.String toString() {
            return "[" + this.name + ": " + this.value + "]";
        }
    }

    public StatsReport(java.lang.String str, java.lang.String str2, double d17, org.webrtc.StatsReport.Value[] valueArr) {
        this.f347921id = str;
        this.type = str2;
        this.timestamp = d17;
        this.values = valueArr;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id: ");
        sb6.append(this.f347921id);
        sb6.append(", type: ");
        sb6.append(this.type);
        sb6.append(", timestamp: ");
        sb6.append(this.timestamp);
        sb6.append(", values: ");
        int i17 = 0;
        while (true) {
            org.webrtc.StatsReport.Value[] valueArr = this.values;
            if (i17 >= valueArr.length) {
                return sb6.toString();
            }
            sb6.append(valueArr[i17].toString());
            sb6.append(", ");
            i17++;
        }
    }
}
