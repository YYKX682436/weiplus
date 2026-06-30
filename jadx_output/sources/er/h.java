package er;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ler/h;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class h implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        bundle.setClassLoader(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) bundle.getParcelable("KEY_DATA");
        if (emojiInfo != null) {
            zq.h.f474972a.e(emojiInfo, new er.g(rVar));
        } else if (rVar != null) {
            rVar.a(null);
        }
    }
}
