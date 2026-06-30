package org.webrtc;

/* loaded from: classes.dex */
public class RTCStats {

    /* renamed from: id, reason: collision with root package name */
    private final java.lang.String f347919id;
    private final java.util.Map<java.lang.String, java.lang.Object> members;
    private final long timestampUs;
    private final java.lang.String type;

    public RTCStats(long j17, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.timestampUs = j17;
        this.type = str;
        this.f347919id = str2;
        this.members = map;
    }

    private static void appendValue(java.lang.StringBuilder sb6, java.lang.Object obj) {
        if (!(obj instanceof java.lang.Object[])) {
            if (!(obj instanceof java.lang.String)) {
                sb6.append(obj);
                return;
            }
            sb6.append('\"');
            sb6.append(obj);
            sb6.append('\"');
            return;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        sb6.append('[');
        for (int i17 = 0; i17 < objArr.length; i17++) {
            if (i17 != 0) {
                sb6.append(", ");
            }
            appendValue(sb6, objArr[i17]);
        }
        sb6.append(']');
    }

    public static org.webrtc.RTCStats create(long j17, java.lang.String str, java.lang.String str2, java.util.Map map) {
        return new org.webrtc.RTCStats(j17, str, str2, map);
    }

    public java.lang.String getId() {
        return this.f347919id;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("{ timestampUs: ");
        sb6.append(this.timestampUs);
        sb6.append(", type: ");
        sb6.append(this.type);
        sb6.append(", id: ");
        sb6.append(this.f347919id);
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.members.entrySet()) {
            sb6.append(", ");
            sb6.append(entry.getKey());
            sb6.append(": ");
            appendValue(sb6, entry.getValue());
        }
        sb6.append(" }");
        return sb6.toString();
    }
}
