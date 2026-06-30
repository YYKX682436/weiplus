package e35;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final e35.h f247593a = new e35.h();

    public final void a(java.lang.String str, long j17, int i17, int i18, java.lang.String str2, int i19, int i27) {
        if (i18 != 1 || j17 >= 1073741824) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[8];
            lVarArr[0] = new jz5.l("file_send_source", java.lang.Integer.valueOf(i17));
            lVarArr[1] = new jz5.l("send_file_type", java.lang.Integer.valueOf(i18));
            lVarArr[2] = new jz5.l("file_size_kb", java.lang.Long.valueOf(j17 / 1000));
            lVarArr[3] = new jz5.l("chat_type", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.R4(str2) ? 2 : 1));
            if (str2 == null) {
                str2 = "";
            }
            lVarArr[4] = new jz5.l("chat_username", str2);
            if (str == null) {
                str = "";
            }
            lVarArr[5] = new jz5.l("file_ext", str);
            lVarArr[6] = new jz5.l("interception_type", java.lang.Integer.valueOf(i19));
            lVarArr[7] = new jz5.l("video_duration_s", java.lang.Integer.valueOf(i27));
            ((cy1.a) rVar).Ej("file_interception", kz5.c1.k(lVarArr), 32337);
        }
    }
}
