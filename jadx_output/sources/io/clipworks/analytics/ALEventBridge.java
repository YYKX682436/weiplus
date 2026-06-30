package io.clipworks.analytics;

/* loaded from: classes16.dex */
public class ALEventBridge {
    private final java.util.Set<cz5.a> _eventSinks = new android.util.ArraySet();

    public void addEventSink(cz5.a aVar) {
        this._eventSinks.add(aVar);
    }

    public boolean hasAnyEventSink() {
        return !this._eventSinks.isEmpty();
    }

    public void removeEventSink(cz5.a aVar) {
        this._eventSinks.remove(aVar);
    }

    public void sinkEventS12(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return;
        }
        try {
            cz5.f fVar = (cz5.f) cz5.f.f225049o.parseFrom(byteBuffer);
            int i17 = fVar.f225054h;
            int i18 = fVar.f225055i;
            long j17 = fVar.f225051e;
            fVar.getName();
            java.util.Map e17 = fVar.g().e();
            java.util.TreeMap treeMap = new java.util.TreeMap();
            if (e17 != null) {
                treeMap.putAll(e17);
            }
            treeMap.put("GSN", java.lang.String.valueOf(i17));
            treeMap.put("LSN", java.lang.String.valueOf(i18));
            treeMap.put("SDKTimestamp", java.lang.String.valueOf(j17));
            java.util.Iterator<cz5.a> it = this._eventSinks.iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                throw null;
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
