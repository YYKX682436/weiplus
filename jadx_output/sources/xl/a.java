package xl;

/* loaded from: classes15.dex */
public class a implements kh1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xl.d f455077a;

    public a(xl.d dVar) {
        this.f455077a = dVar;
    }

    @Override // kh1.d
    public void a(byte[] bArr, int i17, boolean z17) {
        xl.c cVar = this.f455077a.f455090l;
        if (cVar != null) {
            kf1.c cVar2 = (kf1.c) cVar;
            cVar2.getClass();
            java.lang.System.arraycopy(bArr, 0, new byte[i17], 0, i17);
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) cVar2.f307168a.f307166d).values().iterator();
            while (it.hasNext()) {
                ((gf0.g) ((kf1.f) it.next())).getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", "onRecorderStateChange onFrameRecorded,isLastFrame: " + z17 + ",length: " + i17);
            }
        }
    }
}
