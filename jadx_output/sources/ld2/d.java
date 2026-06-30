package ld2;

/* loaded from: classes3.dex */
public final class d implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f318085a;

    public d(yz5.p pVar) {
        this.f318085a = pVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        yz5.p pVar = this.f318085a;
        if (i17 != -1) {
            pVar.invoke(com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction.NONE, null);
            return;
        }
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
        if (byteArrayExtra == null) {
            pVar.invoke(com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction.NONE, null);
            return;
        }
        r45.h32 h32Var = new r45.h32();
        try {
            h32Var.parseFrom(byteArrayExtra);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            h32Var = null;
        }
        java.lang.String string = h32Var != null ? h32Var.getString(4) : null;
        if (string == null || string.length() == 0) {
            pVar.invoke(com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction.NONE, null);
        } else {
            pVar.invoke(com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction.CREATE, h32Var);
        }
    }
}
