package vq4;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static int f439265b;

    /* renamed from: c, reason: collision with root package name */
    public static int f439266c;

    /* renamed from: d, reason: collision with root package name */
    public static int f439267d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f439268e;

    /* renamed from: a, reason: collision with root package name */
    public static final vq4.a0 f439264a = new vq4.a0();

    /* renamed from: f, reason: collision with root package name */
    public static android.util.Size f439269f = vq4.b0.k();

    public final void a(boolean z17) {
        int i17;
        sq4.b bVar;
        if (z17) {
            i17 = 1;
            if (f439267d == 1) {
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPEncoderInfo", "encode trans to soft");
            }
        } else {
            i17 = 2;
            if (f439267d == 2) {
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPEncoderInfo", "encode trans to hard");
            }
        }
        f439267d = i17;
        rq4.d dVar = qq4.c.f365991e;
        if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPEncoderReport", "encode mode change to soft " + z17);
            long j17 = gq4.v.wi().f365983q;
            java.lang.String str = z17 ? "EncoderModeChangeSoft" : "EncoderModeChangeHard";
            java.lang.String str2 = dVar.f398954d;
            java.util.HashMap hashMap = dVar.f398951a;
            if (str2 != null && (bVar = (sq4.b) hashMap.get(str2)) != null) {
                bVar.b();
            }
            sq4.b bVar2 = (sq4.b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new sq4.b();
            }
            bVar2.f411373a = str;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bVar2.d(java.lang.System.currentTimeMillis() - j17);
            hashMap.put(str, bVar2);
            dVar.f398954d = str;
        }
    }

    public final void b(int i17, int i18) {
        if (i17 != f439265b || i18 != f439266c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPEncoderInfo", "set encode size:[" + i17 + ',' + i18 + ']');
            rq4.d dVar = qq4.c.f365991e;
            if (dVar != null) {
                android.util.Size size = new android.util.Size(i17, i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPEncoderReport", "encoder size change to " + size.getWidth() + " * " + size.getHeight());
                long j17 = gq4.v.wi().f365983q;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EncoderDrawSizeChanged_");
                sb6.append(java.lang.Math.max(size.getWidth(), size.getHeight()));
                java.lang.String sb7 = sb6.toString();
                sq4.b bVar = (sq4.b) dVar.f398952b.get("EncodeBadFrame_" + java.lang.Math.max(size.getWidth(), size.getHeight()));
                if (bVar != null) {
                    bVar.b();
                }
                java.util.HashMap hashMap = dVar.f398951a;
                sq4.b bVar2 = (sq4.b) hashMap.get(dVar.f398953c);
                if (bVar2 != null) {
                    bVar2.b();
                }
                sq4.b bVar3 = (sq4.b) hashMap.get(sb7);
                if (bVar3 == null) {
                    bVar3 = new sq4.b();
                }
                bVar3.f(sb7);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                bVar3.d(java.lang.System.currentTimeMillis() - j17);
                bVar3.g(java.lang.String.valueOf(java.lang.Math.max(size.getWidth(), size.getHeight())));
                hashMap.put(sb7, bVar3);
                dVar.f398953c = sb7;
            }
            rq4.q qVar = rq4.q.f399067a;
            rq4.q.f399068b.add(java.lang.Integer.valueOf(i17));
        }
        f439265b = i17;
        f439266c = i18;
        android.util.Size size2 = f439269f;
        if (size2 != null) {
            f439265b = size2.getWidth();
            f439266c = size2.getHeight();
        }
    }
}
