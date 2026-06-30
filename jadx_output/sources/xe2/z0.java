package xe2;

/* loaded from: classes3.dex */
public final class z0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453934c;

    /* renamed from: d, reason: collision with root package name */
    public int f453935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453934c = "LiveNoticeTriggerProgressInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.sq1 sq1Var = new r45.sq1();
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 != null) {
                    try {
                        sq1Var.parseFrom(g17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i(this.f453934c, "pb = " + pm0.b0.g(sq1Var) + ", lastSeq = " + this.f453935d);
        if (sq1Var.getInteger(0) != 1 || sq1Var.getInteger(3) <= this.f453935d) {
            return;
        }
        this.f453935d = sq1Var.getInteger(3);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (context = k0Var.getContext()) == null) {
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = sq1Var.getString(1);
        e4Var.c();
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20106};
    }
}
