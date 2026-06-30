package tl;

/* loaded from: classes14.dex */
public class x implements android.media.AudioRecord.OnRecordPositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.y f420176a;

    public x(tl.y yVar) {
        this.f420176a = yVar;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onMarkerReached(android.media.AudioRecord audioRecord) {
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioRecord audioRecord) {
        tl.y yVar = this.f420176a;
        yVar.getClass();
        android.media.AudioRecord audioRecord2 = yVar.f420178d;
        if (audioRecord2 != null) {
            if (yVar.f420182h || yVar.f420181g == null) {
                yVar.f420181g = new byte[yVar.f420184j];
            }
            int read = audioRecord2.read(yVar.f420181g, 0, yVar.f420184j);
            tl.e0 e0Var = yVar.f420045a;
            if (e0Var != null) {
                ((tl.u) e0Var).a(read, yVar.f420181g);
            }
            byte[] bArr = yVar.f420181g;
            if (read > bArr.length) {
                read = bArr.length;
            }
            if (yVar.f420185k && read > 0) {
                java.util.Arrays.fill(bArr, 0, read, (byte) 0);
            }
            tl.c cVar = yVar.f420180f;
            if (cVar == null || read <= 0) {
                return;
            }
            cVar.b(yVar.f420181g, read);
        }
    }
}
