package h9;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.BufferedReader f279622a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f279623b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f279624c;

    public f(java.util.Queue queue, java.io.BufferedReader bufferedReader) {
        this.f279623b = queue;
        this.f279622a = bufferedReader;
    }

    public boolean a() {
        java.lang.String trim;
        if (this.f279624c != null) {
            return true;
        }
        java.util.Queue queue = this.f279623b;
        if (!queue.isEmpty()) {
            this.f279624c = (java.lang.String) queue.poll();
            return true;
        }
        do {
            java.lang.String readLine = this.f279622a.readLine();
            this.f279624c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f279624c = trim;
        } while (trim.isEmpty());
        return true;
    }
}
