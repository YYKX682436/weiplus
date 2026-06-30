package rc;

/* loaded from: classes16.dex */
public class a extends org.chromium.net.RequestFinishedInfo.Listener {
    public a(rc.c cVar, java.util.concurrent.Executor executor) {
        super(executor);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(org.chromium.net.RequestFinishedInfo requestFinishedInfo) {
        java.lang.String url = requestFinishedInfo.getUrl();
        org.chromium.net.RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url: ");
        sb6.append(url);
        sb6.append(", finish reason: ");
        sb6.append(requestFinishedInfo.getFinishedReason());
        sb6.append(" ");
        if (metrics.getDnsEnd() != null && metrics.getDnsStart() != null) {
            sb6.append("dns cost: ");
            sb6.append(metrics.getDnsEnd().getTime() - metrics.getDnsStart().getTime());
            sb6.append("ms ");
        }
        if (metrics.getSslStart() != null && metrics.getSslEnd() != null) {
            sb6.append("ssl cost: ");
            sb6.append(metrics.getSslEnd().getTime() - metrics.getSslStart().getTime());
            sb6.append("ms ");
        }
        if (metrics.getPushStart() != null && metrics.getPushEnd() != null) {
            sb6.append("push cost: ");
            sb6.append(metrics.getPushEnd().getTime() - metrics.getPushStart().getTime());
            sb6.append("ms ");
        }
        if (metrics.getRequestStart() != null && metrics.getRequestEnd() != null) {
            sb6.append("request cost: ");
            sb6.append(metrics.getRequestEnd().getTime() - metrics.getRequestStart().getTime());
            sb6.append("ms ");
        }
        if (metrics.getConnectStart() != null && metrics.getConnectEnd() != null) {
            sb6.append("connect cost: ");
            sb6.append(metrics.getConnectEnd().getTime() - metrics.getConnectEnd().getTime());
            sb6.append("ms ");
        }
        if (metrics.getSendingStart() != null && metrics.getSendingEnd() != null) {
            sb6.append("sending cost: ");
            sb6.append(metrics.getSendingStart().getTime() - metrics.getSendingEnd().getTime());
            sb6.append("ms ");
        }
        if (metrics.getTotalTimeMs() != null) {
            sb6.append("total cost: ");
            sb6.append(metrics.getTotalTimeMs());
            sb6.append("ms ");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CronetGlobalEngine", sb6.toString());
    }
}
