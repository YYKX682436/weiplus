package rn;

/* loaded from: classes11.dex */
public class g implements java.util.Comparator {
    public g(rn.h hVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.chatroom.storage.GroupToolItem) obj2).f63684f, ((com.tencent.mm.chatroom.storage.GroupToolItem) obj).f63684f);
    }
}
