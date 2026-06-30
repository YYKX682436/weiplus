package md2;

/* loaded from: classes2.dex */
public final class d implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325836a;

    public d(yz5.l lVar) {
        this.f325836a = lVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        yz5.l lVar = this.f325836a;
        if (i17 != -1) {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
            return;
        }
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
        if (byteArrayExtra == null) {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
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
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
        } else {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(h32Var != null ? h32Var.toProtobuf() : null)));
        }
    }
}
