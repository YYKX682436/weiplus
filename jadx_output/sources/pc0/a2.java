package pc0;

/* loaded from: classes10.dex */
public final class a2 extends h.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f353226a;

    public a2(int i17) {
        this.f353226a = i17;
    }

    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider input = (com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider) obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(input, "input");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaOptService", "createIntent");
        int i17 = com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.f155625t;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.class);
        intent.putExtra("KEY_PARAMS_CONFIG", input);
        intent.putExtra("KEY_PARAMS_EXIT_ANIM", com.tencent.mm.R.anim.f477877e1);
        intent.putExtra("KEY_PARAMS_TO_WHERE", this.f353226a);
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    @Override // h.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r27, android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.a2.c(int, android.content.Intent):java.lang.Object");
    }
}
