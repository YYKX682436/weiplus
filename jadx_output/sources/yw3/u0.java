package yw3;

/* loaded from: classes.dex */
public final class u0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public static final yw3.u0 f466897a = new yw3.u0();

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        r45.ha5 ha5Var = new r45.ha5();
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) != null) {
            try {
                ha5Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RepairerChooseChatroomMemberUI", "resultCode: " + i17 + " pojoContactList:" + ha5Var.toJSON());
    }
}
