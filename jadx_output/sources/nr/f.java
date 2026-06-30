package nr;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final nr.f f339044a = new nr.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct f339045b = new com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct();

    public final void a(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct emoticonFastManagementStruct = f339045b;
        emoticonFastManagementStruct.f56032d = i17;
        emoticonFastManagementStruct.k();
    }

    public final void b(int i17) {
        int i18 = 1;
        if (i17 != 0) {
            int i19 = 2;
            if (i17 != 1) {
                if (i17 != 2) {
                    i19 = 3;
                    if (i17 != 3) {
                        if (i17 != 4) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiPopupReport", "type scene mismatch");
                        } else {
                            i18 = 5;
                        }
                    }
                } else {
                    i18 = 4;
                }
            }
            i18 = i19;
        }
        f339045b.f56033e = i18;
    }
}
