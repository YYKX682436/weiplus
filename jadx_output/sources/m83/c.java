package m83;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public boolean f324719c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f324720d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f324721e = false;

    /* renamed from: f, reason: collision with root package name */
    public m83.b f324722f = null;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f324718b = new m83.a(this, android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.v2protocal f324717a = new com.tencent.mm.plugin.voip.model.v2protocal(this.f324718b);

    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m83.c.a():void");
    }

    public void b(int i17) {
        int SetDTMFPayload;
        if (this.f324720d && (SetDTMFPayload = this.f324717a.SetDTMFPayload(i17)) < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "setDtmfPayloadType failed, ret: %d", java.lang.Integer.valueOf(SetDTMFPayload));
        }
    }
}
