package s65;

/* loaded from: classes11.dex */
public class y extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.network.h2 f403553a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f403554b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.pointers.PInt f403555c = new com.tencent.mm.pointers.PInt();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f403556d;

    /* renamed from: e, reason: collision with root package name */
    public final q65.b f403557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s65.z f403558f;

    public y(s65.z zVar, java.lang.String str, q65.b bVar) {
        this.f403558f = zVar;
        this.f403556d = null;
        this.f403557e = null;
        this.f403556d = str;
        this.f403557e = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0133, code lost:
    
        if (r0 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024f, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0251, code lost:
    
        r0.disconnect();
        r39.f403553a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0257, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r40) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s65.y.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        com.tencent.mm.network.h2 h2Var = this.f403553a;
        if (h2Var != null) {
            h2Var.disconnect();
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        r45.yp3 yp3Var = (r45.yp3) obj;
        com.tencent.mm.pointers.PInt pInt = this.f403555c;
        int i17 = pInt.value;
        java.util.Objects.toString(yp3Var);
        this.f403557e.d(this.f403554b, pInt.value, yp3Var);
    }
}
