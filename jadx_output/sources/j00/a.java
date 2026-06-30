package j00;

/* loaded from: classes9.dex */
public final class a implements com.tencent.mm.storage.i8 {
    @Override // com.tencent.mm.storage.i8
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (i17 == 5 && (obj instanceof java.lang.String)) {
            if (((java.lang.CharSequence) obj).length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftConversationObserver", "onNotifyChange, obj is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftConversationObserver", "onNotifyChange, delete, obj:" + obj);
            ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).Vi((java.lang.String) obj);
        }
    }
}
