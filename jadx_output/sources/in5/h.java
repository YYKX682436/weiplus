package in5;

/* loaded from: classes2.dex */
public abstract class h {
    public static final void a(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            in5.e eVar = (in5.e) it.next();
            long a17 = hq.d.a();
            eVar.f293024c = a17;
            eVar.f293025d = a17 - eVar.f293023b;
            com.tencent.mars.xlog.Log.i("MicroMsg.EasyExposeTimeRecordListener", "updateTimeRecord: " + eVar);
        }
    }
}
